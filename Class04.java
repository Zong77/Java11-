package Java11;

//show() method ����ŧi�� static�A�ѩ� Math �O��H���O�A�ëD����A���ઽ�������O�h�I�s���O��ơA�p Compute.mul(3, 5)�C
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