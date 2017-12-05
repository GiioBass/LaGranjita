package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import sql.consultas;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ingresoCategoria extends JFrame {

	private JPanel contentPane;
	private JTextField txtCategoria;
	private JTextField txtIdEmpleado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ingresoCategoria frame = new ingresoCategoria();
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
	public ingresoCategoria() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 290, 298);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCategoria = new JLabel("Categoria:");
		lblCategoria.setBounds(27, 100, 63, 14);
		contentPane.add(lblCategoria);
		
		JLabel lblIdEmpleado = new JLabel("Id Empleado:");
		lblIdEmpleado.setBounds(26, 137, 80, 19);
		contentPane.add(lblIdEmpleado);
		
		txtCategoria = new JTextField();
		txtCategoria.setBounds(100, 97, 146, 20);
		contentPane.add(txtCategoria);
		txtCategoria.setColumns(10);
		
		txtIdEmpleado = new JTextField();
		txtIdEmpleado.setBounds(100, 136, 146, 20);
		contentPane.add(txtIdEmpleado);
		txtIdEmpleado.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				consultas ingresar = new consultas();
				ingresar.guardarCategoria(txtCategoria.getText(), Integer.parseInt(txtIdEmpleado.getText()));
				reiniciarCampos();
			}
		});
		btnGuardar.setBounds(175, 196, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				vistaCategoria consulta = new vistaCategoria();
				consulta.setVisible(true);
				
			}
		});
		btnConsultar.setBounds(22, 196, 96, 23);
		contentPane.add(btnConsultar);
	}
	
	public void reiniciarCampos()
	{
		txtCategoria.setText(null);
		txtIdEmpleado.setText(null);
	}
}
