import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Vpravu extends JFrame {

	private static final long serialVersionUID = 1L;

	private VpravuSpusok vpravuSpusok;
	private JList<String> list;

	String s_nazva = "res/vpravu/";
	String s_k_vuvestuProfil = "";
	JTextArea textArea;
	File folder = new File(s_nazva);
	File[] listOfFiles = folder.listFiles();

	Vpravu(String s) {
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("\u041C\u0435\u043D\u044E");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Menu("Фізична культура в школі");
				setVisible(false);
			}
		});
		btnNewButton.setBounds(10, 11, 243, 23);
		getContentPane().add(btnNewButton);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 65, 243, 455);
		getContentPane().add(scrollPane);

		vpravuSpusok = new VpravuSpusok();

		list = new JList<String>(vpravuSpusok);
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				BufferedReader reader;
				try {
					reader = new BufferedReader(
							new FileReader(s_nazva + list.getSelectedValue() + "/" + "harakteristici.txt"));

					String line;
					List<String> lines = new ArrayList<String>();

					while ((line = reader.readLine()) != null) {
						lines.add(line);
					}
					String[] linesAsArray = lines.toArray(new String[lines.size()]);

					for (int i = 0; i < linesAsArray.length; i++) {
						s_k_vuvestuProfil = s_k_vuvestuProfil + linesAsArray[i] + "\n";
					}

				} catch (Exception e1) {
				}

				textArea.setText(s_k_vuvestuProfil);
				s_k_vuvestuProfil = "";

			}
		});
		scrollPane.setViewportView(list);

		for (int i = 0; i < listOfFiles.length; i++) {
			addElement(listOfFiles[i].getName());
		}

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(263, 11, 511, 543);
		getContentPane().add(scrollPane_1);

		textArea = new JTextArea();
		scrollPane_1.setViewportView(textArea);

		JLabel lblNewLabel = new JLabel(
				"\u041E\u0441\u043D\u043E\u0432\u043D\u0456 \u0444\u0456\u0437\u0438\u0447\u043D\u0456 \u044F\u043A\u043E\u0441\u0442\u0456:\r\n");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(30, 45, 197, 14);
		getContentPane().add(lblNewLabel);

		JButton btnNewButton_1 = new JButton(
				"\u041F\u0435\u0440\u0456\u043E\u0434\u0438  \u0441\u043F\u0440\u0438\u044F\u0442\u043B\u0438\u0432\u043E\u0433\u043E \u0440\u043E\u0437\u0432\u0438\u0442\u043A\u0443");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new PerioduRozvutku();
			}
		});
		btnNewButton_1.setBounds(10, 531, 243, 23);
		getContentPane().add(btnNewButton_1);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("res/fon/Vpravu.png"));
		label.setBounds(0, 0, 784, 562);
		getContentPane().add(label);

		setVisible(true);

	}

	public void addElement(String s) {
		vpravuSpusok.addElements(s);
	}
}
