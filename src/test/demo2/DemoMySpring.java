package test.demo2;

import java.lang.reflect.InvocationTargetException;

import myspring.ComponentScan;
import myspring.Injected;
import myspring.Factory;

@ComponentScan("test.demo2")
public class DemoMySpring
{
   public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException, InstantiationException
   {
      Auto auto = (Auto) Factory.getObject(FordFiesta.class);
      auto.regular();
      auto.acelerar();
      auto.frenar();
      auto.prendeBujia();
   }
}
