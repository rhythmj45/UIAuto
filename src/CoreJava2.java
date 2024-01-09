import java.util.ArrayList;

public class CoreJava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //If-else and break with for loop
		
//		1 - Find multiples of 2
//		2 - Find if array has multiple of 2
		
		int [] arr = {1,2,3,4,5,6,7,8,9,10,11,121,143,1234,12345678};
		
		//1
		//2
		for (int i =0 ; i<arr.length ; i++)
		{
			if(arr[i]%2 ==0) 
			{
				System.out.println(arr[i]);
				break;
			}
			else
			{
				System.out.println(arr[i] + "is not a multiple of 2");

			}
		}
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("rahul");
		a.add("test");
		a.add("best");
		System.out.println(a.get(2));
	}

}
