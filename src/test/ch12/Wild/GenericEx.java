package test.ch12.Wild;

public class GenericEx {

	public static void main(String[] args) {
		   //모든 사람이 신청			regiCourse1(Applicant(T kind))
	      Course.registerCourse1(new Applicant<Person>(new Person()));
	      Course.registerCourse1(new Applicant<Worker>(new Worker()));
	      Course.registerCourse1(new Applicant<Student>(new Student()));
	      Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
	      Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
	      //학생만 신청
//	      Course.registerCourse2(new Applicant<Person>(new Person()));
//	      Course.registerCourse2(new Applicant<Worker>(new Worker()));
	      Course.registerCourse2(new Applicant<Student>(new Student()));
	      Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
	      Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
	      //직장인 및 일반인 신청
	      Course.registerCourse3(new Applicant<Person>(new Person()));
	      Course.registerCourse3(new Applicant<Worker>(new Worker()));
//1	      Course.registerCourse3(new Applicant<Student>(new Student()));
//	      Course.registerCourse3(new Applicant<HighStudent>(new HighStudent()));
//	      Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));


	}

}
