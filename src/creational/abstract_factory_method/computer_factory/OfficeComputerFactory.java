package creational.abstract_factory_method.computer_factory;

public class OfficeComputerFactory implements ComputerFactory{
    @Override
    public Processor createProcessor() {
        return new AMDProcessor();
    }

    @Override
    public Monitor createMonitor() {
        return new LEDMonitor();
    }
}
