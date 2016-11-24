import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Formatter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class TestResult extends JFrame {
	private JLabel l_Tema_Klas;
	String Result = "";

	private Formatter formatter_k_otocenna;
	// private String[] s_name = new String[3];
	private ArrayList<String> arrayList = new ArrayList<String>();

	public TestResult(String s_choice_klas, String s_choice_tema, String s_Name, int result) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JLabel l_Name = new JLabel("\u0412\u0456\u0442\u0430\u044E, " + s_Name);
		l_Name.setForeground(Color.BLUE);
		l_Name.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 30));
		l_Name.setHorizontalAlignment(SwingConstants.CENTER);
		l_Name.setBounds(0, 61, 794, 43);
		getContentPane().add(l_Name);

		l_Tema_Klas = new JLabel("\u0412\u0438 \u043F\u0440\u043E\u0439\u0448\u043B\u0438 \u0442\u0435\u0441\u0442:"
				+ " " + s_choice_tema + " (" + s_choice_klas + ")");
		l_Tema_Klas.setForeground(Color.BLUE);
		l_Tema_Klas.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		l_Tema_Klas.setHorizontalAlignment(SwingConstants.CENTER);
		l_Tema_Klas.setBounds(0, 145, 794, 43);
		getContentPane().add(l_Tema_Klas);

		JLabel l_Result = new JLabel("\u0417 \u0440\u0435\u0437\u0443\u043B\u044C\u0442\u0430\u0442\u043E\u043C:");
		l_Result.setForeground(Color.BLUE);
		l_Result.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		l_Result.setHorizontalAlignment(SwingConstants.CENTER);
		l_Result.setBounds(0, 247, 794, 43);
		getContentPane().add(l_Result);

		JButton btnNewButton = new JButton("\u041F\u0440\u043E\u0439\u0442\u0438 \u0437\u043D\u043E\u0432\u0443");
		btnNewButton.setFont(new Font("Verdana", Font.ITALIC, 25));
		btnNewButton.setForeground(Color.MAGENTA);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Test test = new Test();
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
				Menu menu = new Menu("Фізична культура в школі");
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

	}
}
