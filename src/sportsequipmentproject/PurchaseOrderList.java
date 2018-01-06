package sportsequipmentproject;
import java.util.ArrayList;

/**
 * A class to model an array list of purchases
 */
public class PurchaseOrderList {
    private ArrayList<PurchaseOrder> PurchaseOrderList;
    
    /**
    * Creates an empty PurchaseOrderList.
    */
    public PurchaseOrderList() {
        PurchaseOrderList = new ArrayList<PurchaseOrder>();
    }
    
    /**
    * Store details of a new Purchase Order into the PurchaseOrderList.
    * @param newPurchase    The Customer details to be stored.
    */
    public void addPurchaseOrder(PurchaseOrder newPurchase){
        PurchaseOrderList.add(newPurchase);
    }
    
    /**
    * @return the number of orders currently in the PurchaseOrderList.
    */
    public int numberOfPurchaseOrders(){
        return PurchaseOrderList.size();
    }
  
    /**
    * @return an array containing all the purchase orders in this
    * list, if this list is not empty, otherwise null.
    */
    public PurchaseOrder [] getPurchaseOrders() {
        if(!PurchaseOrderList.isEmpty()){
           PurchaseOrder[] OrderArray = new PurchaseOrder[PurchaseOrderList.size()];
           return PurchaseOrderList.toArray(OrderArray);
        } else {
            return null;
        }
    }

    /**
    * Clears the PurchaseOrderList.
    */
    public void clearPurchaseOrderList() {
        PurchaseOrderList.clear();
    }
    
    /**
    * @return the list of orders
    */
    @Override
    public String toString(){
        StringBuilder orderList = new StringBuilder();
        for (PurchaseOrder nextOrder : PurchaseOrderList ){
            orderList.append(nextOrder).append("\n");
        }
        return orderList.toString();
    }
    
}
