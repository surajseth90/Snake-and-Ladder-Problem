import java.util.concurrent.ThreadLocalRandom;
public class Start_Position {

	public static void main(String[] args) {
		int player = 0;
		int die = ThreadLocalRandom.current() .nextInt(1,7);
		System.out.println("die: "+die);
		int check_option = ThreadLocalRandom.current() .nextInt(0,3);
		System.out.println("option: "+check_option);
		if(check_option==0)
		{
			player = player+0;
			System.out.println(player);
		}
		else if(check_option==1)
		{
			player = player +die;
			System.out.println(player);
		}
		else
		{
			 player = player -die;
			if(player>0)
				player = player;
			else
				player =0;
		}
	}
}
