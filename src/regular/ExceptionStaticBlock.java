package regular;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ExceptionStaticBlock {
    static boolean flag = true;
    static int B;
    static int H;

    static {
        try {
            Scanner scan = new Scanner(System.in);
            B = scan.nextInt();
            H = scan.nextInt();
            if (B <= 0 || H <= 0) throw new Exception("Breadth and height must be positive");
        } catch (Exception e) {
            System.out.print(e);
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }
}
