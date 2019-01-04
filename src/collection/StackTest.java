package collection;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class StackTest 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>(); // 스택 멀티스레드
		
		stack.push("둘리");
		stack.push("또치");
		stack.push("희동이");
		
		while (stack.isEmpty() == false)
		{
			String value = stack.pop();
			System.out.println(value);
		}
		
		stack.pop(); // 비어있는 경우, 예외발생
		
		stack.push("둘리");
		stack.push("또치");
		stack.push("희동이");
		
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
