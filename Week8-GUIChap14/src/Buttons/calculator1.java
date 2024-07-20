package Buttons;

import java.awt.*;

import java.awt.event.*;
import java.io.IOException;
import java.io.*;
public class calculator1 extends Frame implements ActionListener {
    
	private Button btn1,btn2,save;
	private Label lbl1,lbl2,lbl3;
    private TextField fld1,fld2,fld3;
	public calculator1() {
		setLayout(new FlowLayout());
		
		btn1=new Button("+");
		btn2=new Button("-");
		save=new Button("SAVE TO FILE");
		lbl1=new Label("Input 1");
		lbl2=new Label("Input 2");
		lbl3=new Label("Result");
		
		fld1=new TextField();
		fld2=new TextField();
		fld3=new TextField();
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		save.addActionListener(this);
		add(lbl1);
		add(fld1);
		add(lbl2);
		add(fld2);
		add(btn1);
		add(btn2);
		add(lbl3);
		add(fld3);
		add(save);
		
		
		
		
		setSize(250, 300);
		setVisible(true);
		
		
	}
	
	public static void main(String arg[]) {
		calculator1 obj=new calculator1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btn1) {
			
			
			double sum=0.0;
			sum= Double.parseDouble(fld1.getText())+Double.parseDouble(fld2.getText());
			fld3.setText(""+sum);
		}
				 
		 if (e.getSource()==btn2) {
			double diff=0.0;
		diff= Double.parseDouble(fld1.getText())-Double.parseDouble(fld2.getText());
		fld3.setText(""+diff);
		
		}
		
		if(e.getSource()==save) {
			try{
				writeIt(fld3.getText());
				System.out.println("File Written");
			}
			catch(IOException exp) {
				System.out.println("File Write Error "+exp.getMessage());
			}
		}
	}
	
	public void writeIt(String text) throws IOException {
		FileWriter fw=new FileWriter("output.txt");
		PrintWriter pw=new PrintWriter(fw);
		pw.write(text);
		pw.close();
	
		
	}
}

