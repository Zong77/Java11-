package Java11;

abstract class CShpape {
	protected String color;

	public CShpape(String str) {
		color = str;
	}

	public abstract void show();
}

class CRctangle8 extends CShpape {
	int width, height;

	public CRctangle8(int w, int h) {
		super("Yellow");
		width = w;
		height = h;
	}

	public void show() {
		System.out.print("color=" + color + ", ");
		System.out.println("area=" + width * height);
	}
}

class CCircle extends CShpape {
	double radius;

	public CCircle(double r) {
		super("Green");
		radius = r;
	}

	public void show() {
		System.out.print("color=" + color + ", ");
		System.out.println("area=" + 3.14 * radius * radius);
	}
}

public class Class01 {

	public static void main(String[] args) {
		CRctangle8 rect = new CRctangle8(5, 10);
		rect.show();
		CCircle cir = new CCircle(2.0);
		cir.show();
	}
}