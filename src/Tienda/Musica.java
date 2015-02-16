package Tienda;

//Clase principal música, en la que se almacenan los datos de la música de la tienda
public class Musica {
	
	private static int totalMusica = 1;
	String titulo;
	String artista;
	double precio;
	private int codigo;
	int unidades;
	
	//Constructor
	public Musica()
	{
		this.codigo = totalMusica;
		totalMusica++;
	}
	
	//Getters y Setters de los atributos
	public String getTitulo() 
	{
		return this.titulo;
	}
	
	public void setTitulo(String titulo) 
	{
		this.titulo = titulo;
	}
	
	public String getArtista() 
	{
		return this.artista;
	}
	
	public void setArtista(String artista) 
	{
		this.artista = artista;
	}
	
	public double getPrecio() 
	{
		return this.precio;
	}
	
	public void setPrecio(double precio) 
	{
		this.precio = precio;
	}
	
	public int getCodigo()
	{
		return this.codigo;
	}
	
	public void setUnidades(int unidades)
	{
		this.unidades = unidades;
	}
	
	public int getUnidades()
	{
		return this.unidades;
	}

	//Sobreescribimos el método toString
	@Override
	public String toString() {
		return "Musica [titulo=" + titulo + ", artista=" + artista
				+ ", precio=" + precio + ", unidades" + unidades + ", codigoMusica=" + codigo + "]";
	}
	
	//Utilizamos este método para escribir las ventas en el archivo de salida
	public String toStringSinUnidades() {
		return "Musica [titulo=" + titulo + ", artista=" + artista
				+ ", precio=" + precio + ", codigoMusica=" + codigo + "]";
	}
}
