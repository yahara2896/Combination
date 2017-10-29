package combination;

public class Combination_lib {
	private int n,f;
	
	
	public Combination_lib(int n, int f) {
		this.n = n;
		this.f = f;
	}

	public int getFactorial(int n) {
		if (n == 0) n = 1;
		else n = n * getFactorial(n-1);
		return n;
	}
}
