import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdaugareEveniment extends JFrame {

	public JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	public int ziua,luna,an;
	public String titlu,descriere,culoare;
	
	/**
	 * Create the frame.
	 */
	public AdaugareEveniment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(43, 82, 45, 21);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_1.setSelectedIndex(0);
		comboBox_1.setBounds(154, 82, 51, 21);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027"}));
		comboBox_2.setSelectedIndex(0);
		comboBox_2.setBounds(291, 82, 59, 21);
		contentPane.add(comboBox_2);
		
		JLabel lblNewLabel = new JLabel("Selectare data");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(26, 32, 96, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Zi");
		lblNewLabel_1.setBounds(20, 68, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Luna");
		lblNewLabel_2.setBounds(144, 68, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("An");
		lblNewLabel_3.setBounds(291, 59, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(211, 113, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Introducere titlu");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(26, 113, 162, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Descriere");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(26, 136, 98, 13);
		contentPane.add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setBounds(211, 135, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"albastru", "bej", "rosu", "verde"}));
		comboBox_3.setBounds(211, 171, 108, 21);
		contentPane.add(comboBox_3);
		
		
		JButton btnNewButton = new JButton("Adaugare");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(Proiect_fis.idx);

				ziua = comboBox.getSelectedIndex()+1;
				luna = comboBox_1.getSelectedIndex()+1;
				an = comboBox_2.getSelectedIndex()+2020;
				

				titlu = textField.getText();
				descriere = textField_1.getText();
				String[] culori = new String[] {"albastru", "bej", "rosu", "verde"};
				
				culoare = culori[comboBox_3.getSelectedIndex()];
				
				System.out.println(ziua);
				System.out.println(luna);
				System.out.println(an);
				System.out.println(titlu);
				System.out.println(descriere);
				System.out.println(culoare);
				
				int idx = Proiect_fis.idx;
				Proiect_fis.idx+=1;
				
				Proiect_fis.date[idx][0] = ziua;
				Proiect_fis.date[idx][1] = luna;
				Proiect_fis.date[idx][2] = an;
							
				
				Proiect_fis.detalii[idx][0] = titlu;
				Proiect_fis.detalii[idx][1] = descriere;
				Proiect_fis.detalii[idx][2] = culoare;
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(169, 221, 109, 21);
		contentPane.add(btnNewButton);
		

		JLabel lblNewLabel_6 = new JLabel("Cod culoare");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(26, 171, 96, 17);
		contentPane.add(lblNewLabel_6);
	}

}
