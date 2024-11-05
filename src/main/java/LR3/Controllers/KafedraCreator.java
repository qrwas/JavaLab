package LR3.Controllers;

import java.util.Scanner;

import LR3.Models.Facultet;
import LR3.Models.Human;
import LR3.Models.Kafedra;

public class KafedraCreator {
    public Kafedra Create(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name University: ");
        String name = scanner.nextLine();
        System.out.print("Create Head: ");
        Human head = new HumanCreator().Create(); 

        Facultet facultet = new FacultetCreator().Create();
        scanner.close();
        return new Kafedra(name, head);
    }
}
