package Java11;

//method �O�ŧi�� Math �������A�b�������ŧi�� method �i�H�ٲ� abstract ����r�Cmethod ���e�i�H�[�W abstract ����r�A�]�i�H���[�C
interface Math {
	public abstract void show();

	public abstract void add(int a, int b);

	public abstract void sub(int a, int b);

	public abstract void mul(int a, int b);

	public abstract void div(int a, int b);
}

class Compute implements Math {
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

	public void show() {
		System.out.println("ans=" + ans);
	}
}

public class Class07 {

	public static void main(String[] args) {
		Compute cmp = new Compute();
		cmp.mul(3, 5);
		cmp.show();
	}
}