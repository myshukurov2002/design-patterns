package creational.abstract_factory.gui_example;

public class WindowsButton implements Button{

    @Override
    public void click() {
        System.out.println("Windows Button Clicked");
    }
}
