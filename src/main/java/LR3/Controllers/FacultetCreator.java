package LR3.Controllers;

import java.util.ArrayList;
import java.util.List;
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
        System.out.print("Create Kafedras: \n ");

        List<Kafedra> kafedras = new ArrayList<Kafedra>();
        System.out.print("Input count: \n");
        int count = scanner.nextInt(); // Зчитування як ціле число

        for (int i = 0; i < count; i++) {
            Kafedra kafedra = new KafedraCreator().Create(); // Створення нового Facultet
            kafedras.add(kafedra); // Додавання до списку
            System.out.println("Facultet " + (i + 1) + " created.");
        }

       
        scanner.close();
        return new Facultet(name, head, kafedras);
    }
}
