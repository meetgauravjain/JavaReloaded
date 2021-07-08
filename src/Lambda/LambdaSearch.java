package Lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaSearch {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("fish",false,true));
        animalList.add(new Animal("kangaroo",true,false));
        animalList.add(new Animal("fish",true,false));
        animalList.add(new Animal("fish",false,true));
        print(animalList, a -> a.isCanHop());
        print(animalList, a -> a.isCanSwim());
        //Note - In LambdaSearch CheckIfSwim and CheckIfHopper Class is not used
    }
    private static void print(List<Animal> animalList, CheckTrait checkTrait) {
        for (Animal animal:animalList) {
            if (checkTrait.test(animal))
                System.out.println(animal + " ");
        }
        System.out.println();
    }

}
