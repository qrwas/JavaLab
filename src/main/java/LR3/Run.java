package LR3;

import LR3.Controllers.UniversityCreator;
import LR3.Models.University;

public class Run {
    public static void main(String[] args) {
        System.out.print("Hello!");
    }

    public static void CreateTypycalUniversity(){
        UniversityCreator uC = new UniversityCreator();
        University university = uC.Create();
    }
}

