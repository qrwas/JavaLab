package LR3.Controllers;
import LR3.Models.Sex;
import LR3.Models.Student;

public class StudentCreator {
    public Student Create(String name, String prizvishe, String pobatkovu, Sex sex){
        return new Student(name, prizvishe, pobatkovu, sex);
    }
}
