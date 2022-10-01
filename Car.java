package ua.com.car.shitegorki;

public class Car {
	
	String name;
	int yearOfProdaction;
	int price;
	int weigth;
	Color color;
	boolean isReadyToService;
	private int distance = 0;
	protected int distanceOnService;
	
		public Car(String name, int yearOfProduction, int price, int weight, String color) {
		this.name = name;
		this.yearOfProdaction = yearOfProduction;
		this.price = price;
		this.weigth = weight;
		this.color = Color.valueOf(color.trim().toUpperCase());
		
		
	}
	
	public void addDistance(int additinalDistance) {
		distance += additinalDistance;
		distanceOnService += additinalDistance;
	}
		
	public void addDistance(double additinalDistance) {
		distance += Math.round(additinalDistance);
	}
		
	public boolean isReadyToService() {
		if (distanceOnService < 10000) {
			return true;
		}
		return false;
	}
	
	public void service(int distanceOnService) {
		if (distance >= distanceOnService) {
			distance = 0;
		}
	}
	
	public int getdistanceOnService() {
		return distanceOnService;
	}
	
	public int getDistance() {
		return distance;
	}
	
	public void addDistance() {
		distance += 100000;
	}

	public void repaint(String repaintColor) {
		color = Color.valueOf(repaintColor);

	}
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", yearOfProdaction=" + yearOfProdaction + ", price=" + price + ", weigth="
				+ weigth + ", color=" + color + ", isReadyToService=" + isReadyToService + ", distance=" + distance
				+ ", distanceOnService=" + distanceOnService + "]";
	}

	
	
}
