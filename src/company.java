import java.util.Arrays;

public class company {
    String companyName;
    String country;
    String yearOfFoundation;
    String founder;
    Group[] groups = new Group[100];
    Person person = new Person();

    public String toString() {
        return "company{" +
                "companyName='" + companyName + '\'' +
                ", country='" + country + '\'' +
                ", yearOfFoundation='" + yearOfFoundation + '\'' +
                ", founder='" + founder + '\'' +
                ", groups=" + Arrays.toString(groups) +
                ", person=" + person +
                '}';
    }
}