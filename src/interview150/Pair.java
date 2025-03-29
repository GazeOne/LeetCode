package interview150;

public class Pair<T, T1> {

    private T first;
    private T1 second;

    public Pair(T t, T1 t1) {
        first = t;
        second = t1;
    }

    public T getFirst() {
        return first;
    }

    public T1 getSecond() {
        return second;
    }
}
