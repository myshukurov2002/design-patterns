package creational.abstract_factory_method.computer_factory;

public class LCDMonitor implements Monitor{
    @Override
    public void show() {
        System.out.println("lcd");
    }
}
