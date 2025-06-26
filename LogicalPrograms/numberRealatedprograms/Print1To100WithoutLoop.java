package numberRealatedprograms;

public class Print1To100WithoutLoop {
	public static void main(String[] args) {
		print(1);

	}

	public static void print(int num) {
		if (num > 100)
			return;
		System.out.println(num);
		print(num + 1);
	}
}
