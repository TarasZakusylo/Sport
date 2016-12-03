import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class TestResult extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JLabel l_Tema_Klas;
	String Result = "";

	private Formatter formatter_k_otocenna;

	private Formatter formatter_k_pozutuvnuh;
	private Formatter formatter_k_negatuvnuh;
	private Formatter formatter_k_dobre;
	private Formatter formatter_k_serednih;
	
	private Scanner scanner_k_pozutuvnuh;
	private Scanner scanner_k_negatuvnuh;
	private Scanner scanner_k_dobre;
	private Scanner scanner_k_serednih;
	private Scanner scanner_seredniy_bal;

	private String s_k_pozutuvnuh = "";
	private String s_k_negatuvnuh = "";
	private String s_k_serednih = "";
	private String s_k_dobre = "";
	private String s_seredniy_bal = "";

	private ArrayList<String> arrayList = new ArrayList<String>();

	public TestResult(String s_choice_klas, String s_choice_tema, String s_Name, int result) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JLabel l_Name = new JLabel("\u0412\u0456\u0442\u0430\u044E, " + s_Name);
		l_Name.setForeground(Color.GREEN);
		l_Name.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 30));
		l_Name.setHorizontalAlignment(SwingConstants.CENTER);
		l_Name.setBounds(0, 61, 794, 43);
		getContentPane().add(l_Name);

		l_Tema_Klas = new JLabel("\u0412\u0438 \u043F\u0440\u043E\u0439\u0448\u043B\u0438 \u0442\u0435\u0441\u0442:"
				+ " " + s_choice_tema + " (" + s_choice_klas + ")");
		l_Tema_Klas.setForeground(Color.GREEN);
		l_Tema_Klas.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		l_Tema_Klas.setHorizontalAlignment(SwingConstants.CENTER);
		l_Tema_Klas.setBounds(0, 145, 794, 43);
		getContentPane().add(l_Tema_Klas);

		JLabel l_Result = new JLabel("\u0417 \u0440\u0435\u0437\u0443\u043B\u044C\u0442\u0430\u0442\u043E\u043C:");
		l_Result.setForeground(Color.GREEN);
		l_Result.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		l_Result.setHorizontalAlignment(SwingConstants.CENTER);
		l_Result.setBounds(0, 247, 794, 43);
		getContentPane().add(l_Result);

		JButton btnNewButton = new JButton("\u041F\u0440\u043E\u0439\u0442\u0438 \u0437\u043D\u043E\u0432\u0443");
		btnNewButton.setFont(new Font("Verdana", Font.ITALIC, 25));
		btnNewButton.setForeground(Color.MAGENTA);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Test();
				setVisible(false);
			}
		});
		btnNewButton.setBounds(0, 434, 400, 43);
		getContentPane().add(btnNewButton);

		JButton button = new JButton("\u041C\u0435\u043D\u044E");
		button.setFont(new Font("Verdana", Font.ITALIC, 25));
		button.setForeground(Color.MAGENTA);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Menu("Фізична культура в школі");
				setVisible(false);
			}
		});
		button.setBounds(394, 434, 400, 43);
		getContentPane().add(button);

		Result = Result + result;
		JLabel l_Result1 = new JLabel(Result);
		l_Result1.setForeground(Color.ORANGE);
		l_Result1.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 70));
		l_Result1.setHorizontalAlignment(SwingConstants.CENTER);
		l_Result1.setBounds(0, 321, 794, 81);
		getContentPane().add(l_Result1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("res/fon/TestResult.png"));
		label.setBounds(0, 0, 794, 572);
		getContentPane().add(label);
		setVisible(true);

		File[] fList;
		File F = new File("res/test/result/" + s_choice_klas + "/" + s_choice_tema);

		fList = F.listFiles();

		for (int i = 0; i < fList.length; i++) {
			// Нужны только папки в место isFile() пишим isDirectory()
			if (fList[i].isFile()) {
				// System.out.println(fList[i].getName());
				// s_name[i] = fList[i].getName();
				arrayList.add(fList[i].getName());
			}
		}

		String s_NamePorivnanna;
		int k = 0;

		for (int i = 0; i < arrayList.size(); i++) {
			s_NamePorivnanna = s_Name + ".txt";

			if (s_NamePorivnanna.equals(arrayList.get(i))) {
				if (k != 0) {
					s_Name = s_Name.substring(0, s_Name.length() - 1);
				}
				s_Name = s_Name + "" + i;

				k++;
			}

		}

		try {
			formatter_k_otocenna = new Formatter(
					"res/test/result/" + s_choice_klas + "/" + s_choice_tema + "/" + s_Name + ".txt");

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "System Error");
		}
		formatter_k_otocenna.format(Result);
		formatter_k_otocenna.close();

		////

		int i_Result = Integer.parseInt(Result);

		switch (i_Result) {

		case 0:
		case 1:
		case 2:
		case 3: {
			try {
				scanner_k_negatuvnuh = new Scanner(new File("res/Statistika/kilkist_negatuvnuh.txt"));
			} catch (FileNotFoundException e1) {
			}

			while (scanner_k_negatuvnuh.hasNext()) {
				s_k_negatuvnuh = s_k_negatuvnuh + scanner_k_negatuvnuh.next();
			}
			scanner_k_negatuvnuh.close();

			int i_k_negatuvnuh = Integer.parseInt(s_k_negatuvnuh) + 1;
			String s_k_negatuvnuh1 = "" + i_k_negatuvnuh;

			try {
				formatter_k_negatuvnuh = new Formatter("res/Statistika/kilkist_negatuvnuh.txt");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "System Error");
			}
			formatter_k_negatuvnuh.format(s_k_negatuvnuh1);
			formatter_k_negatuvnuh.close();

		}
			break;

		case 4:
		case 5:
		case 6: {

			try {
				scanner_k_serednih = new Scanner(new File("res/Statistika/kilkist_serednih.txt"));
			} catch (FileNotFoundException e1) {
			}

			while (scanner_k_serednih.hasNext()) {
				s_k_serednih = s_k_serednih + scanner_k_serednih.next();
			}
			scanner_k_serednih.close();
			int i_k_serednih = Integer.parseInt(s_k_serednih) + 1;
			String s_k_serednih1 = "" + i_k_serednih;

			try {
				formatter_k_serednih = new Formatter("res/Statistika/kilkist_serednih.txt");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "System Error");
			}
			formatter_k_serednih.format(s_k_serednih1);
			formatter_k_serednih.close();

		}
			break;

		case 7:
		case 8:
		case 9: {
			try {
				scanner_k_dobre = new Scanner(new File("res/Statistika/kilkist_dobre.txt"));
			} catch (FileNotFoundException e1) {
			}

			while (scanner_k_dobre.hasNext()) {
				s_k_dobre = s_k_dobre + scanner_k_dobre.next();
			}
			scanner_k_dobre.close();
			int i_k_dobre = Integer.parseInt(s_k_dobre) + 1;
			String s_k_dobre1 = "" + i_k_dobre;

			try {
				formatter_k_dobre = new Formatter("res/Statistika/kilkist_dobre.txt");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "System Error");
			}
			formatter_k_dobre.format(s_k_dobre1);
			formatter_k_dobre.close();

		}
			break;

		case 10:
		case 11:
		case 12: {
			try {
				scanner_k_pozutuvnuh = new Scanner(new File("res/Statistika/kilkist_pozutudnuh.txt"));
			} catch (FileNotFoundException e1) {
			}

			while (scanner_k_pozutuvnuh.hasNext()) {
				s_k_pozutuvnuh = s_k_pozutuvnuh + scanner_k_pozutuvnuh.next();
			}
			scanner_k_pozutuvnuh.close();

			int i_k_pozutuvnuh = Integer.parseInt(s_k_pozutuvnuh) + 1;
			String s_k_pozutuvnuh1 = "" + i_k_pozutuvnuh;

			try {
				formatter_k_pozutuvnuh = new Formatter("res/Statistika/kilkist_pozutuvnuh.txt");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "System Error");
			}
			formatter_k_pozutuvnuh.format(s_k_pozutuvnuh1);
			formatter_k_pozutuvnuh.close();
		}
			break;
		}

		try {
			scanner_seredniy_bal = new Scanner(new File("res/Statistika/seredniy_bal.txt"));
		} catch (FileNotFoundException e1) {
		}

		while (scanner_seredniy_bal.hasNext()) {
			s_seredniy_bal = s_seredniy_bal + scanner_seredniy_bal.next();
		}
		scanner_seredniy_bal.close();

		double i_seredniy_bal = Double.parseDouble(s_seredniy_bal);
		s_seredniy_bal = ((i_seredniy_bal + i_Result) / 2) + "";

		try {
			formatter_k_pozutuvnuh = new Formatter("res/Statistika/seredniy_bal.txt");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "System Error");
		}
		formatter_k_pozutuvnuh.format(s_seredniy_bal);
		formatter_k_pozutuvnuh.close();

	}
}
