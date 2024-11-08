package LR3.Models;

import java.util.List;

public class Kafedra extends BaseBasePidrozdil {

    public List<Group> groups;
    public Kafedra(String name, Human head, List<Group> groups) {
        this.name = name;
        this.head = head;
        this.groups = groups; 
    }
    
}