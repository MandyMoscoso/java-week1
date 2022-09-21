public class IntrotoArrays {
    public static void main (String[] args) {
        int[] revenues = {30,20,50,10};
        int[] exp = {20,30,10,20};
        System.out.println(calculateGrossProfit(revenues,exp));

    }
    public static int calculateGrossProfit (int [] revenues, int [] expenses){
        int grossProfit = 0;
        for (int i = 0; i < revenues.length; i++){
            grossProfit += (revenues[i]-expenses[i]);
        }
        return grossProfit;
    }
}
