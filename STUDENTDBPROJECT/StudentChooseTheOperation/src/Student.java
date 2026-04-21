public class Student {
    private int id;
    private String name;
    private int mark;
    private String email;
    public Student(int id, String name, int mark, String email) {
        this.id = id;
        this.name = name;
        this.mark = mark;
        this.email = email;
    }

    public int getId() {
        return id;
    }
    public int getMark() {
        return mark;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setMark(int mark) {
        this.mark = mark;
    }
}
