package LR3.Controllers;
import LR3.Models.Human;
import LR3.Models.Student;

public class StudentCreator {
    public Student Create(){
    Human human = new HumanCreator().Create();

    return new Student(human.name, human.prizvishe, human.popatkovy, human.sex);
    }
}
