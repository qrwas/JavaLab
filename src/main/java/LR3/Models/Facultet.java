package LR3.Models;

public class Facultet extends BaseBasePidrozdil {

    public Kafedra kafedra;
    public Facultet(String name, Human head, Kafedra kafedra) {
        this.name = name;
        this.head = head;
        this.kafedra = kafedra;
    }
    
}