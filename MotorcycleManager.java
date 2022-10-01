package ua.com.car.shitegorki;

public class MotorcycleManager {

	public static void main(String[] args) {

		Motorcycle suzuki = new Motorcycle("Suzuki Suzuki GSX-R1000", 2021, 1600, 600, "Black", "diesel", true); 
		
		Motorcycle yamaha = new Motorcycle("Yamaha FZ1", 2007, 9000, 700, "orangE", "gas", false);

		yamaha.repaint("BLACK");
		yamaha.repair();
		yamaha.addDistance(-11.5);
        yamaha.addDistance(200000);
        yamaha.repair();
        suzuki.addDistance(200000);
        suzuki.addDistance(11.5);
        System.out.println(suzuki);                                                                                                                                                                                                                                                                      
        System.out.println(yamaha);                                                                                                                                                                                                                                                                      
        System.out.println(suzuki.equals(yamaha));
	}

}
