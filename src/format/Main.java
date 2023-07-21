package format;

public class Main {
	public static void main(String[] args) {
		final String FORMAT = "%-9s %-13s 所持金%,6d";
		String s = String.format(FORMAT, "sasaki","Hero",156);
		System.out.println(s);
		System.out.printf(FORMAT,"sasakiY","Thief",56444);
	}
}
