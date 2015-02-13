package uppgift4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Color;
import java.awt.Font;

public class HumansAndDogsGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Human human;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HumansAndDogsGUI frame = new HumansAndDogsGUI();
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
	public HumansAndDogsGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New human");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				human=new Human (textField.getText());
				
			}
		});
		btnNewButton.setBounds(227, 42, 113, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Buy dog");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(human!=null){
					
				human.buyDog(new Dog(textField_1.getText()));
				}
			}
		});
		btnNewButton_1.setBounds(227, 78, 113, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Print info");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (human == null) {		// human finns inte
					textField_3.setText("No human!");
				} else { 					// human finns

					if (human.getError() == null) {
						textField_2.setText(human.getInfo());

					} else {
						textField_3.setText(human.getError());

					}
					
				
				}
			}
		
		});
		btnNewButton_2.setBounds(290, 169, 113, 23);
		contentPane.add(btnNewButton_2);
		
		textField = new JTextField();
		textField.setBounds(79, 43, 136, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(79, 79, 136, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(22, 119, 381, 43);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(23, 205, 381, 43);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblInfo = DefaultComponentFactory.getInstance().createTitle("Info:");
		lblInfo.setBounds(22, 101, 105, 16);
		contentPane.add(lblInfo);
		
		JLabel lblErrors = DefaultComponentFactory.getInstance().createTitle("Errors:");
		lblErrors.setBounds(23, 186, 105, 16);
		contentPane.add(lblErrors);
		
		JLabel lblHumansAndDogs = DefaultComponentFactory.getInstance().createTitle("Humans and dogs");
		lblHumansAndDogs.setFont(new Font("Gadugi", Font.BOLD, 17));
		lblHumansAndDogs.setBounds(138, 0, 169, 32);
		contentPane.add(lblHumansAndDogs);
	}
}
