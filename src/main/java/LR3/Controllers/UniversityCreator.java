package LR3.Controllers;

import java.util.Scanner;

import LR3.Models.Human;
import LR3.Models.Kafedra;
import LR3.Models.University;

public class UniversityCreator {
    public University Create(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name University: ");
        String name = scanner.nextLine();
        System.out.print("Create Head: ");
        Human head = new HumanCreator().Create(); 

        Kafedra kafedra = new KafedraCreator().Create();
        scanner.close();
        return new University(name, head);
    }
}
