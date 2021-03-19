package ricorsione;

public class Main {

    public static void main(String[] args) {

        System.out.println(fattoriale(5));
        System.out.println(fibonacci(20));
        inverti("ciao", 4);

    }

    public static int fattoriale(int n){
        int ret;
        if (n > 0)
            ret = fattoriale(n-1) * n;
        else
            ret = 1;
        return ret;
    }

    public static int fibonacci(int n){
        int ret = 0;
        if (n == 0 || n == 1)
            ret = 1;
        else if (n > 1)
            ret = fibonacci(n-1) + fibonacci(n-2);
        return ret;
    }

    public static void inverti(String s, int index){
       if (index == 0)
           System.out.println(s.charAt(index));
       else {
           System.out.println(s.charAt(index));
           inverti(s, index-1);
       }
    }
}
