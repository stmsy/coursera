import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord
{
    public static void main (String[] args)
	{
        String champion = "";
        int counter = 1;
        while (!StdIn.isEmpty())
		{
            String animal = StdIn.readString();
			double prob = 1.0 / counter;
            boolean is_champion = StdRandom.bernoulli(prob);
            if (is_champion)
			{
                // champion initialized with first animal in text file
                champion = animal;
			}
            counter++;
		}
		StdOut.println(champion);
	}
}
