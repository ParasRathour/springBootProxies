package springbootproxies;

import springbootproxies.classes.Man;
import springbootproxies.classes.Person;
import springbootproxies.classes.PersonInvocationHandler;

import java.lang.reflect.Proxy;

public class App {
    public static void main(String[] args) {

        Man mohan = new Man("Mohan" , 30 , "delhi" ,"india");
        ClassLoader mohanClassLoader = mohan.getClass().getClassLoader();
        Class[] interfaces = mohan.getClass().getInterfaces();
        Person proxyMohan =(Person) Proxy.newProxyInstance(mohanClassLoader, interfaces , new PersonInvocationHandler(mohan));
        proxyMohan.introduce(mohan.getName());
    }
}
