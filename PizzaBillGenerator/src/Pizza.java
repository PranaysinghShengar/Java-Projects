public class Pizza {

    private int price;
    private boolean veg;

    private int extraCheesePrice = 50;
    private  int extraToppingsAdded = 30;
    private int backPack = 20;

    private int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;

    public Pizza(boolean veg) {
        this.veg = veg;

        if (this.veg) {
            this.price = 100;
        }
        else {
            this.price = 300;
        }

        basePizzaPrice = this.price;
    }

    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;

    }

    public void addExtraToppings() {
        isExtraToppingsAdded = true;
        this.price += extraToppingsAdded;
    }

    public void takeAway() {
        isOptedForTakeAway = true;
        this.price += backPack;
    }

    public void getBill() {

        String bill = "";
        System.out.println("Pizza price is: "+"Rs "+basePizzaPrice+"/-");
        if (isExtraCheeseAdded) {
            bill += "Extra Cheese Added " +"Rs "+ extraCheesePrice + "/-"+ "\n";
        }
        if (isExtraToppingsAdded) {
            bill += "Extra Toppings Added " +"Rs "+ extraToppingsAdded +"/-"+ "\n";
        }
        if (isOptedForTakeAway) {
            bill += "Opted for Take Away " +"Rs "+ backPack +"/-"+ "\n";
        }

        bill += "Bill of Pizza is: " +"Rs "+ this.price +"/-"+ "\n";
        System.out.println(bill);
    }
}
