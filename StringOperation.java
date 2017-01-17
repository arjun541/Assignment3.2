


import java.util.Scanner;

public class StringOperation {

		public static void main(String args[])
		{
			 boolean isEqual=false;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the first String");
			String s1=sc.nextLine();
			System.out.println("enter the Second String");
			String s2=sc.next();
			if(s1.equals(s2))
			{
				isEqual=true;
			}
			
			System.out.println("status--->"+isEqual);
		}
}
