package test.demo;

import myspring.ComponentScan;
import myspring.Factory;

@ComponentScan("test.demo")
public class DemoMySpring
{
   public static void main(String[] args)
   {
      Banda banda = Factory.getObject(TheBeatles.class);
      System.out.println(banda.toString());
   }
}
