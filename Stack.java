/**
 * 
 * Es la clase Stack con el vector
 *
 * @param <E>
 */

public interface Stack<E> 
{

	/**
	 * 
	 * @param item es el elemento que se desea a�adir al stack
	 */
   public void push(E item);
   // pre: 
   // post: item is added to stack
   // will be popped next if no intervening push
   
   /**
    * Saca el �ltimo elemento del stack
    * @return el �ltimo elemento del stack
    */
   
   public E pop();
   // pre: stack is not empty
   // post: most recently pushed item is removed and returned
   
   
   /**
    * Muestra el �ltimo elemento del stack
    * @return el �ltimo elemento del stack
    */
   public E peek();
   // pre: stack is not empty
   // post: top value (next to be popped) is returned
   
   /**
    * Da un valor booleano para saber si el stack est� vacio o no
    * @return un valor booleano dependiendo la condici�n
    */
   public boolean empty();
   // post: returns true if and only if the stack is empty
   
   /**
    * Indica el tama�o del stack
    * @return devuelve el tama�o del stack
    */
   public int size();
   // post: returns the number of elements in the stack

}