public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        System.out.println(Ackerman.ackerman(3, 2));
//        System.out.println(Ackerman.alpha(4));
        int[] array = MergeSort.sort();

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }

        BinarySearch.binarySearch(array, 3, 0, array.length - 1);
    }
}
