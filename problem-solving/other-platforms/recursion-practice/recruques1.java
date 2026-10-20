public class recruques1 {

    public static void recurQues1(int arr[], int key, int i) {
        // base case
        if (i == arr.length) {
            return;
        }

        // work
        if (arr[i] == key) {
            System.out.print(i+" ");
        }

        // recursive call
        recurQues1(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        recurQues1(arr, 2, 0);
    }
}
