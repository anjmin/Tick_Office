package com.qfedu.utils;

;
import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ResourceBundle;

/**
 * Created by 54110 on 2019-05-06.
 */
@Service
public class UploadUtils {

   /* @Autowired
   private ShopPicMapper shopPicMapper;*/
    //声明属性
    String accessKey;
    String secretKey;
    String bucket;
    String path;
    public UploadUtils() {

        /*这个类的作用就是读取资源属性文件（properties），
        然后根据.properties文件的名称信息（本地化信息），
        匹配当前系统的国别语言信息（也可以程序指定），然后获取相应的properties文件的内容。

        使用这个类，properties需要遵循一定的命名规范，
        一般的命名规范是： 自定义名语言代码国别代码.properties，
        如果是默认的，直接写为：自定义名.properties。
        */
        ResourceBundle rb = ResourceBundle.getBundle("qiniu");
        accessKey = rb.getString("qiniu_accessKey");
        secretKey=rb.getString("qiniu_secretKey");
        bucket=rb.getString("qiniu_bucket");
        //拿到path
        path=rb.getString("qiniu_url");
    }


  /*  public Integer savePic(MultipartFile multipartFile){
        String upload = upload(multipartFile);
        ShopPic shoPic = new ShopPic();
        shoPic.setStatus("0");
        shoPic.setPath(path+"/"+upload);
        shopPicMapper.insertSelective(shoPic);
        Integer id = shoPic.getId();
        return id;
    }
*/
/* public String savePicPath(MultipartFile multipartFile){
        String upload = upload(multipartFile);
        String shoPicPath= path+"/"+upload;
        return  shoPicPath;
    }
    */


    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    //七牛上传
    public String upload(MultipartFile multipartFile) {
        //构造一个带指定Zone对象的配置类
        Configuration cfg = new Configuration(Zone.zone0());
        //...其他参数参考类注释
        UploadManager uploadManager = new UploadManager(cfg);
        //默认不指定key的情况下，以文件内容的hash值作为文件名
        String key = null;
        try {
            //byte[] uploadBytes = "hello qiniu cloud".getBytes("utf-8");
            byte[] bytes = multipartFile.getBytes();
            Auth auth = Auth.create(accessKey, secretKey);
            String upToken = auth.uploadToken(bucket);
            try {
                Response response = uploadManager.put(bytes, key, upToken);
                //解析上传成功的结果
                DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
                if (putRet!=null){
                    return putRet.hash;
                }
                System.out.println(putRet.key);
                System.out.println(putRet.hash);
            } catch (QiniuException ex) {
                Response r = ex.response;
                System.err.println(r.toString());
                try {
                    System.err.println(r.bodyString());
                } catch (QiniuException ex2) {
                    //ignore
                }
            }
        } catch (Exception e){

        }
        return null;
    }


}

