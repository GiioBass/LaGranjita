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

public class ingresoCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtIdCliente;
	private JTextField txtNombreCliente;
	private JTextField txtApellidoCliente;
	private JTextField txtEdadCliente;
	private JTextField txtTelefono;
	private JTextField txtDireccionCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ingresoCliente frame = new ingresoCliente();
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
	public ingresoCliente() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 337, 381);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Id Cliente");
		lblNewLabel.setBounds(43, 66, 55, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(43, 106, 67, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(43, 142, 67, 14);
		contentPane.add(lblApellido);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(43, 180, 67, 14);
		contentPane.add(lblEdad);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(43, 217, 67, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(43, 248, 67, 14);
		contentPane.add(lblDireccion);
		
		txtIdCliente = new JTextField();
		txtIdCliente.setBounds(108, 68, 139, 20);
		contentPane.add(txtIdCliente);
		txtIdCliente.setColumns(10);
		
		txtNombreCliente = new JTextField();
		txtNombreCliente.setText("");
		txtNombreCliente.setBounds(107, 103, 140, 20);
		contentPane.add(txtNombreCliente);
		txtNombreCliente.setColumns(10);
		
		txtApellidoCliente = new JTextField();
		txtApellidoCliente.setBounds(107, 139, 140, 20);
		contentPane.add(txtApellidoCliente);
		txtApellidoCliente.setColumns(10);
		
		txtEdadCliente = new JTextField();
		txtEdadCliente.setText("");
		txtEdadCliente.setBounds(107, 177, 140, 20);
		contentPane.add(txtEdadCliente);
		txtEdadCliente.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setText("");
		txtTelefono.setBounds(107, 214, 140, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		txtDireccionCliente = new JTextField();
		txtDireccionCliente.setBounds(107, 245, 140, 20);
		contentPane.add(txtDireccionCliente);
		txtDireccionCliente.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try
			{
				consultas ingresar = new consultas();
				ingresar.guardarCliente(Integer.parseInt(txtIdCliente.getText()),
						txtNombreCliente.getText(), 
						txtApellidoCliente.getText(),
						Integer.parseInt(txtEdadCliente.getText()),
						Integer.parseInt(txtTelefono.getText()),
						txtDireccionCliente.getText());
				
				reiniciarCampos();
			}catch(Exception e2)
			{
				JOptionPane.showMessageDialog(null, "No se ingreso ningún dato");
			}
			
			}
		});
		btnGuardar.setBounds(203, 301, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnConsulta = new JButton("Consulta");
		btnConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				vistaClientes consulta = new vistaClientes();
				consulta.setVisible(true);
				
			}
		});
		btnConsulta.setBounds(43, 301, 89, 23);
		contentPane.add(btnConsulta);
		
		JLabel lblIngresoClientes = new JLabel();
		lblIngresoClientes.setText("INGRESO CLIENTES");
		lblIngresoClientes.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngresoClientes.setFont(new Font("Verdana", Font.BOLD, 18));
		lblIngresoClientes.setBounds(10, 11, 289, 30);
		contentPane.add(lblIngresoClientes);
	}

	public void reiniciarCampos()
	{
		
		txtIdCliente.setText(null);
		txtNombreCliente.setText(null);
		txtApellidoCliente.setText(null);
		txtEdadCliente.setText(null);
		txtTelefono.setText(null);
		txtDireccionCliente.setText(null);
		
	}
}
