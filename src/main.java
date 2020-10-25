import java.util.*;

public class main {

    public static void main(String[] args) {

        IHola staticRef = main::mostrarHolaStatic; //referencia al método static

        staticRef.mostrarHola();//Hola Estático
        main metodo = new main();//referencia al método de instancia
        IHola instanciaRef = metodo::mostrarHolaInstancia;
        instanciaRef.mostrarHola();//Hola Instancia //referencia a un método de un objeto arbitrario

        String[] nombres = {"Oscar", "Alex", "Maria", "Carlos", "Perla", "Juan", "Luz"};
        Arrays.sort(nombres, String::compareToIgnoreCase);
        System.out.println("Nombres ordenados: " + Arrays.toString(nombres)); // Nombres ordenados: [Alex, Carlos, Juan, Luz, Maria, Oscar, Perla]
        IHola holaRef = Hola::new;//referencia a un constructor
        holaRef.mostrarHola();

    }// Constructor –Clase Hola


    public static void mostrarHolaStatic() {

        System.out.println("Hola Estático");
    }

    public void mostrarHolaInstancia() {

        System.out.println("Hola Instancia");
    }

    public interface IHola {

        void mostrarHola();
    }
}







