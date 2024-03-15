//package de.telran.practic.backLog.test2;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) throws CloneNotSupportedException {
////        Book book = new Book("Duma","3 Muskiters");
////        Book newBook = book.clone();
////
////        newBook.setAuthor("newAuthor");
////        book.setAuthor("oldAuthor");
////
////        System.out.println(book);
////        System.out.println(newBook);
//
////        Random random = new Random();
//////        int[]arr = new int[5];
////        int[] arr = random.ints(2,99).limit(10).toArray();
////
////        System.out.println(Arrays.toString(arr));
//////        System.out.println(a);
//
////        int[] arr = {25, 10, 5, 1};
////        int x = 63;
////
////        System.out.println(reedyAlgorithm(arr, x));
//
//
//        int[][] arr = {{0, 3}, {0, 5}, {3, 4}, {2, 4}, {10, 12}, {20, 23}, {5, 10}, {2, 5}, {4, 8}, {1, 2}};
//
//        printArray(arr);
//        printArray(getEvents(arr));
//        printArray(arr);
//
//    }
//
//    private static List<int[]> getEvents(int[][] arr) {
//        Arrays.sort(arr, (x, y) -> {
//            if (x[1] < y[1]) return -1;
//            else if (x[1] > y[1]) return 1;
//            else return 0;
//        });
//
//        ArrayList<int[]> myEvents = new ArrayList<>();
//
//        int[] min = arr[0];
//        myEvents.add(min);
//        for (int[] event: arr){
//            if (event[0]>=min[1]){
//                myEvents.add(event);
//                min = event;
//            }
//        }
//        return myEvents;
//    }
//
//    private static void printArray(int[][] arr){
//        for (int[] event : arr) {
//            System.out.print(Arrays.toString(event) + ", ");
//        }
//        System.out.println();
//    }
//
////    private static void sortEvents(int[][] arr) {
////        Arrays.sort(arr,(x,y)->{
////            if(x[1]<y[1])
////                return 1;
////            else return -1;
////        });
////        System.out.println(Arrays.toString(arr));
//////        int min = 24;
//////        for (int[] event : arr) {
//////            if (event[1] < min) {
//////                min = event;
//////            }
//////        }
////        return min;
////    }
//
//
//    private static int reedyAlgorithm(int[] arr, int x) {
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            int temp = x / arr[i];
//            if (temp != 0) {
//                x = x - temp * arr[i];
//                count += temp;
//            }
//            if (x == 0) return count;
//        }
//
//        return -1;
//    }
//}
