
package sportsequipmentproject;

/**
 * A class to model the address of a customer or sports club
 */
public class Address {
    private String streetName;
    private String city;
    private String postcode;
    
    /**
     * Creates a new instance of Address
     * @param inpStreet             street name
     * @param inpCity               city
     * @param inpPostcode           postcode
    */
    public Address (String inpStreet, String inpCity, String inpPostcode){
        streetName = inpStreet;
        city = inpCity;
        postcode = inpPostcode;
    }
    
    /**
     * @return  house number and streetname
    */
    public String getStreetName(){
        return streetName;
    }
    /**
     * @return  city
    */
    public String getCity(){
        return city;
    }
    /** 
     * @return  postcode        The postcode to be set
    */
    public String getPostcode(){
        return postcode;
    }
    /**
     * @param newStreetName     The street name to be set
    */
    public void setStreetName(String newStreetName) {
        streetName = newStreetName;
    }
    /**
     * @param newCity   The city to be set
    */
    public void setCity(String newCity){
        city = newCity;
    }
    /**
     * @param newPostcode    
    */
    public void setPostcode(String newPostcode){
        postcode = newPostcode;
    }
    
    /**
     * toString method of address
     * @return Address toString
    */
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder("\n\tHouse Number and Street:\t");
        str.append(streetName).append("\n\tCity:\t");
        str.append(city).append("\n\tPostcode:\t");
        str.append(postcode).append("\n");
        return str.toString();
    }
}
