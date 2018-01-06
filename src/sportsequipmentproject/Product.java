package sportsequipmentproject;

/**
 * A class to model a product that would be sold
 */
public class Product {
    private String productCode;
    private double pricePerUnit;
    
    
    /**
     * Creates a new instance of Product
     * @param code          A product code
     * @param ppUnit        The price per unit
     * @throws sportsequipmentproject.InvalidProductCodeException
    */
    public Product(String code, double ppUnit)
            throws InvalidProductCodeException {
        if(isValidProductCode(code)){
            this.productCode = code;
            this.pricePerUnit = ppUnit;
        } else {
            throw new InvalidProductCodeException
                                        ("Given product code has incorrect format.");
        }
    }
    
    /**
     * Get method for Product Code
     * @return The product code
    */
    public String getProductCode(){
        return productCode;
    }
    
    /**
     * Get method for Unit Price
     * @return The unit price
    */
    public double getUnitPrice(){
        return pricePerUnit;
    }
    
    /**
     * Set method for Product Code
     * @param pCode         The product code to be set
    */
    public void setProductCode(String pCode){
        productCode = pCode;
    }
    
    /**
     * Set method for Unit Price
     * @param unitPrice     The unit price to be set
    */
    public void setUnitPrice(double unitPrice){
        pricePerUnit = unitPrice;
    }
    
    // method to determine whether or not a product code is a valid format
    private boolean isValidProductCode(String code){
        return code.matches("([a-zA-Z]{2})\\/([0-9]{3})");   
    }
    
    /**
     * toString method of product
     * @return Product toString
    */
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder("\n\tProduct Cocde:\t");
        str.append(productCode).append("\n\tPrice Per Unit:\t");
        str.append(pricePerUnit).append("\n");
        return str.toString();
    }
}
