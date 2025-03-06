package creational.singleton;

public class SingleTon {

    private static SingleTon singleTon;

    public static SingleTon getInstance() {
        if (singleTon == null) {
            singleTon = new SingleTon();
        }
        return singleTon;
    }
}
