package chapter03;

public class StringTest01 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// c:\temp
		// /temp(unix) <-> c:\temp (window)
		String s1 = "/temp";
		
		// "Hello"
		String s2 = "\"Hello\"";
		
		System.out.println(s1);
		System.out.println(s2);
		
		// \t -> tab
		// \n -> new line
		// \r -> carriage return
		System.out.println("Hello\tWorld");
		System.out.print("Hello\tWorld");
		System.out.println();
		
		// ''
		char c = '\'';
		System.out.println(c);
	}

}
