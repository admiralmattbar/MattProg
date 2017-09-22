package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;


public class GuiWindow extends Frame implements ActionListener
{

	private static final long serialVersionUID = 1L;
	private TextField tf;
	private int i = 0;
	public static ArrayList<String> students;


	int clickCount = 0;

	public GuiWindow()
	{

		//Setting up the frame
		setSize(600, 400);
		setLayout(null);
		setVisible(true);

		//Creating the only button
		Button but = new Button("Please Click Me!");
		but.setBounds(300,380,180,30);
		//but.addActionListener(this); //add action listener to button
		add(but);

		//Creating a text field
		Font nameFont = new Font("SansSerif", Font.PLAIN, 24);
		tf = new TextField();
		tf.addActionListener(this);
		tf.setBounds(250, 220, 250, 40);
		tf.setFont(nameFont);
		add(tf);


		//Close window when exit button is clicked
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we){
				dispose();
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		students.add(tf.getText());
		System.out.print(students);
		tf.setText("");

	}

}