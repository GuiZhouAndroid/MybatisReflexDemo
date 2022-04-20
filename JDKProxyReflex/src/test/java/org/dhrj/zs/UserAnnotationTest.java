package org.dhrj.zs;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * created by on 2022/4/18
 * 描述：用户类注解测试类
 *
 * @author ZSAndroid
 * @create 2022-04-18-17:07
 */
public class UserAnnotationTest {

    @Test
    public void test1() throws Exception {
        Class<?> userClass = Class.forName("org.dhrj.zs.User");
        if (userClass.isAnnotationPresent(Id.class)) {
            Field[] fields = userClass.getDeclaredFields();
            boolean isOk = false;
            for (Field f : fields) {
                if ("id".equals(f.getName()) && f.getType().getSimpleName().equals("int")) {
                    isOk = true;
                    break;
                }
            }
            if (!isOk) {
                throw new BaseNoHasIdException("Must declare int Type 'id' Field");
            }
        }
    }
}
