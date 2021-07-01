
public class Disco extends Exito {
	private int id;
	private String nombre;
	private String genero;
	private int a�o;
	private int numero_cancion;
	
	public Disco(int id, String nombre, String genero, int numero_cancion, int a�o, String nombre_cancion,String autor) {
		super(nombre_cancion,autor);
		this.id = id;
		this.nombre=nombre;
		this.genero=genero;
		this.numero_cancion=numero_cancion;
		this.a�o=a�o;
	}
	   
   public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setGenero(String gen){
    	this.genero=gen;
    }
    
    public String getGenero(){
        return genero;
    }
    
    public void setNombre(String nom){
    	this.nombre=nom;
    }
    
   public String getNombre(){
       return nombre;
    }
    
    public void setNumero_Cancion(int num_can){
    	this.numero_cancion=num_can;
    }
    
    public int getNumero_Cancion(){
        return numero_cancion;
    }

    public void setA�o(int a�o){
    	this.a�o=a�o;
    }
    
    public int getA�o(){
        return a�o;
    }
    
	public String mostrarDiscoAgregado() {
		return "\n ----------Disco agregado----------:"+"\n"+
		"Id: " + getId()+"\n"+
	    "Nombre: "+getNombre()+"\n"+
	    "Genero: "+getGenero()+"\n"+
	    "Numero de canciones: "+getNumero_Cancion()+"\n"+
	    "A�o de lanzamiento: "+getA�o()+"\n"+
		"Su exito es: "+nombre_cancion+"\n"+
		"Su autor es: "+autor+"\n";
	}
}
