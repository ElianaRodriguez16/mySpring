package myspring;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Factory {

	public static Object getObject(Class<?> classGeneric)
			throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, ClassNotFoundException, InstantiationException {

		Class <?> instanciaGeneric = Class.forName(classGeneric.getName());
		Object classReturn = instanciaGeneric.getDeclaredConstructor().newInstance();
		Class<? extends Object> objetoDeClassConInfoDeMiClase = classReturn.getClass();

		Method metodo = null;
		Class <?> clase = null;
		final Field[] variables = classGeneric.getDeclaredFields();
		for (final Field variable : variables) {

			final Annotation anotacionObtenida = variable.getAnnotation(Injected.class);
			if (anotacionObtenida == null){
				//caso base devuelvo la instancia que me vino no hay mas atributos con injected en la clase
				return classReturn;
			}

			//sigue recorriendo los atributos de esta clase
			final Injected anotacionInjected = (Injected) anotacionObtenida; //solo hay injected

			Class<?> implementation = anotacionInjected.implementation();
				variable.setAccessible(true);
				String nameVariable = variable.getName();
				clase = variable.getType();

				//set
				String primeraLetra = nameVariable.substring(0, 1).toUpperCase();
				String resto = nameVariable.substring(1);
				metodo = objetoDeClassConInfoDeMiClase.getDeclaredMethod("set" + (primeraLetra + resto).toString(),
						clase);

				List<Object> collection = new ArrayList<Object>();
				int count = anotacionInjected.count();
				Object instancia = null;
				for(int i = 0;i<count;i++){

					instancia = getObject(implementation);//inyectar recursivo con instancia generica

					if(count>1){
						collection.add(instancia);
					}
				}

				if(count > 1){

					metodo.invoke(classReturn, collection);
				}else{

					metodo.invoke(classReturn, instancia);
			}
		}

		return classReturn;
	}

}
