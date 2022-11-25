package test.ch11.test;

public class Member {
	//필드
	private String id;
	private String name;
	//생성자
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		
		return id + ": " + name;
	}
	
	
	
	
	
}
