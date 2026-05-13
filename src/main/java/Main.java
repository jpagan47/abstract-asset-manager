import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      ArrayList<Asset> assets = new ArrayList<>();
      Asset myHouse = new House();
      assets.add(myHouse);
      Asset myCar = new Vehicle();
      assets.add(myCar);


      Asset bedMoney = new Cash("tooth fairy", "11/11/2011", 23);
//      for( Assets a : assets){
//
//      }











//        House h = new House(3500);
//        Stock goog = new Stock(10, 382);
//        ArrayList<Asset> assets = new ArrayList<>();
//        assets.add(h);
//        assets.add(goog);

//        double netWorth = 0;
//        for(Assets a: assets){
//            netWorth += a.getValue();
//        }
//        System.out.println("Congrats" + netWorth);
    }
}
