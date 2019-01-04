package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class FileReaderTest 
{
	public static void main(String[] args) 
	{
		Reader in = null;
		InputStream is = null;
		
		try {
			in = new FileReader("123.txt");
			
			int data = -1;
			int count = 0;
			
			while ((data = in.read()) != -1)
			{
				count++;
				System.out.print((char)data);
			}
			
			System.out.println();
			System.out.println(count);
			System.out.println("====================");
			
			is = new FileInputStream("123.txt");
			count = 0;
			
			while ((data = is.read()) != -1)
			{
				count++;
				System.out.print((char)data);
			}
			
			System.out.println();
			System.out.println(count);
			
		} catch (FileNotFoundException e) {   //IOException이 FileNotFoundException의 부모
			// TODO Auto-generated catch block
			System.out.println("파일이 없습니다.:" + e);
		}catch (IOException e) {					
			// TODO Auto-generated catch block
			System.out.println("입출력 에러:" + e);
		}finally {
			
				try {
					if (in != null)
						in.close();
					if (is != null)
						is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

}
