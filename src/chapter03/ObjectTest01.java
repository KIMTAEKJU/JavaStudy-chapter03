package chapter03;

public class ObjectTest01 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Point p = new Point(10, 20);
		
		System.out.println(p.getClass()); // reflection
		System.out.println(p.hashCode()); // 힙메모리의 객체자체의 주소값 reference value x (레퍼런스 변수에 저장되어 있다)
										  // address x 
										  // 해싱 : 여러타입의 값을 하나의 int값으로 바꾸는것
										  // address 기반의 hashing값	주소기반이기때문에 유일
		
		System.out.println(p);	//객체가 들어가면 toString을 호출해줌
		System.out.println(p.toString()); // 객체를 String으로 변환   getClass() + "@" + hashCode()
										  // 객체의 내용을 보고싶다면 오버라이딩
		
		
		
	}
}
