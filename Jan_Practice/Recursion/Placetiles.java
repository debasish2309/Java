package Jan_Practice.Recursion;

public class Placetiles {

    public static int placeTile(int n, int m) {

        if(n == m) 
            return 2;
        
        if(n < m) 
            return 1;

        int verticalPlacements = placeTile(n - m, m);

        int horzPlacements = placeTile(n - 1, verticalPlacements);

        return verticalPlacements + horzPlacements;
    }

    public static void main(String[] args) {
        System.out.println(placeTile(4, 2)); 
    }
    
}
