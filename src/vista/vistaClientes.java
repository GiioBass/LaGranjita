package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Objects;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import conexion.dataCon;
import objects.categoria;
import objects.cliente;
import sql.consultas;

public class vistaClientes extends JFrame implements ActionListener {

	private JLabel labelTitulo;
	JTable miTabla1;
	JScrollPane mibarra1;
	private JButton btnNewButton;
	private JButton btnEliminar;
	

	
	public vistaClientes() {
		setSize(538, 335);
		setTitle("Clientes");
		setLocationRelativeTo(null);
		setResizable(false);
		
		inicializaComponentes();
		construirTabla();
	}

	private void construirTabla() {
		
		actualizarTabla();
		
	}
	
	public void actualizarTabla()
	{
		String titulos[]={ "ID", "Nombre ", "Apellido","Edad", "Telefono", "Direccion" };
		String informacion[][]=obtenerMatriz();
		
		miTabla1=new JTable(informacion,titulos);
		mibarra1.setViewportView(miTabla1);
		
		//JOptionPane.showMessageDialog(null,"Consulta exitosa");
	}

	private String[][] obtenerMatriz() {
		
		
		dataCon conn=new dataCon();
		consultas consulta = new consultas();
		conn.abrirConexion();
		
		
		ArrayList<cliente> miLista =  consulta.consultaClientes();
		
		String matrizInfo[][]=new String[miLista.size()][6];
		
		for (int i = 0; i < miLista.size(); i++) {
			matrizInfo[i][0]=miLista.get(i).getIdCliente()+"";
			matrizInfo[i][1]=miLista.get(i).getNombreCliente()+"";
			matrizInfo[i][2]=miLista.get(i).getApellidoCliente()+"";
			matrizInfo[i][3]=miLista.get(i).getEdadCLiente()+"";
			matrizInfo[i][4]=miLista.get(i).getTelCliente()+"";
			matrizInfo[i][5]=miLista.get(i).getDirCliente()+"";
			
		}
			
		return matrizInfo;
	}

	private void inicializaComponentes() {
		getContentPane().setLayout(null);

		labelTitulo = new JLabel();
		labelTitulo.setBounds(27, 11, 400, 30);
		labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitulo.setText("CLIENTES");
		labelTitulo.setFont(new java.awt.Font("Verdana", 1, 18));
		getContentPane().add(labelTitulo);
		
		mibarra1=new JScrollPane();
		mibarra1.setBounds(27, 72,476,190);
		getContentPane().add(mibarra1);
		
		btnNewButton = new JButton("Actualizar");
		btnNewButton.setBounds(131, 273, 99, 23);
		getContentPane().add(btnNewButton);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int resposta=JOptionPane.showConfirmDialog(null, "Seguro que quieres eliminar?","Eliminar",JOptionPane.YES_NO_OPTION);
				if(resposta==JOptionPane.YES_OPTION){
				try {
					
					
					dataCon conn = new dataCon();
					
						
						Object id = miTabla1.getModel().getValueAt(miTabla1.getSelectedRow(),0);
												
						String seleccion="DELETE FROM `clientes` WHERE `idClientes`= ?";
						
						conn.abrirConexion();
						PreparedStatement ps= conn.getConnection().prepareStatement(seleccion);
						int a = Integer.valueOf((String ) id);
					
						ps.setInt(1, a );
						
							
							ps.executeUpdate();
						} catch (Exception e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
				construirTabla();
			}
		}
		});
		btnEliminar.setBounds(27, 273, 89, 23);
		getContentPane().add(btnEliminar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try
				{	
			
					dataCon conn = new dataCon();
					Object id = (miTabla1.getModel().getValueAt(miTabla1.getSelectedRow(), 0));
					Object nombreClien = (miTabla1.getModel().getValueAt(miTabla1.getSelectedRow(), 1));
					Object apellidoClien = (miTabla1.getModel().getValueAt(miTabla1.getSelectedRow(), 2));
					Object edadClien = (miTabla1.getModel().getValueAt(miTabla1.getSelectedRow(), 3));
					Object telClien = (miTabla1.getModel().getValueAt(miTabla1.getSelectedRow(), 4));
					Object dirClien = (miTabla1.getModel().getValueAt(miTabla1.getSelectedRow(), 5));
					
				int a = Integer.valueOf((String) id);
				String b = Objects.toString(nombreClien);
				String c = Objects.toString(apellidoClien);
				int d = Integer.valueOf((String) edadClien);
				int e = Integer.valueOf((String) telClien);
				String f = Objects.toString(dirClien);
				
				conn.abrirConexion();
				
					String seleccion =" UPDATE `clientes` SET `nombreCliente`=?,`ApellidoCliente`=?,`edadCliente`=?,`telefonoCliente`=?,`direccionCliente`=? WHERE `idClientes`=?";
					
					PreparedStatement ps = conn.getConnection().prepareStatement(seleccion);
			
				
				ps.setString(1, b);
				ps.setString(2, c);
				ps.setInt(3, d);
				ps.setInt(4, e);
				ps.setString(5, f);
				ps.setInt(6, a);
				
				
				ps.executeUpdate();
				
				JOptionPane.showMessageDialog(null, "El producto se modifico exitosamente");
				
				}catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, "error al modificar");
				}
				
			}
		});
		btnModificar.setBounds(252, 273, 89, 23);
		getContentPane().add(btnModificar);
		btnNewButton.addActionListener(this);
		
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnNewButton) {
			construirTabla();
		}
	}


}
