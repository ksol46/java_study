package test.ch01;

public class Hello {

	public static void main(String[] args) {
		//패키지 : 코드를 묶어주는 애.이클립스 프로젝트 만들시 제일 처음 만들어야함
		//클래스 : 네임의 시작은 대문자로 / public static 체크


		//[C + f11:코드실행] [] 
		//주석(C + /) : [//:한줄] [/* */:여러줄] [/** */:api도큐먼트 작성시(설명을 길게 달아야할때)] 

		//vs코드에서 콘솔같은 것 = System.out.println("");
		//이클립스는 코드가 끝날때마다 ;를 필수로 달아줘야함 : 안그럼오류
		//메인안의 코드가 제일 먼저 실행됨(실행시키고 싶은 코드는 메인안에 작성)
		
		
		
		
		int var1 = 0b1011; //0b(2진수)
		int var2 = 0206; //8진수
		int var3 = 365; //10진수
		int var4 = 0xB3; //16진수 //print=한 줄 띄우고 출력, println=이어서 출력
		long var5 = 123456789123L;
		long var6 = 123456789123l; // long은 뒤에 l(L)을 써준다.
		char c1 = 'A'; //작은 따옴표, 문자 1개
		char c2 = 44032;
		
		float var7 = 0.1234567574567f;
		//float var6 = 0.123456757456F; // float는 f(F)를 붙인다.
		double var8 = 0.1234567574567;
		double var9 = 3e6; // 3.0 * 10^6
		double var10 = 2e-3; //2.0 * 10^-3
		float var11 = 3e6f; // 3.0 * 10^6
		
		boolean stop = true;
		
		int x = 10;
		boolean result1 = (x ==20);
//		System.out.println(result1);
		
		
		String name ="나는 \n김솔\n입니다"; //큰 따옴표, 문자 1개 혹은 여러개
		String one="A";
		System.out.println(name);
		
		
		//10진수 출력
		//System.out.println(var1 + ":" + var2 + ":" + var3 + ":" + var4);
		//System.out.println(var5);
		//System.out.println(var6);
		//System.out.println(c1);
		//System.out.println(c2);
//		System.out.println(var7 + "," + var8);
//		System.out.println(var9);
//		System.out.println(var10);
//		System.out.println(var11);
//		System.out.println(result1);
		
	
		
		
		
	}
}
	
