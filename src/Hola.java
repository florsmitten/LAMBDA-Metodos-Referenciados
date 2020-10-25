public class Hola implements main.IHola {

    private String holaMensaje;

    public Hola() {
        System.out.println("Constructor – clase Hola");
    }

    public void setHolaMensaje(String h) {
        holaMensaje = h;
    }

    public void mostrarHola() {
        System.out.println(holaMensaje);
    }
}
