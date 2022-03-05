import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day9_java_end-of-file {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int line = 0;
        while(scan.hasNextLine()){
            line+=1;
            System.out.println(line+" "+scan.nextLine());
        }
    }
}
