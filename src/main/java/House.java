public class House extends Asset{
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;
    //Constructor
    public double getValue(){
        int pricePerSquareFeet = 0;
//        if(condition == 1){
//            pricePerSquareFeet = 180;
//        }
//        else if (condition == 2) {
//            pricePerSquareFeet = 130;
//        }
//        else if(condition == 3){
//            pricePerSquareFeet = 90;
//        }
//        else if (condition == 4){
//            pricePerSquareFeet = 80;
//        }

        switch (condition){
            case 1: pricePerSquareFeet = 180;
            break;
            case 2: pricePerSquareFeet = 130;
            break;
            case 3: pricePerSquareFeet = 90;
            break;
            case 4: pricePerSquareFeet = 80;
            break;
            default:
                System.out.println("Invalid Condition (1-4)");
        }
        double houseTotal = pricePerSquareFeet * this.squareFoot;
        houseTotal += this.lotSize *.25;
        return houseTotal;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }




    public House(String description, String dateAcquired, double originalCost,String address, int condition,int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address= address;
        this.condition= condition;
        this.squareFoot =  squareFoot;
        this.lotSize = lotSize;
    }
}
// A house's value is determined as
// $180.00 per square foot (excellent)
// $130.00 per square foot (good)
// $90.00 per square foot (fair)
// $80.00 per square foot (poor)
// PLUS 25 cents per square foot of lot size