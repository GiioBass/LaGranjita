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
		setBounds(100, 100, 308, 318);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("Id:");
		lblId.setBounds(49, 58, 46, 14);
		contentPane.add(lblId);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(49, 87, 63, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(49, 121, 63, 14);
		contentPane.add(lblApellido);
		
		JLabel lblEdad = new JLabel("Telefono:");
		lblEdad.setBounds(50, 153, 62, 14);
		contentPane.add(lblEdad);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(52, 187, 70, 14);
		contentPane.add(lblDireccion);
		
		txtIdEmpleado = new JTextField();
		txtIdEmpleado.setBounds(127, 53, 112, 20);
		contentPane.add(txtIdEmpleado);
		txtIdEmpleado.setColumns(10);
		
		txtNombreEmpleado = new JTextField();
		txtNombreEmpleado.setBounds(127, 84, 112, 20);
		contentPane.add(txtNombreEmpleado);
		txtNombreEmpleado.setColumns(10);
		
		txtApellidoEmpleado = new JTextField();
		txtApellidoEmpleado.setBounds(127, 118, 112, 20);
		contentPane.add(txtApellidoEmpleado);
		txtApellidoEmpleado.setColumns(10);
		
		txtTelefonoEmpleado = new JTextField();
		txtTelefonoEmpleado.setBounds(127, 150, 112, 20);
		contentPane.add(txtTelefonoEmpleado);
		txtTelefonoEmpleado.setColumns(10);
		
		txtDireccionEmpleado = new JTextField();
		txtDireccionEmpleado.setBounds(127, 184, 112, 20);
		contentPane.add(txtDireccionEmpleado);
		txtDireccionEmpleado.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{	
				
				consultas ingresar = new consultas();
				ingresar.guardarEmpleado(Integer.parseInt(txtIdEmpleado.getText()),
						txtNombreEmpleado.getText(),
						txtApellidoEmpleado.getText(),
						Integer.parseInt(txtTelefonoEmpleado.getText()),
						txtDireccionEmpleado.getText());
				reiniciarCampos();
				}catch(Exception e2)
				{
					JOptionPane.showMessageDialog(null, "No se ingreso ningún dato");
				}
				
				
			}
		});
		btnGuardar.setBounds(163, 228, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnConsulta = new JButton("Consulta");
		btnConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				vistaEmpleados consulta = new vistaEmpleados();
				consulta.setVisible(true);
				
			}
		});
		btnConsulta.setBounds(33, 228, 89, 23);
		contentPane.add(btnConsulta);
		
		JLabel lblIngresoEmpleados = new JLabel();
		lblIngresoEmpleados.setText("INGRESO EMPLEADOS");
		lblIngresoEmpleados.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngresoEmpleados.setFont(new Font("Verdana", Font.BOLD, 18));
		lblIngresoEmpleados.setBounds(10, 11, 272, 30);
		contentPane.add(lblIngresoEmpleados);
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
