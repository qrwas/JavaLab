package LR3.Models;

public class Human {
    public String name;
    public String prizvishe;
    public String popatkovy;
    public Sex sex;
    public Human(String name, String prizvishe, String popatkovy, Sex sex) {
        this.name = name;
        this.prizvishe = prizvishe;
        this.popatkovy = popatkovy;
        this.sex = sex;
    }
    public Human() {
        //TODO Auto-generated constructor stub
    }
}