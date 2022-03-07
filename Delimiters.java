import java.util.*;
public class Delimiters {
    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }
    public ArrayList<String> getDelimiters (String[] tokens) {
        ArrayList<String> delims = new ArrayList<String>();
        for (String x : tokens) {
            if (x.equals(openDel) || x.equals(closeDel)) {
                delims.add(x);
            }
        }
        return delims;
    }
    public boolean isBalanced(ArrayList<String> delimiters) {
        int opened = 0;
        for(String x : delimiters) {
            if(x.equals(openDel)) {
                opened += 1;
            }
            if(x.equals(closeDel)) {
                opened -= 1;
            }
        }
        if(opened == 0) {
            return true;
        }
        return false;
    }
}