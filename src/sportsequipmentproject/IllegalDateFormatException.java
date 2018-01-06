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
public class IllegalDateFormatException extends Exception {

    /**
     * Creates a new instance of <code>IllegalDateFormatException</code> without
     * detail message.
     */
    public IllegalDateFormatException() {
    }

    /**
     * Constructs an instance of <code>IllegalDateFormatException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public IllegalDateFormatException(String msg) {
        super(msg);
    }
}
