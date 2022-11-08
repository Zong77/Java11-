package Java11;

//show() method 不能宣告成 static，由於 Math 是抽象類別，並非實體，不能直接由類別去呼叫類別函數，如 Compute.mul(3, 5)。
abstract class Math {
	protected int ans;

	public void show() {
		System.out.println("ans=" + ans);
	}

	public static void add(int a, int b);// a + b

	public static void sub(int a, int b);// a - b

	public static void mul(int a, int b);// a * b

	public static void div(int a, int b);// a / b
}

class Compute extends Math {
	public void add(int a, int b) {
		ans = a + b;
	}

	public void sub(int a, int b) {
		ans = a - b;
	}

	public void mul(int a, int b) {
		ans = a * b;
	}

	public void div(int a, int b) {
		ans = a / b;
	}
}

public class Class04 {

	public static void main(String[] args) {
		Compute cmp = new Compute();
		cmp.mul(3, 5);
		cmp.show();
	}
}