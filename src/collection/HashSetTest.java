package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Set<String> s = new HashSet<String>();
		
		String s1 = new String("고길동");
		String s2 = new String("고길동");
		
		s.add("둘리");
		s.add("마이콜");
		s.add(s1);
		
		System.out.println(s.contains(s2)); // 내용으로 확인  hashcode와 equals가 이미 오버라이딩되어서 true
		System.out.println(s.size());
		
		String s3 = new String("고길동");
		s.remove(s3);
		
		// 순회
		for (String str : s)
		{
			System.out.println(str);
		}
	}

}
