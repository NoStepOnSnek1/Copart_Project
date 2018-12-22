

public class Person
{
    //Constructor
    public Person(String firstName, String lastName, int aID)
    {
        this.FirstName = firstName;
        this.LastName = lastName;
        this.ID = aID;
    }

    /**setter that takes the variables passed and changes all variables in the constructed object */
    public void set(int aID, String aFirstName, String aLastName)
    {
        ID = aID;
        FirstName = aFirstName;
        LastName = aLastName;
    }

    public String getFirstName(){return FirstName;}
    public String getLastName() {return LastName;}
    public int getID(){return ID;}



    public String toString()
    {
        return("ID: " + ID + ", First Name: " + FirstName + ", Last Name: " + LastName + " Employee: ");
    }

    private int ID;
    private String FirstName;
    private String LastName;

}
