class Demo1 {

	int fun(int x, int y) {
		int z = x + y;
		System.out.println(x);
		System.out.println(y);

		return z;
	}

	public static void main(String[] args) {
		Demo1 d = new Demo1(); // 1.By creating Object 2. By directly writes static
		d.fun(10, 20);

		int ans;
		System.out.println(ans);
	}

}