package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GuiWindow extends Frame implements ActionListener
{	
	
	private static final long serialVersionUID = 1L;
	private TextField tf;
	private int i = 0;
	
	public GuiWindow()
	{
		
		//Setting up the frame
		setSize(600, 400);
		setLayout(null);
		setVisible(true);
		
		//Creating the only button
		Button but = new Button("Please Click Me!");
		but.setBounds(10,30,180,30);
		but.addActionListener(this); //add action listener to button
		add(but);
		
		//Creating a text field
		tf = new TextField(Integer.toString(i));
		tf.setBounds(250, 220, 250, 40);
		add(tf);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		i++;
		tf.setText(Integer.toString(i));
		
	}

}