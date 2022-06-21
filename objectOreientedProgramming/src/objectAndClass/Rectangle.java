package objectAndClass;

public class Rectangle {
	private double width;
	private double height;

	public Rectangle() {
		this.width = 1;
		this.height = 1;
	}

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public double getArea() {
		return this.width * this.height;

	}

	public double getPerimetre() {
		return (this.height + this.width) * 2;
	}

	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(4, 40);
		Rectangle rec2 = new Rectangle(3.5, 35.9);
		System.out.println("rec1:");
		System.out.println("-width:" + rec1.getWidth());
		System.out.println("-height: " + rec1.getHeight());
		System.out.println("-Area: " + rec1.getArea());
		System.out.println("-Perimetre: " + rec1.getPerimetre());

		System.out.println("\nrec2:");
		System.out.println("-width:" + rec2.getWidth());
		System.out.println("-height: " + rec2.getHeight());
		System.out.println("-Area: " + rec2.getArea());
		System.out.println("-Perimetre: " + rec2.getPerimetre());
	}
}
