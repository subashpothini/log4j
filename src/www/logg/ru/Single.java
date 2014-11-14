package www.logg.ru;

public class Single {

	private static Single single;

	private Single() {

	}

	public double pow(double a) {
		System.out.println("a" + a);
		return a * a;

	}

	public static Single getInstance() {
		if (single == null) {
			single = new Single();
		}
		return single;
	}
}
