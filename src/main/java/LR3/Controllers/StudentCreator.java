package LR3.Controllers;
import LR3.Models.Human;
import LR3.Models.Student;

public class StudentCreator {
    public Student create(){
        Human human = new HumanCreator().create();
        return new Student(human.name, human.surname, human.patronymic, human.sex);
    }
}
