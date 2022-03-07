import java.util.*;
public class runner {
    public static void main(String[] args) {
        Delimiters object = new Delimiters("(",")");
        String[] val = {"(",")","*","(",")"};
        ArrayList<String> des = object.getDelimiters(val);
        boolean bis = object.isBalanced(des);
        System.out.print(bis);

    }
}
