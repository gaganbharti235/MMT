package FunctionsUI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File  f= new File("C:\\Users\\ACER\\Desktop\\Read.txt");
		
		BufferedReader br= new BufferedReader(new FileReader(f));
		
		
		String str;
	//	int header=0;
		//int Trailer=0;
		
		boolean x=false;
		
		while((str = br.readLine()) != null)
		{
			
			//System.out.println(str);
			
			if(str.equalsIgnoreCase("10000"))
			{
				
				//System.out.println("True");
				
				x=true;
				
				break;
			}
			
		}
		
		System.out.println(x);

	}

}
