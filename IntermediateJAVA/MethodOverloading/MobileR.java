package MethodOverloading;

public class MobileR {

    // Recharge by mobile number
    public void recharge(String mobileNumber, double amount) {
        System.out.println("Recharged " + mobileNumber + " with ₹" + amount);
    }

    // Recharge by plan name
    public void recharge(String planName) {
        System.out.println("Activated plan: " + planName);
    }

    // Recharge with promo code
    public void recharge(String mobileNumber, double amount, String promoCode) {
        System.out.println("Recharged " + mobileNumber + " with ₹" + amount + " using promo code: " + promoCode);
    }

    public static void main(String[] args) {
        MobileR recharge = new MobileR();

        recharge.recharge("9876543210", 199);
        recharge.recharge("Unlimited Plan 499");
        recharge.recharge("9876543210", 299, "SAVE20");
    }
}
