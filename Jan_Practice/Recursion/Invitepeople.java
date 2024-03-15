package Jan_Practice.Recursion;

//find the no of ways in which you can invite n people to your party, single or paired
public class Invitepeople {

    public static int callGuests(int n) {

        if(n <= 1) {
            return 1;
        }

        //single
        int ways1 = callGuests(n - 1);

        //pair
        int ways2 = (n - 1) * callGuests(n - 2);

        return ways1 + ways2;
    }

    public static void main(String[] args) {
        System.out.println(callGuests(4));
    }
    
}
