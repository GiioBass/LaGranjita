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
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JCalendar;
import java.awt.Font;
import javax.swing.SwingConstants;

public class ingresoFactura extends JFrame {

	private JPanel contentPane;
	private JTextField txtIdFactura;
	private JTextField txtIdProducto;
	private JTextField txtIdCliente;
	private String fechaSelec;
	private JDateChooser fecha;
	

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
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 335, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdFactura = new JLabel("Id Factura:");
		lblIdFactura.setBounds(57, 56, 86, 14);
		contentPane.add(lblIdFactura);
		
		JLabel lblFechaFactura = new JLabel("Fecha Factura:");
		lblFechaFactura.setBounds(56, 94, 101, 14);
		contentPane.add(lblFechaFactura);
		
		JLabel lblIdProducto = new JLabel("Id producto:");
		lblIdProducto.setBounds(57, 132, 86, 14);
		contentPane.add(lblIdProducto);
		
		JLabel lblIdCliente = new JLabel("Id Cliente:");
		lblIdCliente.setBounds(57, 171, 86, 14);
		contentPane.add(lblIdCliente);
		
		txtIdFactura = new JTextField();
		txtIdFactura.setBounds(145, 54, 104, 20);
		contentPane.add(txtIdFactura);
		txtIdFactura.setColumns(10);
		
		txtIdProducto = new JTextField();
		txtIdProducto.setBounds(145, 129, 104, 20);
		contentPane.add(txtIdProducto);
		txtIdProducto.setColumns(10);
		
		txtIdCliente = new JTextField();
		txtIdCliente.setBounds(145, 166, 104, 20);
		contentPane.add(txtIdCliente);
		txtIdCliente.setColumns(10);
		
		//Prueba
		
		fecha = new JDateChooser();
		fecha.setBounds(145, 90, 126, 20);
		contentPane.add(fecha);
		
		
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				consultas ingresar = new consultas();
				
				String anio = String.valueOf(fecha.getCalendar().get(Calendar.YEAR));
				String mes = String.valueOf(fecha.getCalendar().get(Calendar.MONTH)+1);
				String dia = String.valueOf(fecha.getCalendar().get(Calendar.DAY_OF_MONTH));
				fechaSelec = (dia+"/"+mes+"/"+anio);
				
				ingresar.ingresarFactura(Integer.parseInt(txtIdFactura.getText()),
						fechaSelec,
						Integer.parseInt(txtIdProducto.getText()),
						Integer.parseInt(txtIdCliente.getText()));
				
				
				
				
					reiniciarCampos();
				
				System.out.print(fechaSelec);
				}catch(Exception e2)
				{
					JOptionPane.showMessageDialog(null, "No se ingreso ningún dato");
				}
				
				}
			
		});
		
		btnIngresar.setBounds(201, 217, 89, 23);
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
		
		JLabel lblIngresoFactura = new JLabel();
		lblIngresoFactura.setText("INGRESO FACTURA");
		lblIngresoFactura.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngresoFactura.setFont(new Font("Verdana", Font.BOLD, 18));
		lblIngresoFactura.setBounds(21, 11, 274, 30);
		contentPane.add(lblIngresoFactura);
	}
	
		
	
		public void reiniciarCampos() 
		{
			txtIdFactura.setText(null);
			txtIdProducto.setText(null);
			txtIdCliente.setText(null);
			
			
		}
}
