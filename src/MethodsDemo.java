
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here Object declaration is required because static is not used and the method is linked to the object of the class
		MethodsDemo d = new MethodsDemo();
		d.getData();
		String name = d.getData1();
		System.out.print(name);
		
		// Here Object declaration is skipped because static is passed
		String res = getData3();
		System.out.print(res);
		
		// Accessing method from different class
		MethodsDemo2 d1 = new MethodsDemo2();
		String otherclass = d1.getUsers();
		System.out.print(otherclass);

	}

	// Why Method ? should be written outside main block
	// should be invoked whenever needed
	
	public void getData()
	{
		System.out.print("Hello World");
	}
	
	public String getData1()
	{
		System.out.print("Hello World");
		return "rahul shetty";
	}
	
	// if you create method with static then that method will belong to the class and not to the object of the class
	//Static will move the method to class level and object creation is not necessary
	
	public static String getData3()
	{
		System.out.println("Method directly mapped to class");
		return "we used static keyword and now the object declaration is not required";
	}
	
}
