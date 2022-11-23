package test.ch09;

public class AnonymousEx {

	public static void main(String[] args) {
		Anonymous anony  = new Anonymous();
		anony.field.run();
		anony.method1();
		anony.method2(new Anonymous() {
			
		});
		
	}

}
