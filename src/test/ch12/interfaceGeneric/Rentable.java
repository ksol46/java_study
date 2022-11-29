package test.ch12.interfaceGeneric;

public interface Rentable<P> {
	P rent(); //메소드의 리턴타입이 뭔지 모르기 때문에 그냥 P라고 타입을 줬음.
}
