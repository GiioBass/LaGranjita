package objects;

public class cliente {
	
	private int idCliente;
	private String nombreCliente;
	private String apellidoCliente;
	private int edadCLiente;
	private int telCliente;
	private String dirCliente;
	
	public cliente(int id, String nombre, String apellido, int edad, int telefono, String direccion)
	{
		super();
		this.idCliente = id;
		this.nombreCliente = nombre;
		this.apellidoCliente = apellido;
		this.edadCLiente = edad;
		this.telCliente = telefono;
		this.dirCliente = direccion;
	}
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getApellidoCliente() {
		return apellidoCliente;
	}
	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}
	public int getEdadCLiente() {
		return edadCLiente;
	}
	public void setEdadCLiente(int edadCLiente) {
		this.edadCLiente = edadCLiente;
	}
	public int getTelCliente() {
		return telCliente;
	}
	public void setTelCliente(int telCliente) {
		this.telCliente = telCliente;
	}
	public String getDirCliente() {
		return dirCliente;
	}
	public void setDirCliente(String dirCliente) {
		this.dirCliente = dirCliente;
	}
	

}
