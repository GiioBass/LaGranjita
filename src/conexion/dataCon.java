package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import objects.producto;

public class dataCon {
	
public Connection conexion = null;
	
	//abrir conexion
	
	public void abrirConexion()
	{
		
		//variables
		String host = "localhost:3306";
		String user = "root";
		String pass= "";
		String dataBase="db-lagranjita";
		
		
		try {
			//driver base de datos
			
		Class.forName("com.mysql.jdbc.Driver");
		conexion = DriverManager.getConnection("jdbc:mysql://"+ host + "/" + dataBase, user,pass);
			
			//JOptionPane.showMessageDialog(null,"Conexion a la Base de Datos Exitosa");
		
			}catch(Exception e)
			{
				JOptionPane.showMessageDialog(null,"Conexion a la Base de Datos Fallida");
			}
		
	}
	

		//OBTENER CONEXION
			
			public Connection getConnection()
			{
				return conexion;
			}
				
			//CIERRA LA CONEXION CON LA BASE DE DATOS
			
			public void closeConnection()
			{
				
				try
				{
					conexion.close();
					JOptionPane.showMessageDialog(null,"la conexion se cerro correctamente");
					
				}catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,"Error al cerrar la conexion con la Base de Datos");
				}
			}

}
