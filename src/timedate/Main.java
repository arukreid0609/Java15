package timedate;

public class Main {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		String str = "sasaki";
		for(int i=0;i<10000;i++) {
			str += "Java";
		}
		long end = System.currentTimeMillis();
		System.out.println("処理にかかった時間は・・・" + (end - start) + "ミリ秒でした。");

	}

}
