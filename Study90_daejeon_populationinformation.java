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
	// 0:���� 1:�߱� 2:���� 3:������ 4:����� //
	int sum = gu[0]+gu[1]+gu[2]+gu[3]+gu[4];
		
	POP()
	{
		System.out.println("<�����α����� ���α׷�>");
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
				System.out.println("���α׷� ����.");
				break;	
			}
			
		}
	}
	
	void home()
	{
		System.out.println("1.�����α��Է�");
		System.out.println("2.�����α�����");
		System.out.println("3.����");
		
		System.out.print("����: ");
		choice = sc.nextInt();
		System.out.println();
	}
	
	void input()
	{
		System.out.print("����(����:��): ");
		gu[0] = sc.nextInt();
		System.out.print("�߱�(����:��): ");
		gu[1] = sc.nextInt();
		System.out.print("����(����:��): ");
		gu[2] = sc.nextInt();
		System.out.print("������(����:��): ");
		gu[3] = sc.nextInt();
		System.out.print("�����(����:��): ");
		gu[4] = sc.nextInt();
		System.out.println();
		
		sum = gu[0]+gu[1]+gu[2]+gu[3]+gu[4];
	}
	
	void output()
	{
		System.out.println("�����α���:"+gu[0]+"����");
		System.out.println("�����α���:"+gu[1]+"����");
		System.out.println("�������α���:"+gu[2]+"����");
		System.out.println("������α���:"+gu[3]+"����");
		System.out.println("������α���:"+gu[4]+"����");
		System.out.println();
		System.out.println("�������α���:"+sum+"����");
		System.out.println();
	}
	
}
	
