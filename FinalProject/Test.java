import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Test extends JFrame
{
	private JLabel labelPrompt;
	private JButton buttonSelect;
	private JComboBox<String> comboBoxChoices;
	
	public Test()
	{
		createView();
		
		setTitle("Schedule Picker");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		pack();
	}
	
	private void createView()
	{
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		
		labelPrompt = new JLabel("Select a major from the list and click OK.");
		labelPrompt.setVisible(true);
		panel.add(labelPrompt);
		
		String[] choices = {"Advertising and Marketing", "Animation", "Applied Mathematics", 
								"Biology", "Biomathematics", "Biomedical Engineering", "Business Administration",
								"Chemistry", "Computer Science", "Computer Programming", "Criminal Justice", 
								"Economics", "Electrical Engineering", "English", "Environmental Science",
								"Game Design", "History", "Journalism", "Mechanical Engineering", "Photography",
								"Physics", "Political Science", "Psychology", "Statistics", "Theatre"};
		
		comboBoxChoices = new JComboBox<String>(choices);
		comboBoxChoices.setVisible(true);
		panel.add(comboBoxChoices);
		
		buttonSelect = new JButton("OK");
		panel.add(buttonSelect);
	}
	
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				new Test().setVisible(true);
			}
		});
	}
}