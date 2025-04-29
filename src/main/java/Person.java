import java.util.Arrays;
/**
 * @author Jonathan Z
 * @version 17.0.1
 */
final class Person{
    // instance variables
    private String firstname;
    private String lastname;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String ssn;
    private int numberOfSiblings = 0;
    private Person[] siblings = new Person[0];

    /**
     * Constructor for Person class
     * @param firstname
     * @param lastname
     * @param birthDay
     * @param birthMonth
     * @param birthYear
     * @param ssn
     */
    public Person(String firstname, String lastname, int birthDay, int birthMonth, int birthYear, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.ssn = ssn;

    }

    /**
     * Getter for the person's first name
     * @return returns the person's first name
     */
    public String getFirstname() {
        return this.firstname;
    }

    /**
     * Setter for the person's first name
     * @param firstname0
     */
    public void setFirstname(String firstname0) {
        this.firstname = firstname0;
    }

    /**
     * Getter for the person's last name
     * @return returns the person's last name
     */
    public String getLastname() {
        return this.lastname;
    }

    /**
     * Setter for the person's last name
     * @param lastname0
     */
    public void setLastname(String lastname0) {
        this.lastname = lastname0;
    }

    /**
     * Getter for the person's birthday
     * @return returns the person's birthday in the format dd/mm/yyyy
     */
    public String getBirthday() {
        return birthDay + "/" + birthMonth + "/" + this.birthYear;
    }

    /**
     * Method that takes in Person as a parameter and adds them as a sibling to the siblings array
     * Creates a new array with the size of the current array + 1
     * Copies the current siblings array and adds the new sibling to the end of the array
     * @param sibling
     */
    public void addSibling(Person sibling) {
        Person[] newSiblings = Arrays.copyOf(this.siblings, this.siblings.length + 1); //Copies all elements from this.siblings into the new array.
        newSiblings[this.siblings.length] = sibling; //This adds the new sibling to the last position of the newSiblings array.
        this.siblings = newSiblings; //we update the siblings field of the object to point to the new array we just built.
    }

    /**
     * Getter for the persons siblings 
     * @return returns the persons siblings as an array of Person objects
     */

    public Person[] getSiblings() {
        return this.siblings;
    }
}