package objects;

public class producto {
	
	private int idPro;
	private String nombrePro;
	private String tipoPro;
	private String unMedidaPro;
	private int costoPro;
	private int cantPro;
	
	public producto(int idProducto, String nombreProducto, String tipoProducto, String unMedidaProducto, int costoProducto, int cantProducto)
	{
		
		super();
		this.idPro = idProducto;
		this.nombrePro = nombreProducto;
		this.tipoPro = tipoProducto;
		this.unMedidaPro = unMedidaProducto;
		this.costoPro = costoProducto;
		this.cantPro =cantProducto;
		
	}

	public int getCantPro() {
		return cantPro;
	}

	public void setCantPro(int cantPro) {
		this.cantPro = cantPro;
	}

	public int getIdPro() {
		return idPro;
	}

	public void setIdPro(int idPro) {
		this.idPro = idPro;
	}

	public String getNombrePro() {
		return nombrePro;
	}

	public void setNombrePro(String nombrePro) {
		this.nombrePro = nombrePro;
	}

	public String getTipoPro() {
		return tipoPro;
	}

	public void setTipoPro(String tipoPro) {
		this.tipoPro = tipoPro;
	}

	public String getUnMedidaPro() {
		return unMedidaPro;
	}

	public void setUnMedidaPro(String unMedidaPro) {
		this.unMedidaPro = unMedidaPro;
	}

	public int getCostoPro() {
		return costoPro;
	}

	public void setCostoPro(int costoPro) {
		this.costoPro = costoPro;
	}

}
