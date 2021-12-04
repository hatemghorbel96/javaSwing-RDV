package swing;
import classes.Rdv;
import java.awt.BorderLayout;
import dao.RdvDAO;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import classes.Rdv;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;
public class Swing extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JComboBox comboBoxcodemed;
	private JComboBox comboBoxnumMed;
	private JTextField textField_3;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing frame = new Swing();
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
	public Swing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRdvCabine = new JLabel("RDV cabine");
		lblRdvCabine.setBounds(143, 27, 74, 14);
		contentPane.add(lblRdvCabine);
		
		JLabel lblCodeMedecin = new JLabel("Code Medecin");
		lblCodeMedecin.setBounds(28, 58, 80, 14);
		contentPane.add(lblCodeMedecin);
		
		JLabel lblNumMedecin = new JLabel("Nom medecin");
		lblNumMedecin.setBounds(221, 58, 74, 14);
		contentPane.add(lblNumMedecin);
		
		JComboBox comboBoxcodemed = new JComboBox();
		comboBoxcodemed.setBounds(118, 55, 28, 20);
		contentPane.add(comboBoxcodemed);
		
		JComboBox comboBoxnumMed = new JComboBox();
		comboBoxnumMed.setBounds(312, 55, 28, 20);
		contentPane.add(comboBoxnumMed);
		
		JLabel lblNewLabel = new JLabel("Code Patient");
		lblNewLabel.setBounds(28, 96, 67, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nom Patient");
		lblNewLabel_1.setBounds(28, 139, 80, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblDateRdv = new JLabel("Date RDV");
		lblDateRdv.setBounds(28, 178, 46, 14);
		contentPane.add(lblDateRdv);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				afficher();
			}

		
		});
		textField.setBounds(131, 86, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(131, 136, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(131, 175, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ajouter();
			}

		
		});
		btnAjouter.setBounds(282, 92, 89, 23);
		contentPane.add(btnAjouter);
		
		JButton btnModifir = new JButton("Modifir");
		btnModifir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modifier();
			}

			
		});
		btnModifir.setBounds(282, 135, 89, 23);
		contentPane.add(btnModifir);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				supprimer();
			}

			
		});
		btnSupprimer.setBounds(282, 174, 89, 23);
		contentPane.add(btnSupprimer);
		
		JLabel lblHeureRdv = new JLabel("heure RDV");
		lblHeureRdv.setBounds(28, 213, 46, 14);
		contentPane.add(lblHeureRdv);
		
		textField_3 = new JTextField();
		textField_3.setBounds(131, 210, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouseclick();
			}

		
		});
		scrollPane.setBounds(60, 249, 273, 64);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"heure rdv", "date rdv", "code patient"
			}
		));
		scrollPane.setViewportView(table);
	}
	private void ajouter() {
		// TODO Auto-generated method stub
		int c=Integer.parseInt(textField.getText().toString());
		String d=textField_2.getText();
		String h=textField_3.getText();

		
		Rdv r=new Rdv(c,d,h);
		RdvDAO ra=new RdvDAO();
		ra.Ajouter(r);
		
	}
	private void modifier() {
		// TODO Auto-generated method stub
		int c=Integer.parseInt(textField.getText().toString());
		String d=textField_2.getText();
		String h=textField_3.getText();
		Rdv r=new Rdv(c,d,h);
		RdvDAO ra=new RdvDAO();
		ra.Modifier(c,d,h);
		
	}
	private void supprimer() {
		// TODO Auto-generated method stub
		int c=Integer.parseInt(textField.getText().toString());
		RdvDAO ra=new RdvDAO();
		ra.Supprimer(c);
		
	}
	private void afficher() {
		// TODO Auto-generated method stub
		
		
	}
	private void mouseclick() {
		// TODO Auto-generated method stub
		int row=table.getSelectedRow();
		String code=(table.getModel().getValueAt(row, 0).toString());
		String date=(table.getModel().getValueAt(row, 2).toString());
		String heure=(table.getModel().getValueAt(row, 3).toString());
		textField.setText(code);
		textField_2.setText(date);
		textField_3.setText(heure);
	}
}
