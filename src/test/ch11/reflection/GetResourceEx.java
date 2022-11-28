package test.ch11.reflection;

public class GetResourceEx { //경로를 얻는다.
	
	public static void main(String[] args) {
		//car클래스에 대한 정보를 먼저 가져온다.
		Class clazz = Car.class;
							//getResource : 이름 그대로 리소스를 가져온다.
		String photo1Path = clazz.getResource("link.png").getPath();
		String photo2Path = clazz.getResource("images/link.png").getPath();
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);

	}

}
