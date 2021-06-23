package myspring;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class FactoryTree {

	public static Object getObject(Class<?> classGeneric)
			throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, ClassNotFoundException, InstantiationException {

		
		Class <?> instanciaGeneric = Class.forName(classGeneric.getName());

		Object classReturn = null;
		classReturn = instanciaGeneric.getDeclaredConstructor().newInstance();
	
		Class<? extends Object> objetoDeClassConInfoDeMiClase = classReturn.getClass();




		
		Method metodo = null;
		Class <?> clase = null;
		final Field[] variables = classGeneric.getDeclaredFields();
		for (final Field variable : variables) {

			final Annotation anotacionObtenida = variable.getAnnotation(Injected.class);

			if (anotacionObtenida != null && anotacionObtenida instanceof Injected) {
				final Injected anotacionInjected = (Injected) anotacionObtenida;

				int count = anotacionInjected.count();
				List<Object> collection = new ArrayList<Object>();

				for(int i = 0;i<count;i++){

					Class<?> implementation = anotacionInjected.implementation();

					variable.setAccessible(true);

					String nameVariable = variable.getName();
					clase = variable.getType();

					System.out.println("nombre atributo :  " + nameVariable);
					System.out.println("y el nombre de la clase es " + clase);
					System.out.println("implementation " + implementation);
					System.out.println("");

					Class <?> instancia = Class.forName(implementation.getName());

					Object obj = null;
					obj = instancia.getDeclaredConstructor().newInstance();

					String primeraLetra = nameVariable.substring(0, 1).toUpperCase();
					String resto = nameVariable.substring(1);

					if(count>1){
						collection.add(obj);

						metodo = objetoDeClassConInfoDeMiClase.getDeclaredMethod("set" + (primeraLetra + resto).toString(),
								clase);



						metodo.invoke(classReturn, collection);



					}else{
						metodo = objetoDeClassConInfoDeMiClase.getDeclaredMethod("set" + (primeraLetra + resto).toString(),
								clase);

						metodo.invoke(classReturn, obj);
					}


				}


			}

		}

		return classReturn;
	}

	
	
	
	
	
	
}