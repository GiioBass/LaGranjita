package objects;

public class empleado {

	private int idEmpleado;
	private String nombreEmpleado;
	private String apellidoEmpleado;
	private int telEmpleado;
	private String dirEmpleado;
	
	
	public empleado( int id, String nombre, String apellido, int telefono,String direccion)
	{
		super();
		this.idEmpleado = id;
		this.nombreEmpleado = nombre;
		this. apellidoEmpleado = apellido;
		this.telEmpleado =  telefono;
		this.dirEmpleado = direccion;
	}
	
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}
	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}
	public String getApellidoEmpleado() {
		return apellidoEmpleado;
	}
	public void setApellidoEmpleado(String apellidoEmpleado) {
		this.apellidoEmpleado = apellidoEmpleado;
	}
	public int getTelEmpleado() {
		return telEmpleado;
	}
	public void setTelEmpleado(int telEmpleado) {
		this.telEmpleado = telEmpleado;
	}
	public String getDirEmpleado() {
		return dirEmpleado;
	}
	public void setDirEmpleado(String dirEmpleado) {
		this.dirEmpleado = dirEmpleado;
	}
	
	
	
	
}
