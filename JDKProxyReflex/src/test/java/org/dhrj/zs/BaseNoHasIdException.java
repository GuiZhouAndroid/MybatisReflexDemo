package org.dhrj.zs;

/**
 * created by on 2022/4/18
 * 描述：自定义异常
 *
 * @author ZSAndroid
 * @create 2022-04-18-17:21
 */
public class BaseNoHasIdException extends RuntimeException {

    public BaseNoHasIdException() {
    }

    public BaseNoHasIdException(String message) {
        super(message);
    }
}
