public class floydstriangle {
    
    public static void floyds_triangle(int n, int counter) {
        //outer
        for(int i=1;i<=n;i++){
            //how many times the counter will be printed
            for(int j=1;j<=i;j++){
                System.out.print(counter+ " ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floyds_triangle(5, 1);
    }
}
