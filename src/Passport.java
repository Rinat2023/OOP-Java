public class Passport {
    int id;
    String firstName;
    String lastName;
    String gender;
    String yearOfBirth;

    public String toString() {
        return "Passport{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
