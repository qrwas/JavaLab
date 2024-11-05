package LR3.Controllers;

import java.util.Scanner;

import LR3.Models.Facultet;
import LR3.Models.Group;
import LR3.Models.Human;

public class FacultetCreator {
    public Facultet Create(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name University: ");
        String name = scanner.nextLine();
        System.out.print("Create Head: ");
        Human head = new HumanCreator().Create(); 
        
        Group group = new GroupCreator().Create();
        scanner.close();
        return new Facultet(name, head);
    }
}
