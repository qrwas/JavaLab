package LR3.Controllers;

import LR3.Models.Human;
import LR3.Models.Sex;

public abstract class HumanCreator {
    public Human Create(String name, String prizvishe, String pobatkovu, Sex sex){
        return new Human(name, prizvishe, pobatkovu, sex);
    }
}
