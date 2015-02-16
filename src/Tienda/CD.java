package Tienda;

//Clase que extiende la clase m�sica y a�ade la capacidad del CD en MB.
public class CD extends Musica {
	
	private int capacidad;

	//Getters y Setters de los atributos
	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	//Sobreescribimos el m�todo toString
	@Override
	public String toString() {
		return "CD [titulo=" + titulo + ", artista=" + artista + ", precio="
				+ precio + ", capacidad=" + capacidad + " codigoMusica=" + this.getCodigo() + ", unidades=" + unidades + "]";
	}
}
