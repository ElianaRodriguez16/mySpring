package test.demo3;

import java.lang.reflect.InvocationTargetException;

import myspring.ComponentScan;
import myspring.Factory;

@ComponentScan("test.demo3")
public class TestAlquilarAuto {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException, InstantiationException
	   {
	      Automovil automovil = (Automovil) Factory.getObject(AutoFamiliar.class);
	      automovil.probarLuces();
	      automovil.colocarVidriosPolarizados();
	      automovil.colocarPuertas();
	      automovil.colocarBotiquin();
	
	      }
}
