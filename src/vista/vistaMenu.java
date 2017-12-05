package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vistaMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaMenu frame = new vistaMenu();
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
	public vistaMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 367, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("MENÚ");
		
		JButton btnEmpleados = new JButton("EMPLEADOS");
		btnEmpleados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ingresoEmpleado ventanaEmpleado = new ingresoEmpleado();
				ventanaEmpleado.setVisible(true);
				
			}
		});
		btnEmpleados.setBounds(202, 207, 108, 52);
		contentPane.add(btnEmpleados);
		
		JButton btnCategorias = new JButton("CATEGORIAS");
		btnCategorias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ingresoCategoria ventanaCategoria = new ingresoCategoria();
				ventanaCategoria.setVisible(true);
				
			}
		});
		btnCategorias.setBounds(40, 285, 118, 52);
		contentPane.add(btnCategorias);
		
		JButton btnClientes = new JButton("CLIENTES");
		btnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ingresoCliente ventanaCliente = new ingresoCliente();
				ventanaCliente.setVisible(true);
				
			}
		});
		btnClientes.setBounds(202, 120, 108, 52);
		contentPane.add(btnClientes);
		
		JButton btnFacturas = new JButton("FACTURAS");
		btnFacturas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ingresoFactura ventanaFactura = new ingresoFactura();
				ventanaFactura.setVisible(true);
				
			}
		});
		btnFacturas.setBounds(40, 120, 118, 52);
		contentPane.add(btnFacturas);
		
		JButton btnUsuarios = new JButton("USUARIOS");
		btnUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnUsuarios.setBounds(203, 285, 107, 52);
		contentPane.add(btnUsuarios);
		
		JButton btnProductos = new JButton("PRODUCTOS");
		btnProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ingresoProducto ventanaProducto = new ingresoProducto();
				ventanaProducto.setVisible(true);
				
			}
		});
		btnProductos.setBounds(40, 207, 118, 52);
		contentPane.add(btnProductos);
		
		JLabel label = new JLabel("MiniMercado La Granjita");
		label.setFont(new Font("Rockwell Condensed", Font.BOLD, 31));
		label.setBounds(19, 26, 328, 32);
		contentPane.add(label);
	}
}
