package test.demo;

import myspring.ComponentScan;

@ComponentScan("test.demo")
public class JohnLennon implements Guitarrista
{
   @Override
   public String toString()
   {
      return "John Lennon";
   }

}
