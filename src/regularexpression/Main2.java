package regularexpression;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		System.out.print("名前を8文字で入力(A～Z、0～9) >");
		String name = new Scanner(System.in).next();
		if(isValidPlayerName(name)) {
			System.out.println("OK だYO!!");
		}else {
			System.out.println("NG だZE!!");
		}
		
	}

	// 正規表現を使った文字列判定
	public static boolean isValidPlayerName(String name) {
		return name.matches("[A-Z][0-9]{7}");
	}
}