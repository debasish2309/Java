package Java.Strings;

public class BinaryRepresentation {

    static String nextGeneration(String num) {
        
        int l = num.length();
        int i;

        //examine bit from right
        for(i = l - 1;i >= 0; i--) {

            //if '0' is encountered, convert it ot 1 and then break
            if(num.charAt(i) == '0') {
                num = num.substring(0, i) + '1' + num.substring(i + 1);
                break;
            } else {  // convert 1 to 0
                num = num.substring(0, i) + '0' + num.substring(i + 1);
            }
        }

        if(i < 0) {
            num = "1" + num;
        }

        return num;
    }

    public static void main(String[] args) {
        String num = "011";
        System.out.println("Binary representation of next num = " + nextGeneration(num));
    }
    
}
