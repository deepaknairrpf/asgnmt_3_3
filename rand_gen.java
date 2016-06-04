import java.util.Random;
public class rand_gen {
	private int number;
	rand_gen(){number = 0;}
	rand_gen(int number)
	{
		this.number=number;
	}
	
public int randGen()
{
	Random r = new Random();
	return (Math.abs(r.nextInt())%number);
}
}
