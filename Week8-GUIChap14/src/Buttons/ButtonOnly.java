package Buttons;

import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.Flow;

public class ButtonOnly extends Frame implements ActionListener {

	private Button btn1,btn2;
	private Label lbl1,lbl2,lbAction1,lbAction2;
	public static int i=0;
	public static int lbcount1=0;
	public static int lbcount2=0;
	public ButtonOnly() {
		setLayout(new FlowLayout());
		btn1=new Button("Button 1");
		btn2=new Button("Button 2");
		
		lbl1=new Label("A");
		lbl2=new Label("B");
		lbAction1=new Label("0");
		lbAction2=new Label("0");
		add(lbl1);
		add(btn1);
		add(lbl2);
		add(btn2);
		add(lbAction1);
		add(lbAction2);
		
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		setTitle("Simple Button Only");
		setSize(250, 100);
		setVisible(true);
	    
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Button 1 Pressed");
		//System.out.println("Button Pressed "+i++);
		if(e.getSource()==btn1) 
			lbAction1.setText(""+lbcount1++);
		else 
			lbAction2.setText(""+lbcount2++);
		
		
	}
	
	public static void main(String arg[]) {
		ButtonOnly obj=new ButtonOnly();
	}

}
