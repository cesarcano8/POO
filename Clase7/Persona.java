public class Persona {
    //Atributos
    private int Identificacion;
    private String Nombres;
    private String Apellidos;
    private int Edad;
    private double Estatura;
    private double Peso;    

    //La palabra reservada this se utiliza para autoreferenciar el atributo de la clase
    public Persona(int Identificacion, String Nombres, String Apellidos, int Edad, double Estatura, double Peso){
        this.Identificacion = Identificacion;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Edad = Edad;
        this.Estatura = Estatura;
        this.Peso = Peso;
    }

    //Metodos
    public void caminar(){
        System.out.println("Caminar");
    }

    public boolean jugar(){
        return true;
    }

    public void comer(){
        System.out.println("Comiendo");
    }

    public String estudiar(String carrera){
        return "Usted esta estudiando: " + carrera;
    }

    public int getIdentificacion(){
        return Identificacion;
    }

    public String getNombres(){
        return Nombres;
    }

    public String getApellidos(){
        return Apellidos;
    }

    public int getEdad(){
        return Edad;
    }

    public double getEstatura(){
        return Estatura;
    }
    public double getPeso(){
        return Peso;
    }

    public void setIdentificacion(int Identificacion){
        this.Identificacion = Identificacion;
    }

    public void setNombres(String Nombres){
        this.Nombres = Nombres;
    }

    public void setApellidos(String Apellidos){
        this.Apellidos = Apellidos;
    }

    public void setEdad(int Edad){
        this.Edad = Edad;
    }

    public void setEstatura(double Estatura){
        this.Estatura = Estatura;
    }

    public void setPeso(double Peso){
        this.Peso = Peso;
    }

     public String toString() {
        return "Identificacion: " + "Nombres: " + "Apellidos" + "Estatura" + "Peso";
     }

    

    //Tarea consultar del metodo toString

}
