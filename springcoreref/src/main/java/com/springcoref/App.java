package com.springcoref;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
          ApplicationContext context=new ClassPathXmlApplicationContext("com/springcoref/ref.xml");
          TestRefrenceA testRefrenceA=(TestRefrenceA)context.getBean("refA");
          
          //here is get TestRefrenceA  object
          System.out.println(testRefrenceA.getX());
          System.out.println(testRefrenceA.getY());
          System.out.println(testRefrenceA.getZ());
          
          //here is get TestRefrenceB object
          System.out.println(testRefrenceA.getOb());
    }
}
