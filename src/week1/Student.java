package week1;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.sql.SQLOutput;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private String name;
    private int id;
    private String group;
    private String email;
    // TODO: khai báo các phương thức getter, setter cho Student
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getGroup(){
        return group;
    }
    public void setGroup(String group){
        this.group=group;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    /**
     * Constructor 1
     */
    Student() {
        // TODO:
        name="Student";
        id=000;
        group="INT22041";
        email="uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, int sid, String em) {
        // TODO:
        this.name= n;
        this.id = sid;
        this.email = em;
        group="INT22041";
    }

    /**
     * Constructor 3
     * @param 's'
     */
    Student(Student s) {
        // TODO:
    this.name=s.getName();
    this.id=s.getId();
    this.group=s.getGroup();
    this.email=s.getEmail();

  }

    String getInfo() {
        // TODO:
        return "Name: " + this.name + "\n"
                + "Id: " + this.id   + "\n"
                + "Group: " + this.group + "\n"
                + "Email: " + this.email;
    }
}
