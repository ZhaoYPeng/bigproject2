package com.zyp.action;

import org.csource.common.MyException;
import org.csource.fastdfs.*;

import java.io.IOException;
//测试git并上传
public class FastDfsTest {
    public void testFast() throws IOException, MyException {
        //测试git并上传2
        //测试git并上传2
        //加载配置文件
        ClientGlobal.init("D:\\zyp\\IdeaWorkSpace\\bigproject2\\ttmanagerweb\\src\\main\\resources\\client.conf");

        //创建跟踪器的客户端对象
        TrackerClient trackerClient = new TrackerClient();
        //创建跟踪器的服务端对象
        TrackerServer connection = trackerClient.getConnection();
        //声明一个存储器的服务端对象
        StorageServer storageServer = null;
        //创建存储器的客户端对象
        StorageClient storageClient = new StorageClient(connection,storageServer);
        //调用存储器客户端对象的上传方法
        String[] gifs = storageClient.upload_file("D:\\zyp\\material\\image\\c81044dd232a36ca61558decd961ed38.jpg", "JPG", null);
        //服务端返回完整的路径信息
//    for (String gif : gifs) {
//       System.out.println(gif);
//    }
        //路径拼接
        String url ="http://10.0.127.164:88/"+gifs[0]+"/"+gifs[1];
        System.out.println(url);

    }

    public static void main(String[] args) {
        FastDfsTest fastDFSTest = new FastDfsTest();
        try {
            fastDFSTest.testFast();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
