package io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PhoneList02 
{
	public static void main(String[] args) 
	{
		Scanner scan = null;
		
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
			scan = new Scanner(file); // 파일을 읽을때는 ioexception 던짐
			
			while (scan.hasNextLine())
			{
				String name = scan.next();
				String phone01 = scan.next();
				String phone02 = scan.next();
				String phone03 = scan.next();
				
				System.out.println(name + ":" + phone01 + ":" + phone02 + ":" + phone03);
			}
		}
		catch (IOException e)
		{
			System.out.println("Error : " + e);
		}
		finally 
		{
			if (scan != null)
				scan.close(); // close 내부에서 알아서 ioexception함
		}
	}

}
