import java.util.List;




public class Main {
    public static void main(String[] args) {
        generateUsers().stream()
        //Stream: uma sequência de elementos que suporta operações de agregação

        //Filtra os usuários com idade maior que 28
                .filter(user -> user.age() > 28)
                .map(User::name)
                .filter(name -> name.equals("Alice"))
        //Imprime os nomes dos usuários filtrados
                .forEach(System.out::println);
        //Saída esperada: Alice
    }

    private static List<User> generateUsers() {
        User user1 = new User("Alice", 30, Sex.FEMALE, List.of(
                //Cria email para Alice
                new Contact("alice@email.com", Contacttype.EMAIL),
                //Cria um contato de telefone para Alice
                new Contact("(123) 456-7890", Contacttype.PHONE)
        ));
        User user2 = new User("Bob", 25, Sex.MALE, List.of(
                //Cria email para Bob
                new Contact("bob@email.com", Contacttype.EMAIL),
                //Cria um contato de telefone para Bob
                new Contact("(987) 654-3210", Contacttype.PHONE)
        ));
        User user3 = new User("Charlie", 35, Sex.MALE, List.of(
                //Cria email para Charlie
                new Contact("charlie@email.com", Contacttype.EMAIL),
                //Cria um contato de telefone para Charlie
                new Contact("(555) 123-4567", Contacttype.PHONE)
        ));
        return List.of(user1, user2, user3);
    }
}
