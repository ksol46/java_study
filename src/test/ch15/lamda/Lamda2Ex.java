package test.ch15.lamda;

public class Lamda2Ex {

	public static void main(String[] args) {
		read((a,b) -> {
			System.out.println(a+b);
		});
	}
	
	public static void read(Calculable3 calculable3) {
		double a = 13.5;
		double b = 5.4;
		calculable3.Calculator(a, b);
	}

}
