package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest 
{
	public static void main(String[] args) 
	{
		BufferedOutputStream bos = null;
		
		try {
			// 주 스트림 소스에 연결
			FileOutputStream fos = new FileOutputStream("test.txt");
			
			// 보조 스트림 주 스트림에 연결
			bos = new BufferedOutputStream(fos);
			
			// output
			for (int i = 'a'; i < 'z'; i++)
			{
				bos.write(i);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found:" + e);
		} catch (IOException e)
		{
			
		}
			finally {
		
				try {
					if (bos != null)
						bos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

}
