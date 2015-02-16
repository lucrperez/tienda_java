package Tienda;

//Clase que extiende la clase música y añade la velocidad del vinilo.
public class Vinilo extends Musica {
	
	private int velocidad;

	//Getters y Setters de los atributos
	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	//Sobreescribimos el método toString
	@Override
	public String toString() {
		return "Vinilo [titulo=" + titulo + ", artista=" + artista
				+ ", precio=" + precio + ", velocidad=" + velocidad +  " codigoMusica=" + this.getCodigo() + ", unidades=" + unidades + "]";
	}

}
