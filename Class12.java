package Java11;

interface Data5 {
	public void best();

	public void failed();
}

interface Test5 extends Data {
	public void showData();

	public double average();
}

class CStu5 implements Test {
	protected String name;
	protected int math;
	protected int english;

	public CStu5(String s, int m, int eng) {
		name = s;
		math = m;
		english = eng;
	}

	public void show() {
		showData();
		best();
		failed5();
	}

	public void showData() {
		System.out.println("姓名:" + name);
		System.out.println("數學成績:" + math);
		System.out.println("英文成績:" + english);
		System.out.println("平均成績:" + average());
	}

	public void best() {
		if (math > english)
			System.out.println(name + "的數學比英文好");
		else if (math < english)
			System.out.println(name + "的英文比數學好");
	}

	public void failed5() {
		if (math < 60)
			System.out.println(name + "的數學當掉了");
		if (english < 60)
			System.out.println(name + "的英文當掉了");
		if (math >= 60 && english >= 60)
			System.out.println(name + "的數學和英文都及格");
	}

	public double average() {
		return (math + english) / 2.0;
	}
}

public class Class12 {

	public static void main(String[] args) {
		CStu5 stu = new CStu5("Judy", 58, 91);
		stu.show();
	}
}