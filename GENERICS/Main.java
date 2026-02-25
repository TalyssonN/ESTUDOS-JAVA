package GENERICS;

public class Main {
    public static void main(String[] args) {
        // Criando uma instância de Box para Strings
        var boxStr = new Box<String>();
        boxStr.setItem("Hello, Generics!");
        System.out.println(boxStr.getItem());
        // Criando uma instância de Box para Int
        var boxInt = new Box<Integer>();
        boxInt.setItem(42);
        System.out.println(boxInt.getItem());
    }
}