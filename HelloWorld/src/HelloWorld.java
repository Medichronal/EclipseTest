
public class HelloWorld {
	public static void main(String args[]) {
		System.out.println("HelloWorld!");
		
		TestClass1 obj = new TestClass1(1);
		obj.setIndex(5);
		
		System.out.println(obj.getIndex());
		
	}
}
