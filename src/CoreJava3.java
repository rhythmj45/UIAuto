
public class CoreJava3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String is an object // String literal -- if values are same in 2 strings instead of creating a new string and allocating memory 
		// it will point to existng string containing same value
		
		String s1 = "Rahul Shetty Academy";
		String s2 = "Rahul Shetty Academy";
		String s5 = "hello";
		
		// new - both times memory is allocated
		
		String s4 = new String("Welcome");
		String s3 = new String ("Welcome");
		
		//Split method and trim
		
		String s = "Rahul Test Academy";
		String[] SplittedString = s.split(" ");
		for (String s6 : SplittedString) {
			System.out.println(s6);
		}
		
		
		String[] SplittedString1 = s.split("Test");
		for (String s6 : SplittedString1) {
			String s9 = s6.trim();
			System.out.println(s9);
			
		}
	//Print chars of String
		
		System.out.println("-----------------------------------");
		System.out.println("Print Chars of String s");

		for (int i=0 ; i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		System.out.println("-----------------------------------");
		System.out.println("-----------------------------------");
		System.out.println("Print Chars of String s in reverse order");
		
		//Print chars of String in reverse order

		for (int i=s.length()-1; i>=0;i--) {
			System.out.println(s.charAt(i));
		}
	}

}
