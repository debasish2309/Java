package Java.Searching;

public class BinarySearch2 {

    static void binarySearch(int v[],int to_find) {

        int low = 0 ;
        int high = v.length - 1;
        while((high - low) > 1) {
            int mid = (high + low) / 2;
            if(v[mid] < to_find) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        if (v[low] == to_find) {
            System.out.println("Found At Index " + low );
          }
          else if (v[high] == to_find) {
              System.out.println("Found At Index " + high );
          }
          else {
              System.out.println("Not Found" );
          }
    }

    public static void main(String[] args) {
        int v[]={1, 3, 4, 5, 6};
       
        /* List<ArrayList<Integer>> v = new ArrayList<>();
        v.add(new ArrayList<Integer>(Arrays.asList( 1, 3, 4, 5, 6 )));*/
      int To_Find = 1;
      binarySearch(v, To_Find);
      To_Find = 6;
      binarySearch(v, To_Find);
      To_Find = 10;
      binarySearch(v, To_Find);
      }
    }
    

