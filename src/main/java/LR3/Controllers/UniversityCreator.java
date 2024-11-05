package LR3.Controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import LR3.Models.Human;
import LR3.Models.Facultet;
import LR3.Models.University;

public class UniversityCreator {
    public University Create(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name University: ");
        String name = scanner.nextLine();
        System.out.print("Create Head: ");
        Human head = new HumanCreator().Create(); 
        System.out.print("Create Facultets: \n");
        List<Facultet> facultets = new ArrayList<Facultet>();
        System.out.print("Input count: \n");
        int count = scanner.nextInt(); // Зчитування як ціле число

        for (int i = 0; i < count; i++) {
            Facultet facultet = new FacultetCreator().Create(); // Створення нового Facultet
            facultets.add(facultet); // Додавання до списку
            System.out.println("Facultet " + (i + 1) + " created.");
        }
        scanner.close();
        return new University(name, head, facultets);
    }
}
