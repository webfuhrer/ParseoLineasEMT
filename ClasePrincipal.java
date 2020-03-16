package paqueteemt;

import java.util.ArrayList;

public class ClasePrincipal {
public static void main(String[] args) {
	ArrayList<Parada> lista_paradas=AccesoFichero.parsearXML();
	String html_tabla=CreaHTML.crearTabla(lista_paradas);
	AccesoFichero.grabarTablaHTML(html_tabla);
}
}
