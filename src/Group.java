public class Group {
    String groupName;
    String startDate;
    String mentor;
    Person person = new Person();

    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", startDate='" + startDate + '\'' +
                ", mentor='" + mentor + '\'' +
                ", person=" + person +
                '}';
    }
}
