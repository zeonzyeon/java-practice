package ch10.dailyQuiz;

public class Container<T> {
    private T item;

    public T get() {
        return item;
    }

    public void set(T item) {
        this.item = item;
    }
}
