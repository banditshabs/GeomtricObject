public class Square extends GeometricObject implements Colorable {
	
	private double side;
	private String color;
	
	public Square(double side) {
		this.side = side;
	}
	
	public Square(double side, String color) {
		this.side = side;
		this.color = color;
	}
	
	public double getside() {
		return side;
	}
	
	public String getColor() {
		return color;
	}
	
	@Override
	public void howToColor() {
		System.out.println("Color all four sides.");
	}

	@Override
	public double getArea() {
		return side*2;
	}
	
	@Override
	public double getPerimeter() {
		return side*4;
	}
	
	@Override
	public String toString() {
		return "SQUARE: Length= " +this.side + ", Color= " + this.color ;
	}
	
	

}
