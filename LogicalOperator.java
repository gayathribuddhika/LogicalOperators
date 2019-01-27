
package logicaloperator;

//import java.util.Scanner;
public class LogicalOperator {

    
    public static void main(String[] args) {
        int Girls,Boys;
        //Scanner scan = new Scanner(System.in);
        /*System.out.print("Girls = ");
        Girls = scan.nextInt();
        System.out.print("Boys = ");
        Boys = scan.nextInt();*/
        
        Girls = 12;
        Boys = 28;
        
        if(Girls<30 && Boys>40){
            System.out.println("You can enter");
        }else{
            System.out.println("You cannot enter");
        }
        if(Girls<30 || Boys>40){
            System.out.println("You are selected");
        }else{
            System.out.println("You are not selected");
        }
    }
    
}
