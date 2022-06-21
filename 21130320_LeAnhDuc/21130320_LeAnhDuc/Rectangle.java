

public class Rectangle {
	private double width = 1;
	private double height = 1;

	public Rectangle() {
		super();
	}

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(4, 40);
		Rectangle rec2 = new Rectangle(3.5, 35.9);
		System.out.println("Rec1");
		System.out.println("- Width: " + rec1.getWidth());
		System.out.println("- Height: " + rec1.getHeight());
		System.out.println("-> Area: " + rec1.getArea());
		System.out.println("-> Perimeter: " + rec1.getPerimeter());
		System.out.println("Rec2");
		System.out.println("- Width: " + rec2.getWidth());
		System.out.println("- Height: " + rec2.getHeight());
		System.out.println("-> Area: " + rec2.getArea());
		System.out.println("-> Perimeter: " + rec2.getPerimeter());

	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public double getArea() {
		return Math.round(this.width * this.height*100.0)/100.0;
	}

	public double getPerimeter() {
		return (this.height + this.width) * 2;
	}
}
