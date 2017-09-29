package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class GuiWindow extends Frame implements ActionListener
{

	private static final long serialVersionUID = 1L;
	private TextField tf;
	//public static ArrayList<String> students;
	public static String[] students;
	private int i = 0;
	private int text_y = 30;
	private int text_x = 10;
	private TextField sn;

	

	public GuiWindow()
	{
		students = new String[24];

		//Setting up the frame
		setSize(800, 600);
		setLayout(null);
		setVisible(true);

		//Creating the only button
		Button but = new Button("Add Student");
		but.setBounds(getWidth()/2,500,180,30);
		but.addActionListener(this); //add action listener to button
		add(but);

		//Creating a text field
		Font nameFont = new Font("SansSerif", Font.PLAIN, 24);
		tf = new TextField();
		tf.addActionListener(this);
		tf.setBounds(getWidth()/2 - 260, 500, 250, 40);
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

		String name = tf.getText();
		students[i] = name;
		tf.setText("");
		i++;
		
		Font nameFont = new Font("SansSerif", Font.PLAIN, 24);
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