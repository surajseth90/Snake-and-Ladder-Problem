
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
public class Start_Position {

	public static void main(String[] args) {
		int Position_of_Player_1 = 0;
		int Position_of_Player_2 = 0;
		int n1=0;
		int n2=0;
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();

		
		while(Position_of_Player_1!=100)
		{
		int dice = ThreadLocalRandom.current() .nextInt(1,7);
		int check_option = ThreadLocalRandom.current() .nextInt(0,3);
		if(check_option==0)
		{
			Position_of_Player_1 = Position_of_Player_1 ;
			arr1.add(n1,Position_of_Player_1);
			n1++;
		}
		else if(check_option==1)
		{
			Position_of_Player_1 = Position_of_Player_1 + dice;
			arr1.add(n1,Position_of_Player_1);
			n1++;
			if(Position_of_Player_1 >100)
			{
				Position_of_Player_1 = Position_of_Player_1 - dice;
			}
			while(check_option==1)
			{
			dice = ThreadLocalRandom.current() .nextInt(1,7);
			check_option = ThreadLocalRandom.current() .nextInt(0,3);	
			if(check_option==1)
				{
				Position_of_Player_1 = Position_of_Player_1 + dice;
				arr1.add(n1,Position_of_Player_1);
				n1++;
				if(Position_of_Player_1 >100)
				{
					Position_of_Player_1 = Position_of_Player_1 - dice;
				}
				}
			else if(check_option==0)
			{
				Position_of_Player_1 = Position_of_Player_1 ;
				arr1.add(n1,Position_of_Player_1);	
				n1++;
			}
			else
			{
				 Position_of_Player_1 = Position_of_Player_1 - dice;
				if(Position_of_Player_1>0)
					Position_of_Player_1 = Position_of_Player_1;
				else
					Position_of_Player_1 =0;
				arr1.add(n1,Position_of_Player_1);
				n1++;
			}
			if(Position_of_Player_1==100)
			{
				break;
			}
			}     

		}
		else
		{
			 Position_of_Player_1 = Position_of_Player_1 - dice;
			if(Position_of_Player_1>0)
				Position_of_Player_1 = Position_of_Player_1;
			else
				Position_of_Player_1 =0;
			arr1.add(n1,Position_of_Player_1);
			n1++;
		}
		if(Position_of_Player_1 >100)
		{
			Position_of_Player_1 = Position_of_Player_1 - dice;
		}
		if(Position_of_Player_1==100)
		{
			break;
		}
		}
		
		
		while(Position_of_Player_2!=100)
		{
		int dice = ThreadLocalRandom.current() .nextInt(1,7);
		int check_option = ThreadLocalRandom.current() .nextInt(0,3);
		if(check_option==0)
		{
			Position_of_Player_2 = Position_of_Player_2 ;
			arr2.add(n2,Position_of_Player_2);
			n2++;
		}
		else if(check_option==1)
		{
			Position_of_Player_2 = Position_of_Player_2 + dice;
			arr2.add(n2,Position_of_Player_2);
			n2++;
			if(Position_of_Player_2 >100)
			{
				Position_of_Player_2= Position_of_Player_2 - dice;
			}
					while(check_option==1)
					{
						dice = ThreadLocalRandom.current() .nextInt(1,7);
						check_option = ThreadLocalRandom.current() .nextInt(0,3);	
							if(check_option==1)
								{
									Position_of_Player_2 = Position_of_Player_2 + dice;
									arr2.add(n2,Position_of_Player_2);
									n2++;
									if(Position_of_Player_2 >100)
									{
										Position_of_Player_2 = Position_of_Player_2 - dice;
									}
								}
							else if(check_option==0)
								{
									Position_of_Player_2 = Position_of_Player_2 ;
									arr2.add(n2,Position_of_Player_2);	
									n2++;
								}
							else
								{
									Position_of_Player_2 = Position_of_Player_2 - dice;
									if(Position_of_Player_2>0)
										Position_of_Player_2 = Position_of_Player_2;
									else
										Position_of_Player_2 =0;
									arr2.add(n2,Position_of_Player_2);
									n2++;
								}
							if(Position_of_Player_2==100)
							{
								break;
							}
					}     
		
			}
			else
			{
			Position_of_Player_2 = Position_of_Player_2 - dice;
			if(Position_of_Player_2>0)
				Position_of_Player_2 = Position_of_Player_2;
			else
				Position_of_Player_2 =0;
			arr2.add(n2,Position_of_Player_2);
			n2++;
			}
			if(Position_of_Player_2 >100)
				{
					Position_of_Player_2 = Position_of_Player_2 - dice;
				}
			if(Position_of_Player_2==100)
				{
				break;
				}
		}
		if(n1>n2)
		{
			System.out.println("Player 2 won the game by rolling the dice : "+n2 +" times");
		}
		else
			System.out.println("Player 1 won the game by rolling the dice : "+n1 +" times");
	}
}
