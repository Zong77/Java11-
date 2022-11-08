package Java11;

//編譯的錯誤訊息是指 Math 是抽象的，無法實體化。也就是說 Math 是抽象類別，沒辦法利用 Math 建立物件。
abstract class Math {
	protected int ans;

	public void show() {
		System.out.println("ans=" + ans);
	}

	public abstract void add(int a, int b);// a + b

	public abstract void sub(int a, int b);// a - b

	public abstract void mul(int a, int b);// a * b

	public abstract void div(int a, int b);// a / b
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

public class Class03 {

	public static void main(String[] args) {
		Math mth = new Math();
		Compute cmp = new Compute();
		cmp.mul(3, 5);
		cmp.show();
	}
}