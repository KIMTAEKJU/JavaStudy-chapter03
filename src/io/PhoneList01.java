package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class PhoneList01 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		BufferedReader br = null;
		
		try
		{
			File file = new File("phone.txt");
			
			if (!file.exists())
			{
				System.out.println("File Not Found");
				return;
			}
			
			System.out.println("======파일정보======");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length() + "bytes");
	
			System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(file.lastModified())));
			
			System.out.println("======전화번호======");
			
			// 주 스트림(byte)
			FileInputStream fis = new FileInputStream(file);
			
			// 보조 스트림(byte -> char)
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			
			// 보조 스트림2 (line 입력)
			br = new BufferedReader(isr);
			
			// 처리
			String line = null;
			StringTokenizer st = null;
			String token = null;
			int index = 0;
			
			while ((line = br.readLine()) != null)
			{
				st = new StringTokenizer(line, "\t "); // tab 과 스페이스로 되어있는부분 분리
				
				while (st.hasMoreElements())
				{
					token = st.nextToken();
					System.out.print(token);

					if (index == 0)	// 이름
						System.out.print(":");
					else if (index == 1)	// 번호1
						System.out.print("-");
					else if (index == 2)
						System.out.print("-");
					
					index++;
				}
				
				index = 0;
				System.out.println();
			}
		}
		catch (IOException e)
		{
			System.out.println("Error : " + e);
		}
		finally 
		{
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
