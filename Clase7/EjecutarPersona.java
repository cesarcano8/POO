public class EjecutarPersona {
    public static void main(String[] args) {
        //El operador new me permite instanciar el objeto
        Persona objPersona1 = new Persona(820800, 
                                        "Cesar", 
                                        "Cano", 
                                        22,
                                        1.80,
                                        80.0);
        Persona objPersona2 = new Persona(822000, 
                                        "Danna", 
                                        "Leon", 
                                        21,
                                        1.67,
                                        60.0);

    System.out.println(objPersona2.estudiar("Tecnologia de Sistemas"));
    System.out.println("Los datos de la persona 1 son: " + objPersona1.getNombres() + objPersona1.getApellidos() + objPersona1.getIdentificacion()  + objPersona1.getEdad() + objPersona1.getEstatura() + objPersona1.getPeso());


    


    //Tarea: Implementar los metodos get y set en la clase persona
    }
}
