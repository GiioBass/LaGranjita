package principal;

import conexion.dataCon;


import vista.vistaMenu;

public class inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dataCon conexion = new dataCon();
		conexion.abrirConexion();
		
		vistaMenu ventanaMenu = new vistaMenu();
		ventanaMenu.setVisible(true);
		
		
		

	}

}
