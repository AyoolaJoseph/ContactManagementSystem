public class Main {
    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();

        // Example usage
        Contact contact1 = new Contact("Ola Josh", "0904567890");
        Contact contact2 = new Contact("Ayoola Olaoluwa", "0817654321");

        contactManager.addContact(contact1);
        contactManager.addContact(contact2);

        // Display all contacts
        contactManager.displayContacts();
    }
}
