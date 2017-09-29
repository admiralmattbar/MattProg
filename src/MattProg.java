import java.awt.event.KeyEvent;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

import gui.GuiWindow;


public class MattProg 
{
	//public static GuiWindow gw;
	
	public static void main(String[] args)
	{
		
		new GuiWindow();
		
		JMenuBar menuBar;
		JMenu menu, submenu;
		JMenuItem menuItem;
		JRadioButtonMenuItem rbMenuItem;
		JCheckBoxMenuItem cbMenuItem;
		
		menuBar = new JMenuBar();
		menu = new JMenu("File");
		
		menuBar.add(menu);
		
	}
	

}
