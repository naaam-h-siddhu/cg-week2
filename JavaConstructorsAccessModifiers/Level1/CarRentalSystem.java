public class CarRentalSystem {
    public static void main(String[] args){
        CarRental aura = new CarRental("Mohan","Hundai aura",12,1300);
        aura.getTotalCost();
    }
}
class CarRental{
    private String customerName;
    private String carModel;
    private int rentalDays;
    private int costPerDay;


    public CarRental(String customerName, String carModel, int rentalDays,int costPerDay){
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = costPerDay;
    }
    private int totalCost(){
        return rentalDays*costPerDay;
    }
    public void getTotalCost(){
        System.out.println("total cost for "+rentalDays+" days : "+totalCost());
    }

}
