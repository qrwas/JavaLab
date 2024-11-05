package LR3.Controllers;

import java.util.Scanner;

import LR3.Models.Human;
import LR3.Models.Sex;

public class HumanCreator {
    public Human Create(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter prizvishe: ");
        String prizvishe = scanner.nextLine();
        System.out.print("Enter pobatkovy: ");
        String pobatkove = scanner.nextLine();
        
        System.out.print("Enter sex. male or famele: ");
        String sexS = scanner.nextLine();
        Sex sex;
        if (sexS.equals("male"))
            sex = Sex.male;
        else if (sexS.equals("famele"))
            sex = Sex.famele;
        else {
            sex = Sex.male;
            System.out.print("Error input. Sex set to male");
        }
        scanner.close();
        return new Human(name, prizvishe, pobatkove, sex);
    }
}
