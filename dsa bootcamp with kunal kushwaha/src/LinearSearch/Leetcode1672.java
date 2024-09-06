package LinearSearch;

public class Leetcode1672 {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,4},{3,7,1}};

        int highestWealth = maximumWealth(accounts);

        System.out.println(highestWealth);
    }

    public static int maximumWealth(int[][] accounts) {

        int rowAccountSum = 0;
        for (int owner = 0; owner<accounts.length;owner++){

            int sum = 0;

            for(int account = 0; account<accounts[owner].length; account++){
                sum = sum + accounts[owner][account];
            }

            if(sum>rowAccountSum){
                rowAccountSum = sum;
            }
        }

        return rowAccountSum;
    }
}
