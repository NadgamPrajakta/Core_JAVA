package coreInterfaces;

import java.util.function.Supplier;

public class Supplier_12 {

    Supplier<Config> supplier;

    public Supplier_12() {
        Supplier<Config> custom = new ConfigSupplier();
        Supplier<Config> lambda = () -> new Config("127.0.0.1", 3306);

        supplier = custom;
    }

    public static void main(String[] args) {
    	Supplier_12 obj = new Supplier_12();
        Config c = obj.supplier.get();
        System.out.println("URL: " + c.url + ", Port: " + c.port);
    }
}


class Config {
    String url;
    int port;

    public Config(String url, int port) {
        this.url = url;
        this.port = port;
    }
}

class ConfigSupplier implements Supplier<Config> {

    @Override
    public Config get() {
        return new Config("localhost", 8080);
    }
}