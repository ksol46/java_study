package test.ch12.Wild;

public class Applicant <T> {
	//필드 
	public T kind;
	   //생성자
	   public Applicant(T kind) {
	      this.kind = kind;
	   }
}
