package LR3.Models;

import java.util.List;

public class Facultet extends BaseBasePidrozdil {

    public List<Kafedra> kafedras;
    public Facultet(String name, Human head, List<Kafedra> kafedras) {
        this.name = name;
        this.head = head;
        this.kafedras = kafedras;
    }
    
}