package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import sql.consultas;

public class ingresoProducto extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombrePro;
	private JTextField txtTipoPro;
	private JTextField txtMedidaPro;
	private JTextField txtValor;
	private JTextField txtCantidad;
	private JTextField txtIdPro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ingresoProducto frame = new ingresoProducto();
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
	public ingresoProducto() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 446, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("prueba");
		
		JButton btnConsulta = new JButton("Consultar Productos");
		btnConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try 
				{
					vistaProductos ventanaProductos = new vistaProductos();
					ventanaProductos.setVisible(true);
					
				}catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,"Error al iniciar la ventana de consulta");
				}
				
				
			}
		});
		btnConsulta.setBounds(28, 328, 172, 23);
		contentPane.add(btnConsulta);
		
		JLabel lblNombreProducto = new JLabel("Nombre Producto:");
		lblNombreProducto.setBounds(56, 129, 113, 14);
		contentPane.add(lblNombreProducto);
		
		JLabel lblNewLabel = new JLabel("Tipo:");
		lblNewLabel.setBounds(56, 161, 57, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Unidad de Medida:");
		lblNewLabel_1.setBounds(56, 196, 113, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblValorUnidad = new JLabel("Valor Unidad:");
		lblValorUnidad.setBounds(56, 234, 89, 14);
		contentPane.add(lblValorUnidad);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setBounds(56, 272, 74, 14);
		contentPane.add(lblCantidad);
		
		txtNombrePro = new JTextField();
		txtNombrePro.setBounds(170, 128, 183, 20);
		contentPane.add(txtNombrePro);
		txtNombrePro.setColumns(10);
		
		txtTipoPro = new JTextField();
		txtTipoPro.setBounds(170, 163, 183, 20);
		contentPane.add(txtTipoPro);
		txtTipoPro.setColumns(10);
		
		txtMedidaPro = new JTextField();
		txtMedidaPro.setBounds(170, 195, 183, 20);
		contentPane.add(txtMedidaPro);
		txtMedidaPro.setColumns(10);
		
		txtValor = new JTextField();
		txtValor.setBounds(170, 233, 183, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(170, 271, 183, 20);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				consultas ingresar = new consultas();
				
				ingresar.guardarPro(
				
				Integer.parseInt(txtIdPro.getText()),
		           txtNombrePro.getText(),
		            txtTipoPro.getText(),
		            txtMedidaPro.getText(),
		           Integer.parseInt(txtValor.getText()),
		           Integer.parseInt(txtCantidad.getText())
				
				);
				
				reiniciarCampos();
				}catch(Exception e2)
				{
					JOptionPane.showMessageDialog(null, "No se ingreso ningún dato");
				}
				
				}
			
		});
		btnGuardar.setBounds(300, 328, 104, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblIdProducto = new JLabel("Id Producto:");
		lblIdProducto.setBounds(56, 91, 80, 14);
		contentPane.add(lblIdProducto);
		
		txtIdPro = new JTextField();
		txtIdPro.setBounds(170, 87, 183, 20);
		contentPane.add(txtIdPro);
		txtIdPro.setColumns(10);
		
		JLabel lblProductos = new JLabel("Productos");
		lblProductos.setFont(new Font("Rockwell Condensed", Font.BOLD, 31));
		lblProductos.setBounds(142, 24, 147, 32);
		contentPane.add(lblProductos);
	}
	
	
	
	
	public void reiniciarCampos()
	{
		
		txtNombrePro.setText(null);
		txtMedidaPro.setText(null);
		txtTipoPro.setText(null);
		txtValor.setText(null);
		txtCantidad.setText(null);
		txtIdPro.setText(null);
	}

}
