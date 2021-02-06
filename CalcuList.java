import java.util.ArrayList;

/**
 * 
 * @author Sara Paguaga
 *
 * @param <E> es el vector 
 */
public class CalcuList<E> implements Stack<E> {

	/**
	 ** Es una arraylist pila con un vector de tamaño variable
	 */
    private ArrayList<E> dataNums;

    /**
     * Es el constructor vacío 
     */
    public CalcuList() {
        dataNums = new ArrayList<>();
    }
    
    /**
     * Añade un elemento al stack
     * @param item es el elemento que se desea añadir
     */
    @Override
    public void push(E item){
        dataNums.add(item);
    }

    /**
     * Remueve el último elemento
     * @return devuelve el elemento que se removió
     */
    @Override
    public E pop() {
        return dataNums.remove(size() -1);
    }

    /**
     * Devuelve el último elemento en el Stack
     * @return el último elemento en el Stack
     */
    @Override
    public E peek() {
        return dataNums.get(size() - 1);
    }
    
    /**
     * Indica si el Stack está vacio
     * @return si un valor booleano
     */
    @Override
    public boolean empty() {
        return (size() == 0);
    }

    /**
     * Devuelve el tamaño del stack
     * @return el  tamaño del stack
     */
    @Override
    public int size() {
        return dataNums.size();
    }

    /**
     * Devuelve el elemento que hay en la posición indicada
     * @return el elemento que hay en la posición indicada
     * @param pos la posición del elemento
     */
    public E infoPos(int pos){
        return dataNums.get(pos);
    }
}
