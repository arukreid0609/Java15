
public class Main2 {

	public static void main(String[] args) {
		String s1 = "Java and JavaScript";
		String emailAdress = "sasaki0609pm@gmail.com";
		if(s1.contains("Java")) {
			System.out.println("文字列s1は、Javaが含んでいます");
		}
		if(emailAdress.endsWith("@gmail.com")) {
			System.out.println("文字列emailAdressは、@gmail.comが末尾にあります");
		}
		System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
		System.out.println("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));
	}

}
