package Java11;

class CShape {
}

class CCircle15 extends CShape {
}

class CTriangle extends CShape {
}

class CCoin extends CCircle15 {
}

public class Class15 {

	public static void main(String[] args) {
		CCircle15 circle = new CCircle15();
		CTriangle triangle = new CTriangle();
		CCoin coin = new CCoin();
		if (circle instanceof CCoin)
			System.out.println("circle�~��CCoin");
		else
			System.out.println("circle�S���~��CCoin");

		if (triangle instanceof CShape)
			System.out.println("triangle�~��CShape");
		else
			System.out.println("triangle�S���~��CShape");

		if (coin instanceof Object)
			System.out.println("coin�~��Object");
		else
			System.out.println("coin�S���~��Object");
	}
}