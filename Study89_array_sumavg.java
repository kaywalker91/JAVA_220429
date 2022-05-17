package Study0429;

import java.util.Scanner;

public class Study89_array_sumavg 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int Bun = 3;
		int kor[] = new int[Bun];
		int eng[] = new int[Bun];
		int math[] = new int[Bun];
		int sum[] = new int[Bun];
		int avg[] = new int[Bun];
		
		for(int i=0; i<Bun; i++)
		{
			System.out.print("±¹¾î:");
			kor[i] = sc.nextInt();
			System.out.print("¿µ¾î:");
			eng[i] = sc.nextInt();
			System.out.print("¼öÇÐ:");
			math[i] = sc.nextInt();
			System.out.println();
				
			sum[i] = kor[i]+eng[i]+math[i] ;
			avg[i] = sum[i]/3;
						
		}
					
		for(int i=0; i<Bun; i++)
		{
			System.out.println("ÃÑÁ¡:"+sum[i]);
			System.out.println("Æò±Õ:"+avg[i]);
			System.out.println();	
		}
				
	}

}


