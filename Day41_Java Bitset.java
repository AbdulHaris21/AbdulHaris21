import java.io.*;
import java.util.*;

public class Day41_Java_BitSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        
        BitSet[] bitsets = new BitSet[3];
        bitsets[1] = b1;
        bitsets[2] = b2;
        
        for(int i=0;i<m;i++){
            String op = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            switch (op){
                case "AND":
                bitsets[x].and(bitsets[y]);
                break;
                case "OR":
                bitsets[x].or(bitsets[y]);
                break;
                case "XOR":
                bitsets[x].xor(bitsets[y]);
                break;
                case "FLIP":
                bitsets[x].flip(y);
                break;
                 case "SET":
                bitsets[x].set(y);
                break;
            }
            System.out.printf("%d %d%n", b1.cardinality(),b2.cardinality());
        }
    }
}