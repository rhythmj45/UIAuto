
public class CoreJava1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Data Types
		int num = 5;
		String Website = "Rahul Shetty";
		char letter = 'l';
		double dec = 5.99;
		boolean myCard = true;
		
		System.out.println("Hello"+num);
		
		
		//Arrays - Multiple values in one single variable
		int[] arr =  new int[5];
		arr [0] = 1;
		arr [1] = 2;
		arr [2] = 3;
		arr [3] = 4;
		arr [4] = 5;
		
		int[] arr2 = {1,2,3,4,5,6,7,8,9,0,0,10};
		System.out.println(arr[2]);
		
		//for loop
		for(int i=0 ; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
				
		String[] name =  {"rhythm" , "Rahul", "Shetty"}	;
		for(int i=0 ; i<name.length; i++) {
			System.out.println(name[i]);
		}
		for (String s :name)
		{
			System.out.print(s);
		}
	}
	}
