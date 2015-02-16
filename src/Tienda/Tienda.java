package Tienda;

//Importamos las librer�as necesarias
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//Clase principal que se ejecuta al lanzar la aplicaci�n
public class Tienda {
	
	//Constantes que se utilizar�n para el men� principal y para el nombre del archivo de ventas.
	private static final String menu = "Esperando instrucci�n (escriba \"ayuda\" para obtener informaci�n sobre las instrucciones disponibles):";
	private static final String nombreArchivoVentas = "ventas.txt";
	
	//Metodo para la creaci�n del cliente que se introducir� en la lista
	private static Cliente CrearCliente()
	{
		Cliente cliente = new Cliente();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el nombre del cliente: ");
		cliente.setNombre(sc.nextLine());
		System.out.println("Introduzca los apellidos del cliente: ");
		cliente.setApellidos(sc.nextLine());
		System.out.println("Introduzca la edad del cliente: ");
		int edad = 0;
		do
		{
			try
			{
				edad = Integer.parseInt(sc.nextLine());
				cliente.setEdad(edad);
			}
			catch (NumberFormatException ex)
			{
				System.out.println("Formato de edad incorrecto. Debe introducir un n�mero entero.");
				System.out.println("Introduzca la edad del cliente: ");
				edad = -1;
			}
		}
		while (edad < 0);
		
		return cliente;
	}
	
	//M�todos de creaci�n de m�sica (para CD, Vinilo o Casete) que se introducir�n en las listas correspondientes
	private static CD CrearCD()
	{
		CD cd = new CD();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el t�tulo del disco: ");
		cd.setTitulo(sc.nextLine());
		System.out.println("Introduzca el artista del disco: ");
		cd.setArtista(sc.nextLine());
		System.out.println("Introduzca el precio del disco (en formato n.nn): ");
		double precio = 0.0;
		do
		{
			try
			{
				precio = Double.parseDouble(sc.nextLine());
				cd.setPrecio(precio);
			}
			catch (NumberFormatException ex)
			{
				System.out.println("Formato de precio incorrecto. Debe introducir un n�mero decimal separado por \".\"");
				System.out.println("Introduzca el precio del disco: ");
				precio = -1.0;
			}
		} while (precio < 0.0);
		System.out.println("Introduzca el n�mero de unidades: ");
		int unidades = -1;
		do
		{
			try
			{
				unidades = Integer.parseInt(sc.nextLine());
				cd.setUnidades(unidades);
			}
			catch (NumberFormatException ex)
			{
				System.out.println("Formato de unidades incorrecto. Debe introducir un n�mero entero.");
				System.out.println("Introduzca el n�mero de unidades del disco: ");
				unidades = -1;
			}
		} while (unidades < 0);
		System.out.println("Introduzca la capacidad del disco: ");
		int capacidad = 0;
		do
		{
			try
			{
				capacidad = Integer.parseInt(sc.nextLine());
				cd.setCapacidad(capacidad);
			}
			catch (NumberFormatException ex)
			{
				System.out.println("Formato de capacidad incorrecto. Debe introducir un n�mero entero.");
				System.out.println("Introduzca la capacidad del disco: ");
				capacidad = -1;
			}
		} while(capacidad < 0);
		
		return cd;
	}
	
