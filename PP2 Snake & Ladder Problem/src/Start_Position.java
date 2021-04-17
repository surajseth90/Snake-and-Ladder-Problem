import java.util.concurrent.ThreadLocalRandom;
public class Start_Position {

	public static void main(String[] args) {
		int player = 0;
		
		while(player!=100)
		{
		int die = ThreadLocalRandom.current() .nextInt(1,7);
		int check_option = ThreadLocalRandom.current() .nextInt(0,3);
		if(check_option==0)
		{
			player = player ;
		}
		else if(check_option==1)
		{
			player = player + die;
		}
		else
		{
			 player = player - die;
			if(player>0)
				player = player;
			else
				player =0;
		}
		if(player >100)
		{
			player = player - die;
		}
		if(player==100)
		{
			break;
		}
			
		
		}
	}
}
