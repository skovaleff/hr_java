import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){//queries
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int num = 0;
            for(int j=0;j<n;j++){//number in series
                num += a + (2^j)*b;
                System.out.print(num + " ");
            }
            System.out.println();

        }
        in.close();
    }
}