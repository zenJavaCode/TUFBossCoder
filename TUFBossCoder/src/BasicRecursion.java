public class BasicRecursion {


    public static void printNToOne(int n){

        if(n == 0){
            return;
        }
        System.out.println(n +" ");
        printNToOne(n-1);
    }

    public static void printOneToN(int n,int current){
        if(current > n){
            return;
        }
        System.out.println(current++);
        printOneToN(n,current);
    }

        public static void printOneToNUsingBackTracking(int n){
        if(n <1) return;
        printOneToNUsingBackTracking(n-1);
            System.out.println(n+ " ");
        }


        public static int sumOfNNaturalNumbers(int n){
        if(n == 0) return 0;
        return n + sumOfNNaturalNumbers(n-1);
        }

        public static int factorialOfNUsingRecursion(int n){
        if( n == 1 ){
            return 1;
        } else if(n <0){
            return 0;
        }
        return n * factorialOfNUsingRecursion(n-1);
        }

        public static void reverseAnArray(int l, int r, int[] arr){
            if(l>=r)return;
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            reverseAnArray(l+1,r-1,arr);
        }

        public static boolean isPalindrome(String str, int start,int end){
        if(start >= end){
            return true;
        }
        if(str.charAt(start) != str.charAt(end)){
            return false;
        }
        return isPalindrome(str,start+1,end-1);
        }

        public static int fibonacciNumber(int n){
        if(n <2){
            return n;
        }
        return fibonacciNumber(n-1) + fibonacciNumber(n-2);
        }

    public static void main(String[] args) {
       // printNToOne(5);
       // printOneToN(5,1);
        //printOneToNUsingBackTracking(5);
        System.out.println(factorialOfNUsingRecursion(5));
    }
}
