/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportsequipmentproject;

/**
 *
 * @author Parkesy
 */
public class IllegalCustomerIDexception extends Exception {

    /**
     * Creates a new instance of <code>IllegalCustomerIDexception</code> without
     * detail message.
     */
    public IllegalCustomerIDexception() {
    }

    /**
     * Constructs an instance of <code>IllegalCustomerIDexception</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public IllegalCustomerIDexception(String msg) {
        super(msg);
    }
}
