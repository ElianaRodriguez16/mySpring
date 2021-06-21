package test.demo2;

import myspring.ComponentScan;
import myspring.Injected;
import myspring.Factory;

@ComponentScan("test.demo2")
public class DemoMySpring
{
   public static void main(String[] args)
   {
      Auto auto = Factory.getObject(FordFiesta.class);      
      auto.regular();
      auto.acelerar();
      auto.frenar();
   }
}
