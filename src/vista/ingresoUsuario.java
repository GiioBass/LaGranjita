package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import sql.consultas;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class ingresoUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtClave;
	private JTextField txtIdEmpleado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ingresoUsuario frame = new ingresoUsuario();
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
	public ingresoUsuario() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 352, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setBounds(61, 71, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblClave = new JLabel("Clave:");
		lblClave.setBounds(61, 106, 46, 14);
		contentPane.add(lblClave);
		
		JLabel lblIdEmpleado = new JLabel("Id Empleado:");
		lblIdEmpleado.setBounds(61, 146, 76, 14);
		contentPane.add(lblIdEmpleado);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(132, 68, 115, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtClave = new JTextField();
		txtClave.setText("");
		txtClave.setBounds(132, 103, 115, 20);
		contentPane.add(txtClave);
		txtClave.setColumns(10);
		
		txtIdEmpleado = new JTextField();
		txtIdEmpleado.setBounds(132, 143, 115, 20);
		contentPane.add(txtIdEmpleado);
		txtIdEmpleado.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
				consultas ingresar = new consultas();
				ingresar.ingresarUsuario(txtUsuario.getText(), txtClave.getText(), Integer.parseInt(txtIdEmpleado.getText()));
				reiniciarCampos();
				}catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, "No se ingreso ningún dato");
				}
				
				
			}
		});
		btnGuardar.setBounds(207, 208, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				vistaUsuario consulta = new vistaUsuario();
				consulta.setVisible(true);
				
			}
		});
		btnConsultar.setBounds(69, 208, 89, 23);
		contentPane.add(btnConsultar);
		
		JLabel lblIngresoUsuarios = new JLabel();
		lblIngresoUsuarios.setText("INGRESO USUARIOS");
		lblIngresoUsuarios.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngresoUsuarios.setFont(new Font("Verdana", Font.BOLD, 18));
		lblIngresoUsuarios.setBounds(10, 11, 326, 30);
		contentPane.add(lblIngresoUsuarios);
	}
	
	public void reiniciarCampos()
	{
		
		txtUsuario.setText(null);
		txtClave.setText(null);
		txtIdEmpleado.setText(null);
		
	}
	
}
