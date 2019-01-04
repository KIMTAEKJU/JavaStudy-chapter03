package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Map<String, Integer> m = new HashMap<String, Integer>(); // 키관리는 hashSet
		
		m.put("one", 1); // auto boxing
		m.put("two", 2);
		m.put("three", 3);
		
		int i = m.get("two");
		System.out.println(i);
		
		m.put("three", 33333);
		System.out.println(m.get("three")); // 덮어버림
		
		// 순회
		Set<String> keys = m.keySet();
		
		for (String key : keys)
		{
			int v = m.get(key);
			System.out.println(v);
		}
	}

}
