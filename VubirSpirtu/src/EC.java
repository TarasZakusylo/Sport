import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
 
public class EC extends JFrame {

	private JSlider sl_putanna0;
	private JSlider sl_putanna1;
	private JSlider sl_putanna2;
	private JSlider sl_putanna3;
	
	int i_sl_putanna0 = 1;
	int i_sl_putanna1 = 1;
	int i_sl_putanna2 = 1;
	int i_sl_putanna3 = 1;
 
	
	SliderListener slider = new SliderListener();
	SliderListener1 slider1 = new SliderListener1();
	SliderListener2 slider2 = new SliderListener2();
	SliderListener3 slider3 = new SliderListener3();

	 
	EC(String s , int ii_sl_putanna0,int ii_sl_putanna1,int ii_sl_putanna2,int ii_sl_putanna3, int ii_sl_putanna4,int ii_sl_putanna5,int ii_sl_putanna6,int ii_sl_putanna7, 
			int ii_sl_putanna8,int ii_sl_putanna9,int ii_sl_putanna10,int ii_sl_putanna11, int ii_sl_putanna12,int ii_sl_putanna13,int ii_sl_putanna14,int ii_sl_putanna15) { 
		super(s);
		
		this.i_sl_putanna0 = ii_sl_putanna0;
		this.i_sl_putanna1 = ii_sl_putanna1;
		this.i_sl_putanna2 = ii_sl_putanna2;
		this.i_sl_putanna3 = ii_sl_putanna3;
 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JButton b_menu = new JButton("\u041C\u0435\u043D\u044E");
		b_menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menu = new Menu("Фізична культура в школі");
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
		
		 sl_putanna0 = new JSlider(0, 1, 5, i_sl_putanna0);
		getContentPane().add(l_komentar1);
		sl_putanna0.setMinorTickSpacing(1);
		sl_putanna0.setPaintTicks(true);
		sl_putanna0.setPaintLabels(true);		
		sl_putanna0.setBounds(35,136,715,40);
		 getContentPane().add(sl_putanna0);
		 
		  sl_putanna1 = new JSlider(SwingConstants.HORIZONTAL, 1, 5, i_sl_putanna1);
		 sl_putanna1.setPaintTicks(true);
		 sl_putanna1.setPaintLabels(true);
		 sl_putanna1.setMinorTickSpacing(1);
		 sl_putanna1.setBounds(35, 230, 715, 40);
		 getContentPane().add(sl_putanna1);
		 
		  sl_putanna2 = new JSlider(SwingConstants.HORIZONTAL, 1, 5, i_sl_putanna2);
		 sl_putanna2.setPaintTicks(true);
		 sl_putanna2.setPaintLabels(true);
		 sl_putanna2.setMinorTickSpacing(1);
		 sl_putanna2.setBounds(35, 332, 715, 40);
		 getContentPane().add(sl_putanna2);
		 
		  sl_putanna3 = new JSlider(SwingConstants.HORIZONTAL, 1, 5, i_sl_putanna3);
		 sl_putanna3.setPaintTicks(true);
		 sl_putanna3.setPaintLabels(true);
		 sl_putanna3.setMinorTickSpacing(1);
		 sl_putanna3.setBounds(35, 451, 715, 40);
		 getContentPane().add(sl_putanna3);
		 
		 JLabel label = new JLabel("\u0441\u0443\u043C\u043D\u0456\u0432\u0430\u044E\u0441\u044C");
		 label.setHorizontalAlignment(SwingConstants.CENTER);
		 label.setBounds(343, 174, 102, 14);
		 getContentPane().add(label);
		 
		 JLabel label_1 = new JLabel("\u0442\u043E\u0447\u043D\u043E - \u0442\u0430\u043A");
		 label_1.setHorizontalAlignment(SwingConstants.CENTER);
		 label_1.setBounds(682, 174, 102, 14);
		 getContentPane().add(label_1);
		 
		 JLabel label_2 = new JLabel("\u0448\u0432\u0438\u0434\u0448\u0435 \u0437\u0430 \u0432\u0441\u0435 - \u0442\u0430\u043A");
		 label_2.setHorizontalAlignment(SwingConstants.CENTER);
		 label_2.setBounds(502, 174, 116, 14);
		 getContentPane().add(label_2);
		 
		 JLabel label_3 = new JLabel("\u0448\u0432\u0438\u0434\u0448\u0435 \u0437\u0430 \u0432\u0441\u0435 - \u043D\u0456");
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
		 
		 JLabel label_6 = new JLabel("\u0448\u0432\u0438\u0434\u0448\u0435 \u0437\u0430 \u0432\u0441\u0435 - \u043D\u0456");
		 label_6.setHorizontalAlignment(SwingConstants.CENTER);
		 label_6.setBounds(161, 268, 116, 14);
		 getContentPane().add(label_6);
		 
		 JLabel label_7 = new JLabel("\u0441\u0443\u043C\u043D\u0456\u0432\u0430\u044E\u0441\u044C");
		 label_7.setHorizontalAlignment(SwingConstants.CENTER);
		 label_7.setBounds(341, 268, 102, 14);
		 getContentPane().add(label_7);
		 
		 JLabel label_8 = new JLabel("\u0448\u0432\u0438\u0434\u0448\u0435 \u0437\u0430 \u0432\u0441\u0435 - \u0442\u0430\u043A");
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
		 
		 JLabel label_11 = new JLabel("\u0448\u0432\u0438\u0434\u0448\u0435 \u0437\u0430 \u0432\u0441\u0435 - \u043D\u0456");
		 label_11.setHorizontalAlignment(SwingConstants.CENTER);
		 label_11.setBounds(163, 371, 116, 14);
		 getContentPane().add(label_11);
		 
		 JLabel label_12 = new JLabel("\u0441\u0443\u043C\u043D\u0456\u0432\u0430\u044E\u0441\u044C");
		 label_12.setHorizontalAlignment(SwingConstants.CENTER);
		 label_12.setBounds(343, 371, 102, 14);
		 getContentPane().add(label_12);
		 
		 JLabel label_13 = new JLabel("\u0448\u0432\u0438\u0434\u0448\u0435 \u0437\u0430 \u0432\u0441\u0435 - \u0442\u0430\u043A");
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
		 
		 JLabel label_16 = new JLabel("\u0448\u0432\u0438\u0434\u0448\u0435 \u0437\u0430 \u0432\u0441\u0435 - \u043D\u0456");
		 label_16.setHorizontalAlignment(SwingConstants.CENTER);
		 label_16.setBounds(163, 494, 116, 14);
		 getContentPane().add(label_16);
		 
		 JLabel label_17 = new JLabel("\u0441\u0443\u043C\u043D\u0456\u0432\u0430\u044E\u0441\u044C");
		 label_17.setHorizontalAlignment(SwingConstants.CENTER);
		 label_17.setBounds(343, 494, 102, 14);
		 getContentPane().add(label_17);
		 
		 JLabel label_18 = new JLabel("\u0448\u0432\u0438\u0434\u0448\u0435 \u0437\u0430 \u0432\u0441\u0435 - \u0442\u0430\u043A");
		 label_18.setHorizontalAlignment(SwingConstants.CENTER);
		 label_18.setBounds(502, 494, 116, 14);
		 getContentPane().add(label_18);
		 
		 JLabel label_19 = new JLabel("\u0442\u043E\u0447\u043D\u043E - \u0442\u0430\u043A");
		 label_19.setHorizontalAlignment(SwingConstants.CENTER);
		 label_19.setBounds(682, 494, 102, 14);
		 getContentPane().add(label_19);
		 
		 JLabel l_putanna0 = new JLabel("\u0412\u0430\u043C \u043F\u043E\u0434\u043E\u0431\u0430\u0454\u0442\u044C\u0441\u044F \u0447\u0430\u0441\u0442\u043E \u0445\u043E\u0434\u0438\u0442\u0438 \u0434\u043E \u043A\u043E\u0433\u043E-\u043D\u0435\u0431\u0443\u0434\u044C \u0432 \u0433\u043E\u0441\u0442\u0456 \u0456 \u0431\u0443\u0432\u0430\u0442\u0438 \u0432 \u0441\u0443\u0441\u043F\u0456\u043B\u044C\u0441\u0442\u0432\u0456?");
		 l_putanna0.setHorizontalAlignment(SwingConstants.CENTER);
		 l_putanna0.setBounds(35, 96, 715, 34);
		 l_putanna0.setFont(new Font("Times New Roman", Font.BOLD, 20));
		 l_putanna0.setForeground(Color.RED);
		 getContentPane().add(l_putanna0);
		 
		 JLabel l_putanna1 = new JLabel("\u0423 \u0432\u0430\u0441 \u0431\u0430\u0433\u0430\u0442\u043E \u0434\u0440\u0443\u0437\u0456\u0432?");
		 l_putanna1.setHorizontalAlignment(SwingConstants.CENTER);
		 l_putanna1.setBounds(35, 203, 715, 34);
		 getContentPane().add(l_putanna1);
		 l_putanna1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		 l_putanna1.setForeground(Color.RED);
		 
		 JLabel l_putanna2 = new JLabel("\u0412\u0438 \u0432\u0432\u0430\u0436\u0430\u0454\u0442\u0435 \u0441\u0435\u0431\u0435 \u0431\u0435\u0437\u0442\u0443\u0440\u0431\u043E\u0442\u043D\u0438\u043C \u043B\u044E\u0434\u0438\u043D\u043E\u044E?");
		 l_putanna2.setHorizontalAlignment(SwingConstants.CENTER);
		 l_putanna2.setBounds(35, 306, 715, 34);
		 getContentPane().add(l_putanna2);
		 l_putanna2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		 l_putanna2.setForeground(Color.RED);
		 
		 JLabel l_putanna3 = new JLabel("\u0412\u0438 \u043B\u0435\u0433\u043A\u043E \u043C\u043E\u0436\u0435\u0442\u0435 \u0432\u043D\u0435\u0441\u0442\u0438 \u043F\u043E\u0436\u0432\u0430\u0432\u043B\u0435\u043D\u043D\u044F \u0432 \u0434\u043E\u0441\u0438\u0442\u044C \u043D\u0443\u0434\u043D\u0443 \u043A\u043E\u043C\u043F\u0430\u043D\u0456\u044E?");
		 l_putanna3.setHorizontalAlignment(SwingConstants.CENTER);
		 l_putanna3.setBounds(35, 422, 715, 34);
		 getContentPane().add(l_putanna3);
		 l_putanna3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		 l_putanna3.setForeground(Color.RED);
		 
		 JButton b_vpered0 = new JButton("\u0412\u043F\u0435\u0440\u0435\u0434 2/4");
		 b_vpered0.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) {
		 		EC1 ec1 = new EC1 ("EC" ,i_sl_putanna0 , i_sl_putanna1 , i_sl_putanna2 ,i_sl_putanna3 ,ii_sl_putanna4 , ii_sl_putanna5 , ii_sl_putanna6 ,ii_sl_putanna7,
		 				ii_sl_putanna8 , ii_sl_putanna9 , ii_sl_putanna10 ,ii_sl_putanna11 ,ii_sl_putanna12 , ii_sl_putanna13 , ii_sl_putanna14 ,ii_sl_putanna15);
		 		setVisible(false);
		 		}
		 });
		 b_vpered0.setBounds(643, 526, 141, 36);
		 getContentPane().add(b_vpered0);

		 
		setVisible(true);

		sl_putanna0.addChangeListener(slider);
		sl_putanna1.addChangeListener(slider1);
		sl_putanna2.addChangeListener(slider2);
		sl_putanna3.addChangeListener(slider3);
		
	}

	class SliderListener implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			sl_putanna0 = (JSlider) e.getSource();
			i_sl_putanna0 = (int) sl_putanna0.getValue();
		}
	}
	
	class SliderListener1 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			sl_putanna1 = (JSlider) e.getSource();
			i_sl_putanna1 = (int) sl_putanna1.getValue();
		}
	}

	class SliderListener2 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			sl_putanna2 = (JSlider) e.getSource();
			i_sl_putanna2 = (int) sl_putanna2.getValue();
		}
	}

	class SliderListener3 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			sl_putanna3 = (JSlider) e.getSource();
			i_sl_putanna3 = (int) sl_putanna3.getValue();
		}
	}
	
}

