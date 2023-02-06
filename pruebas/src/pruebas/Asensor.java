package pruebas;

import java.awt.EventQueue;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Asensor extends JFrame {

	private JPanel contentPane;
	private JLabel label1;
	private JLabel label2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Asensor frame = new Asensor();
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
	public Asensor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton cuatro = new JButton("4");
		cuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pisoactual = Integer.parseInt(label1.getText());
				label1.setText("4");
				
				if(4<pisoactual) {
					label2.setText("Baja");
				
				}else if(4>pisoactual) {
					label2.setText("Subiendo");
				}else {
					label2.setText("Piso actual");
				}
			}
			
		});
		cuatro.setBounds(10, 53, 89, 23);
		contentPane.add(cuatro);
		
		JButton tres = new JButton("3");
		tres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pisoactual = Integer.parseInt(label1.getText());
				label1.setText("3");
				
				if(3<pisoactual) {
					label2.setText("Baja");
				
				}else if(3>pisoactual) {
					label2.setText("Subiendo");
				}else {
					label2.setText("Piso actual");
				}
			}
		});
		tres.setBounds(10, 84, 89, 23);
		contentPane.add(tres);
		
		JButton dos = new JButton("2");
		dos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pisoactual = Integer.parseInt(label1.getText());
				label1.setText("2");
				
				if(2<pisoactual) {
					label2.setText("Baja");
				
				}else if(2>pisoactual) {
					label2.setText("Subiendo");
				}else{
					label2.setText("Piso actual");
					
				
				}
			}
		});
		dos.setBounds(10, 116, 89, 23);
		contentPane.add(dos);
		
		JButton uno = new JButton("1");
		uno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pisoactual = Integer.parseInt(label1.getText());
				label1.setText("1");
				
				if(1<pisoactual) {
					label2.setText("Baja");
				
				}else if(1>pisoactual) {
					label2.setText("Subiendo");
				}else {
					label2.setText("Piso actual");
				}
			}
		}
		);
		uno.setBounds(10, 149, 89, 23);
		contentPane.add(uno);
		
		JLabel lblNewLabel = new JLabel("PISO");
		lblNewLabel.setBounds(195, 46, 39, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("DIRECCION");
		lblNewLabel_1.setBounds(195, 88, 74, 37);
		contentPane.add(lblNewLabel_1);
		
		label1 = new JLabel("1");
		label1.setBounds(283, 46, 82, 37);
		contentPane.add(label1);
		
		label2 = new JLabel("-");
		label2.setBounds(283, 88, 82, 37);
		contentPane.add(label2);
	}
}
