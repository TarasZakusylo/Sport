import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class TestPrepod extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String s_k_vuvestuProfil = "";

	private String s_choice_klas;
	private String s_choice_tema;
	private ArrayList<String> lines;
	String line;
	private String[] linesAsArray;

	private ArrayList<String> arrayList = new ArrayList<String>();
	Date date;
	private ArrayList<String> arrayListDelete = new ArrayList<String>();
	String s_date = "";

	File[] fList;

	private Checkbox checkbox;
	private Checkbox checkbox_1;
	private Checkbox checkbox_2;
	private Checkbox checkbox_3;
	private Checkbox checkbox_9;
	private Checkbox checkbox_4;
	private Checkbox checkbox_8;
	private Checkbox checkbox_6;
	private Checkbox checkbox_7;
	private Checkbox checkbox_5;
	private Checkbox checkbox_13;
	private Checkbox checkbox_12;
	private Checkbox checkbox_11;
	private Checkbox checkbox_10;
	private Checkbox checkbox_14;

	private JButton b_vudalutu;

	private String put = "";

	private Choice choice_klas;
	private Choice choice_tema;

	private JTextArea textArea_result;
	
	int i_dali = 0; 
	private JLabel label_2;

	public TestPrepod() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		// setVisible(true);

		JButton b_Menu = new JButton("\u041C\u0435\u043D\u044E");
		b_Menu.setForeground(Color.BLACK);
		b_Menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Menu("Գ����� �������� � ����");
				setVisible(false);
			}
		});
		b_Menu.setBounds(705, 0, 89, 23);
		getContentPane().add(b_Menu);

		JButton b_Nazad = new JButton("\u041D\u0430\u0437\u0430\u0434");
		b_Nazad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Test test = new Test();
				setVisible(false);
			}
		});
		b_Nazad.setForeground(Color.BLACK);
		b_Nazad.setBounds(620, 0, 89, 23);
		getContentPane().add(b_Nazad);

		JLabel label = new JLabel(
				"\u0414\u043B\u044F \u043F\u0435\u0440\u0435\u0433\u043B\u044F\u0434\u0443 \u0440\u0435\u0437\u0443\u043B\u044C\u0442\u0430\u0442\u0456\u0432 \u0443\u0447\u043D\u0456\u0432 \u0432\u043A\u0430\u0436\u0456\u0442\u044C \u043A\u043B\u0430\u0441 \u0442\u0430 \u0442\u0435\u043C\u0443:");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.ORANGE);
		label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		label.setBounds(5, 27, 523, 23);
		getContentPane().add(label);

		choice_klas = new Choice();
		choice_klas.setBounds(534, 30, 56, 20);
		getContentPane().add(choice_klas);

		choice_tema = new Choice();
		choice_tema.setBounds(596, 29, 111, 20);
		getContentPane().add(choice_tema);

		choice_tema.add("������");
		choice_tema.add("��������");
		choice_tema.add("���������");

		choice_klas.add("5");
		choice_klas.add("6");
		choice_klas.add("7");

		JLabel label_1 = new JLabel(
				"\u0422\u0435\u043F\u0435\u0440 \u043E\u0431\u0435\u0440\u0456\u0442\u044C \u0443\u0447\u043D\u044F, \u0449\u043E \u043F\u0440\u043E\u0445\u043E\u0434\u0438\u0432 \u043E\u043F\u0438\u0442\u0443\u0432\u0430\u043D\u043D\u044F:");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.BLUE);
		label_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		label_1.setBounds(0, 0, 0, 0);
		getContentPane().add(label_1);

		textArea_result = new JTextArea();
		textArea_result.setForeground(Color.GREEN);
		textArea_result.setFont(new Font("Segoe Print", Font.BOLD, 17));
		textArea_result.setBounds(15, 61, 714, 465);
		getContentPane().add(textArea_result);
		textArea_result.setEditable(false);

		textArea_result.setOpaque(false);

		JButton b_dali0 = new JButton("\u0414\u0430\u043B\u0456");
		b_dali0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ocustutu();
				paint();
			}
		});
		b_dali0.setForeground(Color.BLACK);
		b_dali0.setBounds(715, 27, 79, 23);
		getContentPane().add(b_dali0);

		JButton button = new JButton("\u0414\u043E \u0441\u0442\u0430\u0442\u0438\u0441\u0442\u0438\u043A\u0438");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Statistika ctatistika = new Statistika () ; 
				setVisible(false);
			}
		});
		button.setForeground(Color.BLACK);
		button.setBounds(389, 549, 405, 23);
		getContentPane().add(button);

		JButton button_1 = new JButton("\u0412\u0438\u0434\u0430\u043B\u0438\u0442\u0438 \u043F\u043E\u043B\u0435");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (i_dali == 0) {
					JOptionPane.showMessageDialog(null,
							"�������� ������ ���� �� ����, � ���� ������� ���� �� �� ������ ��������");
				} else {
				ocustutu();
				paintCheckbox();
				}
			}
		});
		button_1.setForeground(Color.BLACK);
		button_1.setBounds(0, 549, 395, 23);
		getContentPane().add(button_1);

		checkbox = new Checkbox();
		getContentPane().add(checkbox);
		checkbox.addItemListener(new ItemListener() {
		    public void itemStateChanged(ItemEvent e) {
				checkbox_1.setState(false);
				checkbox_2.setState(false);
				checkbox_3.setState(false);
				checkbox_4.setState(false);
				checkbox_5.setState(false);
				checkbox_6.setState(false);
				checkbox_7.setState(false);
				checkbox_8.setState(false);
				checkbox_9.setState(false);
				checkbox_10.setState(false);
				checkbox_11.setState(false);
				checkbox_12.setState(false);
				checkbox_13.setState(false);
				checkbox_14.setState(false);
		    }
		});

		checkbox_1 = new Checkbox();
		getContentPane().add(checkbox_1);
		checkbox_1.addItemListener(new ItemListener() {
		    public void itemStateChanged(ItemEvent e) {
		    	checkbox.setState(false);
				checkbox_2.setState(false);
				checkbox_3.setState(false);
				checkbox_4.setState(false);
				checkbox_5.setState(false);
				checkbox_6.setState(false);
				checkbox_7.setState(false);
				checkbox_8.setState(false);
				checkbox_9.setState(false);
				checkbox_10.setState(false);
				checkbox_11.setState(false);
				checkbox_12.setState(false);
				checkbox_13.setState(false);
				checkbox_14.setState(false);
		    }
		});

		checkbox_2 = new Checkbox();
		getContentPane().add(checkbox_2);
		checkbox_2.addItemListener(new ItemListener() {
		    public void itemStateChanged(ItemEvent e) {
		    	checkbox.setState(false);
				checkbox_1.setState(false);
				checkbox_3.setState(false);
				checkbox_4.setState(false);
				checkbox_5.setState(false);
				checkbox_6.setState(false);
				checkbox_7.setState(false);
				checkbox_8.setState(false);
				checkbox_9.setState(false);
				checkbox_10.setState(false);
				checkbox_11.setState(false);
				checkbox_12.setState(false);
				checkbox_13.setState(false);
				checkbox_14.setState(false);
		    }
		});

		checkbox_3 = new Checkbox();
		getContentPane().add(checkbox_3);
		checkbox_3.addItemListener(new ItemListener() {
		    public void itemStateChanged(ItemEvent e) {
		    	checkbox.setState(false);
				checkbox_1.setState(false);
				checkbox_2.setState(false);
				checkbox_4.setState(false);
				checkbox_5.setState(false);
				checkbox_6.setState(false);
				checkbox_7.setState(false);
				checkbox_8.setState(false);
				checkbox_9.setState(false);
				checkbox_10.setState(false);
				checkbox_11.setState(false);
				checkbox_12.setState(false);
				checkbox_13.setState(false);
				checkbox_14.setState(false);
		    }
		});

		checkbox_4 = new Checkbox();
		getContentPane().add(checkbox_4);
		checkbox_4.addItemListener(new ItemListener() {
		    public void itemStateChanged(ItemEvent e) {
		    	checkbox.setState(false);
				checkbox_1.setState(false);
				checkbox_2.setState(false);
				checkbox_3.setState(false); 
				checkbox_5.setState(false);
				checkbox_6.setState(false);
				checkbox_7.setState(false);
				checkbox_8.setState(false);
				checkbox_9.setState(false);
				checkbox_10.setState(false);
				checkbox_11.setState(false);
				checkbox_12.setState(false);
				checkbox_13.setState(false);
				checkbox_14.setState(false);
		    }
		});

		checkbox_9 = new Checkbox();
		getContentPane().add(checkbox_9);
		checkbox_9.addItemListener(new ItemListener() {
		    public void itemStateChanged(ItemEvent e) {
		    	checkbox.setState(false);
				checkbox_1.setState(false);
				checkbox_2.setState(false);
				checkbox_3.setState(false);
				checkbox_4.setState(false);
				checkbox_5.setState(false);
				checkbox_6.setState(false);
				checkbox_7.setState(false);
				checkbox_8.setState(false); 
				checkbox_10.setState(false);
				checkbox_11.setState(false);
				checkbox_12.setState(false);
				checkbox_13.setState(false);
				checkbox_14.setState(false);
		    }
		});

		checkbox_8 = new Checkbox();
		getContentPane().add(checkbox_8);
		checkbox_8.addItemListener(new ItemListener() {
		    public void itemStateChanged(ItemEvent e) {
		    	checkbox.setState(false);
				checkbox_1.setState(false);
				checkbox_2.setState(false);
				checkbox_3.setState(false);
				checkbox_4.setState(false);
				checkbox_5.setState(false);
				checkbox_6.setState(false);
				checkbox_7.setState(false); 
				checkbox_9.setState(false);
				checkbox_10.setState(false);
				checkbox_11.setState(false);
				checkbox_12.setState(false);
				checkbox_13.setState(false);
				checkbox_14.setState(false);
		    }
		});

		checkbox_7 = new Checkbox();
		getContentPane().add(checkbox_7);
		checkbox_7.addItemListener(new ItemListener() {
		    public void itemStateChanged(ItemEvent e) {
		    	checkbox.setState(false);
				checkbox_1.setState(false);
				checkbox_2.setState(false);
				checkbox_3.setState(false);
				checkbox_4.setState(false);
				checkbox_5.setState(false);
				checkbox_6.setState(false); 
				checkbox_8.setState(false);
				checkbox_9.setState(false);
				checkbox_10.setState(false);
				checkbox_11.setState(false);
				checkbox_12.setState(false);
				checkbox_13.setState(false);
				checkbox_14.setState(false);
		    }
		});

		checkbox_6 = new Checkbox();
		getContentPane().add(checkbox_6);
		checkbox_6.addItemListener(new ItemListener() {
		    public void itemStateChanged(ItemEvent e) {
		    	checkbox.setState(false);
				checkbox_1.setState(false);
				checkbox_2.setState(false);
				checkbox_3.setState(false);
				checkbox_4.setState(false);
				checkbox_5.setState(false); 
				checkbox_7.setState(false);
				checkbox_8.setState(false);
				checkbox_9.setState(false);
				checkbox_10.setState(false);
				checkbox_11.setState(false);
				checkbox_12.setState(false);
				checkbox_13.setState(false);
				checkbox_14.setState(false);
		    }
		});

		checkbox_5 = new Checkbox();
		getContentPane().add(checkbox_5);
		checkbox_5.addItemListener(new ItemListener() {
		    public void itemStateChanged(ItemEvent e) {
		    	checkbox.setState(false);
				checkbox_1.setState(false);
				checkbox_2.setState(false);
				checkbox_3.setState(false);
				checkbox_4.setState(false); 
				checkbox_6.setState(false);
				checkbox_7.setState(false);
				checkbox_8.setState(false);
				checkbox_9.setState(false);
				checkbox_10.setState(false);
				checkbox_11.setState(false);
				checkbox_12.setState(false);
				checkbox_13.setState(false);
				checkbox_14.setState(false);
		    }
		});

		checkbox_13 = new Checkbox();
		getContentPane().add(checkbox_13);
		checkbox_13.addItemListener(new ItemListener() {
		    public void itemStateChanged(ItemEvent e) {
		    	checkbox.setState(false);
				checkbox_1.setState(false);
				checkbox_2.setState(false);
				checkbox_3.setState(false);
				checkbox_4.setState(false);
				checkbox_5.setState(false);
				checkbox_6.setState(false);
				checkbox_7.setState(false);
				checkbox_8.setState(false);
				checkbox_9.setState(false);
				checkbox_10.setState(false);
				checkbox_11.setState(false);
				checkbox_12.setState(false); 
				checkbox_14.setState(false);
		    }
		});

		checkbox_12 = new Checkbox();
		getContentPane().add(checkbox_12);
		checkbox_12.addItemListener(new ItemListener() {
		    public void itemStateChanged(ItemEvent e) {
		    	checkbox.setState(false);
				checkbox_1.setState(false);
				checkbox_2.setState(false);
				checkbox_3.setState(false);
				checkbox_4.setState(false);
				checkbox_5.setState(false);
				checkbox_6.setState(false);
				checkbox_7.setState(false);
				checkbox_8.setState(false);
				checkbox_9.setState(false);
				checkbox_10.setState(false);
				checkbox_11.setState(false); 
				checkbox_13.setState(false);
				checkbox_14.setState(false);
		    }
		});

		checkbox_11 = new Checkbox();
		getContentPane().add(checkbox_11);
		checkbox_11.addItemListener(new ItemListener() {
		    public void itemStateChanged(ItemEvent e) {
		    	checkbox.setState(false);
				checkbox_1.setState(false);
				checkbox_2.setState(false);
				checkbox_3.setState(false);
				checkbox_4.setState(false);
				checkbox_5.setState(false);
				checkbox_6.setState(false);
				checkbox_7.setState(false);
				checkbox_8.setState(false);
				checkbox_9.setState(false);
				checkbox_10.setState(false); 
				checkbox_12.setState(false);
				checkbox_13.setState(false);
				checkbox_14.setState(false);
		    }
		});

		checkbox_10 = new Checkbox();
		getContentPane().add(checkbox_10);
		checkbox_10.addItemListener(new ItemListener() {
		    public void itemStateChanged(ItemEvent e) {
		    	checkbox.setState(false);
				checkbox_1.setState(false);
				checkbox_2.setState(false);
				checkbox_3.setState(false);
				checkbox_4.setState(false);
				checkbox_5.setState(false);
				checkbox_6.setState(false);
				checkbox_7.setState(false);
				checkbox_8.setState(false);
				checkbox_9.setState(false); 
				checkbox_11.setState(false);
				checkbox_12.setState(false);
				checkbox_13.setState(false);
				checkbox_14.setState(false);
		    }
		});

		checkbox_14 = new Checkbox();
		getContentPane().add(checkbox_14);
		checkbox_14.addItemListener(new ItemListener() {
		    public void itemStateChanged(ItemEvent e) {
		    	checkbox.setState(false);
				checkbox_1.setState(false);
				checkbox_2.setState(false);
				checkbox_3.setState(false);
				checkbox_4.setState(false);
				checkbox_5.setState(false);
				checkbox_6.setState(false);
				checkbox_7.setState(false);
				checkbox_8.setState(false);
				checkbox_9.setState(false);
				checkbox_10.setState(false);
				checkbox_11.setState(false);
				checkbox_12.setState(false);
				checkbox_13.setState(false); 
		    }
		});
		
		b_vudalutu = new JButton(
				"\u041F\u0456\u0434\u0442\u0432\u0435\u0440\u0434\u0438\u0442\u0438 \u0432\u0438\u0434\u0430\u043B\u0435\u043D\u043D\u044F");
		getContentPane().add(b_vudalutu);
		
		label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("res/fon/TestPrepod.png"));
		label_2.setBounds(0, 0, 794, 572);
		getContentPane().add(label_2);
		
		b_vudalutu.addActionListener(new ActionListener() {
			private Path pathSource;
			public void actionPerformed(ActionEvent e) {

				boolean[] bool = new boolean[16];

				bool[0] = checkbox.getState();
				bool[1] = checkbox_1.getState();
				bool[2] = checkbox_2.getState();
				bool[3] = checkbox_3.getState();
				bool[4] = checkbox_4.getState();
				bool[5] = checkbox_5.getState();
				bool[6] = checkbox_6.getState();
				bool[7] = checkbox_7.getState();
				bool[8] = checkbox_8.getState();
				bool[9] = checkbox_9.getState();
				bool[10] = checkbox_10.getState();
				bool[11] = checkbox_11.getState();
				bool[12] = checkbox_12.getState();
				bool[14] = checkbox_13.getState();
				bool[15] = checkbox_14.getState();

				int perevirkaNaNull = 0;

				for (int i = 0; i <= 15; i++) {

					if (bool[i] == true) {
					  
						File F = new File("res/test/result/" + s_choice_klas + "/" + s_choice_tema);

						fList = F.listFiles();
						for (int i1 = 0; i1 < fList.length; i1++) {
							if (fList[i1].isFile()) {
								arrayListDelete.add(fList[i1].getName());
							}

						}
						////

//						System.out.println("res/test/result/" + s_choice_klas + "/" + s_choice_tema + "/"
//								+ arrayListDelete.get(i));
						// System.out.println(i + " " + bool[i]);
						perevirkaNaNull++;
 

						pathSource = Paths.get("res/test/result/" + s_choice_klas + "/" + s_choice_tema + "/"
								+ arrayListDelete.get(i));

						do {
							try {
								Files.delete(pathSource);
//								System.out.println("File deleted successfully");
							} catch (Exception ex) {
							}
						} while (fList[i].isFile());

					}
				}

				if (perevirkaNaNull == 0) {
					JOptionPane.showMessageDialog(null, "������� ���� �� �������");
				} else {

					arrayListDelete.clear();
					ocustutu();
					paint();
					paintCheckbox();

//					System.out.println();
//					System.out.println();
//					System.out.println();

				}
			}
		});

		setVisible(true);
	}

	void ocustutu() {
		checkbox.setBounds(0, 0, 0, 0);
		checkbox_1.setBounds(0, 0, 0, 0);
		checkbox_2.setBounds(0, 0, 0, 0);
		checkbox_3.setBounds(0, 0, 0, 0);
		checkbox_4.setBounds(0, 0, 0, 0);
		checkbox_9.setBounds(0, 0, 0, 0);
		checkbox_8.setBounds(0, 0, 0, 0);
		checkbox_7.setBounds(0, 0, 0, 0);
		checkbox_6.setBounds(0, 0, 0, 0);
		checkbox_5.setBounds(0, 0, 0, 0);
		checkbox_13.setBounds(0, 0, 0, 0);
		checkbox_12.setBounds(0, 0, 0, 0);
		checkbox_11.setBounds(0, 0, 0, 0);
		checkbox_10.setBounds(0, 0, 0, 0);
		checkbox_14.setBounds(0, 0, 0, 0);
		b_vudalutu.setBounds(0, 0, 0, 0);

		checkbox.setState(false);
		checkbox_1.setState(false);
		checkbox_2.setState(false);
		checkbox_3.setState(false);
		checkbox_4.setState(false);
		checkbox_5.setState(false);
		checkbox_6.setState(false);
		checkbox_7.setState(false);
		checkbox_8.setState(false);
		checkbox_9.setState(false);
		checkbox_10.setState(false);
		checkbox_11.setState(false);
		checkbox_12.setState(false);
		checkbox_13.setState(false);
		checkbox_14.setState(false);

	}

	void paint() {
		s_choice_klas = choice_klas.getSelectedItem();
		s_choice_tema = choice_tema.getSelectedItem();

		File F = new File("res/test/result/" + s_choice_klas + "/" + s_choice_tema);

		fList = F.listFiles();

		textArea_result.setText(null);
		 
		if (fList.length == 0) {
			JOptionPane.showMessageDialog(null, "������ ����� � ����� ����� �� ������ ���� �� ����� ��������� !");
		} else {

			for (int i = 0; i < fList.length; i++) {
				// ����� ������ ����� � ����� isFile() �����
				// isDirectory()
				if (fList[i].isFile()) {
					// System.out.println(fList[i].getName());
					// choice_name.add(fList[i].getName());
					arrayList.add(fList[i].getName());
					date = new Date(fList[i].lastModified());
					s_date = "" + date;
					// arrayListDelete.add(fList[i].getName());
				}
			}

			//

			BufferedReader reader;
			try {

				for (int i = 0; i < arrayList.size(); i++) {

					put = "res/test/result/" + s_choice_klas + "/" + s_choice_tema + "/" + arrayList.get(i);

					reader = new BufferedReader(new FileReader(put));

					lines = new ArrayList<String>();
					while ((line = reader.readLine()) != null) {
						lines.add(line);
					}
					linesAsArray = lines.toArray(new String[lines.size()]);

					String s_Name = arrayList.get(i).substring(0, arrayList.get(i).length() - 4);

					for (int j = 0; j < linesAsArray.length; j++) {

						s_k_vuvestuProfil = s_k_vuvestuProfil + s_Name + "    ���������:" + linesAsArray[j] + "     "
								+ s_date + "\n";

					}
					textArea_result.setText(s_k_vuvestuProfil);

				}
			} catch (Exception e1) {
			}

			s_k_vuvestuProfil = "";
			arrayList.clear();
			i_dali = 1 ; 
		}
	}

	void paintCheckbox() {

		try {
//			if (fList.length == 0) {
//				JOptionPane.showMessageDialog(null,
//						"�������� ������ ���� �� ����, � ���� ������� ���� �� �� ������ ��������");
//			} else {

				switch (fList.length) {
				case 1: {
					checkbox.setBounds(752, 61, 12, 12);
				}
					break;
				case 2: {
					checkbox.setBounds(752, 61, 12, 12);
					checkbox_1.setBounds(752, 96, 12, 12);
				}
					break;
				case 3: {
					checkbox.setBounds(752, 61, 12, 12);
					checkbox_1.setBounds(752, 96, 12, 12);
					checkbox_2.setBounds(752, 124, 12, 12);
				}
					break;
				case 4: {
					checkbox.setBounds(752, 61, 12, 12);
					checkbox_1.setBounds(752, 96, 12, 12);
					checkbox_2.setBounds(752, 124, 12, 12);
					checkbox_3.setBounds(752, 159, 12, 12);
				}
					break;
				case 5: {
					checkbox.setBounds(752, 61, 12, 12);
					checkbox_1.setBounds(752, 96, 12, 12);
					checkbox_2.setBounds(752, 124, 12, 12);
					checkbox_3.setBounds(752, 159, 12, 12);
					checkbox_4.setBounds(752, 187, 12, 12);
				}
					break;
				case 6: {
					checkbox.setBounds(752, 61, 12, 12);
					checkbox_1.setBounds(752, 96, 12, 12);
					checkbox_2.setBounds(752, 124, 12, 12);
					checkbox_3.setBounds(752, 159, 12, 12);
					checkbox_4.setBounds(752, 187, 12, 12);
					checkbox_5.setBounds(752, 215, 12, 12);
				}
					break;
				case 7: {
					checkbox.setBounds(752, 61, 12, 12);
					checkbox_1.setBounds(752, 96, 12, 12);
					checkbox_2.setBounds(752, 124, 12, 12);
					checkbox_3.setBounds(752, 159, 12, 12);
					checkbox_4.setBounds(752, 187, 12, 12);
					checkbox_5.setBounds(752, 215, 12, 12);
					checkbox_6.setBounds(752, 250, 12, 12);
				}
					break;
				case 8: {
					checkbox.setBounds(752, 61, 12, 12);
					checkbox_1.setBounds(752, 96, 12, 12);
					checkbox_2.setBounds(752, 124, 12, 12);
					checkbox_3.setBounds(752, 159, 12, 12);
					checkbox_4.setBounds(752, 187, 12, 12);
					checkbox_5.setBounds(752, 215, 12, 12);
					checkbox_6.setBounds(752, 250, 12, 12);
					checkbox_7.setBounds(752, 278, 12, 12);
				}
					break;
				case 9: {
					checkbox.setBounds(752, 61, 12, 12);
					checkbox_1.setBounds(752, 96, 12, 12);
					checkbox_2.setBounds(752, 124, 12, 12);
					checkbox_3.setBounds(752, 159, 12, 12);
					checkbox_4.setBounds(752, 187, 12, 12);
					checkbox_5.setBounds(752, 215, 12, 12);
					checkbox_6.setBounds(752, 250, 12, 12);
					checkbox_7.setBounds(752, 278, 12, 12);
					checkbox_8.setBounds(752, 306, 12, 12);
				}
					break;
				case 10: {
					checkbox.setBounds(752, 61, 12, 12);
					checkbox_1.setBounds(752, 96, 12, 12);
					checkbox_2.setBounds(752, 124, 12, 12);
					checkbox_3.setBounds(752, 159, 12, 12);
					checkbox_4.setBounds(752, 187, 12, 12);
					checkbox_5.setBounds(752, 215, 12, 12);
					checkbox_6.setBounds(752, 250, 12, 12);
					checkbox_7.setBounds(752, 278, 12, 12);
					checkbox_8.setBounds(752, 306, 12, 12);
					checkbox_9.setBounds(752, 334, 12, 12);
				}
					break;
				case 11: {
					checkbox.setBounds(752, 61, 12, 12);
					checkbox_1.setBounds(752, 96, 12, 12);
					checkbox_2.setBounds(752, 124, 12, 12);
					checkbox_3.setBounds(752, 159, 12, 12);
					checkbox_4.setBounds(752, 187, 12, 12);
					checkbox_5.setBounds(752, 215, 12, 12);
					checkbox_6.setBounds(752, 250, 12, 12);
					checkbox_7.setBounds(752, 278, 12, 12);
					checkbox_8.setBounds(752, 306, 12, 12);
					checkbox_9.setBounds(752, 334, 12, 12);
					checkbox_10.setBounds(752, 373, 12, 12);
				}
					break;
				case 12: {
					checkbox.setBounds(752, 61, 12, 12);
					checkbox_1.setBounds(752, 96, 12, 12);
					checkbox_2.setBounds(752, 124, 12, 12);
					checkbox_3.setBounds(752, 159, 12, 12);
					checkbox_4.setBounds(752, 187, 12, 12);
					checkbox_5.setBounds(752, 215, 12, 12);
					checkbox_6.setBounds(752, 250, 12, 12);
					checkbox_7.setBounds(752, 278, 12, 12);
					checkbox_8.setBounds(752, 306, 12, 12);
					checkbox_9.setBounds(752, 334, 12, 12);
					checkbox_10.setBounds(752, 373, 12, 12);
					checkbox_11.setBounds(752, 401, 12, 12);
				}
					break;
				case 13: {
					checkbox.setBounds(752, 61, 12, 12);
					checkbox_1.setBounds(752, 96, 12, 12);
					checkbox_2.setBounds(752, 124, 12, 12);
					checkbox_3.setBounds(752, 159, 12, 12);
					checkbox_4.setBounds(752, 187, 12, 12);
					checkbox_5.setBounds(752, 215, 12, 12);
					checkbox_6.setBounds(752, 250, 12, 12);
					checkbox_7.setBounds(752, 278, 12, 12);
					checkbox_8.setBounds(752, 306, 12, 12);
					checkbox_9.setBounds(752, 334, 12, 12);
					checkbox_10.setBounds(752, 373, 12, 12);
					checkbox_11.setBounds(752, 401, 12, 12);
					checkbox_12.setBounds(752, 429, 12, 12);
				}
					break;
				case 14: {
					checkbox.setBounds(752, 61, 12, 12);
					checkbox_1.setBounds(752, 96, 12, 12);
					checkbox_2.setBounds(752, 124, 12, 12);
					checkbox_3.setBounds(752, 159, 12, 12);
					checkbox_4.setBounds(752, 187, 12, 12);
					checkbox_5.setBounds(752, 215, 12, 12);
					checkbox_6.setBounds(752, 250, 12, 12);
					checkbox_7.setBounds(752, 278, 12, 12);
					checkbox_8.setBounds(752, 306, 12, 12);
					checkbox_9.setBounds(752, 334, 12, 12);
					checkbox_10.setBounds(752, 373, 12, 12);
					checkbox_11.setBounds(752, 401, 12, 12);
					checkbox_12.setBounds(752, 429, 12, 12);
					checkbox_13.setBounds(752, 457, 12, 12);
				}
					break;
				default: {
					checkbox.setBounds(752, 61, 12, 12);
					checkbox_1.setBounds(752, 96, 12, 12);
					checkbox_2.setBounds(752, 124, 12, 12);
					checkbox_3.setBounds(752, 159, 12, 12);
					checkbox_4.setBounds(752, 187, 12, 12);
					checkbox_5.setBounds(752, 215, 12, 12);
					checkbox_6.setBounds(752, 250, 12, 12);
					checkbox_7.setBounds(752, 278, 12, 12);
					checkbox_8.setBounds(752, 306, 12, 12);
					checkbox_9.setBounds(752, 334, 12, 12);
					checkbox_10.setBounds(752, 373, 12, 12);
					checkbox_11.setBounds(752, 401, 12, 12);
					checkbox_12.setBounds(752, 429, 12, 12);
					checkbox_13.setBounds(752, 457, 12, 12);
					checkbox_14.setBounds(752, 489, 12, 12);
				}
					break;
				}

				b_vudalutu.setBounds(195, 527, 395, 23);
//			}
		} catch (Exception e1) {
		}
	}

}
