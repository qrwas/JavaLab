package LR3.Controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import LR3.Models.Group;
import LR3.Models.Human;
import LR3.Models.Kafedra;

public class KafedraCreator {
    public Kafedra Create(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name Kafedra: ");
        String name = scanner.nextLine();
        System.out.print("Create Head: ");
        Human head = new HumanCreator().Create(); 
        System.out.print("Create Group: \n");

        List<Group> Groups = new ArrayList<Group>();
        System.out.print("Input count: \n");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            Group group = new GroupCreator().Create();
            Groups.add(group); 
            System.out.println("Group " + (i + 1) + " created. \n");
        }

        scanner.close();
        return new Kafedra(name, head, Groups);
    }
}
