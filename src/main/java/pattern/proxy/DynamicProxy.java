package pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author : Lin Can
 * @description : 代理类
 * @modified ：By
 * @date : 2018/5/28 14:04
 */
public class DynamicProxy implements InvocationHandler {

    /**
     * 需要被代理的目标对象
     */
    private Object target;

    public Object bind (Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("被代理类的方法执行之前----------------");
        //执行目标方法
        Object result = method.invoke(target, args);
        System.out.println("被代理类的方法执行之后---------------");
        return result;
    }
}
