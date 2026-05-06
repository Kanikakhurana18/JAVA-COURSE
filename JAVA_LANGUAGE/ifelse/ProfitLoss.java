package ifelse;

import java.util.Scanner;

public class ProfitLoss {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter selling price: ");
    double sp=sc.nextDouble();
    System.out.println("Enter cost price: ");
    double cp=sc.nextDouble();
    
    if(sp>cp) {System.out.println("Profit = "+ (sp-cp));
    System.out.println("Profit percentage= "+((sp-cp)/cp*100));}
    else{ System.out.println("Loss = "+(cp-sp));
    System.out.println("Loss percentage= "+((cp-sp)/cp*100));}
    
  }
}
