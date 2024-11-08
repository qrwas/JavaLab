package LR3.Models;

public class Human {
    public String name;
    public String surname;
    public String patronymic;
    public Sex sex;

    public Human(String name, String surname, String patronymic, Sex sex) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.sex = sex;
    }

}