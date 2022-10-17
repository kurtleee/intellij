public class BestTimeToBuyStock {
    public static void main(String[] args) {
        int[] stock = new int[]{1,3,9,3,1,6,1,75,1,22};
        BestTimeToBuyStock o1 = new BestTimeToBuyStock();
        System.out.print(o1.naive(stock));
    }

//Time Complexity: O(N). Where N is the size of prices array.
//Auxiliary Space: O(1). We do not use any extra space.
    public int naive(int[] stock) {
        int buy = stock[0], maxPrice = 0;
        for (int i = 0; i < stock.length; ++i) {
            if (buy > stock[i]) {
                buy = stock[i];
            } else if (maxPrice < stock[i] - buy) {
                maxPrice = stock[i] - buy;
            }
        }
        return maxPrice;
    }
//OK this time there's no pro version for this question.
//    public int pro(int[] stock) {
//
//    }
}
