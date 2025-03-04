
public class Libro {
    String titulo;
    String autor;
    int numeroEjemplares;
    int numeroEjemplaresPrestados;
    String categoria;
    String nombreEditorial;
    public Libro ()
    {

    }

    public Libro(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }

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
   public void  realizarPrestamo (int numeroEjemplaresPrestados)
{
    if (numeroEjemplaresPrestados>0) {
        this.numeroEjemplares -= numeroEjemplaresPrestados;
        System.out.println("Se realizo el prestamo");
    }
    else {
        System.out.println("No se puedo realizar");
    }
    
    if (numeroEjemplares < 0)
    {
        System.out.println("No hay ejemplares disponibles");
    }
}


public void realizarDevolucion (int numeroEjemplares,int numeroEjemplaresPrestados)
{
    if (numeroEjemplares > 0) {
        this.numeroEjemplares+= numeroEjemplaresPrestados;
        System.out.println("Devolucion Realizada ");
    }
    else {
        System.out.println(" No fue posible realizarla devolucion");
    }
    
if (numeroEjemplaresPrestados<0)
{
System.out.println(" No es posible realizar la devolucion");
}
}
    public void imprimir ()
    {
        System.out.println("El titulo es "+ titulo);
        System.out.println("El autor es "+ autor);
        System.out.println("El numero de ejemplares es "+ numeroEjemplares);
        System.out.println("El numero de ejemplares prestados son "+ numeroEjemplaresPrestados);
    }
    public static void main(String[] args) {
        Libro Libro1= new Libro("Cien anos de Soledad", "Gabriel Garcia Marquez", 5,3);
        Libro1.imprimir();
        Libro Libro2= new Libro();
        Libro2.imprimir();

        
    

}
}
