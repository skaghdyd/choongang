package chap08;

public class DriverEx {

	public static void main(String[] args) {
		System.out.println(Vehicle2.X);
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		Vehicle2 bus2 = new Bus();
		Vehicle2 taxi2 = new Taxi();
		
		Vehicle3 bus3 = new Bus();
		
//		driver.drive(bus);
		driver.drive(taxi);
		
		driver.drive(bus2);
		driver.drive(taxi2);
		
		driver.drive(bus3);

	}

}
