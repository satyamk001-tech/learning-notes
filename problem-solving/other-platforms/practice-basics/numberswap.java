public class numberswap {
    public static String numberSwap(int x, int y){
        x=x^y;
        y=x^y;
        x=x^y;
        return x+""+y;
    }
    public static void main(String[] args) {
        System.out.println(numberSwap(5, 3));
    }
}
