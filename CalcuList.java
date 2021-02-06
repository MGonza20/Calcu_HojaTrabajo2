import java.util.ArrayList;

/**
 * 
 * @author Sara Paguaga
 *
 * @param <E> es el vector 
 */
public class CalcuList<E> implements Stack<E> {

	/**
	 ** Es una arraylist pila con un vector de tama�o variable
	 */
    private ArrayList<E> dataNums;

    /**
     * Es el constructor vac�o 
     */
    public CalcuList() {
        dataNums = new ArrayList<>();
    }
    
    /**
     * A�ade un elemento al stack
     * @param item es el elemento que se desea a�adir
     */
    @Override
    public void push(E item){
        dataNums.add(item);
    }

    /**
     * Remueve el �ltimo elemento
     * @return devuelve el elemento que se removi�
     */
    @Override
    public E pop() {
        return dataNums.remove(size() -1);
    }

    /**
     * Devuelve el �ltimo elemento en el Stack
     * @return el �ltimo elemento en el Stack
     */
    @Override
    public E peek() {
        return dataNums.get(size() - 1);
    }
    
    /**
     * Indica si el Stack est� vacio
     * @return si un valor booleano
     */
    @Override
    public boolean empty() {
        return (size() == 0);
    }

    /**
     * Devuelve el tama�o del stack
     * @return el  tama�o del stack
     */
    @Override
    public int size() {
        return dataNums.size();
    }

    /**
     * Devuelve el elemento que hay en la posici�n indicada
     * @return el elemento que hay en la posici�n indicada
     * @param pos la posici�n del elemento
     */
    public E infoPos(int pos){
        return dataNums.get(pos);
    }
}
