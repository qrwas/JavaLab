package LR3.Controllers;

import LR3.Models.Facultet;
import LR3.Models.Human;

public class FacultetCreator {
    public Facultet Create(String name, Human head){
        return new Facultet(name, head);
    }
}
