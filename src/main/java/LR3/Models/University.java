package LR3.Models;

public class University extends BaseBasePidrozdil {

    public Facultet facultet;
    public University(String name, Human head, Facultet facultet) {
        this.name = name;
        this.head = head;
        this.facultet = facultet;
    }
    
}