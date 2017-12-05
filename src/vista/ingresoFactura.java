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

public class ingresoFactura extends JFrame {

	private JPanel contentPane;
	private JTextField txtIdFactura;
	private JTextField txtFecha;
	private JTextField txtIdProducto;
	private JTextField txtIdCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ingresoFactura frame = new ingresoFactura();
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
	public ingresoFactura() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdFactura = new JLabel("Id Factura");
		lblIdFactura.setBounds(59, 53, 46, 14);
		contentPane.add(lblIdFactura);
		
		JLabel lblFechaFactura = new JLabel("Fecha Factura");
		lblFechaFactura.setBounds(59, 93, 46, 14);
		contentPane.add(lblFechaFactura);
		
		JLabel lblIdProducto = new JLabel("Id producto");
		lblIdProducto.setBounds(59, 135, 46, 14);
		contentPane.add(lblIdProducto);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(265, 135, 46, 14);
		contentPane.add(lblCantidad);
		
		JLabel lblIdCliente = new JLabel("Id Cliente");
		lblIdCliente.setBounds(59, 184, 46, 14);
		contentPane.add(lblIdCliente);
		
		txtIdFactura = new JTextField();
		txtIdFactura.setBounds(115, 50, 86, 20);
		contentPane.add(txtIdFactura);
		txtIdFactura.setColumns(10);
		
		txtFecha = new JTextField();
		txtFecha.setBounds(115, 90, 86, 20);
		contentPane.add(txtFecha);
		txtFecha.setColumns(10);
		
		txtIdProducto = new JTextField();
		txtIdProducto.setBounds(115, 132, 86, 20);
		contentPane.add(txtIdProducto);
		txtIdProducto.setColumns(10);
		
		txtIdCliente = new JTextField();
		txtIdCliente.setBounds(115, 181, 86, 20);
		contentPane.add(txtIdCliente);
		txtIdCliente.setColumns(10);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				consultas ingresar = new consultas();
				ingresar.ingresarFactura(Integer.parseInt(txtIdFactura.getText()),
						//Integer.parseInt(txtFecha.getText()),
						Integer.parseInt(txtIdProducto.getText()),
						Integer.parseInt(txtIdCliente.getText()));
				
			}
		});
		btnIngresar.setBounds(243, 217, 89, 23);
		contentPane.add(btnIngresar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				vistaFacturas consultar = new vistaFacturas();
				consultar.setVisible(true);
				
			}
		});
		btnConsultar.setBounds(41, 217, 89, 23);
		contentPane.add(btnConsultar);
	}

	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}
