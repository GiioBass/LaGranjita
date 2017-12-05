package objects;

public class categoria {
	
	private int idCategoria;
	private String categoria;
	private int catEmpleado;
	
	public categoria(int id, String catego, int categoEmpleado)
	{
		super();
		this.idCategoria=id;
		this.categoria=catego;
		this.catEmpleado = categoEmpleado;
	}
	public int getCatEmpleado() {
		return catEmpleado;
	}

	public void setCatEmpleado(int catEmpleado) {
		this.catEmpleado = catEmpleado;
	}

	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	

}
