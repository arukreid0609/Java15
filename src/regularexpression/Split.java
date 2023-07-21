package regularexpression;

public class Split {
	public static void main(String[] args) {
		String s = "abc,def:ghi";
		String[] words = s.split("[,:]");
		for(String word : words) {
			System.out.println(word);
		}
	}
}
