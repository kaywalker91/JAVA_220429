package Study0429;

import java.util.Scanner;

public class Study90_daejeon_populationinformation 
{
	public static void main(String[] args)
	{

	POP pop = new POP();
	
	}
		
}

class POP
{
	Scanner sc = new Scanner(System.in);
		
	int choice;
	int gu[] = new int[5];
	// 0:서구 1:중구 2:동구 3:유성구 4:대덕구 //
	int sum = gu[0]+gu[1]+gu[2]+gu[3]+gu[4];
		
	POP()
	{
		System.out.println("<대전인구정보 프로그램>");
		System.out.println();
		
		while(true)
		{
			home();
			
			if(choice == 1)
			{
				input();
			}
			else if(choice == 2)
			{
				output();
			}	
			else if(choice == 3)
			{
				System.out.println("프로그램 종료.");
				break;	
			}
			
		}
	}
	
	void home()
	{
		System.out.println("1.대전인구입력");
		System.out.println("2.대전인구정보");
		System.out.println("3.종료");
		
		System.out.print("선택: ");
		choice = sc.nextInt();
		System.out.println();
	}
	
	void input()
	{
		System.out.print("서구(단위:만): ");
		gu[0] = sc.nextInt();
		System.out.print("중구(단위:만): ");
		gu[1] = sc.nextInt();
		System.out.print("동구(단위:만): ");
		gu[2] = sc.nextInt();
		System.out.print("유성구(단위:만): ");
		gu[3] = sc.nextInt();
		System.out.print("대덕구(단위:만): ");
		gu[4] = sc.nextInt();
		System.out.println();
		
		sum = gu[0]+gu[1]+gu[2]+gu[3]+gu[4];
	}
	
	void output()
	{
		System.out.println("서구인구수:"+gu[0]+"만명");
		System.out.println("동구인구수:"+gu[1]+"만명");
		System.out.println("유성구인구수:"+gu[2]+"만명");
		System.out.println("대덕구인구수:"+gu[3]+"만명");
		System.out.println("대덕구인구수:"+gu[4]+"만명");
		System.out.println();
		System.out.println("대전총인구수:"+sum+"만명");
		System.out.println();
	}
	
}
	
