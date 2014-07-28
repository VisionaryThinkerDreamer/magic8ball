import java.util.Random;

import javax.swing.JOptionPane;

public class Main
{
	public static void main(String[] args)
	{

		// TODO Auto-generated method stub
		int random;
		random = new Random().nextInt(4);
		JOptionPane.showInputDialog("Ask a question");
		if (random == 0)
		{
			JOptionPane.showMessageDialog(null, "Yes");
		}
		if (random == 1)
		{
			JOptionPane.showMessageDialog(null, "No");
		}
		if (random == 2)
		{
			JOptionPane.showMessageDialog(null, "Maybe?");
		}
		if (random == 3)
		{
			JOptionPane.showMessageDialog(null, "I feel faint.");
		}
	}
}
