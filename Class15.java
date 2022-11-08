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
			System.out.println("circleÄ~©ÓCCoin");
		else
			System.out.println("circle¨S¦³Ä~©ÓCCoin");

		if (triangle instanceof CShape)
			System.out.println("triangleÄ~©ÓCShape");
		else
			System.out.println("triangle¨S¦³Ä~©ÓCShape");

		if (coin instanceof Object)
			System.out.println("coinÄ~©ÓObject");
		else
			System.out.println("coin¨S¦³Ä~©ÓObject");
	}
}