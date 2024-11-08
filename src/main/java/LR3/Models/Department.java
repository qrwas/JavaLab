package LR3.Models;

import java.util.List;

public class Department extends BaseDivision {

    public List<Group> groups;
    
    public Department(String name, Human head, List<Group> groups) {
        this.name = name;
        this.head = head;
        this.groups = groups; 
    }
    
}