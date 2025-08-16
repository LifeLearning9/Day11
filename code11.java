import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split(" ");
        
        int[] prices = new int[s1.length];
        for (int i = 0; i < s1.length; i++) {
            prices[i] = Integer.parseInt(s1[i]);
        }
        
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        
        System.out.println(profit);
    }
}
