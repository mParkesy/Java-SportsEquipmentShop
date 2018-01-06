package sportsequipmentproject;

/**
 * A class to model  a name of a customer
 */
public class Name {
    private String title;
    private String surname;
    private String initials;
    
        /**
     * Creates a new instance of Name
     * @param inpTitle          private customers preferred title
     * @param inpSurname        private customers last name
     * @param newInitials       private customers initials
     */
    public Name(String inpTitle, String inpSurname, String newInitials) {
        title = inpTitle;
        surname = inpSurname;
        initials = newInitials;
    }
    /**
     * @param newTitle         The title to be set
    */
    public void setTitle(String newTitle){
        title = newTitle;
    }
    /**
     * @param newSurname         The surname to be set
    */        
    public void setSurname(String newSurname){
        title = newSurname;
    }
    /**
     * @param newInitials           The initials to be set
    */
    public void setInitials(String newInitials) {
        initials = newInitials;
    }
    /**
     * @return title          
    */    
    public String getTitle(){
        return title;
    }
    /**
     * @return surname         
    */      
    public String getSurname(){
        return surname;
    }
    /**
     * @return initials          
    */      
    public String getInitials(){
        return initials;
    }

    /**
     * toString method of Name
     * @return Name toString
    */    
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder("\n\tTitle:\t");
        str.append(title).append("\n\tInitials:\t");
        str.append(initials).append("\n\tSurname:\t");
        str.append(surname).append("\n");
        return str.toString();
    }
}
