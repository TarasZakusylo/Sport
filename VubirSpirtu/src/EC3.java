import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class EC3 extends JFrame {

	private static final long serialVersionUID = 1L;

	private JSlider sl_putanna12;
	private JSlider sl_putanna13;
	private JSlider sl_putanna14;
	private JSlider sl_putanna15;

	int i_sl_putanna12 = 3;
	int i_sl_putanna13 = 3;
	int i_sl_putanna14 = 3;
	int i_sl_putanna15 = 3;

	SliderListener12 slider12 = new SliderListener12();
	SliderListener13 slider13 = new SliderListener13();
	SliderListener14 slider14 = new SliderListener14();
	SliderListener15 slider15 = new SliderListener15();

	private int i_sl_putanna10 = 3;
	private int i_sl_putanna11 = 3;

	EC3(String s, int ii_sl_putanna0, int ii_sl_putanna1, int ii_sl_putanna2, int ii_sl_putanna3, int ii_sl_putanna4,
			int ii_sl_putanna5, int ii_sl_putanna6, int ii_sl_putanna7, int ii_sl_putanna8, int ii_sl_putanna9,
			int ii_sl_putanna10, int ii_sl_putanna11, int ii_sl_putanna12, int ii_sl_putanna13, int ii_sl_putanna14,
			int ii_sl_putanna15) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		this.i_sl_putanna12 = ii_sl_putanna12;
		this.i_sl_putanna13 = ii_sl_putanna13;
		this.i_sl_putanna14 = ii_sl_putanna14;
		this.i_sl_putanna15 = ii_sl_putanna15;

		JButton b_menu = new JButton("\u041C\u0435\u043D\u044E");
		b_menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Menu("Фізична культура в школі");
				setVisible(false);
			}
		});
		b_menu.setBounds(695, 0, 89, 23);
		getContentPane().add(b_menu);

		JLabel l_nazva = new JLabel(
				"\u042F\u043A\u0438\u0439 \u0441\u043F\u043E\u0440\u0442 \u0432\u0430\u043C \u043F\u0456\u0434\u0445\u043E\u0434\u0438\u0442\u044C ?");
		l_nazva.setHorizontalAlignment(SwingConstants.CENTER);
		l_nazva.setBounds(51, 11, 647, 50);
		getContentPane().add(l_nazva);
		l_nazva.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 30));
		l_nazva.setForeground(Color.green);

		JLabel l_komentar = new JLabel(
				"\u041F\u0440\u043E\u0439\u0434\u0456\u0442\u044C, \u0431\u0443\u0434\u044C \u043B\u0430\u0441\u043A\u0430, \u043C\u0456\u043D\u0456\u043E\u043F\u0438\u0442\u0443\u0432\u0430\u043D\u043D\u044F");
		l_komentar.setHorizontalAlignment(SwingConstants.CENTER);
		l_komentar.setBounds(174, 71, 398, 14);
		getContentPane().add(l_komentar);

		JLabel l_komentar1 = new JLabel(
				"\u0414\u0430\u0432\u0430\u0439\u0442\u0435 \u0432\u0456\u0434\u043F\u043E\u0432\u0456\u0434\u0456 \u0447\u0435\u0441\u043D\u043E \u0442\u0430 \u043D\u0435 \u0437\u0432\u0435\u0440\u0442\u0430\u0439\u0442\u0435 \u0443\u0432\u0430\u0433\u0438, \u044F\u043A\u0449\u043E \u0437\u0430\u043F\u0438\u0442\u0430\u043D\u043D\u044F \u0432\u0438\u044F\u0432\u043B\u044F\u0442\u044C\u0441\u044F \u0434\u0438\u0432\u043D\u0438\u043C\u0438.\r\n");
		l_komentar1.setHorizontalAlignment(SwingConstants.CENTER);
		l_komentar1.setBounds(-1, 537, 785, 14);

		sl_putanna12 = new JSlider(0, 1, 5, i_sl_putanna12);
		getContentPane().add(l_komentar1);
		sl_putanna12.setMinorTickSpacing(1);
		sl_putanna12.setOpaque(false);
		sl_putanna12.setPaintTicks(true);
		sl_putanna12.setPaintLabels(true);
		sl_putanna12.setBounds(35, 136, 715, 40);
		getContentPane().add(sl_putanna12);

		sl_putanna13 = new JSlider(SwingConstants.HORIZONTAL, 1, 5, i_sl_putanna13);
		sl_putanna13.setPaintTicks(true);
		sl_putanna13.setPaintLabels(true);
		sl_putanna13.setOpaque(false);
		sl_putanna13.setMinorTickSpacing(1);
		sl_putanna13.setBounds(35, 230, 715, 40);
		getContentPane().add(sl_putanna13);

		sl_putanna14 = new JSlider(SwingConstants.HORIZONTAL, 1, 5, i_sl_putanna14);
		sl_putanna14.setPaintTicks(true);
		sl_putanna14.setPaintLabels(true);
		sl_putanna14.setOpaque(false);
		sl_putanna14.setMinorTickSpacing(1);
		sl_putanna14.setBounds(35, 332, 715, 40);
		getContentPane().add(sl_putanna14);

		sl_putanna15 = new JSlider(SwingConstants.HORIZONTAL, 1, 5, i_sl_putanna15);
		sl_putanna15.setPaintTicks(true);
		sl_putanna15.setPaintLabels(true);
		sl_putanna15.setOpaque(false);
		sl_putanna15.setMinorTickSpacing(1);
		sl_putanna15.setBounds(35, 451, 715, 40);
		getContentPane().add(sl_putanna15);

		JLabel label = new JLabel("\u0441\u0443\u043C\u043D\u0456\u0432\u0430\u044E\u0441\u044C");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(343, 174, 102, 14);
		getContentPane().add(label);

		JLabel label_1 = new JLabel("\u0442\u043E\u0447\u043D\u043E - \u0442\u0430\u043A");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(682, 174, 102, 14);
		getContentPane().add(label_1);

		JLabel label_2 = new JLabel(
				"\u0448\u0432\u0438\u0434\u0448\u0435 \u0437\u0430 \u0432\u0441\u0435 - \u0442\u0430\u043A");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(502, 174, 116, 14);
		getContentPane().add(label_2);

		JLabel label_3 = new JLabel(
				"\u0448\u0432\u0438\u0434\u0448\u0435 \u0437\u0430 \u0432\u0441\u0435 - \u043D\u0456");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(163, 174, 116, 14);
		getContentPane().add(label_3);

		JLabel label_4 = new JLabel("\u0442\u043E\u0447\u043D\u043E - \u043D\u0456");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(10, 174, 102, 14);
		getContentPane().add(label_4);

		JLabel label_5 = new JLabel("\u0442\u043E\u0447\u043D\u043E - \u043D\u0456");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(8, 268, 102, 14);
		getContentPane().add(label_5);

		JLabel label_6 = new JLabel(
				"\u0448\u0432\u0438\u0434\u0448\u0435 \u0437\u0430 \u0432\u0441\u0435 - \u043D\u0456");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(161, 268, 116, 14);
		getContentPane().add(label_6);

		JLabel label_7 = new JLabel("\u0441\u0443\u043C\u043D\u0456\u0432\u0430\u044E\u0441\u044C");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(341, 268, 102, 14);
		getContentPane().add(label_7);

		JLabel label_8 = new JLabel(
				"\u0448\u0432\u0438\u0434\u0448\u0435 \u0437\u0430 \u0432\u0441\u0435 - \u0442\u0430\u043A");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setBounds(500, 268, 116, 14);
		getContentPane().add(label_8);

		JLabel label_9 = new JLabel("\u0442\u043E\u0447\u043D\u043E - \u0442\u0430\u043A");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setBounds(680, 268, 102, 14);
		getContentPane().add(label_9);

		JLabel label_10 = new JLabel("\u0442\u043E\u0447\u043D\u043E - \u043D\u0456");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setBounds(10, 371, 102, 14);
		getContentPane().add(label_10);

		JLabel label_11 = new JLabel(
				"\u0448\u0432\u0438\u0434\u0448\u0435 \u0437\u0430 \u0432\u0441\u0435 - \u043D\u0456");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setBounds(163, 371, 116, 14);
		getContentPane().add(label_11);

		JLabel label_12 = new JLabel("\u0441\u0443\u043C\u043D\u0456\u0432\u0430\u044E\u0441\u044C");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setBounds(343, 371, 102, 14);
		getContentPane().add(label_12);

		JLabel label_13 = new JLabel(
				"\u0448\u0432\u0438\u0434\u0448\u0435 \u0437\u0430 \u0432\u0441\u0435 - \u0442\u0430\u043A");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setBounds(502, 371, 116, 14);
		getContentPane().add(label_13);

		JLabel label_14 = new JLabel("\u0442\u043E\u0447\u043D\u043E - \u0442\u0430\u043A");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setBounds(682, 371, 102, 14);
		getContentPane().add(label_14);

		JLabel label_15 = new JLabel("\u0442\u043E\u0447\u043D\u043E - \u043D\u0456");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setBounds(10, 494, 102, 14);
		getContentPane().add(label_15);

		JLabel label_16 = new JLabel(
				"\u0448\u0432\u0438\u0434\u0448\u0435 \u0437\u0430 \u0432\u0441\u0435 - \u043D\u0456");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setBounds(163, 494, 116, 14);
		getContentPane().add(label_16);

		JLabel label_17 = new JLabel("\u0441\u0443\u043C\u043D\u0456\u0432\u0430\u044E\u0441\u044C");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setBounds(343, 494, 102, 14);
		getContentPane().add(label_17);

		JLabel label_18 = new JLabel(
				"\u0448\u0432\u0438\u0434\u0448\u0435 \u0437\u0430 \u0432\u0441\u0435 - \u0442\u0430\u043A");
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setBounds(502, 494, 116, 14);
		getContentPane().add(label_18);

		JLabel label_19 = new JLabel("\u0442\u043E\u0447\u043D\u043E - \u0442\u0430\u043A");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setBounds(682, 494, 102, 14);
		getContentPane().add(label_19);

		JLabel l_putanna0 = new JLabel(
				"\u0412\u0438 \u0437\u0430\u0437\u0432\u0438\u0447\u0430\u0439 \u043F\u0435\u0440\u0448\u0438\u043C\u0438 \u043F\u0440\u043E\u044F\u0432\u043B\u044F\u0454\u0442\u0435 \u0456\u043D\u0456\u0446\u0456\u0430\u0442\u0438\u0432\u0443 \u043F\u0440\u0438 \u0437\u043D\u0430\u0439\u043E\u043C\u0441\u0442\u0432\u0456?");
		l_putanna0.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna0.setBounds(35, 96, 715, 34);
		l_putanna0.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna0.setForeground(Color.RED);
		getContentPane().add(l_putanna0);

		JLabel l_putanna1 = new JLabel(
				"\u0423 \u0432\u0430\u0441 \u0447\u0430\u0441\u0442\u043E \u0431\u0443\u0432\u0430\u044E\u0442\u044C \u0441\u043F\u0430\u0434\u0438 \u0456 \u043F\u0456\u0434\u0439\u043E\u043C\u0438 \u043D\u0430\u0441\u0442\u0440\u043E\u044E?");
		l_putanna1.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna1.setBounds(35, 203, 715, 34);
		getContentPane().add(l_putanna1);
		l_putanna1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna1.setForeground(Color.RED);

		JLabel l_putanna2 = new JLabel(
				"\u0412\u0430\u043C \u043D\u0435\u043F\u0440\u0438\u0454\u043C\u043D\u043E \u0437\u043D\u0430\u0445\u043E\u0434\u0438\u0442\u0438\u0441\u044F \u0441\u0435\u0440\u0435\u0434 \u043B\u044E\u0434\u0435\u0439, \u044F\u043A\u0456 \u0436\u0430\u0440\u0442\u0443\u044E\u0442\u044C \u043D\u0430\u0434 \u0442\u043E\u0432\u0430\u0440\u0438\u0448\u0430\u043C\u0438?");
		l_putanna2.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna2.setBounds(10, 306, 764, 34);
		getContentPane().add(l_putanna2);
		l_putanna2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna2.setForeground(Color.RED);

		JLabel l_putanna3 = new JLabel(
				"\u042F\u043A \u0432\u0438 \u0432\u0456\u0434\u0447\u0443\u0432\u0430\u0454\u0442\u0435 \u0431\u0430\u043B\u0430\u043D\u0441 / \u0440\u0456\u0432\u043D\u043E\u0432\u0430\u0433\u0443 ?");
		l_putanna3.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna3.setBounds(35, 422, 715, 34);
		getContentPane().add(l_putanna3);
		l_putanna3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna3.setForeground(Color.RED);

		JButton b_gotovo = new JButton("\u0413\u043E\u0442\u043E\u0432\u043E\r\n");
		b_gotovo.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				switch (ii_sl_putanna10) {
				case 1: {
					i_sl_putanna10 = 5;
				}
					break;
				case 2: {
					i_sl_putanna10 = 4;
				}
					break;
				case 4: {
					i_sl_putanna10 = 2;
				}
					break;
				case 5: {
					i_sl_putanna10 = 1;
				}
					break;
				}

				switch (ii_sl_putanna11) {
				case 1: {
					i_sl_putanna11 = 5;
				}
					break;
				case 2: {
					i_sl_putanna11 = 4;
				}
					break;
				case 4: {
					i_sl_putanna11 = 2;
				}
					break;
				case 5: {
					i_sl_putanna11 = 1;
				}
					break;
				}

				switch (i_sl_putanna14) {
				case 1: {
					i_sl_putanna14 = 5;
				}
					break;
				case 2: {
					i_sl_putanna14 = 4;
				}
					break;
				case 4: {
					i_sl_putanna14 = 2;
				}
					break;
				case 5: {
					i_sl_putanna14 = 1;
				}
					break;
				}

				int indekator_komanda, indekator_temperament, indekator_trener, indekator_balans,
						indekator_dostovirnosti = 0;

				double komanda = (ii_sl_putanna0 + ii_sl_putanna1 + ii_sl_putanna2 + ii_sl_putanna3) / 4;

				if (komanda >= 3) {
					indekator_komanda = 1;
				} else {
					indekator_komanda = 0;
				}

				double temperament = (ii_sl_putanna0 + ii_sl_putanna1 + ii_sl_putanna2 + ii_sl_putanna3 + ii_sl_putanna4
						+ ii_sl_putanna5 + ii_sl_putanna6 + ii_sl_putanna7 + ii_sl_putanna8 + ii_sl_putanna9
						+ i_sl_putanna10 + i_sl_putanna11 + i_sl_putanna12 + i_sl_putanna13 + i_sl_putanna14
						+ i_sl_putanna15) / 16;

				if (temperament >= 3) {
					indekator_temperament = 1;
				} else {
					indekator_temperament = 0;
				}

				double trener = (ii_sl_putanna8 + ii_sl_putanna9 + i_sl_putanna10 + i_sl_putanna11) / 4;

				if (trener >= 3) {
					indekator_trener = 1;
				} else {
					indekator_trener = 0;
				}

				double balans = (i_sl_putanna12 + i_sl_putanna13 + i_sl_putanna14 + i_sl_putanna15) / 4;

				if (balans >= 3) {
					indekator_balans = 1;
				} else {
					indekator_balans = 0;
				}

				String rezultat = "";
				String rezultat1 = "";

				if (ii_sl_putanna0 == 3 && ii_sl_putanna1 == 3 && ii_sl_putanna2 == 3 && ii_sl_putanna3 == 3
						&& ii_sl_putanna4 == 3 && ii_sl_putanna5 == 3 && ii_sl_putanna6 == 3 && ii_sl_putanna7 == 3
						&& ii_sl_putanna8 == 3 && ii_sl_putanna9 == 3 && i_sl_putanna10 == 3 && i_sl_putanna11 == 3
						&& i_sl_putanna12 == 3 && i_sl_putanna13 == 3 && i_sl_putanna14 == 3 && i_sl_putanna15 == 3) {
					int type2 = JOptionPane.WARNING_MESSAGE;
					JOptionPane.showMessageDialog(null, "Помилка! Не змінено жодного поля.", null, type2);

				} else {

					if (indekator_komanda == 1) {
						if (indekator_temperament == 1) {
							if (indekator_trener == 1) {
								if (indekator_balans == 1) {
									rezultat = "Вам найкраще підходить хокей";
								} else {
									rezultat = "Вам найкраще підходить баскетбол, футбол,";
									rezultat1 = "волейбол, гандбол";
								}
							} else {
								if (indekator_balans == 1) {
									rezultat = "Вам найкраще підходить веслування";
								} else {
									rezultat = "Вам найкраще підходить атоспорт";
								}
							}
						} else {
							if (indekator_trener == 1) {
								if (indekator_balans == 1) {
									rezultat = "Вам найкраще підходить хокей";
								} else {
									rezultat = "Вам найкраще підходить баскетбол, футбол,";
									rezultat1 = "волейбол, гандбол";
								}
							} else {
								if (indekator_balans == 1) {
									rezultat = "Вам найкраще підходить альпінізм";
								} else {
									rezultat = "Вам найкраще підходить туризм, автоспорт";
								}
							}
						}
					} else {
						if (indekator_temperament == 1) {
							if (indekator_trener == 1) {
								if (indekator_balans == 1) {
									rezultat = "Вам найкраще підходить важка атлетика,";
									rezultat1 = "велоспорт, кінний спорт, веслування";
								} else {
									rezultat = "Вам найкраще підходить легка атлетика, плавання";
								}
							} else {
								if (indekator_balans == 1) {
									rezultat = "Вам найкраще підходить важка атлетика,";
									rezultat1 = "велоспорт, кінний спорт, веслування";
								} else {
									rezultat = "Вам найкраще підходить легка атлетика, плавання";
								}
							}
						} else {
							if (indekator_trener == 1) {
								if (indekator_balans == 1) {
									rezultat = "Вам найкраще підходить гімнастика, фігурне катання";
								} else {
									rezultat = "Вам найкраще підходить бойові мистецтва, шахи";
								}
							} else {
								if (indekator_balans == 1) {
									rezultat = "Вам найкраще підходить гірськолижний спорт";
								} else {
									rezultat = "Вам найкраще підходить теніс, стрільба, фехтування";
								}
							}
						}
					}

					int dostovirnist = 0;

					if ((ii_sl_putanna0 == 1 && ii_sl_putanna1 == 5 && ii_sl_putanna2 == 5 && ii_sl_putanna3 == 5)
							|| (ii_sl_putanna0 == 5 && ii_sl_putanna1 == 1 && ii_sl_putanna2 == 5
									&& ii_sl_putanna3 == 5)
							|| (ii_sl_putanna0 == 5 && ii_sl_putanna1 == 5 && ii_sl_putanna2 == 1
									&& ii_sl_putanna3 == 5)
							|| (ii_sl_putanna0 == 5 && ii_sl_putanna1 == 5 && ii_sl_putanna2 == 5
									&& ii_sl_putanna3 == 1)) {
						dostovirnist++;
					}
					if ((ii_sl_putanna4 == 1 && ii_sl_putanna5 == 5 && ii_sl_putanna6 == 5 && ii_sl_putanna7 == 5)
							|| (ii_sl_putanna4 == 5 && ii_sl_putanna5 == 1 && ii_sl_putanna6 == 5
									&& ii_sl_putanna7 == 5)
							|| (ii_sl_putanna4 == 5 && ii_sl_putanna5 == 5 && ii_sl_putanna6 == 1
									&& ii_sl_putanna7 == 5)
							|| (ii_sl_putanna4 == 5 && ii_sl_putanna5 == 5 && ii_sl_putanna6 == 5
									&& ii_sl_putanna7 == 1)) {
						dostovirnist++;
					}
					if ((ii_sl_putanna8 == 1 && ii_sl_putanna9 == 5 && i_sl_putanna10 == 5 && i_sl_putanna11 == 5)
							|| (ii_sl_putanna8 == 5 && ii_sl_putanna9 == 1 && i_sl_putanna10 == 5
									&& i_sl_putanna11 == 5)
							|| (ii_sl_putanna8 == 5 && ii_sl_putanna9 == 5 && i_sl_putanna10 == 1
									&& i_sl_putanna11 == 5)
							|| (ii_sl_putanna8 == 5 && ii_sl_putanna9 == 5 && i_sl_putanna10 == 5
									&& i_sl_putanna11 == 1)) {
						dostovirnist++;
					}
					if ((i_sl_putanna12 == 1 && i_sl_putanna13 == 5 && i_sl_putanna14 == 5 && i_sl_putanna15 == 5)
							|| (i_sl_putanna12 == 5 && i_sl_putanna13 == 1 && i_sl_putanna14 == 5
									&& i_sl_putanna15 == 5)
							|| (i_sl_putanna12 == 5 && i_sl_putanna13 == 5 && i_sl_putanna14 == 1
									&& i_sl_putanna15 == 5)
							|| (i_sl_putanna12 == 5 && i_sl_putanna13 == 5 && i_sl_putanna14 == 5
									&& i_sl_putanna15 == 1)) {
						dostovirnist++;
					}
					if ((ii_sl_putanna0 == 5 && ii_sl_putanna1 == 1 && ii_sl_putanna2 == 1 && ii_sl_putanna3 == 1)
							|| (ii_sl_putanna0 == 1 && ii_sl_putanna1 == 5 && ii_sl_putanna2 == 1
									&& ii_sl_putanna3 == 1)
							|| (ii_sl_putanna0 == 1 && ii_sl_putanna1 == 1 && ii_sl_putanna2 == 5
									&& ii_sl_putanna3 == 1)
							|| (ii_sl_putanna0 == 1 && ii_sl_putanna1 == 1 && ii_sl_putanna2 == 1
									&& ii_sl_putanna3 == 5)) {
						dostovirnist++;
					}
					if ((ii_sl_putanna4 == 5 && ii_sl_putanna5 == 1 && ii_sl_putanna6 == 1 && ii_sl_putanna7 == 1)
							|| (ii_sl_putanna4 == 1 && ii_sl_putanna5 == 5 && ii_sl_putanna6 == 1
									&& ii_sl_putanna7 == 1)
							|| (ii_sl_putanna4 == 1 && ii_sl_putanna5 == 1 && ii_sl_putanna6 == 5
									&& ii_sl_putanna7 == 1)
							|| (ii_sl_putanna4 == 1 && ii_sl_putanna5 == 1 && ii_sl_putanna6 == 1
									&& ii_sl_putanna7 == 5)) {
						dostovirnist++;
					}
					if ((ii_sl_putanna8 == 5 && ii_sl_putanna9 == 1 && i_sl_putanna10 == 1 && i_sl_putanna11 == 1)
							|| (ii_sl_putanna8 == 1 && ii_sl_putanna9 == 5 && i_sl_putanna10 == 1
									&& i_sl_putanna11 == 1)
							|| (ii_sl_putanna8 == 1 && ii_sl_putanna9 == 1 && i_sl_putanna10 == 5
									&& i_sl_putanna11 == 1)
							|| (ii_sl_putanna8 == 1 && ii_sl_putanna9 == 1 && i_sl_putanna10 == 1
									&& i_sl_putanna11 == 5)) {
						dostovirnist++;
					}
					if ((i_sl_putanna12 == 5 && i_sl_putanna13 == 1 && i_sl_putanna14 == 1 && i_sl_putanna15 == 1)
							|| (i_sl_putanna12 == 1 && i_sl_putanna13 == 5 && i_sl_putanna14 == 1
									&& i_sl_putanna15 == 1)
							|| (i_sl_putanna12 == 1 && i_sl_putanna13 == 1 && i_sl_putanna14 == 5
									&& i_sl_putanna15 == 1)
							|| (i_sl_putanna12 == 1 && i_sl_putanna13 == 1 && i_sl_putanna14 == 1
									&& i_sl_putanna15 == 5)) {
						dostovirnist++;
					}

					if (ii_sl_putanna0 == 3 && ii_sl_putanna1 == 3 && ii_sl_putanna2 == 3 && ii_sl_putanna3 == 3) {
						dostovirnist++;
					}

					if (ii_sl_putanna4 == 3 && ii_sl_putanna5 == 3 && ii_sl_putanna6 == 3 && ii_sl_putanna7 == 3) {
						dostovirnist++;
					}

					if (ii_sl_putanna8 == 3 && ii_sl_putanna9 == 3 && i_sl_putanna10 == 3 && i_sl_putanna11 == 3) {
						dostovirnist++;
					}
					if (i_sl_putanna12 == 3 && i_sl_putanna13 == 3 && i_sl_putanna14 == 3 && i_sl_putanna15 == 3) {
						dostovirnist++;
					}

					if (dostovirnist >= 3) {
						indekator_dostovirnosti = 2;
					}
					if (dostovirnist == 1 || dostovirnist == 2) {
						indekator_dostovirnosti = 1;
					}
					dostovirnist = 0;
					new EC_rezultat(rezultat, rezultat1, indekator_dostovirnosti);
					setVisible(false);
				}
			}
		});
		b_gotovo.setBounds(643, 526, 141, 36);
		getContentPane().add(b_gotovo);

		JButton b_nazad1 = new JButton("\u041D\u0430\u0437\u0430\u0434 3/4");
		b_nazad1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new EC2("EC", ii_sl_putanna0, ii_sl_putanna1, ii_sl_putanna2, ii_sl_putanna3, ii_sl_putanna4,
						ii_sl_putanna5, ii_sl_putanna6, ii_sl_putanna7, ii_sl_putanna8, ii_sl_putanna9, ii_sl_putanna10,
						ii_sl_putanna11, i_sl_putanna12, i_sl_putanna13, i_sl_putanna14, i_sl_putanna15);
				setVisible(false);

			}
		});
		b_nazad1.setBounds(-1, 526, 141, 36);
		getContentPane().add(b_nazad1);

		JLabel label_20 = new JLabel("");
		label_20.setIcon(new ImageIcon("res/fon/EC3.png"));
		label_20.setBounds(-10, 0, 794, 572);
		getContentPane().add(label_20);

		setVisible(true);

		sl_putanna12.addChangeListener(slider12);
		sl_putanna13.addChangeListener(slider13);
		sl_putanna14.addChangeListener(slider14);
		sl_putanna15.addChangeListener(slider15);

	}

	class SliderListener12 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			sl_putanna12 = (JSlider) e.getSource();
			i_sl_putanna12 = (int) sl_putanna12.getValue();
		}
	}

	class SliderListener13 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			sl_putanna13 = (JSlider) e.getSource();
			i_sl_putanna13 = (int) sl_putanna13.getValue();
		}
	}

	class SliderListener14 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			sl_putanna14 = (JSlider) e.getSource();
			i_sl_putanna14 = (int) sl_putanna14.getValue();
		}
	}

	class SliderListener15 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			sl_putanna15 = (JSlider) e.getSource();
			i_sl_putanna15 = (int) sl_putanna15.getValue();
		}
	}

}
