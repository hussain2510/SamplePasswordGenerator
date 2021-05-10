
import java.util.*;
public class M {
	
	static Scanner sc=new Scanner(System.in);
	static Random r=new Random();
	
	public static void Manual_pass(int length)
	{
		sc.nextLine();
		System.out.println("Enter Sample Password");
		String sample=sc.nextLine();
		String s="abcdefghijklmnopqrstuvwxyz";
		String s1="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String symbol="@";
		String a="0123456789";
		char sam[]=sample.toCharArray();
		String values=s+s1+symbol+a;
		char finl[]=values.toCharArray();
		for(int i=0;i<length;i++)
		{
			char c=sam[i];
			String p=Character.toString(c);
			if(s.contains(p))
			{
				finl[i]=s.charAt(r.nextInt(s.length()));
				continue;
			}
			else if(s1.contains(p))
			{
				finl[i]=s1.charAt(r.nextInt(s1.length()));
				continue;
			}
			else if(symbol.contains(p))
			{
				finl[i]=symbol.charAt(0);
				continue;
			}
			else if(a.contains(p))
			{
				finl[i]=a.charAt(r.nextInt(a.length()));
				continue;
			}
		}
		System.out.println("Your Manual Password is:");
		for(int j=0;j<length;j++)
		{
			System.out.print(finl[j]);
		}
		System.out.println();
		
	}
	public static void Automated_pass(int length)
	{
		
		String s="abcdefghijklmnopqrstuvwxyz";
		String s1="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String symbol="@";
		String a="0123456789";
		String value=s+symbol+a+s1;
		char [] c=value.toCharArray();
		for(int i=0;i<length;i++)
		{
			if(i==0)
			{
				c[i]=s1.charAt(r.nextInt(s1.length()));
				continue;
			}
			else
				c[i]=value.charAt(r.nextInt(value.length()));
		}
		for(int j=0;j<length;j++)
		{
			System.out.print(c[j]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b=true;
		while(b){	
			System.out.println("1.Automated Password\n2.Manual Password");
			int n=sc.nextInt();
			switch(n){
			
				case 1:
						System.out.println("Enter Password Length");
						int length=sc.nextInt();
						System.out.println("Your Automated Password is:");
						Automated_pass(length);
						break;
				case 2:
						System.out.println("Enter Password Length");
						length=sc.nextInt();
						Manual_pass(length);
						break;
			}
				
		}
}
}
