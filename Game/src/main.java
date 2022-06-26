import java.util.*;
public class main {

	public static void main(String[] args)throws InputMismatchException{
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		try
		{
		Random rand = new Random();
		int ssssss=s.nextInt();
	      int num = rand.nextInt(21);
		int x;
	      
	      num=num==0?1:num;
	      
	   
		map m=new map(num,num);
		m.setcx();
		m.setcy();
		int n1=rand.nextInt(num);
		n1=n1==0?1:n1;
		int n2=rand.nextInt(num);
		n2=n2==0?1:n2;
		
		
		m.setwinx(n1);
		m.setwiny(n2);
		
		System.out.println("Win position "+m.getwiny()+" "+m.getwinx());
		while(true)
		{
			System.out.println("Current position "+m.getcy()+" "+m.getcx());
			
			System.out.println("enter the direction of your move");
			String ss=s.nextLine();
			
			int x=m.move(ss);
			if(x==1)
			{
				break;
			}
			else
			{
				
				continue;
			}
		}
	}
		catch (InputMismatchException ex)
		{
			System.out.println("Caught");
			ex.printStackTrace();
		}
	}


}
