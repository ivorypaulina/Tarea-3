public class Libro {
    //atributos
    String titulo;
    String autor;
    int anioPublicacion;

    //constructor
    public Libro(String titulo, String autor, int anioPublicacion){
        this.titulo=titulo;
        this.autor=autor;
        this.anioPublicacion=anioPublicacion;
    }

    //metodo
    public void mostrarInformacion(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Año de publicación: "+anioPublicacion);
        System.out.println("----------------------------------------");
    }
}
