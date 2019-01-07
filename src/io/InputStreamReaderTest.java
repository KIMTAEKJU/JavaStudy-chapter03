package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class InputStreamReaderTest 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		InputStreamReader isr = null;
		
		try {
			// 주 스트림
			FileInputStream fis = new FileInputStream("123.txt");
			
			// 보조 스트림
			isr = new InputStreamReader(fis, "MS949");
			
			int data = -1;
			while ((data = isr.read()) != -1)
			{
				System.out.println((char)data);
			}
		} catch (FileNotFoundException e)
		{   
			// TODO Auto-generated catch block
			System.out.println("Error: " + e);
		}catch(UnsupportedEncodingException e)
		{
			System.out.println("Error: " + e);

		}
		catch(IOException e)
		{
			System.out.println("Error: " + e);

		}
		finally {
				try {
					if (isr != null)
						isr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

}
