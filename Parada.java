package paqueteemt;

public class Parada {
private String label, origen, destino;

public Parada(String label, String origen, String destino) {
	super();
	this.label = label;
	this.origen = origen;
	this.destino = destino;
}

public String getLabel() {
	return label;
}

public String getOrigen() {
	return origen;
}

public String getDestino() {
	return destino;
}

}
