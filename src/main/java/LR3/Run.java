package LR3;

import LR3.Controllers.UniversityCreator;
import LR3.Models.University;

public class Run {
    public static void main(String[] args) {
        new Run().createTypycalUniversity();
    }

    public void createTypycalUniversity(){
        UniversityCreator uC = new UniversityCreator();
        University university = uC.create();
    }
}

