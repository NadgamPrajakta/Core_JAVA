package coreInterfaces;

import java.util.function.Supplier;

public class Supplier_16 {

    Supplier<Settings> supplier;

    public Supplier_16() {
        Supplier<Settings> custom = new SettingsSupplier();
        Supplier<Settings> lambda = () -> new Settings("Dark Mode", false);

        supplier = custom;
    }

    public static void main(String[] args) {
    	Supplier_16 obj = new Supplier_16();
        Settings s = obj.supplier.get();
        System.out.println("Theme: " + s.theme + ", Notifications: " + s.notifications);
    }
}


class Settings {
    String theme;
    boolean notifications;

    public Settings(String theme, boolean notifications) {
        this.theme = theme;
        this.notifications = notifications;
    }
}

class SettingsSupplier implements Supplier<Settings> {

    @Override
    public Settings get() {
        return new Settings("Light Mode", true);
    }
}