package LR3.Controllers;

import java.util.Scanner;

import LR3.Models.Group;
import LR3.Models.Human;
import LR3.Models.Student;

public class GroupCreator {
    public Group Create(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name University: ");
        String name = scanner.nextLine();
        System.out.print("Create Head: ");
        Human head = new HumanCreator().Create(); 

        Student student = new StudentCreator().Create();
        scanner.close();
        return new Group(name, head);
    }
}
