import model.Contact;
import model.EmailAddress;
import model.PhoneNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author Jinxu Zheng
 * @Date 4/5/2024
 **/
public class Main {
    public static void main(String[] args) {
        // Create sample contacts
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("David", "Sanger", "Argos LLC", "Sales Manager",
                List.of(new PhoneNumber("240-133-0011", "Home"), new PhoneNumber("240-112-0123", "Mobile")),
                List.of(new EmailAddress("dave.sang@gmail.com", "Home"), new EmailAddress("dsanger@argos.com", "Work"))));
        contacts.add(new Contact("Carlos", "Jimenez", "Zappos", "Director",
                Collections.emptyList(), Collections.emptyList()));
        contacts.add(new Contact("Ali", "Gafar", "BMI Services", "HR Manager",
                Collections.singletonList(new PhoneNumber("412-116-9988", "Work")),
                Collections.singletonList(new EmailAddress("ali@bmi.com", "Work"))));

        // Sort contacts by last names in ascending order
        Collections.sort(contacts, (c1, c2) -> c1.getLastName().compareTo(c2.getLastName()));

        // Convert contacts to JSON and print to console
        for (Contact contact : contacts) {
            System.out.println(contact.toJSON());
        }
    }
}
