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
public class InvalidProductCodeException extends Exception {

    /**
     * Creates a new instance of <code>InvalidProductCodeException</code>
     * without detail message.
     */
    public InvalidProductCodeException() {
    }

    /**
     * Constructs an instance of <code>InvalidProductCodeException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public InvalidProductCodeException(String msg) {
        super(msg);
    }
}
