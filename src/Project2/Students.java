package Project2;

public class Students {
    private int id;
    private String name;
    private int age;
    private String course;
    private String grade;

    public Students(){}

    public Students( String name, int agr , String course,String grade){
        this.name = name;
        this.age = agr;
        this.course = course;
        this.grade = grade;
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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getCourse(){
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public String getGrade(){
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString(){
        return id + " | " + name + " | " + age + " | " + course + " | " + grade;
    }
}
