import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Client {
    @SerializedName("first_name")
    public String firstName;
    @SerializedName("last_name")
    public String lastName;
    @SerializedName("phone_number")
    public String phoneNumber;
    @SerializedName("street")
    public String street;
    @SerializedName("house_number")
    public String houseNumber;
    @SerializedName("postcode")
    public String postcode;
    @SerializedName("client_id")
    public String clientId;
    @SerializedName("city")
    public String city;
    @SerializedName("other_ids")
    public ArrayList<String> otherIds;

    Client(String firstName, String lastName, String phoneNumber, String street,
           String houseNumber, String postcode, String city, String clientId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.street = street;
        this.houseNumber = houseNumber;
        this.postcode = postcode;
        this.clientId = clientId;
        this.city = city;
        this.otherIds = new ArrayList<String>();
    }

    @Override
    public String toString() {
        return firstName + ", " + lastName + ", " + phoneNumber + ", " + street + ", " + houseNumber + ", " +
                postcode + ", " + city + ", " + clientId + ", " + otherIds.toString();
    }
}