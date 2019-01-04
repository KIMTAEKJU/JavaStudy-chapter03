package chapter03;

public class WrapperClassTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer i = new Integer(10);
		Character c = new Character('A');
		Boolean b = new Boolean(true);
		
		System.out.println(i);
		System.out.println(c);
		System.out.println(b);
		
		//auto boxing
		Integer i2 = 10;
		Integer i3 = 10;
		System.out.println(i2 == i3);
		
		//auto Unboxing
		int j = 20 + i2;
	}

}
