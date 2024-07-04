
import java.util.Scanner;
public class Calculator 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int ans = 0;
	
		while(true)
		{
			System.out.print("enter a number: ");
			int num1 = sc.nextInt();
			System.out.print("enter operator: ");
			char op = sc.next().charAt(0);
			if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%')
			{
				
				System.out.print("enter a number: ");
				int num2 = sc.nextInt();
				if(op == '+')
				{
					ans = num1 + num2;
				}
				if(op == '-')
				{
					ans = num1-num2;
				}
				if(op == '*')
				{
					ans = num1*num2;
				}
				if(op == '/' && num2 != 0)
				{
					ans = num1/num2;
				}
				if(op == '%')
				{
					ans = num1%num2;
				}
				
				
			}else if(op == 'x' || op == 'X')
			{
				break;
			}else 
			{
				System.out.println("invalid ");
				break;
			}
			
			System.out.println(ans);
			
			System.out.println("want to calculator again: y/n");
			char isActive = sc.next().charAt(0);
			if(isActive == 'y')
			{
				continue;
			}else if(isActive == 'n')
			{
				break;
			}
		}
		
	}

}
