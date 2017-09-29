package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;


public class GuiWindow extends Frame
{

	private static final long serialVersionUID = 1L;
	private TextField tf;
	public static String[] students; //Array that holds the student names
	private int i = 0;
	private int text_y = 30;
	private int text_x = 10;
	private TextField sn;
	private TextField randName;
	private ActionListener addName;
	private ActionListener getName;
	private Font nameFont = new Font("SansSerif", Font.PLAIN, 24);

	

	public GuiWindow()
	{
		students = new String[24];
		
		//Action listener to add names
		addName = new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				String name = tf.getText();
				if(!name.isEmpty() && i < 24)
				{	
					students[i] = name;
					tf.setText("");
					i++;
					
					sn = new TextField(name);
					sn.setBounds(text_x, text_y, 250, 40);
					sn.setFont(nameFont);
					sn.setEditable(false);
					add(sn);
					
					text_y += 50;
					
					if(i % 8 == 0)
					{
						text_x += 260;
						text_y = 30;
					}
				}
			}
		};
		
		//Action listener to get a pseudorandom name from the list of names.
		getName = new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				Random rand = new Random();
				int k = 0;
				
				/*
				 * This loop makes it so that only positions in the array
				 * that have values can be called by the random number.
				 * k is the variable that stores the amount of filled positions
				 * that is the basis for getting the random integer.
				 */
				for(int j = 0; j < students.length; j++) {
					if(students[j] != null)
					{
						k++;
					}
				}
				int rando = rand.nextInt(k);
				System.out.println(students[rando]);
				randName.setText(students[rando]);
				
			}
		};
		

		//Setting up the frame
		setSize(800, 600);
		setLayout(null);
		setVisible(true);

		//Creating the add button
		Button but = new Button("Add Student");
		but.setBounds(getWidth()/2,500,180,40);
		but.addActionListener(addName); //add action listener to button
		but.setFont(nameFont);
		add(but);
		
		//Creating the random button
		Button sbut = new Button("Get Student");
		sbut.setBounds(getWidth()/2 + 190, 500, 180, 40);
		sbut.addActionListener(getName);
		sbut.setFont(nameFont);
		add(sbut);

		//Creating a text field to enter names
		tf = new TextField();
		tf.addActionListener(addName);
		tf.setBounds(getWidth()/2 - 260, 500, 250, 40);
		tf.setFont(nameFont);
		add(tf);
		
		//Create a text field that shows the random name
		randName = new TextField();
		randName.setFont(nameFont);
		randName.setBounds(getWidth()/2 - 260, 450, 250, 40);
		randName.setEditable(false);
		add(randName);


		//Close window when exit button is clicked
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we){
				dispose();
			}
		});

	}
}