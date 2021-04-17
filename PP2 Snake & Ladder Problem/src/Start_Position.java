
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
public class Start_Position {

	public static void main(String[] args) {
		int Position_of_Player = 0;
		int n=0;
		ArrayList<Integer> arr = new ArrayList<Integer>();

		
		while(Position_of_Player!=100)
		{
		int die = ThreadLocalRandom.current() .nextInt(1,7);
		int check_option = ThreadLocalRandom.current() .nextInt(0,3);
		if(check_option==0)
		{
			Position_of_Player = Position_of_Player ;
			arr.add(n,Position_of_Player);
		}
		else if(check_option==1)
		{
			Position_of_Player = Position_of_Player + die;
			arr.add(n,Position_of_Player);
		}
		else
		{
			 Position_of_Player = Position_of_Player - die;
			if(Position_of_Player>0)
				Position_of_Player = Position_of_Player;
			else
				Position_of_Player =0;
			arr.add(n,Position_of_Player);
		}
		if(Position_of_Player >100)
		{
			Position_of_Player = Position_of_Player - die;
		}
		if(Position_of_Player==100)
		{
			
			System.out.println("Dice was played "+(n+1) +
					" times and player reached at the winning position "+Position_of_Player);
			break;
		}
		System.out.println("Dice was played "+(n+1) +
				" times and player reached at the position "+Position_of_Player);
		n++;
		}
	}
}
