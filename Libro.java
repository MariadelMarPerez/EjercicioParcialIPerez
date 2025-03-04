// El libro y sus atributos
public class Libro {
    String titulo;
    String autor;
    int numeroEjemplares;
    int numeroEjemplaresPrestados;
    //Nuevos Atrubutos
    String categoria;
    String nombreEditorial;

    public Libro () //Costructur vacio por defecto
    {

    }
//Constructor con parametros 
    public Libro(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }
//Metodos get y set
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public int getNumeroEjemplaresPrestados() {
        return numeroEjemplaresPrestados;
    }

    public void setNumeroEjemplaresPrestados(int numeroEjemplaresPrestados,int ejemplares) {
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }
    //Metodo Prestamo
   public boolean realizarPrestamo () {
    if (numeroEjemplares>numeroEjemplaresPrestados) {
        numeroEjemplaresPrestados++;
        return true;
    }
    else {
        return false;
    }
}
        

//M etodo Devolucion
public boolean realizarDevolucion ()
{
    if (numeroEjemplaresPrestados> 0) 
    {
        numeroEjemplaresPrestados--;
        return true;     
}

else
 {
    return false;
}

}
//Metodo Imprimir
    public void imprimir ()
    {
        System.out.println("El titulo es "+ titulo);
        System.out.println("El autor es "+ autor);
        System.out.println("El numero de ejemplares es "+ numeroEjemplares);
        System.out.println("El numero de ejemplares prestados son "+ numeroEjemplaresPrestados);
    }

    // Metodo Adicional
    public boolean verificarEjemplaresDisponibles ()
    {
       if(numeroEjemplares> numeroEjemplaresPrestados){
        System.out.println("Es posible prestar este libro hay "+ numeroEjemplares);
        return true;
       } 
       else{
        System.out.println("No hay ejemplares disponibles");
        return false;
       }
    }
    public static void main(String[] args) {
        //Objeto 1
        Libro Libro1= new Libro("Cien anos de Soledad", "Gabriel Garcia Marquez", 5,3);
        Libro1.imprimir();
        //Objeto 2
        Libro Libro2= new Libro();
        
        Libro2.setTitulo("Cien Anos de Soledad");
        Libro2.setAutor("Gabriel Garcia Marquez");
        Libro2.setNumeroEjemplares(5);
        Libro2.imprimir();

        System.out.println("Se presto el libro " + Libro1.realizarPrestamo());
        System.out.println("Se devolvio el libro " + Libro1.realizarDevolucion());
        Libro1.verificarEjemplaresDisponibles();
    }


        
    

}

