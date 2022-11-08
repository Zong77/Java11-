package Java11;

//可以執行。mod()、fac()與pow() method 會變成 Compute 類別裡自訂的 method，而非實作 AdvancedMath 介面中的 method。
interface Math2 {
	public void show();

	public void add(int a, int b);

	public void sub(int a, int b);

	public void mul(int a, int b);

	public void div(int a, int b);
}

class Compute interface Math {
	public void mod(int a, int b);

	public void fac(int a, int b);

	public void pow(int a, int b);
}

class Compute2 implements Math2, AdvanceMath {
	public int ans;

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

	public void mod(int a, int b) {
		ans = a % b;
	}

	public void fac(int a) {
		ans = 1;
		for (int i = 1; i <= a; i++)
			ans *= i;
	}

	public void pow(int a, int b) {
		ans = 1;
		for (int i = 1; i <= b; i++)
			ans *= a;
	}

	public void show() {
		System.out.println("ans=" + ans);
	}
}

public class Class09 {

	public static void main(String[] args) {
		Compute2 cmp = new Compute2();
		cmp.mul(3, 5);
		cmp.show();
		cmp.mod(14, 5);
		cmp.show();
		cmp.fac(5);
		cmp.show();
	}
}