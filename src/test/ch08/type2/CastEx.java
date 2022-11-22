package test.ch08.type2;

public class CastEx {

	public static void main(String[] args) {
//		Vehicle vehicle = new Bus(); //자동 타입변환(형변환)
//		vehicle.run();
//		
//		Bus bus = (Bus) vehicle;
//		bus.run();
//		bus.checkFare();
		
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		ride(taxi);
		ride(bus);
		
		
	}						//Vehicle vehicle = new Bus 와 같다. 자동형변형.
	public static void ride(Vehicle vehicle) {
		//vehicle이 Bus 객체를 가지고 있니? 하고 물어봄
		//Vehicle vehicle = new Bus();
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
			
			
			
			
	}
}
