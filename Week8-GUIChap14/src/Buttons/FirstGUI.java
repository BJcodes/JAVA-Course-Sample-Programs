package Buttons;

import java.awt.*;

import java.awt.event.*;

public class FirstGUI extends Frame implements ActionListener {
    public static int counter=0;
	private Button btn1,btn2;
	private Label lbl1,lbl2;
	public static int c1=1;
	public static int c2=1;
	public FirstGUI() {
		setLayout(new FlowLayout());
		btn1=new Button("A");
		btn1.addActionListener(this);
		lbl1=new Label();
		lbl1.setText("Label 1");
		lbl2=new Label();
		lbl2.setText("Label 2");
		btn2=new Button();
		btn2.setLabel("B");
		
		btn2.addActionListener(this);
		add(btn1);
		add(btn2);
		add(lbl1);
		add(lbl2);
	
		
		setSize(250, 300);
		setVisible(true);
		
		
	}
	
	public static void main(String arg[]) {
		FirstGUI obj=new FirstGUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btn1)
		 lbl1.setText("Hi"+c1++);
		else
			lbl2.setText("Bye"+c2++);
		
	}
}
