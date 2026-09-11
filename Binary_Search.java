public class Binary_Search {

    public static int bSearch(int[] arr, int target, int low, int high) {

        if (low > high) {
            System.out.println("bSearch(" + low + ", " + high + ", " + target + ")");
            return -1;
        }

        int mid = low + (high - low) / 2;

        System.out.println("bSearch(" + low + ", " + high + ", " + target + ")");
        System.out.println("Low = " + low);
        System.out.println("High = " + high);
        System.out.println("Mid = " + mid);
        System.out.println();

        if (arr[mid] == target) {
            return mid;
        }

        if (target < arr[mid]) {
            return bSearch(arr, target, low, mid - 1);
        }

        return bSearch(arr, target, mid + 1, high);
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60, 70};
        int target = 50;

        int result = bSearch(
                numbers,
                target,
                0,
                numbers.length - 1
        );

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}


