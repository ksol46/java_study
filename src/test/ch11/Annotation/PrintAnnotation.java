package test.ch11.Annotation;
//Annotation은 클래스가 아니고 Annotation파일로 따로 생성해준다.
import java.lang.annotation.*;


//어노테이션 정의
//@Target은 어노테이션을 사용할 수 있는 곳을 지정한다.
@Target({ElementType.METHOD})
//타겟 : 어노테이션 적용 대상을 써준 곳에만 어노테이션이 적용됨.
//METHOD : 메소드, FIELD : 필드, 생성자 : CONSTRUCTOR, 클래스타입 : TYPE
@Retention(RetentionPolicy.RUNTIME)
//RUNTIME : 계속 진행됨 , SOURCE : 컴파일 될 때 , CLASS : 메모리 할당 될 때
//@Retention : 유지정책, 어노테이션을 언제 시작해서 언제까지 유지를 할건지 지정.
public @interface PrintAnnotation {
	//상속의 interface가 아니라 Annotation의 interface이다.
	//적용하고 싶은 자리를 정해줄 수 있다.
	
	String value() default "-";
	int number() default 15; //default ->
	
	
}
