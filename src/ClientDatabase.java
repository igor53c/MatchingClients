import java.util.ArrayList;
import java.util.List;

public class ClientDatabase {

    private static List<Client> clients = new ArrayList<>();

    public static List<Client> getAllClients() {
        return clients;
    }

    public static Client getClientByFirstName(String firstName) {
        for (Client client : clients) {
            if (client.firstName.equals(firstName)) {
                return client;
            }
        }
        return null;
    }

    public static Client getClientByLastName(String lastName) {
        for (Client client : clients) {
            if (client.lastName.equals(lastName)) {
                return client;
            }
        }
        return null;
    }

    public static List<Client> findClients(String firstName, String lastName, String phoneNumber, String street,
                                           String houseNumber, String postcode, String city, String clientId) {
        List<Client> matchingClients = new ArrayList<>();
        for (Client client : clients) {
            if ((firstName == null || client.firstName.equalsIgnoreCase(firstName)) &&
                    (lastName == null || client.lastName.equalsIgnoreCase(lastName)) &&
                    (phoneNumber == null || client.phoneNumber.equals(phoneNumber)) &&
                    (street == null || client.street.equalsIgnoreCase(street)) &&
                    (houseNumber == null || client.houseNumber.equalsIgnoreCase(houseNumber)) &&
                    (postcode == null || client.postcode.equalsIgnoreCase(postcode)) &&
                    (city == null || client.city.equalsIgnoreCase(city)) &&
                    (clientId == null || client.clientId.equals(clientId))) {
                matchingClients.add(client);
            }
        }
        return matchingClients;
    }

    public static void addClient(Client client) {
        clients.add(client);
    }

    public static void addClients(List<Client> newClients) {
        clients.addAll(newClients);
    }

    public static void flushDatabase() {
        clients.removeAll(clients);
    }
}