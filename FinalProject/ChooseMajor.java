import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ChooseMajor extends JFrame
{
	private JLabel labelPrompt;
	private JButton buttonSelect;
	private JComboBox<String> comboBoxChoices;
	
	private String major = "Advertising and Marketing";
	
	public ChooseMajor()
	{
		createView();
		
		setTitle("Schedule Picker");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
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
		comboBoxChoices.addActionListener(
				new ComboBoxChoicesActionListener());
		panel.add(comboBoxChoices);
		
		buttonSelect = new JButton("OK");
		buttonSelect.addActionListener(
				new ButtonSelectActionListener());
		panel.add(buttonSelect);
	}
	
	private class ButtonSelectActionListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MajorSort object = new MajorSort(getMajor());
			System.out.println(object);
			System.exit(0);
		}
	}
	
	private class ComboBoxChoicesActionListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			major = (String)comboBoxChoices.getSelectedItem();
		}
	}
	
	public String getMajor()
	{
		return major;
	}
	
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				new ChooseMajor().setVisible(true);
			}
		});
	}
}