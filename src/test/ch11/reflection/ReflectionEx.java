package test.ch11.reflection;

//import java.lang.reflect.Constructor;
//import java.lang.reflect.Field;
//import java.lang.reflect.Method;

//*
import java.lang.reflect.*;



public class ReflectionEx {

	public static void main(String[] args) {
		//Car객체에 대한 클래스 정보를 얻어옴.
		Class clazz = Car2.class;
		
		System.out.println("[생성자 정보]");
		//Constructor는 import해줘서 사용한다. / Constructor라는 배열에 받음.
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			System.out.println(constructor.getName() + "(");
			//파라미터의 타입을 불러온다.
			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		
		System.out.println("[필드 정보]");
		//Field라는 배열
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields ) {
			System.out.println(field.getType().getName() + " " + field.getName());
		}
		
		System.out.println("[메소드 정보]");
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			System.out.print(method.getName() + "(");
			//파라미터의 타입을 불러온다.
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
	}
	
	private static void printParameters(Class[] parameters) {
		for (int i=0; i<parameters.length; i++) {
			System.out.print(parameters[i].getName());
			if (i<parameters.length-1) { //
				System.out.print(","); //매개변수 사이에 콤마를 
			}
		}
	}

}
