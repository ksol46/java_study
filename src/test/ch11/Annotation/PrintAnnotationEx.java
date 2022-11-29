package test.ch11.Annotation;

import java.lang.reflect.*;
import java.security.Provider.Service;

public class PrintAnnotationEx {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		for(Method method : declaredMethods) {
			PrintAnnotation printAno = method.getAnnotation(PrintAnnotation.class);
			//PrintAnnotation 얻기									//얻어오고 싶은 클래스 정보를 넣어준다.
			printLine(printAno);
				//method를 실행시키는 함수 invoke
			method.invoke(new Service());
		}
	}

	
	//메소드
	public static void printLine(PrintAnnotation printAno) {
		if (printAno != null) {
			//1. number속성 값 얻기
			int number = printAno.number();
								//내가 만들어놓은 속성에 대한 값을 그대로 가져옴.
			String value = printAno.value();
			
			System.out.println(number);
			System.out.println(value);
		}
	}
	
	
	
	
	
	
}
