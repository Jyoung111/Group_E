package team;
import java.awt.BorderLayout;
import java.util.Random;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import java.awt.Font;
import java.awt.Label;
import java.awt.Button;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Choice;
import java.awt.List;
import javax.swing.JSpinner;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Play_choice extends JFrame {

	private JPanel contentPane;
	public Thread looper;
	public boolean flag = true;
	public ImageIcon img[] = {
			new ImageIcon("C:\\Users\\JY\\Desktop\\opensource\\img\\sample\\Baeksuk.jpg"),
            new ImageIcon("C:\\Users\\JY\\Desktop\\opensource\\img\\sample\\Cake.jpg"),
            new ImageIcon("C:\\Users\\JY\\Desktop\\opensource\\img\\sample\\Chicken.jpg"),
            new ImageIcon("C:\\Users\\JY\\Desktop\\opensource\\img\\sample\\Dak-bokkeum-tang.png"),
            new ImageIcon("C:\\Users\\JY\\Desktop\\opensource\\img\\sample\\Jokbal.jpg"),
            new ImageIcon("C:\\Users\\JY\\Desktop\\opensource\\img\\sample\\Bossam.png"),
            new ImageIcon("C:\\Users\\JY\\Desktop\\opensource\\img\\sample\\Caramel Macchiato.png"),
            //new ImageIcon("C:\\Users\\JY\\Desktop\\opensource\\img\\4.png"),
            //new ImageIcon("C:\\Users\\JY\\Desktop\\opensource\\img\\return-button.png")

	};
	public String img_name[] = {
			"���",
			"����ũ",
			"ġŲ",
			"�ߺ�����",
			"����",
			"����",
			"ī��� �����߶�"
	};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Play_choice frame = new Play_choice();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Play_choice() {
		super ("Choice_Helper");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 471);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(186, 85, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocation(550,200);
		
		JButton btnNewButton = new JButton("\uC2DC\uC791");
		btnNewButton.setBackground(new Color(230, 230, 250));
		btnNewButton.setForeground(new Color(106, 90, 205));
		btnNewButton.setFont(new Font("����ǹ��� ����", Font.PLAIN, 26));
		btnNewButton.setBounds(103, 361, 179, 36);
		contentPane.add(btnNewButton);
		
	
		JButton button = new JButton("\uC815\uC9C0");
		button.setBackground(new Color(255, 204, 255));
		button.setForeground(new Color(186, 85, 211));
		button.setFont(new Font("����ǹ��� ����", Font.PLAIN, 26));
		button.setBounds(330, 361, 179, 36);
		contentPane.add(button);
		
		JLabel label = new JLabel("\uB180\uAC70\uB9AC");
		label.setBackground(new Color(255, 255, 255));
		label.setForeground(new Color(255, 240, 245));
		label.setFont(new Font("����ǹ��� �־�", Font.PLAIN, 25));
		label.setBounds(265, 307, 252, 26);
		contentPane.add(label);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(new Color(186, 85, 211));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\chosun\\Documents\\OpenSource_Team_E\\img\\return-button.png"));
		btnNewButton_1.setBounds(24, 23, 49, 47);
		//������ ���ֱ�
		btnNewButton_1.setFocusPainted( false );
		btnNewButton_1.setBorder(null);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_1.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Home_main home_frame = new Home_main();
				home_frame.setVisible(true);
				dispose();
			}
		});
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\chosun\\Documents\\OpenSource_Team_E\\img\\play.PNG"));
		lblNewLabel.setBounds(87, 45, 407, 241);
		contentPane.add(lblNewLabel);
		
		btnNewButton.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {				
				
				new Thread() {
					public void run() {
						while(flag) {
							int random_num = (int)(Math.random() * 6);
							//���� ���� ������
							lblNewLabel.setIcon(img[random_num]);
							lblNewLabel.setLocation(160,50);
//							lblNewLabel.revalidate();
//							lblNewLabel.repaint();
//							lblNewLabel.update(lblNewLabel.getGraphics());
//							
							//�ؽ�Ʈ ����
							label.setText(img_name[random_num]);
							
							try {
								Thread.sleep(100);
							} catch (InterruptedException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}
				}.start();
				flag = true;				
			}
		});
		
		button.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {		
				flag = false;
			}
		});		
		
		
		//setUndecorated(true);
	}
	
}
