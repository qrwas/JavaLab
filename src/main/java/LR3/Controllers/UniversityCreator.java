package LR3.Controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import LR3.Models.Human;
import LR3.Models.Faculty;
import LR3.Models.University;

public class UniversityCreator {
    public University create(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name University: ");
        String name = scanner.nextLine();
        System.out.print("Create Head: ");
        Human head = new HumanCreator().create(); 
        System.out.print("Create Facultets: \n");
        List<Faculty> facultets = new ArrayList<Faculty>();
        System.out.print("Input count: \n");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            Faculty facultet = new FacultyCreator().create();
            facultets.add(facultet);
            System.out.println("Facultet " + (i + 1) + " created. \n");
        }
        scanner.close();
        return new University(name, head, facultets);
    }
}
