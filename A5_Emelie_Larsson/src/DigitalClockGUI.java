

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Toolkit;


public class DigitalClockGUI extends JFrame {

	private ClockLogic clockLogic = new ClockLogic(this);
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigitalClockGUI frame = new DigitalClockGUI();
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
	public DigitalClockGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\emeli_000\\Desktop\\RidRrE7yT.png"));
		setTitle("Alarm Clock");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Myriad Pro", Font.PLAIN, 12));
		textField.setBounds(162, 255, 111, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Myriad Pro", Font.PLAIN, 12));
		textField_1.setBounds(293, 255, 117, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setEditable(false);
		textField_2.setFont(new Font("Myriad Pro", Font.PLAIN, 26));
		textField_2.setBounds(186, 42, 192, 46);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Myriad Pro", Font.PLAIN, 20));
		textField_3.setEditable(false);
		textField_3.setBounds(186, 103, 192, 46);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblMinutes = DefaultComponentFactory.getInstance().createTitle("Minutes: ");
		lblMinutes.setFont(new Font("Myriad Pro Light", Font.BOLD, 14));
		lblMinutes.setForeground(Color.WHITE);
		lblMinutes.setBounds(293, 241, 64, 14);
		contentPane.add(lblMinutes);
		
		JLabel lblHour = DefaultComponentFactory.getInstance().createTitle("Hour:");
		lblHour.setFont(new Font("Myriad Pro Light", Font.PLAIN, 14));
		lblHour.setForeground(Color.WHITE);
		lblHour.setBounds(162, 241, 64, 14);
		contentPane.add(lblHour);
		
		JButton btnSetAlarm = new JButton("Set Alarm");
		btnSetAlarm.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		btnSetAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				clockLogic.setAlarm(Integer.parseInt(textField.getText()), Integer.parseInt(textField_1.getText()));
				
				
				
			}
		});
		btnSetAlarm.setBounds(162, 297, 111, 23);
		contentPane.add(btnSetAlarm);
		
		JButton btnClearAlarm = new JButton("Clear Alarm");
		btnClearAlarm.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		btnClearAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				clockLogic.clearAlarm();
				textField.setText(" ");
				textField_1.setText(" ");
				
				
				
			}
		});
		btnClearAlarm.setBounds(293, 297, 117, 23);
		contentPane.add(btnClearAlarm);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 449, 349);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\emeli_000\\Desktop\\kaffe-mamma (1).jpg"));
		contentPane.add(lblNewLabel);
	}
	
	public void setTimeOnLabel(String time){
		textField_2.setText(time);
		
	}
}
