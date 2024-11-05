package LR3.Models;

public class Group extends BaseBasePidrozdil {

    public Student student;
    public Group(String name, Human head, Student student) {
        this.name = name;
        this.head = head;
        this.student = student;
    }    
}