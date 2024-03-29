import java.util.ArrayList;
import java.util.List;

public class ContactManager {
    private List<Contact> contacts;

    public ContactManager() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContact(Contact contact) {
        contacts.remove(contact);
    }

    public void displayContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact.getName() + ": " + contact.getPhoneNumber());
        }
    }

    // Implement other methods as needed (search, update, etc.)
}
