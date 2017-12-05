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

public class ingresoEmpleado extends JFrame {

	private JPanel contentPane;
	private JTextField txtIdEmpleado;
	private JTextField txtNombreEmpleado;
	private JTextField txtApellidoEmpleado;
	private JTextField txtTelefonoEmpleado;
	private JTextField txtDireccionEmpleado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ingresoEmpleado frame = new ingresoEmpleado();
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
	public ingresoEmpleado() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 343, 417);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(52, 71, 46, 14);
		contentPane.add(lblId);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(52, 96, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(52, 121, 46, 14);
		contentPane.add(lblApellido);
		
		JLabel lblEdad = new JLabel("Telefono");
		lblEdad.setBounds(52, 147, 46, 14);
		contentPane.add(lblEdad);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(52, 187, 46, 14);
		contentPane.add(lblDireccion);
		
		txtIdEmpleado = new JTextField();
		txtIdEmpleado.setBounds(108, 68, 86, 20);
		contentPane.add(txtIdEmpleado);
		txtIdEmpleado.setColumns(10);
		
		txtNombreEmpleado = new JTextField();
		txtNombreEmpleado.setBounds(108, 93, 86, 20);
		contentPane.add(txtNombreEmpleado);
		txtNombreEmpleado.setColumns(10);
		
		txtApellidoEmpleado = new JTextField();
		txtApellidoEmpleado.setBounds(108, 118, 86, 20);
		contentPane.add(txtApellidoEmpleado);
		txtApellidoEmpleado.setColumns(10);
		
		txtTelefonoEmpleado = new JTextField();
		txtTelefonoEmpleado.setBounds(108, 144, 86, 20);
		contentPane.add(txtTelefonoEmpleado);
		txtTelefonoEmpleado.setColumns(10);
		
		txtDireccionEmpleado = new JTextField();
		txtDireccionEmpleado.setBounds(108, 184, 86, 20);
		contentPane.add(txtDireccionEmpleado);
		txtDireccionEmpleado.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				consultas ingresar = new consultas();
				ingresar.guardarEmpleado(Integer.parseInt(txtIdEmpleado.getText()),
						txtNombreEmpleado.getText(),
						txtApellidoEmpleado.getText(),
						Integer.parseInt(txtTelefonoEmpleado.getText()),
						txtDireccionEmpleado.getText());
				reiniciarCampos();
			}
		});
		btnGuardar.setBounds(194, 228, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnConsulta = new JButton("Consulta");
		btnConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				vistaEmpleados consulta = new vistaEmpleados();
				consulta.setVisible(true);
				
			}
		});
		btnConsulta.setBounds(62, 228, 89, 23);
		contentPane.add(btnConsulta);
	}
	
	public void reiniciarCampos()
	{
		
		txtIdEmpleado.setText(null);
		txtNombreEmpleado.setText(null);
		txtApellidoEmpleado.setText(null);
		txtTelefonoEmpleado.setText(null);
		txtDireccionEmpleado.setText(null);
		
	}

}
