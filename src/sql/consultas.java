package sql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import conexion.dataCon;
import objects.categoria;
import objects.cliente;
import objects.empleado;
import objects.factura;
import objects.producto;
import objects.usuario;

public class consultas {

	dataCon conn = new dataCon();
	
	public ArrayList<producto> consultaProductos()
	{
	conn.abrirConexion();
		
		ArrayList<producto> arrayDatos = new ArrayList<producto>();
		
		try 
		{
			
			PreparedStatement state =conn.getConnection().prepareStatement("SELECT * FROM productos");
			ResultSet rs = state.executeQuery();
			
			while(rs.next())
				{
				
					producto misProductos = new producto( rs.getInt("idProductos"),
							rs.getString("nombreProduc"),
							rs.getString("tipoProduc"),
							rs.getString("unidadMediadProduc"),
							rs.getInt("costoProduc"),
							rs.getInt("cantidadPro")		);
					
					arrayDatos.add(misProductos);
					
					
				
				}
			
			rs.close();
			return arrayDatos;
			
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "La Consulta fallo");
		}
		
		return arrayDatos;
		
		
	}
	
	public ArrayList<empleado> consultaEmpleados()
	{
	conn.abrirConexion();
		
		ArrayList<empleado> arrayDatos = new ArrayList<empleado>();
		
		try 
		{
			
			PreparedStatement state =conn.getConnection().prepareStatement("SELECT * FROM empleados");
			ResultSet rs = state.executeQuery();
			
			while(rs.next())
				{
				
					empleado miEmpleado = new empleado( rs.getInt("idEmpleados"),
							rs.getString("nombreEmpleado"),
							rs.getString("apellidoEmpleado"),
							
							rs.getInt("telefonoEmpleado"),
							rs.getString("direccionEmpleado")		);
					
					arrayDatos.add(miEmpleado);
					
					
				
				}
			
			rs.close();
			return arrayDatos;
			
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "La Consulta fallo");
		}
		
		return arrayDatos;
		
		
	}
	
	public ArrayList<categoria> consultaCategoria()
	{
	conn.abrirConexion();
		
		ArrayList<categoria> arrayDatos = new ArrayList<categoria>();
		
		try 
		{
			
			PreparedStatement state =conn.getConnection().prepareStatement("SELECT * FROM categorias");
			ResultSet rs = state.executeQuery();
			
			while(rs.next())
				{
				
					categoria miCategoria = new categoria( rs.getInt("idCategorias"),
							rs.getString("categoria"),
							rs.getInt("Empleados_idEmpleados"));
					
					arrayDatos.add(miCategoria);
					
					
				
				}
			
			rs.close();
			return arrayDatos;
			
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "La Consulta fallo");
		}
		
		return arrayDatos;
		
		
	}
	
    public ArrayList<cliente> consultaClientes()
	
	{
	conn.abrirConexion();
		
		ArrayList<cliente> arrayDatos = new ArrayList<cliente>();
		
		try 
		{
			
			PreparedStatement state =conn.getConnection().prepareStatement("SELECT * FROM clientes");
			ResultSet rs = state.executeQuery();
			
			while(rs.next())
				{
				
					cliente miCliente = new cliente( rs.getInt("idClientes"),
							rs.getString("nombreCliente"),
							rs.getString("apellidoCliente"),
							rs.getInt("edadCliente"),
							rs.getInt("telefonoCliente"),
							rs.getString("direccionCliente")
							);
					
					arrayDatos.add(miCliente);
					
					
				
				}
			
			rs.close();
			return arrayDatos;
			
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "La Consulta fallo");
		}
		
		return arrayDatos;
		
		
	}
		
	public ArrayList<factura> consultaFactura()
	
	{
	conn.abrirConexion();
		
		ArrayList<factura> arrayDatos = new ArrayList<factura>();
		
		try 
		{
			
			PreparedStatement state =conn.getConnection().prepareStatement("SELECT * FROM facturas");
			ResultSet rs = state.executeQuery();
			
			while(rs.next())
				{
				
					factura miFactura = new factura( rs.getInt("idFacturas"),
							rs.getString("fechaFactura"),
							rs.getInt("Productos_idProductos"),
							rs.getInt("Clientes_idClientes")
							);
					
					arrayDatos.add(miFactura);
					
					
				
				}
			
			rs.close();
			return arrayDatos;
			
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "La Consulta fallo");
		}
		
		return arrayDatos;
		
		
	}
	
	public ArrayList<usuario> consultaUsuario()
	
	{
	conn.abrirConexion();
		
		ArrayList<usuario> arrayDatos = new ArrayList<usuario>();
		
		try 
		{
			
			PreparedStatement state =conn.getConnection().prepareStatement("SELECT * FROM usuarios");
			ResultSet rs = state.executeQuery();
			
			while(rs.next())
				{
				
					usuario miUsuario = new usuario( rs.getInt("idUsuarios"),
							rs.getString("Usuario"),
							rs.getString("clave"),
							rs.getInt("Empleados_idEmpleados")
							);
					
					arrayDatos.add(miUsuario);
					
					
				
				}
			
			rs.close();
			return arrayDatos;
			
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "La Consulta fallo");
		}
		
		return arrayDatos;
		
		
	}
	
	public void guardarPro (int a, String b, String c, String d, int e, int f) 
	{
		String insertTableSQL = "INSERT INTO `productos`(`idProductos`, `nombreProduc`, `tipoProduc`, `unidadMediadProduc`, `costoProduc`, `cantidadPro`)"
                + "VALUES (?,?,?,?,?,?)";
		

        try {
            dataCon conn = new dataCon();
            conn.abrirConexion();
            PreparedStatement ps = conn.getConnection().prepareStatement(insertTableSQL);
         
            ps.setInt(1, a );
            ps.setString(2, b);
            ps.setString(3, c);
            ps.setString(4, d);
            ps.setInt(5,e);
            ps.setInt(6, f);

            // execute insert SQL stetement
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null,"El producto se a guardado");
           

        } catch (SQLException e2) {

            JOptionPane.showMessageDialog(null,e2.getMessage());
            

        }
		
	}
	
	public void guardarCategoria (String a, int b) 
	{
		String insertTableSQL = "INSERT INTO `categorias`(`idProductos`, `nombreProduc`, `tipoProduc`)"
                + "VALUES (null,?,?)";
		

        try {
            dataCon conn = new dataCon();
            conn.abrirConexion();
            PreparedStatement ps = conn.getConnection().prepareStatement(insertTableSQL);
         
            ps.setString(2, a );
            ps.setInt(3, b);
           

            // execute insert SQL stetement
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null,"La categoria se a guardado");
           

        } catch (SQLException e2) {

            JOptionPane.showMessageDialog(null,e2.getMessage());
            

        }
		
	}
	
	public void guardarCliente (int a, String b, String c, int d, int e, String f) 
	{
		String insertTableSQL = "INSERT INTO `clientes`(`idClientes`, `nombreCliente`, `ApellidoCliente`, `edadCliente`, `telefonoCliente`, `direccionCliente`)"
                + "VALUES (?,?,?,?,?,?)";
		

        try {
            dataCon conn = new dataCon();
            conn.abrirConexion();
            PreparedStatement ps = conn.getConnection().prepareStatement(insertTableSQL);
         
            ps.setInt(1, a);
            ps.setString(2, b );
            ps.setString(3, c );
            ps.setInt(4, d);
            ps.setInt(5, e);
            ps.setString(6, f);

            // execute insert SQL stetement
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null,"El cliente se a guardado");
           

        } catch (SQLException e2) {

            JOptionPane.showMessageDialog(null,e2.getMessage());
            

        }
		
	}
	
	public void guardarEmpleado (int a, String b, String c, int d,  String e) 
	{
		String insertTableSQL = "INSERT INTO `empleados`(`idEmpleados`, `nombreEmpleado`, `apellidoEmpleado`, `telefonoEmpleado`, `direccionEmpleado`)"
                + "VALUES (?,?,?,?,?)";
		

        try {
            dataCon conn = new dataCon();
            conn.abrirConexion();
            PreparedStatement ps = conn.getConnection().prepareStatement(insertTableSQL);
         
            ps.setInt(1, a);
            ps.setString(2, b );
            ps.setString(3, c );
            ps.setInt(4, d);
            ps.setString(5, e);
            

            // execute insert SQL stetement
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null,"El empleado se a guardado");
           

        } catch (SQLException e2) {

            JOptionPane.showMessageDialog(null,e2.getMessage());
            

        }
		
	}
	
	public void ingresarFactura (int a, int b, int c, int d) 
	{
		String insertTableSQL = "INSERT INTO `facturas`(`idFacturas`, `fechaFactura`, `Productos_idProductos`, `Clientes_idClientes`)"
                + "VALUES (?,?,?,?,?)";
		

        try {
            dataCon conn = new dataCon();
            conn.abrirConexion();
            PreparedStatement ps = conn.getConnection().prepareStatement(insertTableSQL);
         
            ps.setInt(1, a);
            ps.setInt(2, b);
            ps.setInt(3, c);
            ps.setInt(4, d);
            
            

            // execute insert SQL stetement
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null,"Factura realizada");
           

        } catch (SQLException e2) {

            JOptionPane.showMessageDialog(null,e2.getMessage());
            

        }
		
	}
		
}
