package sportsequipmentproject;
/**
 * A class to model the details of a sports club
 */
public class SportsClubDetails extends CustomerDetails{
    private String clubName;
    private int clubDiscount;
    
        
     /**
     * Creates a new instance of SportClubDetails
     * @param clubID            unique club ID
     * @param clubAddress       clubs address
     * @param inpClubName       regional code 
     * 
     * @throws IllegalCustomerIDexception   if the customerID String does 
     *                                  not have the required format
     */
    public SportsClubDetails 
                 (String clubID, Address clubAddress, String inpClubName) 
                                              throws IllegalCustomerIDexception{
        super(clubID, clubAddress);
        if ( customerID.charAt(0) != 'C')
            throw new IllegalCustomerIDexception("Club ID must begin with 'C'"
                    + " for sports club");
        else
            clubName = inpClubName;
    }
    
    /**
    * @return the customer ID
    */
    @Override
    public String getCustomerID(){
        return customerID;
    }
    
    /**
    * @return the customer discount
    */    
    @Override
    public int getDiscount(){
        return clubDiscount;
    }
}
