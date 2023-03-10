public class Main {
    public static void main(String[] args) {

        boolean retValue = ClientService.addClient(new Client("Diane", "Nguyen",
                "015234531642", "Finkenweg", "8", "29992",
                "Bremen", "20201157"));

        System.out.println(retValue);

        retValue = ClientService.addClient(new Client("Diane", "Nguyen",
                "015234531642", "Finkenweg", "8", "29992",
                "Bremen", "20201157"));

        System.out.println(retValue);
        System.out.println(ClientDatabase.getAllClients());

        System.out.println("------------------------------------------------------------------------------------");

        retValue = ClientService.addClient(new Client("Diane", "Nguyen",
                "015234531642", "Finkenweg", "9", "29992",
                "Bremen", "20201157"));

        System.out.println(retValue);

        for(Client client : ClientDatabase.getAllClients())
            System.out.println(client.toString());

        System.out.println("------------------------------------------------------------------------------------");

        retValue = ClientService.addClient(new Client("Diane", "Nguyen",
                "015234531642", "Finkenweg", "8", "29992",
                "Bremen", "20201157"));

        System.out.println(retValue);
        System.out.println(ClientDatabase.getAllClients().size());
        for(Client client : ClientDatabase.getAllClients())
            System.out.println(client.toString());

        System.out.println("------------------------------------------------------------------------------------");

        retValue = ClientService.addClient(new Client("Diane", "Nguyen",
                "015234531642", "Finkenweg", "8", "29992",
                "Bremen", "20221141"));

        System.out.println(retValue);
        System.out.println(ClientDatabase.getAllClients().size());
        for(Client client : ClientDatabase.getAllClients())
            System.out.println(client.toString());

        System.out.println("------------------------------------------------------------------------------------");

        retValue = ClientService.addClient(new Client("Diane", "Nguy???n",
                "015234531642", "Finkenweg", "8", "29992",
                "Bremen", "20227349"));

        System.out.println(retValue);
        System.out.println(ClientDatabase.getAllClients().size());
        for(Client client : ClientDatabase.getAllClients())
            System.out.println(client.toString());

        System.out.println("------------------------------------------------------------------------------------");

        retValue = ClientService.addClient(new Client("Diane", "Nguy???n",
                "015234531642", "Lietzenburger Stra??e", "91", "49779",
                "Oberlangen", "202042353"));

        System.out.println(retValue);
        System.out.println(ClientDatabase.getAllClients().size());
        for(Client client : ClientDatabase.getAllClients())
            System.out.println(client.toString());

        retValue = ClientService.addClient(new Client("Diane", "Nguy???n",
                "015234531642", "Finkenweg", "8", "29992",
                "Bremen", "20227349"));

        System.out.println(retValue);

        System.out.println("------------------------------------------------------------------------------------");

        retValue = ClientService.addClient(new Client("Otmar", "Jacobi",
                "019995254185", "Klosterstra??e", "5", "9013",
                "Osnabr??ck", "20221600"));

        System.out.println(retValue);
        System.out.println(ClientDatabase.getAllClients().size());
        for(Client client : ClientDatabase.getAllClients())
            System.out.println(client.toString());

        System.out.println("------------------------------------------------------------------------------------");

        retValue = ClientService.addClient(new Client("Otmar", "Jacobi ",
                "019995254185", "Hauptstra??e", "47", "11968",
                "M??nchen", "20221601"));

        System.out.println(retValue);
        System.out.println(ClientDatabase.getAllClients().size());
        for(Client client : ClientDatabase.getAllClients())
            System.out.println(client.toString());

        System.out.println("------------------------------------------------------------------------------------");

        retValue = ClientService.addClient(new Client("Monika", "Kastner",
                "019135763642", "Nelkenweg", "45", "58262",
                "Wangen im Allg??u", "20221579"));

        System.out.println(retValue);
        System.out.println(ClientDatabase.getAllClients().size());
        for(Client client : ClientDatabase.getAllClients())
            System.out.println(client.toString());

        System.out.println("------------------------------------------------------------------------------------");

        retValue = ClientService.addClient(new Client("Monika", "Kastner-Jacobi",
                "019135763642", "Nelken Weg", "45", "58262",
                "Wangen im Allg??u", "20221572"));

        System.out.println(retValue);
        System.out.println(ClientDatabase.getAllClients().size());
        for(Client client : ClientDatabase.getAllClients())
            System.out.println(client.toString());

        System.out.println("------------------------------------------------------------------------------------");

        retValue = ClientService.addClient(new Client("Kurt", "Friedrich",
                "019106558129", "Falkenweg", "22", "93058",
                "Burgdorf", "20221621"));

        System.out.println(retValue);
        System.out.println(ClientDatabase.getAllClients().size());
        for(Client client : ClientDatabase.getAllClients())
            System.out.println(client.toString());

        System.out.println("------------------------------------------------------------------------------------");

        retValue = ClientService.addClient(new Client("KURT MICHAEL", "FRIEDRICH",
                "019106558129", "FALKENWEG", "22", "93058",
                "BURGDORF", "20221622"));

        System.out.println(retValue);
        System.out.println(ClientDatabase.getAllClients().size());
        for(Client client : ClientDatabase.getAllClients())
            System.out.println(client.toString());

        System.out.println("------------------------------------------------------------------------------------");

        retValue = ClientService.addClient(new Client("Felix", "Hamm",
                "019738956535", "Hochstra??e", "6", "41983",
                "Sch??nebeck", "20221663"));

        System.out.println(retValue);
        System.out.println(ClientDatabase.getAllClients().size());
        for(Client client : ClientDatabase.getAllClients())
            System.out.println(client.toString());

        System.out.println("------------------------------------------------------------------------------------");

        retValue = ClientService.addClient(new Client("Felix", "Hamm",
                "09151 15 03 73", "Hochstrasse", "6", "41983",
                "Schoenebeck", "20221664"));

        System.out.println(retValue);
        System.out.println(ClientDatabase.getAllClients().size());
        for(Client client : ClientDatabase.getAllClients())
            System.out.println(client.toString());

        System.out.println("------------------------------------------------------------------------------------");

        retValue = ClientService.addClient(new Client("Anett", "Haug",
                "019685848009", "Feldstra??e", "14", "70676",
                "Uelzen", "20221635"));

        System.out.println(retValue);
        System.out.println(ClientDatabase.getAllClients().size());
        for(Client client : ClientDatabase.getAllClients())
            System.out.println(client.toString());

        System.out.println("------------------------------------------------------------------------------------");

        retValue = ClientService.addClient(new Client("Anett Catrin", "Haug",
                "+4919685848009", "Kiefernweg", "10a", "71723",
                "Bruchk??bel", "20255664"));

        System.out.println(retValue);
        System.out.println(ClientDatabase.getAllClients().size());
        for(Client client : ClientDatabase.getAllClients())
            System.out.println(client.toString());
    }
}