package Sample_0516;
import javax.swing.*;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

public class MyFrame extends JFrame{
	
	public MyFrame(){
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");	
		
		setLayout(new FlowLayout());
		JButton button = new JButton("bt");
		this.add(button);
		setVisible(true);
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		setLocation(screenSize.width/2, screenSize.height/2);
		
		
		
	}
	
	public MyFrame(int a, int b, String c){
		setSize(a,b);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(c);
		setVisible(true);		
	}
}
