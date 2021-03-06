import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Test extends JFrame
{
	private JLabel labelPrompt, labelResults;
	private JButton buttonSelect;
	private JComboBox<String> comboBoxClassOne, comboBoxClassTwo, comboBoxClassThree, comboBoxClassFour;
	private JPanel panelCourses, panelResults;
	
	private String[] classes;
	
	public Test()
	{
		classes = new String[4];
		
		createView();
		
		setTitle("Schedule Picker");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
	}
	
	private void createView()
	{
		panelCourses = new JPanel();
		panelCourses.setLayout(new BoxLayout(panelCourses, BoxLayout.PAGE_AXIS));
		getContentPane().add(panelCourses);
		
		labelPrompt = new JLabel("Select your four favorite AP courses and click OK.");
		labelPrompt.setVisible(true);
		panelCourses.add(labelPrompt);
		
		String[] courses = {"[Select Course]", 
								"AP Art History", 
								"AP Biology", 
								"AP Calculus AB", 
								"AP Calculus BC", 
								"AP Chemistry", 
								"AP Chinese", 
								"AP Computer Science",
								"AP Economics", 
								"AP Environmental Science", 
								"AP European History", 
								"AP French",
								"AP Government",
								"AP Japanese",
								"AP Language and Composition",
								"AP Literature and Composition",
								"AP Physics 1", 
								"AP Physics 2", 
								"AP Physics C",
								"AP Psychology", 
								"AP Spanish", 
								"AP Statistics", 
								"AP Studio Art", 
								"AP U.S. History", 
								"AP World History"};
								
		comboBoxClassOne = new JComboBox<String>(courses);
		comboBoxClassOne.setVisible(true);
		comboBoxClassOne.addActionListener(
				new comboBoxClassOneActionListener());
		panelCourses.add(comboBoxClassOne);
		
		comboBoxClassTwo = new JComboBox<String>(courses);
		comboBoxClassTwo.setVisible(true);
		comboBoxClassTwo.addActionListener(
				new comboBoxClassTwoActionListener());
		panelCourses.add(comboBoxClassTwo);
		
		comboBoxClassThree = new JComboBox<String>(courses);
		comboBoxClassThree.setVisible(true);
		comboBoxClassThree.addActionListener(
				new comboBoxClassThreeActionListener());
		panelCourses.add(comboBoxClassThree);
		
		comboBoxClassFour = new JComboBox<String>(courses);
		comboBoxClassFour.setVisible(true);
		comboBoxClassFour.addActionListener(
				new comboBoxClassFourActionListener());
		panelCourses.add(comboBoxClassFour);
		
		buttonSelect = new JButton("OK");
		buttonSelect.addActionListener(
				new ButtonSelectActionListener());
		panelCourses.add(buttonSelect);
	}
	
	//Action Listeners. There's probably a more effiecient way to incorporate these into the code.
	private class ButtonSelectActionListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			CourseSort object = new CourseSort(getCourses());
			
			panelCourses.setVisible(false);
			
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
	
	private class comboBoxClassOneActionListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			classes[0] = (String)comboBoxClassOne.getSelectedItem(); 
		}
	}
	
	private class comboBoxClassTwoActionListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			classes[1] = (String)comboBoxClassTwo.getSelectedItem(); 
		}
	}
	
	private class comboBoxClassThreeActionListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			classes[2] = (String)comboBoxClassThree.getSelectedItem(); 
		}
	}
	
	private class comboBoxClassFourActionListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			classes[3] = (String)comboBoxClassFour.getSelectedItem(); 
		}
	}
	
	public String[] getCourses()
	{
		return classes;
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