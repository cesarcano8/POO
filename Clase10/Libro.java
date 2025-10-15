package Clase10;

public class Libro {
    //Atributos
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private int numeroPaginas;
    private boolean prestado;

    //Constructor
    public Libro(String titulo, String autor, int anioPublicacion, int numeroPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.numeroPaginas = numeroPaginas;
    }

    //Metodos
    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getAnioPublicacion(){
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anio){
        if (anio <= 2025 && anio > 0) {
            this.anioPublicacion = anio;
        } else {
        System.out.println("Error: Ano de publicacion invalido.");
        }
    }

    public int getNumeroPaginas(){
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas){
        this.numeroPaginas = numeroPaginas;
    }

    public boolean getPrestado(){
        return prestado;
    }

    public void setPrestado(boolean prestado){
        this.prestado = prestado;

    }   


    public boolean prestar() {
        if (!this.prestado) {   
            this.prestado = true;
            System.out.println("El libro " + this.titulo + " ha sido prestado exitosamente.");
            return true; // Préstamo exitoso
        }else {
            System.out.println("El libro " + this.titulo + " ya está prestado.");
            return false; // El libro ya está prestado
        }
    }

    @Override
    public String toString(){
        String estado = this.prestado ? "PRESTADO" : "DISPONIBLE";
        return  "Libro [Titulo: " + titulo +
            ", Autor: " + autor +
            ", Ano: " + anioPublicacion +
            ", Paginas: " + numeroPaginas +
            ", Estado: " + estado +
            "]";
    }
}
