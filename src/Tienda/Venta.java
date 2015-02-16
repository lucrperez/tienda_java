package Tienda;

//Clase principal que almacena las ventas realizadas en las tiendas
public class Venta {
	
	private static int totalMusica = 1;
	
	private Musica musica;
	private Cliente cliente;
	private int codigo;
	
	//Constructor
	public Venta()
	{
		this.codigo = totalMusica;
		totalMusica++;
	}
	
	//Getters y Setters de los atributos
	public void setMusica(Musica musica)
	{
		this.musica = musica;
	}
	
	public Musica getMusica()
	{
		return this.musica;
	}
	
	public void setCliente(Cliente cliente)
	{
		this.cliente = cliente;
	}
	
	public Cliente getCliente()
	{
		return this.cliente;
	}
	
	public int getCodigo()
	{
		return this.codigo;
	}

	//Sobreescribimos el método toString
	@Override
	public String toString() {
		return "Venta [musica=" + musica.toStringSinUnidades() + ", cliente=" + cliente + ", codigoVenta="
				+ codigo + "]";
	}
}
