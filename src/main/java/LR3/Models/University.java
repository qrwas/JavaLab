package LR3.Models;

import java.util.List;

public class University extends BaseBasePidrozdil {

    public List<Facultet> facultets;
    public University(String name, Human head, List<Facultet> facultets) {
        this.name = name;
        this.head = head;
        this.facultets = facultets;
    }
    
}