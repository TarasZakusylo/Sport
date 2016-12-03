import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class TestPutanna extends JFrame {

	private static final long serialVersionUID = 1L;

	private Scanner scanner_k_pravulno;
	private Scanner scanner_k_putanna;
	private Scanner scanner_k_variant0;
	private Scanner scanner_k_variant1;
	private Scanner scanner_k_variant2;

	private String s_k_putanna = "";
	private String s_k_pravulno = "";
	private String s_k_variant0 = "";
	private String s_k_variant1 = "";
	private String s_k_variant2 = "";
	private Scanner scanner_k_putanna_1;
	private Scanner scanner_k_pravulno_1;
	private Scanner scanner_k_variant0_1;
	private Scanner scanner_k_variant1_1;
	private Scanner scanner_k_variant2_1;
	private String s_k_pravulno_1 = "";
	private String s_k_putanna_1 = "";
	private String s_k_variant0_1 = "";
	private String s_k_variant1_1 = "";
	private String s_k_variant2_1 = "";

	private String vidpovid;
	private String vidpovid1;

	int metka_result = 0;
	int result = 0;

	public TestPutanna(String s_choice_klas, String s_choice_tema, String s_Name, int i_result, int testNomerPutanna0,
			int testNomerPutanna1, int i_metka_result, int testNomerPutanna2, int testNomerPutanna3,
			int testNomerPutanna4, int testNomerPutanna5, int testNomerPutanna6, int testNomerPutanna7,
			int testNomerPutanna8, int testNomerPutanna9, int testNomerPutanna10, int testNomerPutanna11) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);

		this.metka_result = i_metka_result;
		this.result = i_result;

		JButton button = new JButton("\u041C\u0435\u043D\u044E");
		button.setBounds(705, 0, 89, 23);
		button.setForeground(Color.BLACK);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Menu("Фізична культура в школі");
				setVisible(false);
			}
		});
		getContentPane().setLayout(null);
		getContentPane().add(button);

		String s_put = s_choice_klas + "/" + s_choice_tema;

		try {

			scanner_k_pravulno = new Scanner(
					new File("res/test/" + s_put + "/" + testNomerPutanna0 + "/" + "Pravulno" + ".txt"));
			scanner_k_putanna = new Scanner(
					new File("res/test/" + s_put + "/" + testNomerPutanna0 + "/" + "Putanna" + ".txt"));
			scanner_k_variant0 = new Scanner(
					new File("res/test/" + s_put + "/" + testNomerPutanna0 + "/" + "Variant0" + ".txt"));
			scanner_k_variant1 = new Scanner(
					new File("res/test/" + s_put + "/" + testNomerPutanna0 + "/" + "Variant1" + ".txt"));
			scanner_k_variant2 = new Scanner(
					new File("res/test/" + s_put + "/" + testNomerPutanna0 + "/" + "Variant2" + ".txt"));

			scanner_k_pravulno_1 = new Scanner(
					new File("res/test/" + s_put + "/" + testNomerPutanna1 + "/" + "Pravulno" + ".txt"));
			scanner_k_putanna_1 = new Scanner(
					new File("res/test/" + s_put + "/" + testNomerPutanna1 + "/" + "Putanna" + ".txt"));
			scanner_k_variant0_1 = new Scanner(
					new File("res/test/" + s_put + "/" + testNomerPutanna1 + "/" + "Variant0" + ".txt"));
			scanner_k_variant1_1 = new Scanner(
					new File("res/test/" + s_put + "/" + testNomerPutanna1 + "/" + "Variant1" + ".txt"));
			scanner_k_variant2_1 = new Scanner(
					new File("res/test/" + s_put + "/" + testNomerPutanna1 + "/" + "Variant2" + ".txt"));

		} catch (Exception ez) {
			JOptionPane.showMessageDialog(null, "Помилка відкриття файлів");
		}

		while (scanner_k_pravulno.hasNext()) {
			s_k_pravulno = s_k_pravulno + " " + scanner_k_pravulno.next();
		}
		scanner_k_pravulno.close();

		while (scanner_k_putanna.hasNext()) {
			s_k_putanna = s_k_putanna + " " + scanner_k_putanna.next();
		}
		scanner_k_putanna.close();

		while (scanner_k_variant0.hasNext()) {
			s_k_variant0 = s_k_variant0 + " " + scanner_k_variant0.next();
		}
		scanner_k_variant0.close();

		while (scanner_k_variant1.hasNext()) {
			s_k_variant1 = s_k_variant1 + " " + scanner_k_variant1.next();
		}
		scanner_k_variant1.close();

		while (scanner_k_variant2.hasNext()) {
			s_k_variant2 = s_k_variant2 + " " + scanner_k_variant2.next();
		}
		scanner_k_variant2.close();

		////// 2 pruklad

		while (scanner_k_pravulno_1.hasNext()) {
			s_k_pravulno_1 = s_k_pravulno_1 + " " + scanner_k_pravulno_1.next();
		}
		scanner_k_pravulno_1.close();

		while (scanner_k_putanna_1.hasNext()) {
			s_k_putanna_1 = s_k_putanna_1 + " " + scanner_k_putanna_1.next();
		}
		scanner_k_putanna_1.close();

		while (scanner_k_variant0_1.hasNext()) {
			s_k_variant0_1 = s_k_variant0_1 + " " + scanner_k_variant0_1.next();
		}
		scanner_k_variant0_1.close();

		while (scanner_k_variant1_1.hasNext()) {
			s_k_variant1_1 = s_k_variant1_1 + " " + scanner_k_variant1_1.next();
		}
		scanner_k_variant1_1.close();

		while (scanner_k_variant2_1.hasNext()) {
			s_k_variant2_1 = s_k_variant2_1 + " " + scanner_k_variant2_1.next();
		}
		scanner_k_variant2_1.close();

		JLabel l_putanna0 = new JLabel(s_k_putanna);
		l_putanna0.setForeground(Color.BLUE);
		l_putanna0.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		l_putanna0.setBounds(33, 33, 751, 29);
		getContentPane().add(l_putanna0);
		
		JLabel l_putanna1 = new JLabel(s_k_putanna_1);
		l_putanna1.setForeground(Color.BLUE);
		l_putanna1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		l_putanna1.setBounds(33, 285, 751, 29);
		getContentPane().add(l_putanna1);

		JButton btnNewButton = new JButton("\u0414\u0430\u043B\u0456");
		btnNewButton.setForeground(Color.MAGENTA);
		btnNewButton.setFont(new Font("Times New Roman", Font.ITALIC, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {

					if (vidpovid.equals(s_k_pravulno)) {
						result++;
					}

					if (vidpovid1.equals(s_k_pravulno_1)) {
						result++;
					}

					metka_result++;

					if (metka_result == 6) {
						setVisible(false);
					}
					new TestMath(s_choice_klas, s_choice_tema, s_Name, result, metka_result, testNomerPutanna0,
							testNomerPutanna1, testNomerPutanna2, testNomerPutanna3, testNomerPutanna4,
							testNomerPutanna5, testNomerPutanna6, testNomerPutanna7, testNomerPutanna8,
							testNomerPutanna9, testNomerPutanna10, testNomerPutanna11);
					setVisible(false);

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Відсутня відповідь !");
				}
			}
		});
		btnNewButton.setBounds(0, 535, 794, 37);
		getContentPane().add(btnNewButton);

		JRadioButton radioButton = new JRadioButton(s_k_variant0);
		radioButton.setForeground(Color.BLUE);
		radioButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vidpovid = s_k_variant0;
			}
		});
		radioButton.setBounds(24, 92, 684, 25);
		radioButton.setOpaque(false);
		getContentPane().add(radioButton);

		JRadioButton radioButton_1 = new JRadioButton(s_k_variant1);
		radioButton_1.setForeground(Color.BLUE);
		radioButton_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		radioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vidpovid = s_k_variant1;
			}
		});
		radioButton_1.setBounds(24, 145, 684, 23);
		radioButton_1.setOpaque(false);
		getContentPane().add(radioButton_1);

		JRadioButton radioButton_2 = new JRadioButton(s_k_variant2);
		radioButton_2.setForeground(Color.BLUE);
		radioButton_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		radioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vidpovid = s_k_variant2;
			}
		});
		radioButton_2.setBounds(24, 199, 684, 23);
		radioButton_2.setOpaque(false);
		getContentPane().add(radioButton_2);

		JRadioButton radioButton_1_2 = new JRadioButton(s_k_variant2_1);
		radioButton_1_2.setForeground(Color.BLUE);
		radioButton_1_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		radioButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vidpovid1 = s_k_variant2_1;
			}
		});
		radioButton_1_2.setBounds(24, 447, 684, 23);
		radioButton_1_2.setOpaque(false);
		getContentPane().add(radioButton_1_2);

		JRadioButton radioButton_1_1 = new JRadioButton(s_k_variant1_1);
		radioButton_1_1.setForeground(Color.BLUE);
		radioButton_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		radioButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vidpovid1 = s_k_variant1_1;
			}
		});
		radioButton_1_1.setBounds(24, 393, 684, 23);
		radioButton_1_1.setOpaque(false);
		getContentPane().add(radioButton_1_1);

		JRadioButton radioButton_1_0 = new JRadioButton(s_k_variant0_1);
		radioButton_1_0.setForeground(Color.BLUE);
		radioButton_1_0.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		radioButton_1_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vidpovid1 = s_k_variant0_1;
			}
		});
		radioButton_1_0.setBounds(24, 340, 684, 23);
		radioButton_1_0.setOpaque(false);
		getContentPane().add(radioButton_1_0);

		ButtonGroup group = new ButtonGroup();
		group.add(radioButton);
		group.add(radioButton_1);
		group.add(radioButton_2);

		ButtonGroup group1 = new ButtonGroup();
		group1.add(radioButton_1_2);
		group1.add(radioButton_1_1);
		group1.add(radioButton_1_0);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("res/fon/TestPutanna.png"));
		label.setBounds(0, 0, 794, 572);
		getContentPane().add(label);

		setVisible(true);

	}
}
