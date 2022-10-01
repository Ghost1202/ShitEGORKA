package ua.com.car.shitegorki;

public class MotorcycleManagerCop {
	public static void main(String[] args) {

		Motorcycle suzuki = new Motorcycle("Suzuki Suzuki GSX-R1000", 2021, 1600, 600, "Black", "diesel", true); 
		
		Motorcycle yamaha = new Motorcycle("Yamaha FZ1", 2007, 9000, 700, "orangE", "gas", false);
		Motorcycle yamaha2 = new Motorcycle("Yamaha FZ1", 2007, 9000, 700, "orangE", "gas", false);

		yamaha.addDistance(1000);
		suzuki.addDistance(1000);                                                                                                                                                                                                                                                                        
        suzuki.addDistance(2000);                                                                                                                                                                                                                                                                        
        yamaha.repair();                                                                                                                                                                                                                                                                             
        
        System.out.println(suzuki);                                                                                                                                                                                                                                                                      
        System.out.println(yamaha);                                                                                                                                                                                                                                                                      
        System.out.println(suzuki.equals(yamaha));
		System.out.println(yamaha.equals(yamaha2));
	}

}
