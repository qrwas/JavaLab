package LR3.Models;

public class Kafedra extends BaseBasePidrozdil {

    public Group group;
    public Kafedra(String name, Human head, Group group) {
        this.name = name;
        this.head = head;
        this.group = group; 
    }
    
}