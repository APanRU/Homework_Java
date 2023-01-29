public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "123456"); // !
        phoneBook.add("Васильев", "321456");
        phoneBook.add("Петрова", "234561");
        phoneBook.add("Иванов", "234432"); // !
        phoneBook.add("Петрова", "654321");
        phoneBook.add("Иванов", "345678"); // !

        System.out.println(phoneBook.getBySurname("Иванов"));
    }
}