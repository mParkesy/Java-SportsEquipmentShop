package sportsequipmentproject;
import java.text.*;
import java.util.Date;

/**
 * A class to model a date
 */
public class OrderDate {
    private String orderDate;
    
    /**
     * Creates a new instance of OrderDate
     * @param date       An order date
     * @throws sportsequipmentproject.IllegalDateFormatException
    */
    public OrderDate(String date) 
            throws IllegalDateFormatException {
        if ( isValidDate(date) ){
            this.orderDate = date;
        }
        else {
            throw new IllegalDateFormatException
                                        ("Given date string has incorrect format.");
        }
    }
    
    /**
     * Set method for Order Date
     * @param newOrderDate     The date to be set
     * @throws sportsequipmentproject.IllegalDateFormatException
    */
    public void setOrderDate(String newOrderDate) throws IllegalDateFormatException {
        if ( isValidDate(newOrderDate) ){
            orderDate = newOrderDate;
        }
        else {
            throw new IllegalDateFormatException
                                        ("Given date string has incorrect format.");
        }
    }
    
    /**
     * 
     * @return  order date
    */    
    public String getOrderDate() {
        return orderDate;
    }
    
    /**
     * 
     * @return  order date month
    */
    public String getMonth(){
        return orderDate.substring(3,5);
    }
    
    /**
     * 
     * @return  order date day
    */
    public String getDay(){
        return orderDate.substring(0,2);
    }
    
    /**
     * 
     * @return  order date year
    */
    public String getYear(){
        return orderDate.substring(6,8);
    }   
    
    // method to determine whether or not a string date is a valid format
    /**
     * @param validDate         The date to be validated
    */    
    private boolean isValidDate(String validDate){
        Date date = null;
        try {
            DateFormat format = new SimpleDateFormat("dd/MM/yy");
            format.setLenient(false);
            date = format.parse(validDate);
            return true;
        } catch (ParseException e) {
            return false;
        }
     }
    
    /**
     * toString method of OrderDate
     * @return OrderDate toString
    */    
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder("\n\tDate:\t");
        str.append(orderDate).append("\n");
        return str.toString();
    }
}


