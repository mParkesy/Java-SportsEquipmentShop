package sportsequipmentproject;
import java.util.ArrayList;

/**
 * A class to model an array list of customer details
 */
public class CustomerDetailsList {
    private ArrayList<CustomerDetails> customerDetailsList;
    
    /**
    * Creates an empty CustomerDetailsList.
    */
    public CustomerDetailsList() {
        customerDetailsList = new ArrayList<CustomerDetails>();
    }
    
    /**
    * Store details of a new CustomerDetail into the CustomerDetailsList.
    *
    * @param newCustomer The Customer details to be stored.
    */
    public void addCustomer(CustomerDetails newCustomer){
        customerDetailsList.add(newCustomer);
    }
    
    /**
    * @return the number of Customer details currently in the CustomerDetailsList.
    */
    public int numberOfCustomers(){
        return customerDetailsList.size();
    }
    
    /**
    *
    * @param givenID the ID of a customer
    * @return the customer’s details if found,
    * exception thrown otherwise.
     * @throws sportsequipmentproject.CustomerNotFoundException
    */
    public CustomerDetails findCustomer( String givenID )
            throws CustomerNotFoundException {
        for (CustomerDetails nextCustomer : customerDetailsList ){
            if(nextCustomer.getCustomerID().matches(givenID))
                return nextCustomer;
        }
        throw new CustomerNotFoundException();
        
    }
    
    /**
    * @return the list of customers
    */
    @Override
    public String toString(){
        StringBuilder customerList = new StringBuilder();
        for (CustomerDetails nextCustomer : customerDetailsList ){
            customerList.append(nextCustomer).append("\n");
        }
        return customerList.toString();
    }
}
