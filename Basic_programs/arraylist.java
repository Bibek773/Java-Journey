import java.util.ArrayList;

public class arraylist {

    public static void main(String[] args){

        /*
        array list is resizable array
        elements can be added and removed after compilation phase
        store reference data type
         */
        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");//add new element to array list
        food.add("burger");
        food.add("mo:mo");

        for(int i=0; i<food.size(); i++){
            System.out.println(food.get(i));
        }
    }
}