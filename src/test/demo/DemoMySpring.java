package test.demo;

import java.lang.reflect.InvocationTargetException;

import myspring.ComponentScan;
import myspring.Factory;

@ComponentScan("test.demo")
public class DemoMySpring
{
   public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException, InstantiationException
   {
      Banda banda = (Banda) Factory.getObject(TheBeatles.class);
      System.out.println(banda.toString());
   }
}
