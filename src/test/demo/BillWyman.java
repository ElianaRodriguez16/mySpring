package test.demo;

import myspring.ComponentScan;

@ComponentScan("test.demo")
public class BillWyman implements Bajista
{
   @Override
   public String toString()
   {
      return "Bill";
   }

}
