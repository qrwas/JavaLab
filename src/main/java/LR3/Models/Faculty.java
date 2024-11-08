package LR3.Models;

import java.util.List;

public class Faculty extends BaseDivision {

    public List<Department> kafedras;
    
    public Faculty(String name, Human head, List<Department> kafedras) {
        this.name = name;
        this.head = head;
        this.kafedras = kafedras;
    }
    
}