package objects;

public class usuario {
	
	private int idUsuario;
	private String usuario;
	private String clave;
	private int idEmpleado;
	
	public usuario(int idUsuario, String usuario, String clave, int idEmpleado)
	{
		super();
		this.idUsuario = idUsuario;
		this.usuario = usuario;
		this.clave = clave;
		this.idEmpleado = idEmpleado;
		
	}
	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	
	
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}

	
}
