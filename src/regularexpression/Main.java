package regularexpression;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.print("名前を8文字で入力(A～Z、0～9) >");
		String name = new Scanner(System.in).next();
		if(isValidPlayerName(name)) {
			System.out.println("OK");
		}else {
			System.out.println("NG");
		}
		
	}

	// 正規表現を使わない文字列判定
	public static boolean isValidPlayerName(String name) {
		// 文字列が8文字ちょうどか判定
		if (name.length() != 8) {
			return false;
		}

		// １文字目がA～Zか判定
		char first = name.charAt(0);
		if (!(first >= 'A' && first <= 'Z')) {
			return false;
		}

		// 2文字目以降はA～Z、0～9の文字を使ってるか判定
		for (int i = 1; i < 8; i++) {
			char c = name.charAt(i);
			if (!((c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
				return false;
			}
		}
		return true;
	}
}
