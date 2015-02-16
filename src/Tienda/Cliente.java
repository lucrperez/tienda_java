package Tienda;

//Clase principal que almacena los datos de los clientes
public class Cliente {
	
	private static int totalClientes = 1;
	private String nombre;
	private String apellidos;
	private int edad;
	private int codigo;
	
	//Contructor
	public Cliente ()
	{
		this.codigo = totalClientes;
		totalClientes++;
	}
	
	//Getters y Setters de los atributos
	public String getNombre() 
	{
		return nombre;
	}
	
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	
	public String getApellidos() 
	{
		return apellidos;
	}
	
	public void setApellidos(String apellidos) 
	{
		this.apellidos = apellidos;
	}
	
	public int getEdad() 
	{
		return edad;
	}
	
	public void setEdad(int edad) 
	{
		this.edad = edad;
	}
	
	public int getCodigo()
	{
		return this.codigo;
	}

	//Sobreescribimos el método toString
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellidos=" + apellidos
				+ ", edad=" + edad + ", codigoCliente=" + codigo + "]";
	}

}