	private static Vinilo CrearVinilo()
	{
		Vinilo vinilo = new Vinilo();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el t�tulo del disco: ");
		vinilo.setTitulo(sc.nextLine());
		System.out.println("Introduzca el artista del disco: ");
		vinilo.setArtista(sc.nextLine());
		System.out.println("Introduzca el precio del disco (en formato n.nn): ");
		double precio = 0.0;
		do
		{
			try
			{
				precio = Double.parseDouble(sc.nextLine());
				vinilo.setPrecio(precio);
			}
			catch (NumberFormatException ex)
			{
				System.out.println("Formato de precio incorrecto. Debe introducir un n�mero decimal separado por \".\"");
				System.out.println("Introduzca el precio del disco: ");
				precio = -1.0;
			}
		} while (precio < 0.0);
		System.out.println("Introduzca el n�mero de unidades: ");
		int unidades = -1;
		do
		{
			try
			{
				unidades = Integer.parseInt(sc.nextLine());
				vinilo.setUnidades(unidades);
			}
			catch (NumberFormatException ex)
			{
				System.out.println("Formato de unidades incorrecto. Debe introducir un n�mero entero.");
				System.out.println("Introduzca el n�mero de unidades del vinilo: ");
				unidades = -1;
			}
		} while (unidades < 0);
		System.out.println("Introduzca la velocidad del disco: ");
		int velocidad = 0;
		do
		{
			try
			{
				velocidad = sc.nextInt();
				vinilo.setVelocidad(velocidad);
			}
			catch (InputMismatchException ex)
			{
				System.out.println("Formato de velocidad incorrecto. Debe introducir un n�mero entero.");
				System.out.println("Introduzca la velocidad del disco: ");
				velocidad = -1;
			}
		} while(velocidad < 0);
		
		return vinilo;
	}

	private static Casete CrearCasete()
	{
		Casete casete = new Casete();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el t�tulo de la cinta: ");
		casete.setTitulo(sc.nextLine());
		System.out.println("Introduzca el artista de la cinta: ");
		casete.setArtista(sc.nextLine());
		System.out.println("Introduzca el precio de la cinta (en formato n.nn): ");
		double precio = 0.0;
		do
		{
			try
			{
				precio = Double.parseDouble(sc.nextLine());
				casete.setPrecio(precio);
			}
			catch (NumberFormatException ex)
			{
				System.out.println("Formato de precio incorrecto. Debe introducir un n�mero decimal separado por \".\"");
				System.out.println("Introduzca el precio de la cinta: ");
				precio = -1.0;
			}
		} while (precio < 0.0);
		System.out.println("Introduzca el n�mero de unidades: ");
		int unidades = -1;
		do
		{
			try
			{
				unidades = Integer.parseInt(sc.nextLine());
				casete.setUnidades(unidades);
			}
			catch (NumberFormatException ex)
			{
				System.out.println("Formato de unidades incorrecto. Debe introducir un n�mero entero.");
				System.out.println("Introduzca el n�mero de unidades del casete: ");
				unidades = -1;
			}
		} while (unidades < 0);
		System.out.println("Introduzca la duraci�n en minutos de la cinta: ");
		int minutos = 0;
		do
		{
			try
			{
				minutos = Integer.parseInt(sc.nextLine());
				casete.setMinutosDuracion(minutos);
			}
			catch (NumberFormatException ex)
			{
				System.out.println("Formato de duraci�n incorrecto. Debe introducir un n�mero entero.");
				System.out.println("Introduzca la duraci�n en minutos de la cinta: ");
				minutos = -1;
			}
		} while(minutos < 0);
		
		return casete;
	}

	//M�todo para la creaci�n y actualizaci�n del archivo de ventas.
	public static void archivarVentas(ArrayList<Venta> listaVentas)
	{
		FileWriter escribir;
		try {
			escribir = new FileWriter(nombreArchivoVentas);
			
			for (Venta venta:listaVentas)
			{
				escribir.write(venta.toString() + "\r\n");
			}
			
			escribir.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("ERROR al escribir en el fichero.");
		}
	}
	
	//M�todos para buscar el Cliente y la M�sica en funci�n del c�digo
	private static Cliente buscarCliente(int codigo, ArrayList<Cliente> listaClientes)
	{
		for (Cliente cliente:listaClientes)
		{
			if (cliente.getCodigo() == codigo)
				return cliente;
		}
		return null;
	}
	
