package GENERICS;

public class Box<T> {
    private T item;
    // T é um tipo genérico que será definido quando a classe for instanciada
    public void setItem(T item) {
        this.item = item;
    }
    // O método getItem retorna o item do tipo T
    public T getItem() {
        return item;
    }
}
