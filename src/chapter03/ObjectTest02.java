package chapter03;

public class ObjectTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p1 = new Point(10, 20);
		Point p2 = new Point(10, 20);
		Point p3 = p2;
		
		// == -> 두 객체의 동일성을 비교
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
		
		// equals() -> 두 객체의 동질성(내용) 비교
		// Object의 equals() 기본 구현은 == 연산 결과와 같다
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
		
		//String
		String s1 = new String("ABC");
		String s2 = new String("ABC");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode() + ":" + s2.hashCode()); // 내용기반으로 해싱하게끔 바뀜 equals 오버라이딩될때
		System.out.println(System.identityHashCode(s1) + ":" + System.identityHashCode(s2)); // address 기반의 해쉬값으로 살아남
		
		String s3 = "ABC"; // 무조건 new String을 해주는게아님 상수풀에 처음들어온건 해쉬값이 처음이니 new String 해주지만 
		String s4 = "ABC"; // 2번째꺼는 상수풀에 등록되어있으니 처음에했던거 사용	
						   // 그렇게 공유해서 쓰기때문에 불변객체가 되야함
						   // Integer 같은 랩퍼클래스들도 동일함
		System.out.println(s3 == s4); 
		System.out.println(s3.equals(s4));
		System.out.println(s3.hashCode() + ":" + s4.hashCode());
		System.out.println(System.identityHashCode(s3) + ":" + System.identityHashCode(s4));
	}

}
