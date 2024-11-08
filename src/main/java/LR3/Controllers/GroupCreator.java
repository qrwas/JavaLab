package LR3.Controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import LR3.Models.Group;
import LR3.Models.Human;
import LR3.Models.Student;

public class GroupCreator {
    public Group create(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name Group: ");
        String name = scanner.nextLine();
        System.out.print("Create Head: ");
        Human head = new HumanCreator().create(); 
        System.out.print("Create Student:\n ");

        List<Student> students = new ArrayList<Student>();
        System.out.print("Input count: \n");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            Student student = new StudentCreator().create();
            students.add(student); 
            System.out.println("Student " + (i + 1) + " created. \n");
        }

       
        scanner.close();
        return new Group(name, head, students);
    }
}
