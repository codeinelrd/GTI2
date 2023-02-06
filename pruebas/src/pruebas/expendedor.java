package pruebas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class expendedor extends JFrame {

	private JPanel contentPane;
	private JButton b2;
	private JLabel pre;
	private JLabel falta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					expendedor frame = new expendedor();
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
	public expendedor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton b1 = new JButton("");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pre.setText("2.50");
				falta.setText("2.50");
				
			}
		});
		b1.setBounds(22, 108, 89, 23);
		contentPane.add(b1);
		
		b2 = new JButton("");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pre.setText("1.50");
				falta.setText("1.50");
			}
		});
		b2.setBounds(22, 137, 89, 23);
		contentPane.add(b2);
		
		JButton b3 = new JButton("");
		b3.setBounds(22, 167, 89, 23);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pre.setText("3.50");
				falta.setText("3.50");
			}
		});
		contentPane.add(b3);
		
				pre = new JLabel("0");
				pre.setBounds(169, 28, 120, 35);
				contentPane.add(pre);
				
				
				
		
		falta = new JLabel("0");
		falta.setBounds(169, 74, 120, 35);
		contentPane.add(falta);
		
		
		JLabel l3 = new JLabel("PRECIO");
		l3.setBounds(105, 28, 47, 35);
		contentPane.add(l3);
		
		JLabel estado = new JLabel("FALTA");
		estado.setBounds(105, 74, 47, 35);
		contentPane.add(estado);
		
		JButton e1 = new JButton("1$");
		e1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				float pr = Float.parseFloat(falta.getText());
				float res = pr - 1;
				String conv = String.valueOf(res);
				falta.setText(conv);
				
				int coger = Integer.parseInt(falta.getText());
				if(coger < 0) {
					falta.setText("Te sobran :"+coger);
				}

			}
		});
		e1.setBounds(335, 108, 89, 23);
		contentPane.add(e1);
		
		JButton e2 = new JButton("2$");
		e2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float pr2 = Float.parseFloat(falta.getText());
				float res2 = pr2 - 2;
				String conv2 = String.valueOf(res2);
				falta.setText(conv2);
				

				
			}
		});
		e2.setBounds(335, 137, 89, 23);
		contentPane.add(e2);
		
		JButton c50 = new JButton("50c");
		c50.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float pr3 = Float.parseFloat(falta.getText());
				double res3 = pr3 -  0.5;
				String conv3 = String.valueOf(res3);
				falta.setText(conv3);

				
			}
		});
		c50.setBounds(335, 167, 89, 23);
		contentPane.add(c50);
	}
}
