package com.WhizTraining.Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionPractice {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String operation = "div";
        int x = 200;
        int y = 100;

       Operations opr = new Operations();

       Method m = opr.getClass().getMethod(operation, int.class, int.class);
       m.invoke(opr,x,y);

        /* if(operation.equals("add"))
            System.out.println(opr.sum(x,y));
        else if(operation.equals("diff"))
            System.out.println(opr.diff(x,y));
        else if(operation.equals("mult"))
            System.out.println(opr.mult(x,y));
        else if(operation.equals("div"))
            System.out.println(opr.div(x,y));*/
    }


}
