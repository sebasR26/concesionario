import java.util.Stack;

public class Metodos{

    public void mostrar(Stack<obj> pila){
        for(obj o : pila){
            System.out.println("Modelo: " + o.getModelo());
            System.out.println("CC: " + o.getCc());
            System.out.println("Marca: " + o.getMarca());
        }

    }

}