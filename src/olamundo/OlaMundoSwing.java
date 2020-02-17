package olamundo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class OlaMundoSwing extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OlaMundoSwing frame = new OlaMundoSwing();
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
	public OlaMundoSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblMensagem = new JLabel("Aqui vai aparecer a mensagem");
		lblMensagem.setForeground(Color.RED);
		lblMensagem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblMensagem, BorderLayout.NORTH);
		
		JButton btnClick = new JButton("Clique em mim!");
		btnClick.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnClick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblMensagem.setText("Olá, Mundo!");
			}
		});
		contentPane.add(btnClick, BorderLayout.SOUTH);
	}

}
