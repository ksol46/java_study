package test.ch12.interfaceGeneric;

public class CarAgency implements Rentable<Car> {

	@Override
	public Car rent() {
		return new Car(); //car객체를 리턴
	}

}
