package test.demo;

import myspring.ComponentScan;

@ComponentScan ("test.demo")
public class PaulMcCartney implements Bajista
{
   @Override
   public String toString()
   {
      return "Paul McCartney";
   }

}
