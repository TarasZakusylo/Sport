import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Test extends JFrame {

	private JTextField t_Name;
	private Choice choice_tema;
	private Choice choice_klas;

	public Test() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		getContentPane().setLayout(null);

		JButton button = new JButton("\u041C\u0435\u043D\u044E");
		button.setForeground(Color.BLACK);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Menu("Фізична культура в школі");
				setVisible(false);
			}
		});
		button.setBounds(705, 0, 89, 23);
		getContentPane().add(button);

		choice_klas = new Choice();
		choice_klas.setBounds(483, 58, 68, 30);
		getContentPane().add(choice_klas);
		choice_klas.add("5");
		choice_klas.add("6");
		choice_klas.add("7");

		JLabel label = new JLabel("\u0412\u043A\u0430\u0436\u0456\u0442\u044C \u043A\u043B\u0430\u0441:");
		label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		label.setForeground(Color.BLUE);
		label.setBounds(239, 58, 221, 23);
		getContentPane().add(label);

		JLabel label_1 = new JLabel("\u0412\u043A\u0430\u0436\u0456\u0442\u044C \u0442\u0435\u043C\u0443:");
		label_1.setForeground(Color.BLUE);
		label_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 26));
		label_1.setBounds(200, 102, 221, 23);
		getContentPane().add(label_1);

		JLabel label_2 = new JLabel(
				"\u0412\u043A\u0430\u0436\u0456\u0442\u044C \u0432\u0430\u0448\u0435 \u0456\u043C'\u044F, \u043F\u0440\u0456\u0437\u0432\u0438\u0448\u0435:");
		label_2.setForeground(Color.BLUE);
		label_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(20, 405, 774, 35);
		getContentPane().add(label_2);

		JButton b_gotovo = new JButton("\u0413\u043E\u0442\u043E\u0432\u043E");
		b_gotovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					String s_choice_klas = choice_klas.getSelectedItem();
					String s_choice_tema = choice_tema.getSelectedItem();
					String s_Name = t_Name.getText();

					int zahust = 0;

					switch (s_Name) {
					case "Name":
						JOptionPane.showMessageDialog(null, "Змініть ім’я");
						break;
					case "Login":
						JOptionPane.showMessageDialog(null, "Змініть ім’я");
						break;
					case "login":
						JOptionPane.showMessageDialog(null, "Змініть ім’я");
						break;
					case "":
						JOptionPane.showMessageDialog(null, "Введіть ім’я");
						break;
					case " ":
						JOptionPane.showMessageDialog(null, "Змініть ім’я");
						break;
					case "  ":
						JOptionPane.showMessageDialog(null, "Змініть ім’я");
						break;
					case "   ":
						JOptionPane.showMessageDialog(null, "Змініть ім’я");
						break;
					default:
						zahust++;
						break;
					}

					if (zahust != 0) {

						int[] testNomerPutanna = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
						// перемішуємо масив
						Random rnd = new Random();
						for (int i = testNomerPutanna.length - 1; i > 0; i--) {
							int index = rnd.nextInt(i + 1);

							int a = testNomerPutanna[index];
							testNomerPutanna[index] = testNomerPutanna[i];
							testNomerPutanna[i] = a;
						}
						// закінчили перемішувати

						new TestMath(s_choice_klas, s_choice_tema, s_Name, 0, 0, testNomerPutanna[0],
								testNomerPutanna[1], testNomerPutanna[2], testNomerPutanna[3], testNomerPutanna[4],
								testNomerPutanna[5], testNomerPutanna[6], testNomerPutanna[7], testNomerPutanna[8],
								testNomerPutanna[9], testNomerPutanna[10], testNomerPutanna[11]);
						setVisible(false);
					}

				} catch (Exception e) {
				}

			}
		});
		b_gotovo.setForeground(Color.GREEN);
		b_gotovo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		b_gotovo.setBounds(259, 485, 273, 51);
		getContentPane().add(b_gotovo);

		JLabel label_3 = new JLabel(
				"\u0412\u0441\u0456 \u043F\u043E\u043B\u044F \u0454 \u043E\u0431\u043E\u0432'\u044F\u0437\u043A\u043E\u0432\u0438\u043C\u0438 !");
		label_3.setForeground(Color.MAGENTA);
		label_3.setFont(new Font("Verdana", Font.ITALIC, 20));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(10, 547, 774, 25);
		getContentPane().add(label_3);

		t_Name = new JTextField();
		t_Name.setHorizontalAlignment(SwingConstants.CENTER);
		t_Name.setBounds(228, 451, 324, 23);
		getContentPane().add(t_Name);
		t_Name.setColumns(10);

		choice_tema = new Choice();
		choice_tema.setBounds(442, 102, 134, 23);
		getContentPane().add(choice_tema);

		JButton btnNewButton = new JButton();
		btnNewButton.setIcon(new ImageIcon("res\\icon_DlaVchutela.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {

					int k = 0;

					do {
						String s_password = JOptionPane.showInputDialog(null,
								"Ви намагаєтесь отримати доступ до інформації вчителя.\nВведіть, будь ласка, пароль:");
						
						if (s_password.equals("1")) {
							k = 1;
							TestPrepod testPrepod = new TestPrepod () ;
							setVisible(false);
						} else {
							JOptionPane.showMessageDialog(null, "Помилка введення !");
						}
						
					} while (k != 1);

				} catch (Exception e) {
				}

			}
		});
		btnNewButton.setBounds(695, 510, 89, 51);
		getContentPane().add(btnNewButton);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("res/fon/Test.png"));
		label_4.setBounds(0, 0, 794, 572);
		getContentPane().add(label_4);

		choice_tema.add("Волейбол");
		choice_tema.add("Футбол");
		choice_tema.add("Баскетбол");

	}
}
