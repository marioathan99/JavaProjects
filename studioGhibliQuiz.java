import javax.swing.JOptionPane;
public class Quiz {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String question = "When was the first Studio Ghibli movie released?\n";
		question += "A. 1999\n";
		question += "B. 2001\n";
		question += "C. 1986\n";
		do {
		  String answer = JOptionPane.showInputDialog(question);
		  answer = answer.toUpperCase();
    if ( answer.equals("A")  || answer.equals("B") || answer.equals("C")) {
	    if (answer.equals("C")) {
	    	JOptionPane.showMessageDialog(null,"Correct!");
			break;
		
    } else {
    	          JOptionPane.showMessageDialog(null,"Incorrect, please try again!");	
		     continue;
           }
    } else {
			      JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C!");	
		     continue;
	    }
		    } while(true);
	
	}
 }

		
