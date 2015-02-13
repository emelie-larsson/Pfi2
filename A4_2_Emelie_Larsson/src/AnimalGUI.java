import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import java.awt.Color;


public class AnimalGUI extends JFrame {

	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalGUI frame = new AnimalGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public AnimalGUI() {
		
	ArrayList<Animal> animals = new ArrayList <Animal>();
	Cat cat = new Cat("Felis catus", 4, 6);
	cat.setFriendlyName ("Kissemissen");
	
	Cat cat_2 = new Cat("Felis catus", 6, 9);
	cat_2.setFriendlyName ("Kattjäveln");
	
	Cat cat_3 = new Cat("Felis catus", 2, 3);
	cat_3.setFriendlyName ("Kattis");
	
	
	
	
	animals.add(new Dog ("Canis lupus familiaris", 20, false, "Ann-Marie"));
	animals.add(cat);
	animals.add(new Snake("Anguis", true));
	animals.add(new Dog ("Canis lupus familiaris", 3, true, "Rolf"));
	animals.add(cat_2);
	animals.add(new Snake("Anguis", false));
	animals.add(cat_3);
	
	
	
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 352);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		scrollPane.setBounds(21, 37, 437, 265);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JLabel lblListOfAnimals = DefaultComponentFactory.getInstance().createTitle("List of animals:");
		lblListOfAnimals.setFont(new Font("Myanmar Text", Font.PLAIN, 15));
		lblListOfAnimals.setBounds(21, 11, 143, 27);
		contentPane.add(lblListOfAnimals);
		
		for (int i = 0; i < animals.size(); i++){
			textArea.append(animals.get(i).getInfo() + "\n");
			
		}
	}
}
