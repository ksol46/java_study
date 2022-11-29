package test.ch12;
//제네릭 타입을 여러가지로 사용해줄수도 있다~~!
public class Product<K, M> { //타입 파라메터 정의
	//필드
	private K kind; //종류
	private M model; //모델
	public K getKind() {
		return kind;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
}
