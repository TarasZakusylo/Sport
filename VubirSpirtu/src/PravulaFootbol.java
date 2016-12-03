import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URI;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

public class PravulaFootbol extends JFrame {

	private static final long serialVersionUID = 1L;

	String s_nazva = "res/pravila+taktika/Footbol";
	private static BufferedImage image_vuvestuProfil;

	public PravulaFootbol() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);

		JButton btnNewButton = new JButton("\u041C\u0435\u043D\u044E");
		btnNewButton.setBounds(396, 11, 388, 38);
		btnNewButton.setFont(new Font("Verdana", Font.ITALIC, 20));
		btnNewButton.setForeground(Color.MAGENTA);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Menu("Գ����� �������� � ����");
				setVisible(false);
			}
		});
		getContentPane().setLayout(null);
		getContentPane().add(btnNewButton);

		JButton button = new JButton("\u041D\u0430\u0437\u0430\u0434");
		button.setBounds(10, 11, 388, 38);
		button.setForeground(Color.MAGENTA);
		button.setFont(new Font("Verdana", Font.ITALIC, 20));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new PravulaMenu();
				setVisible(false);
			}
		});
		getContentPane().add(button);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 60, 794, 512);
		getContentPane().add(tabbedPane);

		JPanel panel_pravula = new JPanel();
		tabbedPane.addTab("\u041F\u0440\u0430\u0432\u0438\u043B\u0430", null, panel_pravula, null);
		panel_pravula.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 789, 484);
		panel_pravula.add(scrollPane);

		JLabel lblNewLabel = new JLabel();
		scrollPane.setViewportView(lblNewLabel);

		File file_vuvestuProfil = new File(s_nazva + "/" + "photo.png");

		try {
			image_vuvestuProfil = ImageIO.read(file_vuvestuProfil);
		} catch (Exception e1) {
		}

		lblNewLabel.setIcon(new ImageIcon(image_vuvestuProfil));

		Desktop d = Desktop.getDesktop();

		JPanel panel_taktika = new JPanel();
		panel_taktika.setToolTipText("\u0422\u0430\u043A\u0442\u0438\u043A\u0430");
		tabbedPane.addTab("\u0422\u0430\u043A\u0442\u0438\u043A\u0430", null, panel_taktika, null);
		panel_taktika.setLayout(null);

		JLabel label = new JLabel(
				"\u041D\u0430\u0442\u0438\u0441\u043D\u0456\u0442\u044C, \u0431\u0443\u0434\u044C \u043B\u0430\u0441\u043A\u0430, \u043D\u0430 \u043D\u0430\u043F\u0438\u0441 \u0434\u043B\u044F \u043F\u0435\u0440\u0435\u0433\u043B\u044F\u0434\u0443 \u0446\u0456\u043A\u0430\u0432\u043E\u0457 \u0432\u0430\u043C \u0440\u0443\u0431\u0440\u0438\u043A\u0438");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.MAGENTA);
		label.setFont(new Font("Verdana", Font.ITALIC, 15));
		label.setBounds(10, 455, 769, 29);
		panel_taktika.add(label);

		JLabel label_1 = new JLabel(
				"\u0422\u0430\u043A\u0442\u0438\u043A\u0430 \u0437\u0430\u0445\u0438\u0441\u0442\u0443");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					d.browse(new URI("http://footballtrainer.ru/tactics/249-34-taktika-zashhity.html"));
				} catch (Exception e1) {
				}
			}
		});
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setForeground(Color.ORANGE);
		label_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		label_1.setBounds(46, 424, 226, 20);
		panel_taktika.add(label_1);

		JLabel label_2 = new JLabel("\u0422\u0430\u043A\u0442\u0438\u043A\u0430 \u043D\u0430\u043F\u0430\u0434\u0443");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					d.browse(new URI("http://footballtrainer.ru/tactics/250-33-taktika-napadeniya.html"));
				} catch (Exception e1) {
				}
			}
		});
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setForeground(Color.ORANGE);
		label_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		label_2.setBounds(46, 355, 226, 20);
		panel_taktika.add(label_2);

		JLabel label_3 = new JLabel(
				"\u0424\u0443\u043D\u043A\u0446\u0456\u0457 \u0433\u0440\u0430\u0432\u0446\u0456\u0432");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					d.browse(new URI("http://footballtrainer.ru/tactics/251-32-funkcii-igrokov.html"));
				} catch (Exception e1) {
				}
			}
		});
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setForeground(Color.ORANGE);
		label_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		label_3.setBounds(46, 288, 226, 20);
		panel_taktika.add(label_3);

		JLabel label_4 = new JLabel("\u0421\u0445\u0435\u043C\u0430 4-3-3");
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					d.browse(new URI("http://footballtrainer.ru/tactics/406-shema-4-3-3.html"));
				} catch (Exception e1) {
				}
			}
		});
		label_4.setHorizontalAlignment(SwingConstants.LEFT);
		label_4.setForeground(Color.ORANGE);
		label_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		label_4.setBounds(46, 224, 226, 20);
		panel_taktika.add(label_4);

		JLabel label_5 = new JLabel("\u0417\u0430\u0445\u0438\u0441\u0442 (\u043E\u0441\u043D\u043E\u0432\u0430)");
		label_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					d.browse(new URI("http://footballtrainer.ru/tactics/379-obschie-pravila-dlya-zaschitnikov.html"));
				} catch (Exception e1) {
				}
			}
		});
		label_5.setHorizontalAlignment(SwingConstants.LEFT);
		label_5.setForeground(Color.ORANGE);
		label_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		label_5.setBounds(46, 155, 226, 20);
		panel_taktika.add(label_5);

		JLabel label_6 = new JLabel("\u0410\u0442\u0430\u043A\u0430 (\u043E\u0441\u043D\u043E\u0432\u0430)\r\n");
		label_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					d.browse(new URI(
							"http://footballtrainer.ru/tactics/774-osnovnye-takticheskie-priemy-pri-igre-v-atake.html"));
				} catch (Exception e1) {
				}
			}
		});
		label_6.setHorizontalAlignment(SwingConstants.LEFT);
		label_6.setForeground(Color.ORANGE);
		label_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		label_6.setBounds(46, 91, 226, 20);
		panel_taktika.add(label_6);

		JLabel label_7 = new JLabel(
				"\u0417\u0430\u0445\u0438\u0441\u0442 (\u0437\u0430\u0433\u0430\u043B\u044C\u043D\u043E)");
		label_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					d.browse(new URI("http://footballtrainer.ru/tactics/987-obschie-pravila-dlya-zaschitnikov.html"));
				} catch (Exception e1) {
				}
			}
		});
		label_7.setHorizontalAlignment(SwingConstants.LEFT);
		label_7.setForeground(Color.ORANGE);
		label_7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		label_7.setBounds(46, 26, 226, 20);
		panel_taktika.add(label_7);

		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon("res/fon/PravulaFootbol.png"));
		label_8.setVerticalAlignment(SwingConstants.TOP);
		label_8.setBounds(0, 0, 789, 484);
		panel_taktika.add(label_8);

		JLabel label_61 = new JLabel("");
		label_61.setIcon(new ImageIcon("res/fon/Pravula.png"));
		label_61.setBounds(0, 0, 794, 572);
		getContentPane().add(label_61);

		setVisible(true);

	}
}
