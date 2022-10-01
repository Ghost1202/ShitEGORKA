package ua.com.car.shitegorki;

import java.util.Objects;
import java.lang.*;

public class Motorcycle {
	
	String name; 
	int yearOfProduction;
	int price;
	int weight;
	Color color;
	String engineType;
	boolean isReadyToDrive;
	private int distance = 0;
	
	public Motorcycle(String name, int yearOfProduction, int price, int weight, String color, String engineType, boolean isReadyToDrive) {
		this.name = name;
		this.yearOfProduction = yearOfProduction;
		this.price = price;
		this.weight = weight;
		this.color = Color.valueOf(color.trim().toUpperCase());
		this.engineType = engineType;
		this.isReadyToDrive = isReadyToDrive;
	}
		
	public void repair () {
	    isReadyToDrive = true;
	}
		
	public boolean isReadyToDrive() {
		return isReadyToDrive;
	}
	
	public void addDistance(int additinalDistance) {
		distance += additinalDistance;
		destroyEngine();
	}
		
	public void addDistance(double additinalDistance) {
		distance += Math.round(additinalDistance);
	}
		
	public void destroyEngine() {
		if (distance >= 200000) {
			isReadyToDrive = false;
		} else {
			isReadyToDrive = true;
		}
		
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
		return "Motorcycle [name=" + name + ", yearOfProduction=" + yearOfProduction + ", price=" + price + ", weight="
				+ weight + ", color=" + color + ", engineType=" + engineType + ", isReadyToDrive=" + isReadyToDrive
				+ ", distance=" + distance + "]";
	}





	@Override
	public int hashCode() {
		return Objects.hash(isReadyToDrive);
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Motorcycle other = (Motorcycle) obj;
		return isReadyToDrive == other.isReadyToDrive;
	} 

	
	
}
