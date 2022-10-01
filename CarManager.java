package ua.com.car.shitegorki;

public class CarManager {

	public static void main(String[] args) {

		Bus toyota = new Bus("Toyota Supra", 2008, 12000, 1600, "Orange");
		
		toyota.addDistance(12000);
		
		System.out.println(toyota);
		
		
		
		
	}

}
