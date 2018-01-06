package sportsequipmentproject;
import java.util.Scanner;
import java.io.File; 
import java.io.FileNotFoundException; 
/**
 * A class to test the SportsEquipmentDemo
 */
public class SportsEquipmentProject {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{    
            
            // testing the constructors by creating test instances of each class
            Product testProduct = new Product("AA/123", 10);
            OrderDate testDate = new OrderDate("22/03/17");
            Name testName = new Name("Mr", "Matt", "Parkes");
            PurchaseOrder testOrder = new PurchaseOrder(testDate, "PSE-123", testProduct, 10, 15);
            Address testAddress = new Address("86, University Drive", "Norwich", "NR4 7TJ");           
            CustomerDetails testPCustomer = new PrivateCustomerDetails("PSE-1234", testAddress, testName);
            CustomerDetails testSportsClub = new SportsClubDetails("CSE-1234", testAddress, "BSCC");
            
            
            int choice = 0;
            while(choice < 9) {
                System.out.println("");
                System.out.println("1 - Product Class\n"
                        + "2 - OrderDate Class\n"
                        + "3 - Name Class\n"
                        + "4 - Purchase Order Class\n"
                        + "5 - Address Class\n"
                        + "6 - PrivateCustomerDetails Class\n"
                        + "7 - SportsClubDetails Class\n"
                        + "8 - Test Reading From Files\n"
                        + "9 - Exit Program"
                );
                System.out.println("");
                System.out.print("Please type the corresponding number from the list above to test that class or quit the program: ");
                choice = scan.nextInt();
                
                System.out.println();
                
                switch (choice) {
                    case 1:
                        System.out.println("Testing Product Class:"); 
                        System.out.println(" - toString Method - ");
                        // testing toString method
                        System.out.println(testProduct);
                        
                        System.out.println(" - Set Methods - ");
                        // testing set methods
                        System.out.print("Enter a new Unit Price to set: ");
                        Double newPrice = scan.nextDouble();
                        scan.nextLine();
                        System.out.print("Enter a new Product Code to set: ");
                        String newCode = scan.nextLine();
                        // testing the two set methods
                        testProduct.setProductCode(newCode);
                        testProduct.setUnitPrice(newPrice);
                        
                        System.out.println(" - Get Methods - ");
                        // test get methods
                        if (testProduct.getProductCode() != null)
                           System.out.println("Product Code is: "+ testProduct.getProductCode());
                        else
                            System.out.println("Product instance was not created correctly.");

                        System.out.println("Unit Price is: "+ testProduct.getUnitPrice());
                        
                        
                        break;
                    case 2:
                        System.out.println("Testing OrderDate class:");
                        System.out.println(" - toString Method - ");
                        // testing toString method
                        System.out.println(testDate);
                        
                        //System.out.println(" - Set Methods - ");
                        // testing set methods       
                        //System.out.print("Enter a new date in format dd/mm/yyyy: ");
                        //String newDate = scan.nextLine();
                        //scan.nextLine();
                        // testing the set method
                        //testDate.setOrderDate(newDate);
                        
                        System.out.println(" - Get Methods - ");
                        // test get methods
                       
                        if (testDate.getDay() != null)
                            System.out.println("Day is: " + testDate.getDay());
                        else
                           System.out.println("Failed to get day from OrderDate instance."); 
                        if (testDate.getMonth() !=  null)
                            System.out.println("Month is: " + testDate.getMonth());
                        else
                           System.out.println("Failed to get month from OrderDate instance.");         
                        if (testDate.getYear() != null)
                            System.out.println("Year is: " + testDate.getYear());
                        else
                           System.out.println("Failed to get year from OrderDate instance.");
                        
                        break;
                    case 3:
                        System.out.println("Testing Name class:");
                        System.out.println(" - toString Method - ");
                        // testing toString method
                        System.out.println(testName);
                        System.out.println(" - Set Methods - ");
                        // testing set methods
                        System.out.print("Enter a new title: ");
                        String newTitle = scan.nextLine();
                        scan.nextLine();
                        System.out.print("Enter a new surname: ");
                        String newSurname = scan.nextLine();
                        scan.nextLine();
                        System.out.print("Enter new initials: ");
                        String newInitials = scan.nextLine();
                        
                        // testing the three set methods
                        testName.setTitle(newTitle);
                        testName.setSurname(newSurname);
                        testName.setInitials(newInitials);
                        
                        System.out.println(" - Get Methods - ");
                        // test get methods
                        if(testName.getTitle() != null)
                            System.out.println("Title: "+ testName.getTitle());
                        else
                            System.out.println("Failed to get title from Name instance.");
        
                        if(testName.getSurname() != null)
                            System.out.println("Surname: "+ testName.getSurname());
                        else
                            System.out.println("Failed to get surname from Name instance.");

                        if(testName.getInitials() != null)
                            System.out.println("Initials: "+ testName.getInitials());
                        else
                            System.out.println("Failed to get initials from Name instance.");
                        
                        break;
                    case 4:
                        System.out.println("Testing PurchaseOrder class:");
                        System.out.println(" - toString Method - ");
                        // testing toString method
                        System.out.println(testOrder);
                        System.out.println(" - Get Methods - ");
                        // test get methods
                        if(testOrder.getDateOfOrder() != null)
                            System.out.println("Date of Order:" + testOrder.getDateOfOrder().getOrderDate());
                        else
                            System.out.println("Failed to get the date of order from PurchaseOrder instance.");

                        if(testOrder.getCustomerID() != null)
                            System.out.println("Customer ID:" + testOrder.getCustomerID());
                        else
                            System.out.println("Failed to get the Customer ID from PurchaseOrder instance.");

                        if(testOrder.getProductType() != null)
                            System.out.println("Product Type:" + testOrder.getProductType().getProductCode());
                        else
                            System.out.println("Failed to get the product type from PurchaseOrder instance.");

                        System.out.println("Order Value:" + testOrder.getValueOfOrder());
                        System.out.println("Invoice Amount:" + testOrder.getInvoiceAmount());
                        break;
                    case 5:
                        System.out.println("Testing Address class:");
                        System.out.println(" - toString Method - ");
                        // testing toString method
                        System.out.println(testAddress);
                        System.out.println(" - Set Methods - ");
                        // testing set methods
                        System.out.print("Enter a new House Number and Street Name: ");
                        String newStreetName = scan.nextLine();
                        scan.nextLine();
                        System.out.print("Enter a new City: ");
                        String newCity = scan.nextLine();
                        scan.nextLine();
                        System.out.print("Enter a new postcode: ");
                        String newPostCode = scan.nextLine();
                        // testing the three set methods
                        testAddress.setStreetName(newStreetName);
                        testAddress.setCity(newCity);
                        testAddress.setPostcode(newPostCode);
                        
                        System.out.println(" - Get Methods - ");
                        // test get methods
                        if(testAddress.getStreetName() != null)
                            System.out.println("House Number and Street Name: " + testAddress.getStreetName());
                        else
                            System.out.println("Failed to get the street name from Address instance.");
                        if(testAddress.getCity() != null)
                            System.out.println("City: " + testAddress.getCity());
                        else
                            System.out.println("Failed to get the city from address instance.");
                        if(testAddress.getPostcode() != null)
                            System.out.println("Postcode: " + testAddress.getPostcode());
                        else
                            System.out.println("Failed to get postcode from address instance.");
                        break;
                    case 6:
                        System.out.println("Testing Private Customer Details class:");
                        System.out.println(" - toString Method - ");
                        // testing toString method
                        System.out.println(testPCustomer);
                        System.out.println(" - Set Methods - ");
                        // testing set methods
                        System.out.print("Enter a new Customer ID: ");
                        String newCustomerID = scan.nextLine();
                        scan.nextLine();
                        testPCustomer.setCustomerID(newCustomerID);
            
                        System.out.println(" - Get Methods - ");
                        // test get methods
                        if(testPCustomer.getCustomerID() != null)
                            System.out.println("Customer ID: "+ testPCustomer.getCustomerID());
                        else
                            System.out.println("Failed to get customer ID from Private Customer instance.");

                        if(testPCustomer.getAddress() != null)
                            System.out.println("Address: "+ testPCustomer.getAddress());
                        else
                            System.out.println("Failed to get address from Private Customer instance.");

                        if(testPCustomer.getRegionalCode() != null)
                            System.out.println("Regional Code: "+ testPCustomer.getRegionalCode());
                        else
                            System.out.println("Failed to get regional code from Private Customer instance.");
                        
                        System.out.println("Discount: "+ testPCustomer.getDiscount());
                        System.out.println("Total Value of Orders: "+ testPCustomer.getTotalValueOfOrders());
                        
                        break;
                    case 7:
                        System.out.println("Testing Sports Club Details class:");
                        System.out.println(" - toString Method - ");
                        // testing toString method
                        System.out.println(testSportsClub);
                        System.out.println(" - Set Methods - ");
                        // testing set methods
                        System.out.print("Enter a new Customer ID: ");
                        String newSportsID = scan.nextLine();
                        scan.nextLine();
                        testSportsClub.setCustomerID(newSportsID);
            
                        System.out.println(" - Get Methods - ");
                        // test get methods
                        if(testSportsClub.getCustomerID() != null)
                            System.out.println("Sports Club Customer ID: "+ testSportsClub.getCustomerID());
                        else
                            System.out.println("Failed to get customer ID from Sports Customer Details instance.");

                        if(testSportsClub.getAddress() != null)
                            System.out.println("Address: "+ testSportsClub.getAddress());
                        else
                            System.out.println("Failed to get address from Sports Customer Details instance.");

                        if(testSportsClub.getRegionalCode() != null)
                            System.out.println("Regional Code: "+ testSportsClub.getRegionalCode());
                        else
                            System.out.println("Failed to get regional code from Sports Customer Details instance.");
                        
                        System.out.println("Discount: "+ testSportsClub.getDiscount());
                        System.out.println("Total Value of Orders: "+ testSportsClub.getTotalValueOfOrders());
                        
                        break;
                    case 8:
                        readFiles(); 
                        break;   
                    case 9:
                        System.exit(0);
                }

            }
        }catch(Exception e){
           System.out.println(e);            
        }         
    }
    
    /**
     * method to read in data files
     * @throws java.io.FileNotFoundException
     * @throws sportsequipmentproject.InvalidProductCodeException
     * @throws sportsequipmentproject.IllegalDateFormatException
     * @throws sportsequipmentproject.IncorrectPurchaseOrderException
     * @throws sportsequipmentproject.CustomerNotFoundException
    */    
    public static void readFiles() throws FileNotFoundException, InvalidProductCodeException, IllegalDateFormatException, CustomerNotFoundException, IncorrectPurchaseOrderException{
        // product data import
        File file1 = new File("productData.txt");
        Scanner scannerProduct = new Scanner(file1);
        // get first line from file
        String numberProducts = scannerProduct.nextLine();
        // convert string to int for size of array
        int arraySize = Integer.parseInt(numberProducts);
        // create array of products
        Product [] productArray = new Product[arraySize];
        // get second line from file
        String productCodesList = scannerProduct.nextLine();
        // get third line from file
        String pricePerUnitList = scannerProduct.nextLine();
        // split lists based on delimeter
        String[] productCodes = productCodesList.split("#");
        String[] productPrices = pricePerUnitList.split("#");
        // fill the array of products with the codes and prices
        for(int i = 0; i < productCodes.length; i++){
            productArray[i] = new Product(productCodes[i],Double.parseDouble(productPrices[i]));
        }    
        
        // create new instance of SportsEquipmentSupplier
        SportsEquipmentSupplier newSupplier = new SportsEquipmentSupplier(productArray,1, 2013);
        
        // cutsomer details import
        File file2 = new File("CustomerData.txt");
        Scanner scannerCustomer = new Scanner(file2);
        
        // make new instance of customerDetailsList
        CustomerDetailsList customerList = new CustomerDetailsList();
        
        // read each line of the file using the scanner until end of file is reached
        while(scannerCustomer.hasNext()){
            // split each line into an array
            String[] customerLine = scannerCustomer.nextLine().split("/");
            // store the relevant elements from the array
            String listStreetName;            
            String listCustomerID = customerLine[0];
            String listCity;
            String listPostCode;
            // create a new instance of an address using elements
            Address newCustomerAddress;
            try {
                // check if a sports club or private customer
                if(listCustomerID.charAt(0) == ('C')){
                    // store appropriate values from file
                    listStreetName = customerLine[2];
                    listCity = customerLine[3];
                    listPostCode = customerLine[4];
                    // store a new address instance
                    newCustomerAddress = new Address(listStreetName, listCity, listPostCode);
                    String sportsClubName = customerLine[1];
                    // add a new sports club to suppliers customer list
                    customerList.addCustomer(new SportsClubDetails(listCustomerID, newCustomerAddress, sportsClubName));
                } else {
                    // store appropriate values from file
                    listStreetName = customerLine[4];
                    listCity = customerLine[5];
                    listPostCode = customerLine[6];
                    // store a new address instance
                    newCustomerAddress = new Address(listStreetName, listCity, listPostCode);
                    String listTitle = customerLine[1];
                    String listInitials = customerLine[2];
                    String listSurname = customerLine[3];
                    // create a new name instance based on file
                    Name pCustomerName = new Name(listTitle, listInitials, listSurname);
                    // add a new private customer to the customer list
                    customerList.addCustomer(new PrivateCustomerDetails(listCustomerID, newCustomerAddress, pCustomerName));
                }
            } catch(IllegalCustomerIDexception e) {
                System.out.println(e);
            }
        }
        System.out.println("There are: "+ customerList.numberOfCustomers() +" customers that have been imported from the file."); 
        System.out.println();
        // import purchase order data
        File file3 = new File("PurchaseOrderData.txt");
        Scanner scannerData = new Scanner(file3);
        
        //create new purchase list
        PurchaseOrderList purchaseList = new PurchaseOrderList();
        
        // scan through each line of the file
        while(scannerData.hasNext()){
            // split file based on months - @ sign
            String[] purchaseLine = scannerData.nextLine().split("#");
            // store relevant elements from the array
            String newDate = purchaseLine[0];
            String newCustomerID = purchaseLine[1];
            String newProductCode = purchaseLine[2];
            String stringQuantity = purchaseLine[3];
            
            int newQuantity;
           // check end character, remove if @ sign or blank space
            switch (stringQuantity.charAt(stringQuantity.length()-1)) {
                case '@':
                    newQuantity = Integer.parseInt(stringQuantity.substring(0, stringQuantity.length() -1));
                    break;                     
                case ' ':
                    newQuantity = Integer.parseInt(stringQuantity.substring(0, stringQuantity.length() -1));
                    break;
                default:
                    newQuantity = Integer.parseInt(stringQuantity);
                    break;
            }
            // find the customer and store it
            CustomerDetails checkCustomer = customerList.findCustomer(newCustomerID);
            // add the customer to the suppliers customer list
            newSupplier.addNewCustomer(checkCustomer);
            // add the purchase order to the suppliers purchase list
            newSupplier.addNewPurchaseOrder(newDate, newCustomerID, newProductCode, newQuantity);

            int afterPurchaseDiscount = checkCustomer.getDiscount();
            // if the customer ius a private customer, output their ID and discount rate
            if(checkCustomer.getCustomerID().charAt(0) == ('P')) {
                System.out.println("Customer ID: " + newCustomerID);
                System.out.println("Current Discount Rate: " + afterPurchaseDiscount);
            }
            // if the last character was an @ update the suppliers month
            if(stringQuantity.charAt(stringQuantity.length() -1) == ('@')){
                newSupplier.updateMonth();
            }
        }   
    }
}