	private static Musica buscarMusica(int codigo, ArrayList<CD> listaCDs, ArrayList<Vinilo> listaVinilos, ArrayList<Casete> listaCasetes)
	{
		for (CD disco:listaCDs)
		{
			if (disco.getCodigo() == codigo)
				return disco;
		}
		for (Vinilo vinilo:listaVinilos)
		{
			if (vinilo.getCodigo() == codigo)
				return vinilo;
		}
		for (Casete casete:listaCasetes)
			if (casete.getCodigo() == codigo)
				return casete;
		return null;
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String[] instrucciones;
		String linea;
		String formato;

		//clases temporales
		Cliente temporalCliente;
		Venta temporalVenta;
		Musica temporalMusica;

		//Listas de Musica
		ArrayList<CD> listaCDs = new ArrayList<CD>();
		ArrayList<Vinilo> listaVinilos = new ArrayList<Vinilo>();
		ArrayList<Casete> listaCasetes = new ArrayList<Casete>();

		//Lista de clientes
		ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

		//Lista de Ventas
		ArrayList<Venta> listaVentas = new ArrayList<Venta>();
		
		do
		{
			//Mostramos el men� y leemos la instrucci�n del usuario
			System.out.println(menu);
			linea = sc.nextLine();
			if (!linea.isEmpty())
			{
				//Separamos la instruccion en palabras y buscamos los m�todos que se deban ejecutar
				// en funci�n de lo introducido por el usuario.
				instrucciones = linea.split(" ");
				
				switch (instrucciones[0].toLowerCase())
				{
					case "crear":
						if (instrucciones.length == 2)
						{
							switch (instrucciones[1].toLowerCase())
							{
								case "cliente":
									//A�adimos a la lista el nuevo cliente que introduzca el usuario
									listaClientes.add(CrearCliente());
									break;
								case "musica":
									//En funci�n del formato a�adimos a la lista adecuada la nueva M�sica
									System.out.println("Elija el formato: ");
									formato = sc.nextLine();
									switch (formato.toLowerCase())
									{
									case "cd":
										listaCDs.add(CrearCD());
										break;
									case "vinilo":
										listaVinilos.add(CrearVinilo());
										break;
									case "casete":
										listaCasetes.add(CrearCasete());
										break;
									default:
										System.out.println("Formato incorrecto");
										break;
									}
									break;
								case "venta":
									//En funci�n de los c�digos de cliente y de m�sica a�adimos a la lista la nueva venta
									// y la introducimos en el archivo.
									if (listaClientes.isEmpty() || (listaCDs.isEmpty() && listaVinilos.isEmpty() && listaCasetes.isEmpty()))
										System.out.println("No existen clientes o elementos para realizar una venta.");
									else
									{
										temporalCliente = null;
										temporalMusica = null;
										
										int codigoCliente = -1;
										do
										{
											try 
											{
												System.out.println("Introduzca el c�digo del cliente: ");
												codigoCliente = sc.nextInt();
												temporalCliente = buscarCliente(codigoCliente, listaClientes);
												if (temporalCliente == null)
												{
													codigoCliente = -1;
													System.out.println("C�digo de cliente incorrecto");
												}
											}
											catch (InputMismatchException ex)
											{
												System.out.println("C�digo de cliente incorrecto");
											}
										} while (codigoCliente < 0);
										
										int codigoMusica = -1;
										do
										{
											try
											{
												System.out.println("Introduzca el c�digo de la m�sica: ");
												codigoMusica = sc.nextInt();
												temporalMusica = buscarMusica(codigoMusica, listaCDs, listaVinilos, listaCasetes);
												if (temporalMusica == null)
												{
													codigoMusica = -2;
													System.out.println("C�digo de musica incorrecto");
												}
												if (temporalMusica.getUnidades() <= 0)
												{
													codigoMusica = -1;
													System.out.println("No hay unidades del producto.");
													break;
												}
												else
												{
													temporalMusica.setUnidades(temporalMusica.getUnidades() - 1);
												}
											}
											catch (InputMismatchException ex)
											{
												System.out.println("C�digo de musica incorrecto");
											}
										} while (codigoMusica < -1);
										
										temporalVenta = new Venta();
										if (temporalMusica != null && temporalCliente != null)
										{
											if (codigoMusica > 0)
											{
												temporalVenta.setCliente(temporalCliente);
												temporalVenta.setMusica(temporalMusica);
												listaVentas.add(temporalVenta);
											}
										}
										else
										{
											System.out.println("ERROR al crear la venta.");
										}
										
										archivarVentas(listaVentas);
									}
									break;
								default:
									//Informamos de un error al introducir la instrucci�n
									System.out.println("Instruccion incompatible.");
									break;
							}
						}
						else
						{
							//Informamos de un error en el n�mero de palabras en la instrucci�n
							System.out.println("N�mero de palabras incorrecto para esta instrucci�n.");
						}
						break;
					case "listar":
						if (instrucciones.length == 2)
						{
							switch (instrucciones[1].toLowerCase())
							{
								case "cliente":
									//Listamos los clientes que actualmente existen en la lista
									System.out.println("Listado de clientes");
									for (Cliente cliente:listaClientes)
									{
										System.out.println(cliente.toString());
									}
									break;
								case "musica":
									//Listamos la m�sica que actualmente existe en las distintas listas
									if (listaCDs.size() > 0)
										System.out.println("Lista de CDs");
									for (CD disco:listaCDs)
									{
										System.out.println(disco.toString());
									}
									if (listaVinilos.size() > 0)
										System.out.println("Lista de Vinilos");
									for (Vinilo vinilo:listaVinilos)
									{
										System.out.println(vinilo.toString());
									}
									if (listaCasetes.size() > 0)
										System.out.println("Lista de Casetes");
									for (Casete casete:listaCasetes)
									{
										System.out.println(casete.toString());
									}
									break;
								case "venta":
									//Listamos las ventas que actualmente existen
									System.out.println("Listado de ventas");
									for (Venta venta:listaVentas)
									{
										System.out.println(venta.toString());
									}
									break;
								default:
									//Informamos de un error en la instrucci�n facilitada por el usuario.
									System.out.println("Instruccion incompatible.");
									break;
							}
						}
						else
						{
							//Informamos de un error en la instrucci�n facilitada por el usuario.
							System.out.println("N�mero de palabras incorrecto para esta instrucci�n.");
						}
						break;
					case "eliminar":
						if (instrucciones.length == 3)
						{
							try
							{
								int codigoEliminar = Integer.parseInt(instrucciones[2]);
								int contador = 0;
								switch (instrucciones[1].toLowerCase())
								{
									case "cliente":
										//Buscamos el cliente con el c�digo indicado y lo borramos de la lista
										for (Cliente cliente:listaClientes)
										{
											if (cliente.getCodigo() == codigoEliminar)
												break;
											contador++;
										}
										listaClientes.remove(contador);
										break;
									case "musica":
										//Buscamos la m�sica con el c�digo indicado y la borramos de la lista adecuada
										boolean encontrado = false;
										for (CD disco:listaCDs)
										{
											if (disco.getCodigo() == codigoEliminar)
											{
												encontrado = true;
												break;
											}
											contador++;
										}
										if (encontrado)
											listaCDs.remove(contador);
										encontrado = false;
										contador = 0;
										for (Vinilo vinilo:listaVinilos)
										{
											if (vinilo.getCodigo() == codigoEliminar)
											{
												encontrado = true;
												break;
											}
											contador++;
										}
										if (encontrado)
											listaVinilos.remove(contador);
										encontrado = false;
										contador = 0;
										for (Casete casete:listaCasetes)
										{
											if (casete.getCodigo() == codigoEliminar)
											{
												encontrado = true;
												break;
											}
											contador++;
										}
										if (encontrado)
											listaCasetes.remove(contador);
										encontrado = false;
										contador = 0;
										break;
									case "venta":
										//Buscamos la venta con el c�digo indicado y la borramos de la lista
										for (Venta venta:listaVentas)
										{
											if (venta.getCodigo() == codigoEliminar)
												break;
											contador++;
										}
										listaVentas.remove(contador);
										archivarVentas(listaVentas);
										break;
									default:
										//Informamos al usuario de un error al introducir la instrucci�n
										System.out.println("Instruccion incompatible");
										break;
								}
							}
							catch (InputMismatchException ex)
							{
								//Informamos al usuario que hay un error al leer el c�digo introducido
								System.out.println("ERROR al leer el c�digo");
							}
						}
						else
						{
							//Informamos al usuario de un error al introducir la instrucci�n
							System.out.println("N�mero de palabras incorrecto para esta instrucci�n.");
						}
						break;
					case "existencias":
						if (instrucciones.length == 3)
						{
							int codigo = -1;
							try
							{
								codigo = Integer.parseInt(instrucciones[1]);
								for (CD disco:listaCDs)
								{
									if (disco.getCodigo() == codigo)
									{
										disco.setUnidades(disco.getUnidades() + Integer.parseInt(instrucciones[2]));
										break;
									}
								}
								for (Vinilo vinilo:listaVinilos)
								{
									if (vinilo.getCodigo() == codigo)
									{
										vinilo.setUnidades(vinilo.getUnidades() + Integer.parseInt(instrucciones[2]));
										break;
									}
								}
								for (Casete casete:listaCasetes)
								{
									if (casete.getCodigo() == codigo)
									{
										casete.setUnidades(casete.getUnidades() + Integer.parseInt(instrucciones[2]));
										break;
									}
								}
							}
							catch (NumberFormatException ex)
							{
								System.out.println("No ha utilizado correctamente la instrucci�n.");
							}
						}
						else
						{
							//Informamos al usuario de un error al introducir la instrucci�n
							System.out.println("N�mero de palabras incorrecto para esta instrucci�n.");
						}
						break;
					case "ayuda":
						//Se ha a�adido una breve ayuda para que el usuario pueda utilizar el programa correctamente
						System.out.println("Existen tres instrucciones b�sicas con las que interactuar con la aplicaci�n.");
						System.out.println("\"crear\" nos permitir� crear nuevos clientes, ventas o m�sica.");
						System.out.println("Si se crea un nuevo Cliente se pedir�n el nombre, apellidos y edad del cliente");
						System.out.println("Si se crea una nueva m�sica se pedir� en perimer lugar el formato.");
						System.out.println("Para todos los formatos se pedir� el t�tulo, autor y precio.");
						System.out.println("Seg�n en formato sea CD, Vinilo o Casete, se solicitar� al usuario que introduzca la capacidad, la velocidad o la duraci�n, respectivamente.");
						System.out.println("Si se crea una nueva venta, se pedir� el c�digo del cliente y de la m�sica");
						System.out.println("\"listar\" nos permitir� ver un listado de todos los clientes, las ventas o la m�sica que tengamos");
						System.out.println("\"eliminar\" nos permitir� eliminar un cliente, una venta o m�sica. Para ello deberemos aportar el c�digo para eliminar �nicamente el elemento que deseemos");
						System.out.println("\"existencias\" nos permitir� modificar el n�mero de unidades de un elemento de tipo m�sica. Para utilizarlo introduciremos el c�digo del elemento y el n�mero de unidades que queramos a�adir a las existentes.");
						System.out.println("\"ayuda\" nos facilitar� informaci�n acerca de las instrucciones que se podr�n utilizar");
						System.out.println("\"cerrar\" saldr� de la aplicaci�n.");
						break;
					default:
						//Se informa al usuario que la instrucci�n introducida es incorrecta
						if (!instrucciones[0].toLowerCase().contentEquals("cerrar"))
							System.out.println("Instrucci�n incorrecta");
						break;
				}
			}
			
		
		} while(!linea.contentEquals("cerrar"));
		
		//Finalizamos el programa y cerramos la lectura de teclado
		sc.close();
	}

}
