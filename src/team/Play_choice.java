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
<<<<<<< HEAD
	private JLabel lblNewLabel_2;
	public boolean flag = false;
	public ImageIcon img[] = {
			new ImageIcon("C:\\Users\\JY\\Desktop\\opensource\\img\\0.png"),
            new ImageIcon("C:\\Users\\JY\\Desktop\\opensource\\img\\1.png"),
            new ImageIcon("C:\\Users\\JY\\Desktop\\opensource\\img\\2.png"),
            new ImageIcon("C:\\Users\\JY\\Desktop\\opensource\\img\\3.png"),
            new ImageIcon("C:\\Users\\JY\\Desktop\\opensource\\img\\4.png"),
            //new ImageIcon("C:\\Users\\JY\\Desktop\\opensource\\img\\return-button.png")

	};
=======
>>>>>>> 11f999ad2b58e8d52dfa082566a745673584f498

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Play_choice frame = new Play_choice();
					//frame.setVisible(true);
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
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 440);
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
		btnNewButton.setBounds(102, 336, 179, 36);
		contentPane.add(btnNewButton);
		
	
		JButton button = new JButton("\uC815\uC9C0");
		button.setBackground(new Color(255, 204, 255));
		button.setForeground(new Color(186, 85, 211));
		button.setFont(new Font("����ǹ��� ����", Font.PLAIN, 26));
		button.setBounds(330, 336, 179, 36);
		contentPane.add(button);
		
		JLabel label = new JLabel("\uB180\uAC70\uB9AC");
		label.setBackground(new Color(255, 255, 255));
		label.setForeground(new Color(255, 240, 245));
		label.setFont(new Font("����ǹ��� �־�", Font.PLAIN, 18));
		label.setBounds(276, 298, 57, 15);
		contentPane.add(label);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(new Color(186, 85, 211));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\chosun\\Desktop\\return-button.png"));
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
		
<<<<<<< HEAD
		
		
		JLabel lblNewLabel_1 = new JLabel("X");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.setFont(new Font("����ǹ��� �־�", Font.BOLD, 18));
		lblNewLabel_1.setForeground(new Color(240, 248, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(567, 10, 24, 15);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\JY\\Desktop\\opensource\\img\\clapperboard (1).png"));
		lblNewLabel_2.setBounds(177, 114, 69, 61);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\JY\\Desktop\\opensource\\img\\football.png"));
		lblNewLabel_3.setBounds(279, 92, 81, 71);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\JY\\Desktop\\opensource\\img\\microphone.png"));
		lblNewLabel_4.setBounds(372, 114, 81, 71);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\JY\\Desktop\\opensource\\img\\cards.png"));
		lblNewLabel_5.setBounds(422, 192, 81, 71);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\JY\\Desktop\\opensource\\img\\question.png"));
		lblNewLabel_6.setBounds(242, 162, 145, 163);
		contentPane.add(lblNewLabel_6);
		
		
		
		btnNewButton.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {				
				
				new Thread() {
					public void run() {
						while(flag) {
							button.requestFocus();
							int random_num = (int)(Math.random() * 4);				
							lblNewLabel_6.setIcon(img[random_num]);
							lblNewLabel_6.revalidate();
							lblNewLabel_6.repaint();
							lblNewLabel_6.update(lblNewLabel_6.getGraphics());
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
		
		
		
		
		setUndecorated(true);
		setVisible(true);
=======
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\chosun\\Desktop\\play.PNG"));
		lblNewLabel.setBounds(85, 47, 407, 241);
		contentPane.add(lblNewLabel);
		
>>>>>>> 11f999ad2b58e8d52dfa082566a745673584f498
	
	}
	
	
}
