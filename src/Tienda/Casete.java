package Tienda;

//Clase que extiende la clase m�sica y a�ade la duraci�n de la cinta en minutos.
public class Casete extends Musica
{
	
	private int minutosDuracion;

	//Getters y Setters de los atributos
	public int getMinutosDuracion() {
		return minutosDuracion;
	}

	public void setMinutosDuracion(int minutosDuracion) {
		this.minutosDuracion = minutosDuracion;
	}

	//Sobreescribimos el m�todo toString
	@Override
	public String toString() {
		return "Casete [titulo=" + titulo + ", artista=" + artista
				+ ", precio=" + precio + ", minutosDuracion=" + minutosDuracion
				+  " codigoMusica=" + this.getCodigo() + ", unidades=" + unidades + "]";
	}
	
	

}
