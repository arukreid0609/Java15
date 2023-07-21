package regularexpression;

public class ReplaceAll {
	public static void main(String[] args) {
		String s = "abc,def:ghi";
		String w1 = s.replaceAll("[beh]", "X");
		String w2 = s.replaceFirst("[beh]", "X");

		System.out.println("replaceAll   : " + w1);
		System.out.println("replaceFirst : " + w2);
	}
}
