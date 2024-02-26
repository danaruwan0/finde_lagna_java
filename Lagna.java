import java.util.Scanner;

class Lagna {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter Your name:");
        String uName = scan.next();
        
        System.out.println("Enter Your Age:");
        int uAge = scan.nextInt();
        
        if (uAge >= 18) {
            System.out.println("You are eligible:");
            
            System.out.println("Enter the number of incomes:");
            int length = scan.nextInt();
            
            double totalIncome = 0;
            String uLagna = ""; 
            
            for (int i = 0; i < length; i++) {
                System.out.println("Enter your income for the " + (i + 1) + "th income:");
                double uIncome = scan.nextDouble();
                totalIncome += uIncome;
                
                System.out.println("Enter your Lagna:");
                uLagna = scan.next(); 
            }
            System.out.println("Your total income is " + totalIncome);
            
            System.out.println("Enter the number of chances you have of waiting:");
            int numChances = scan.nextInt();
            
            if(totalIncome > 80000){ 
                for (int i = 0; i < numChances; i++) {
                    System.out.println("Enter chance " + (i + 1) + " of waiting (in percentage):");
                    
                    double chance = scan.nextDouble();
                    System.out.println("You have a " + chance + "% chance of waiting.");
                    
                    String[] dana = new String[]{"It is a day of social respect, which is fertile for the hands.", 
						"Wealth and pleasures are attained", "Talent emerges, learning only up","Courage may decrease."};
                    switch(uLagna) {
                        case "mesha":
                            System.out.println(uName + dana[0] + " your good family" );
                            break;
                        case "wushaba":
                            System.out.println(uName + dana[1]+ " your good family" );
                            break;
                        case "mithuna":
                            System.out.println(uName + dana[2]+ " your good family" );
                            break;
                        default:
                            System.out.println(uName + dana[3]+ " your good family" );
                    }
                }
            }
        } else {
            System.out.println("You are not eligible.");
        }
    }
}
