package springbootproxies.classes;

import  java.lang.reflect.Method;
import java.lang.reflect.InvocationHandler;

public class PersonInvocationHandler implements InvocationHandler{

    private Person person;

    public PersonInvocationHandler(Person person){
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy , Method method , Object[] args){
        System.out.println("Hi");
        return null;

    }


}
