package Lambda;

public class ChechIfSwim implements CheckTrait{

    @Override
    public boolean test(Animal a) {
        return a.isCanSwim();
    }
}