package org.dhrj.zs;

import org.junit.Test;

import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * created by on 2022/4/18
 * 描述：配置文件路径相关
 *
 * @author ZSAndroid
 * @create 2022-04-18-10:56
 */
public class PathTest {

    @Test
    public void test1() throws Exception {
//        //路径方式：获取配置文件的绝对路径
//        String path = Thread.currentThread().getContextClassLoader().getResource("path.properties").getPath();
//        //通过IO流读取配置文件
//        FileReader reader = new FileReader(path);
        //字节流方式：
        InputStream reader = Thread.currentThread().getContextClassLoader().getResourceAsStream("path.properties");
        Properties properties = new Properties();
        properties.load(reader);
        reader.close();
        //Class.forName()只对静态啊代码块执行
        System.out.println(Class.forName(properties.getProperty("className")).newInstance());
    }

    @Test
    public void test2() {
        // ResourceBundle是JDK工具包自带的资源绑定器，只能绑定xxx.properties文件。
        // 并且这个文件必须在类路径下。文件扩展名也必须是properties并且在写路径的时候，路径后面的扩展名不能写。
        System.out.println(ResourceBundle.getBundle("path").getString("className"));
    }
}
