package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		// TODO Auto-generated method stub
		BufferedReader br = null;
		
		try 
		{
			// 주 스트림
			FileReader fr = new FileReader("./src/io/BufferedReaderTest.java");
			
			// 보조 스트림
			br = new BufferedReader(fr);
			
			// input
			int index = 0;
			String line = null;
			while ((line = br.readLine()) != null)
			{
				index++;
				System.out.print(index + ":");
				System.out.print(line);
				System.out.print("\n");
			}
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			System.out.println("error : " + e);
		}
		
		finally {
				try {
					if (br != null)
						br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

}
