import java.util.ArrayList;
import java.util.Scanner;
public class FoodOrders {

  
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> orders = new ArrayList<String>();
        ArrayList<Double> prices = new ArrayList<Double>();
        
        Scanner input = new Scanner(System.in);
        boolean finished = false ;
        
        while(!finished){
            System.out.println("Enter your order(enter 'done' when finished)");
            String order = input.nextLine();
            if(order.equals("done")){
                
            }
        }
    }
    
}
