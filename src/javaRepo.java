

public class javaRepo {
    
    // class level vars
    
    public static void main(String[] args) throws Exception {

        // datatypes varName [=value];
        int games = 3;
        double allowance = 40.50;
        long battlePass; // We define battlepass 
        
        battlePass = 15; // We assign a value to battlepass

        // Print out our var values along with a string that explains our values
        System.out.println("Number of games I own : " + games);
        System.out.println("My monthly allowance : " + allowance);
        System.out.println("Cost of a single battlepass : " + battlePass);

        // With our current Allowance, how many battle passes will we be able to buy?
        System.out.println("Amount of battle passes we can buy : " + Math.floor(allowance/battlePass));
            // I got the answer by taking the allowance and dividing it by the cost of each battlepass, then flooring it to remove any decimals because you can't buy a decimal amount of battle passes
        

        // What is the total cost of battle passes
        System.out.println("Total cost of battle passes : " + (battlePass * games));
            //I took the amount of games and multiplied by the cost of each battle pass to get the total cost of buying a battlepass for each game
    }   

}
