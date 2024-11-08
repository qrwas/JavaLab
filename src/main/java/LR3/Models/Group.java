package LR3.Models;

import java.util.List;

public class Group extends BaseDivision {

    public List<Student> students;
    
    public Group(String name, Human head, List<Student> students) {
        this.name = name;
        this.head = head;
        this.students = students;
    }    
}