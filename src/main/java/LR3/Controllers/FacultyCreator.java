package LR3.Controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import LR3.Models.Faculty;
import LR3.Models.Human;
import LR3.Models.Department;

public class FacultyCreator {
    public Faculty create(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name Facultet: ");
        String name = scanner.nextLine();
        System.out.print("Create Head: ");
        Human head = new HumanCreator().create(); 
        System.out.print("Create department: \n ");

        List<Department> departments = new ArrayList<Department>();
        System.out.print("Input count: \n");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            Department department = new DepartmentsCreator().create();
            departments.add(department);
            System.out.println("Department " + (i + 1) + " created. \n");
        }

       
        scanner.close();
        return new Faculty(name, head, departments);
    }
}
