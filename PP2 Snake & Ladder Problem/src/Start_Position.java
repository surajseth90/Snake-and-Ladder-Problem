import java.util.concurrent.ThreadLocalRandom;
public class Start_Position {

	public static void main(String[] args) {
		int player = 0;
		int Actual_die ;
		//int die =(int) (Math.random()*10);
		
			for(int i=0; i<100;i++)
			{
				int die = ThreadLocalRandom.current() .nextInt(1,7);
				System.out.println(die);
			}
		
		     
		      
		


		
	}

}
