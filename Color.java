package ua.com.car.shitegorki;

public enum Color {
	
	WHITE ("White"),
	BLACK ("Black"),
	ORANGE ("Orange"),
	GREEN ("Green"),
	BLUE ("Blue");
	
	private String color;
	
	private Color(String color) {
		this.color = color;
	}
	
	public String toString() {
		return color;
	}
	
	
}

	
	
