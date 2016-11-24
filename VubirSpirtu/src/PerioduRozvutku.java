import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PerioduRozvutku extends JFrame {

	JFrame perioduRozvutku = new JFrame("Періоди  сприятливого розвитку");
 
	String f = "res/Періоди  сприятливого розвитку.png";
	
	ImageIcon logo = new ImageIcon(f);
	JLabel l_logo = new JLabel(logo);
 
	public PerioduRozvutku() {
 
		perioduRozvutku.setVisible(true);
//		perioduRozvutku.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		perioduRozvutku.setSize(800, 600);
		perioduRozvutku.setResizable(false);
		perioduRozvutku.setLocationRelativeTo(null);

	
		
		l_logo.setBounds(0, 10, 800, 600);
 

		perioduRozvutku.add(l_logo);
 

	}



}
