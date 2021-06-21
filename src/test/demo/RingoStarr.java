package test.demo;

import myspring.ComponentScan;

@ComponentScan ("test.demo")
public class RingoStarr implements Baterista
{
   @Override
   public String toString()
   {
      return "Ringo Starr";
   }

}
