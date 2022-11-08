package Java11;

interface iVolume {
	public void showData();

	public double vol();
}

abstract class CSphere implements iVolume {
	final double PI = 3.14;
	protected int x;
	protected int y;
}

class CCircle3 extends CSphere {
	protected int radius;

	public CCircle3(int a, int b, int r) {
		x = a;
		y = b;
		radius = r;
	}

	public void showData() {
		System.out.println("�y��:(" + x + "," + y + ")");
		System.out.println("�b�|:" + radius);
		System.out.println("�y��n:" + vol());
	}

	public double vol() {
		return ((4.0 / 3) * PI * radius * radius * radius);
	}
}

public class Class14 {

	public static void main(String[] args) {
		CCircle3 cir = new CCircle3(8, 6, 2);
		cir.showData();
	}
}