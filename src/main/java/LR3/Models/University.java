package LR3.Models;

import java.util.List;

public class University extends BaseDivision {

    public List<Faculty> facultets;
    public University(String name, Human head, List<Faculty> facultets) {
        this.name = name;
        this.head = head;
        this.facultets = facultets;
    }
    
}