package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new LinkedList();
		
		list.add("둘리");
		list.add("마이콜");
		list.add("도우넛");
		
		// 순회
		int count = list.size();
		for (int i = 0; i < count; i++)
		{	
			System.out.println(list.get(i));
		}
		
		list.remove(1);
		
		// 순회2
		Iterator<String> it = list.iterator();
		
		while (it.hasNext())
		{
			String s = it.next();
			System.out.println(s);
		}
		
		while (it.hasNext())
		{
			String s = it.next();
			System.out.println("-->" + s); // 한번 이터레이터 된애는 다시해야 적용이됨
		}
		
		// 순회3 for-each
		for (String s : list)
		{
			System.out.println(s);
		}
	}

}
