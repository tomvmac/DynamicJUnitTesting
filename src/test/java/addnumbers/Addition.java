package addnumbers;

/**
 * Created with IntelliJ IDEA.
 * User: Tom Mac
 * Date: 7/20/14
 * Time: 12:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class Addition {

    public String addNumbers(String a, String b){
        int numA, numB;
        numA = Integer.valueOf(a);
        numB = Integer.valueOf(b);
        int sum = numA + numB;
        return String.valueOf(sum);
    }
}
