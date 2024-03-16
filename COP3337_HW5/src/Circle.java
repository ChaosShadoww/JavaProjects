
public class Circle implements Shape{
	private double radius;
	public Circle() {
		
	}
	public Circle(double radius) {
		setRadius(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;	
	}
	public double area() {
		return Math.PI * Math.pow(getRadius(), 2);
	}
	

}
