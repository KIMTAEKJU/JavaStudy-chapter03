package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		InputStream is = null;
		OutputStream os = null;
		
		try
		{
			is = new FileInputStream("Dooly.png");
			os = new FileOutputStream("Dooly.copy.png");
			
			int data = -1;
			while ((data = is.read()) != -1)
			{
				System.out.println(data);
				os.write(data);
			}
		}
		catch (FileNotFoundException e) 
		{
			System.out.println("파일이 없습니다.:" + e);
		}
		catch (IOException e)
		{
			System.out.println("입출력 에러:" + e);
		}

		finally 
		{
			// 자원정리
			try {
				if (is != null)
					is.close();
				
				if (os != null)
					os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
