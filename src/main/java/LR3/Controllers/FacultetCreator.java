package LR3.Controllers;

import java.util.Scanner;

import LR3.Models.Facultet;
import LR3.Models.Human;
import LR3.Models.Kafedra;

public class FacultetCreator {
    public Facultet Create(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name Facultet: ");
        String name = scanner.nextLine();
        System.out.print("Create Head: ");
        Human head = new HumanCreator().Create(); 
        System.out.print("Create Kafedra: \n ");
        Kafedra kafedra = new KafedraCreator().Create();
        scanner.close();
        return new Facultet(name, head, kafedra);
    }
}
