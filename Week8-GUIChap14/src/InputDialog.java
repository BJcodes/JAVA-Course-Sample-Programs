import javax.swing.JOptionPane;

public class InputDialog {
	public static void main(String arg[]) {
		
		String value=JOptionPane.showInputDialog("Entery Your GPA");
		
		double gpa=Double.parseDouble(value);
		if(2.0<=gpa && gpa<=4.0)
			JOptionPane.showMessageDialog(null, "Pass with "+gpa, "GPA VALUE"+"how are you", JOptionPane.PLAIN_MESSAGE);
		else if(0<=gpa && gpa<2.0)
			JOptionPane.showMessageDialog(null, "Fail with "+gpa);
		else
		JOptionPane.showMessageDialog(null, "Wrong Value "+gpa,"ERROR",JOptionPane.WARNING_MESSAGE);

		JOptionPane.showMessageDialog(null, "Just Checking","LABEL",JOptionPane.YES_NO_OPTION);
		
		
			
		
	}

}
