package test.demo;

import myspring.ComponentScan;

@ComponentScan ("test.demo")
public class GeorgeHarrison implements Guitarrista
{
   @Override
   public String toString()
   {
      return "George Harrison";
   }

}
