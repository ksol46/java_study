package test.ch06.hyundai;

import test.ch06.hankook.SnowTire;
import test.ch06.kumho.AllSeasonTire;

public class Car {
	//다른 패키지에 있는 class는 반드시 패키지 import를 해줘야한다.
	SnowTire snowT = new SnowTire();
	AllSeasonTire allT = new AllSeasonTire();
	Test test = new Test();
	//이렇게 해도 임포트가 되지만 코드가 지저분해져서 잘 사용하지 않음. 참고만 할 것.
//	test.ch06.hankook.Tire tire1 = new test.ch06.hankook.Tire();
	
}
