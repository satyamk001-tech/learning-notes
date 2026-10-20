public class comparearray {

    public static boolean hasDuplicate(int numbers[]) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    return true;   // duplicate found
                }
            }
        }
        return false;  // no duplicates
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 2};

        System.out.println(hasDuplicate(numbers));
    }
}
