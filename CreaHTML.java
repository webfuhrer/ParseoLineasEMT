package paqueteemt;

import java.util.ArrayList;

public class CreaHTML {

	public static String crearTabla(ArrayList<Parada> lista_paradas) {
		String tabla="<table>";
		tabla+="<tr><th>Nombre línea</th><th>Punto A</th><th>Punto B</th></tr>";
		for (Parada parada : lista_paradas) {
			tabla+="<tr><td>"+parada.getLabel()+"</td><td>"+parada.getOrigen()+
					"</td><td>"+parada.getDestino()+"</td></tr>";
		}
		tabla+="</table>";
		// TODO Auto-generated method stub
		return tabla;
	}

}
