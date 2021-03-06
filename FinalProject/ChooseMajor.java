import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ChooseMajor extends JFrame
{
	private JLabel labelPrompt, labelResults;
	private JButton buttonSelect;
	private JComboBox<String> comboBoxChoices;
	private JPanel panelMajor, panelResults;
	
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
		panelMajor = new JPanel();
		getContentPane().add(panelMajor);
		
		labelPrompt = new JLabel("Select a major from the list and click OK.");
		labelPrompt.setVisible(true);
		panelMajor.add(labelPrompt);
		
		String[] choices = {"Advertising and Marketing", 
								"Animation", 
								"Applied Mathematics", 
								"Biology", 
								"Biomathematics", 
								"Biomedical Engineering", 
								"Business Administration",
								"Chemistry", 
								"Computer Science", 
								"Computer Programming",
								"Criminal Justice", 
								"Economics", 
								"Electrical Engineering", 
								"English", 
								"Environmental Science",
								"Game Design", 
								"History", 
								"Journalism", 
								"Mechanical Engineering",
								"Photography",
								"Physics", 
								"Political Science", 
								"Psychology", 
								"Statistics", 
								"Theatre"};
		
		comboBoxChoices = new JComboBox<String>(choices);
		comboBoxChoices.setVisible(true);
		comboBoxChoices.addActionListener(
				new ComboBoxChoicesActionListener());
		panelMajor.add(comboBoxChoices);
		
		buttonSelect = new JButton("OK");
		buttonSelect.addActionListener(
				new ButtonSelectActionListener());
		panelMajor.add(buttonSelect);
	}
	
	private class ButtonSelectActionListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MajorSort object = new MajorSort(getMajor());
			
			panelMajor.setVisible(false);

			panelResults = new JPanel();
			panelResults.setLayout(new BoxLayout(panelResults, BoxLayout.PAGE_AXIS));
			getContentPane().add(panelResults);
			
			String results = object.toString();
			labelResults = new JLabel(results);
			labelResults.setVisible(true);
			panelResults.add(labelResults);
			
			pack();
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