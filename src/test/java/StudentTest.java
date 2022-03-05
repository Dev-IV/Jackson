import java.util.Objects;

public class StudentTest {

    private int id;
    private String name;
    private String group;

    public StudentTest(int id, String name, String group) {
        this.id = id;
        this.name = name;
        this.group = group;
    }

    public StudentTest(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !StudentTest.class.equals(obj.getClass())) return false;

        StudentTest altStudent = (StudentTest) obj;
        return this.id == altStudent.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return name + " " + group + " (" + id + ")";
    }
}