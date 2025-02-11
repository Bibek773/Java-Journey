import java.util.ArrayList;

public class arraylist {

    public static void main(String[] args){

        /*
        array list is resizable array
        elements can be added and removed after compilation phase
        store reference data type
         */
//        ArrayList<String> food = new ArrayList<String>();
//        food.add("pizza");//add new element to array list
//        food.add("burger");
//        food.add("mo:mo");
//
//        food.set(0, "chowmin");//set chowmin to index 0
//        food.remove(2);// remove item of index 2
//        food.clear(); // clear the list
//
//
//        for(int i=0; i<food.size(); i++){
//            System.out.println(food.get(i));
//        }
        // --------------------------------------
        // 2 dimension array list

            ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

            ArrayList<String> bakeryList = new ArrayList<>();
            bakeryList.add("pasta");
            bakeryList.add("garlic bread");
            bakeryList.add("donuts");

            ArrayList<String> produceList = new ArrayList<>();
            produceList.add("tomato");
            produceList.add("potato");
            produceList.add("gingers");

            ArrayList<String> drinkList = new ArrayList<>();
            drinkList.add("pepsi");
            drinkList.add("coffee");

            groceryList.add(bakeryList);
            groceryList.add(produceList);
            groceryList.add(drinkList);

            System.out.println(groceryList);

    }
}