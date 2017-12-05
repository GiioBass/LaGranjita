package objects;



public class factura {

	private int idFactura;
	private String fechaFactura;
	private int idProducto;
	private int idCliente;
	
	public factura(int id, String fecha, int idProd, int idClien)
	{
		super();
		this.idFactura=id;
		this.fechaFactura=fecha;
		this.idProducto = idProd;
		this.idCliente=idClien;
		
	}
	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	
	
	public int getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}
	public String getFechaFactura() {
		return fechaFactura;
	}
	public void setFechaFactura(String fechaFactura) {
		this.fechaFactura = fechaFactura;
	}
	
	
	
}
