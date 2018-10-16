package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import conexion.dataCon;
import objects.usuario;
import sql.consultas;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtClave;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 344, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Login");
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(44, 91, 232, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtClave = new JTextField();
		txtClave.setBounds(44, 151, 232, 20);
		contentPane.add(txtClave);
		txtClave.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(44, 62, 62, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblClave = new JLabel("Clave:");
		lblClave.setBounds(44, 126, 62, 14);
		contentPane.add(lblClave);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				  if(txtUsuario.getText().length()>0 && txtClave.getText().length()>0){
					  
				        try{
				            
				        	dataCon conn = new dataCon();
				        	conn.abrirConexion();
				            Statement s =  conn.getConnection().createStatement();
				            ResultSet r = s.executeQuery("select * from usuarios where idUsuarios=\""+txtUsuario.getText()+"\" and clave=\""+txtClave.getText()+"\" ");
				            boolean found = false;
				            int user_id = 0;
				            while(r.next()){ found=true; user_id = r.getInt("id"); }
				            if(found){
				                JOptionPane.showMessageDialog(rootPane, "Acceso concedido ...");
				            }else{
				                JOptionPane.showMessageDialog(rootPane, "Acceso Denegado!!");
				            }
				        }catch(SQLException e){
				        System.out.println(e.getMessage());
				        }
				        
				        
				        }else{
				            JOptionPane.showMessageDialog(rootPane, "No debes dejar campos vacios !!");        
				        }
				
				
			}
		});
		btnIngresar.setBounds(128, 203, 89, 23);
		contentPane.add(btnIngresar);
	}
	
	
	
	

	
}
