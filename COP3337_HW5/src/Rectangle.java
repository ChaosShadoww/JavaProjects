
public class Rectangle implements Shape{
	private double height;
	private double width;
	public Rectangle() {
		
	}
	public Rectangle(double height, double width) {
		setHeight(height);
		setWidth(width);
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double area() {
		return getWidth() * getHeight();
	}
	

}
