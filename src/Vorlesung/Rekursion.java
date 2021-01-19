package Vorlesung;

public class Rekursion {

    public static long fakultaetRecursive(long n) {
        if(n>1){
            return n*fakultaetRecursive(n-1);
        }
        else {
            return 1;
        }
    }

    public static boolean odd(int n) {
        if(n==0){
            return false;
        }
        else return even(n-1);
    }

    public static boolean even(int n){
        if(n==0){
            return true;
        }
        else return odd(n-1);
    }

    public static long recursiceFibonacci(long n){
        if(n==1) return 1;
        else if(n==2) return 1;
        else {
            return recursiceFibonacci(n-1) + recursiceFibonacci(n-2);
        }
    }

    public static long iterativeFibonacci(long n){
        if(n==1) return 1;
        if(n==2) return 1;
        long n1 = 1, n2=1, current = 2, result=0;
        while(current<n){
            result = n1 + n2;
            n1 = n2;
            n2 = result;
            current++;
        }
        return result;
    }

    public static int ackermann(int n, int m){
        if(n==0)return m+1;
        else if(m==0)return ackermann(n-1, 1);
        else return ackermann(n-1, ackermann(n, m-1));
    }

    public static void main(String[] args){
        System.out.println(fakultaetRecursive(8));
        System.out.println(odd(9));
        System.out.println(recursiceFibonacci(7));
        System.out.println(iterativeFibonacci(7));
        System.out.println(ackermann(7, 3));
    }
}
