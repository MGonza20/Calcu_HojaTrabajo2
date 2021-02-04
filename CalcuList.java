import java.util.ArrayList;

public class CalcuList<E> implements Stack<E> {

    private ArrayList<E> dataNums;

    public CalcuList() {
        dataNums = new ArrayList<>();
    }

    @Override
    public void push(E item){
        dataNums.add(item);
    }

    @Override
    public E pop() {
        return dataNums.remove(size() -1);
    }

    @Override
    public E peek() {
        return dataNums.get(size() - 1);
    }

    @Override
    public boolean empty() {
        return (size() == 0);
    }

    @Override
    public int size() {
        return dataNums.size();
    }

    public E infoPos(int pos){
        return dataNums.get(pos);
    }
}
