package method_references;
import java.util.function.Consumer;

public class ArbitraryObjMethod_3 {
	
    public static void main(String[] args) {
    	
        Consumer<Device> c = Device::showDevice;
        c.accept(new Device());
    }
}


class Device {
	
    void showDevice() 
    {
        System.out.println("Smart Device");
    }
}
