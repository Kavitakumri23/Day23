public class Demo3 {
    public static void main(String[] args) {
        int n =5;
        PrintNTo1(n);
    }

    static void PrintNTo1(int n){
        //base case
        if(n==0) return;

        //print first(before recursion)
        System.out.print(n + " ");

        //recursive
        PrintNTo1(n-1);
    }
}
