public class MobilePhoneDetails {
    public static void main(String[] args){
        MobilePhone samsung = new MobilePhone("Samsung","S24 Ultra",120000);
        MobilePhone apple = new MobilePhone("Apple", "16 pro", 115000);
        samsung.getDetails();
        apple.getDetails();
    }
}
class MobilePhone{
    private String brand;
    private String model;
    private int price;
    public MobilePhone(String brand,String model,int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public void getDetails(){
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: INR " + price);
    }
}
