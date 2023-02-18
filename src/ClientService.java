import java.util.ArrayList;
import java.util.List;

public class ClientService {
    public static Boolean addClient(Client client) {
        
        List<Client> matchingClients = ClientDatabase.findClients(client.firstName, client.lastName,
                client.phoneNumber, client.street, client.houseNumber, client.postcode, client.city, client.clientId);

        if (!matchingClients.isEmpty()) {

            Client existingClient = matchingClients.get(0);
            if (existingClient.clientId.equals(client.clientId)) {
                return false;
            } else {
                existingClient.otherIds.add(client.clientId);
                return true;
            }
        } else {
            if (updateClientIfMatchFound(client)) {
                return true;
            } else {
                ClientDatabase.addClient(client);
                return true;
            }
        }
    }

    private static boolean updateClientIfMatchFound(Client client) {

        List<Client> clients = new ArrayList<>(ClientDatabase.getAllClients());

        for (int i = 0; i < clients.size(); i++) {

            Client dbClient = clients.get(i);

            if (dbClient.clientId.equals(client.clientId)) {
                clients.set(i, client);

                ClientDatabase.flushDatabase();
                ClientDatabase.addClients(clients);

                return true;
            } else if(areClientsEqual(client, dbClient)) {
                dbClient.otherIds.add(client.clientId);
                client.clientId = dbClient.clientId;
                client.otherIds.addAll(dbClient.otherIds);

                clients.set(i, client);

                ClientDatabase.flushDatabase();
                ClientDatabase.addClients(clients);

                return true;
            }
        }

        return false;
    }

    private static boolean areClientsEqual(Client c1, Client c2) {

        int matchCount = 0;

        if ((areStrings70PercentSimilar(trimEmptySpaces(c1.firstName), trimEmptySpaces(c2.firstName)) ||
                isWordInString(trimEmptySpaces(c1.firstName), trimEmptySpaces(c2.firstName)) ||
                        isWordInString(trimEmptySpaces(c2.firstName), trimEmptySpaces(c1.firstName))) &&
                areStrings70PercentSimilar(trimEmptySpaces(c1.lastName), trimEmptySpaces(c2.lastName))) {
            matchCount++;
        }
        if (areLastCharacters90PercentSimilar(removeNonNumeric(c1.phoneNumber), removeNonNumeric(c2.phoneNumber))) {
            matchCount++;
        }
        if (areStrings70PercentSimilar(removeEmptySpaces(c1.street), removeEmptySpaces(c2.street)) &&
                removeEmptySpaces(c1.houseNumber).equalsIgnoreCase(removeEmptySpaces(c2.houseNumber)) &&
                c1.postcode.equalsIgnoreCase(c2.postcode) &&
                areStrings70PercentSimilar(trimEmptySpaces(c1.city), trimEmptySpaces(c2.city))
        ) {
            matchCount++;
        }

        return matchCount >= 2;
    }

    public static String removeEmptySpaces(String input) {
        return input.replaceAll("\\s+", "");
    }

    public static String trimEmptySpaces(String input) {
        return input.trim();
    }

    public static String removeNonNumeric(String input) {
        return input.replaceAll("[^0-9]", "");
    }

    public static boolean areStrings70PercentSimilar(String string1, String string2) {
        int shorterLength = Math.min(string1.length(), string2.length());
        int minSimilarity = (int) Math.ceil(shorterLength * 0.7);
        int similarityCount = 0;

        for (int i = 0; i < shorterLength; i++) {
            if (Character.toLowerCase(string1.charAt(i)) == Character.toLowerCase(string2.charAt(i)) ||
                    (i > 0 && (Character.toLowerCase(string1.charAt(i - 1)) == Character.toLowerCase(string2.charAt(i)) ||
                            Character.toLowerCase(string1.charAt(i)) == Character.toLowerCase(string2.charAt(i - 1))))
            ) {
                similarityCount++;
            }
        }

        return similarityCount >= minSimilarity;
    }

    public static boolean areLastCharacters90PercentSimilar(String string1, String string2) {

        int length = (int) Math.floor(Math.min(string1.length(), string2.length()) * 0.9);

        for (int i = 1; i <= length; i++) {
            char c1 = string1.charAt(string1.length() - i);
            char c2 = string2.charAt(string2.length() - i);
            if (c1 != c2) {
                return false;
            }
        }

        return true;
    }

    public static boolean isWordInString(String word, String string) {

        return string.toLowerCase().contains(word.toLowerCase());
    }
}