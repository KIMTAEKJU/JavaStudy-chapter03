package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class IOExample 
{
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		byte[] src = {0, 1, 2, 3, 4};
		byte[] dest = null;
		
		InputStream is = new ByteArrayInputStream(src); // 바로 소스(파일)이 들어가기때문에 주 스트림
		OutputStream os = new ByteArrayOutputStream(); // 내부에 destination이 있다 생성하면서 꽂혀져있다 내부에있는걸 받아오기위해
														// 내부에 정보를 바깥으로  얘만의 특별한기능  내부적으로 빨대를 꽂았다
		int data = -1;
		
		while ((data = is.read()) != -1)
		{
			os.write(data);
		}
		
		dest = ((ByteArrayOutputStream)os).toByteArray();
		
		System.out.println(Arrays.toString(src));
		System.out.println(Arrays.toString(dest));
	}

}
