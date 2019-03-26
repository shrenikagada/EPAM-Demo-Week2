import java.util.*;
import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<t;i++) {
            int n = sc.nextInt();
            //sc.nextLine();
            int c=0,k=3;
            while(k<=n) {
                k=k*2+1;
                c++;
            }
            System.out.println(c);
        } 
    }
}