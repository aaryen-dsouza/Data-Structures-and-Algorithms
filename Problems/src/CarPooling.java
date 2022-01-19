import java.util.ArrayList;

public class CarPooling {
    public static void main(String[] args) {
        int[][] trips = {{2,1,5},{3,3,7}};
        int capacity = 4;

        System.out.println(carPooling(trips, capacity));
    }

    static boolean carPooling(int[][] trips, int capacity) {
        // for the number of passengers present at pickup(index to index) to Drop
        int[] list = new int[1001];

        // add the number of passengers picked up at the location(pick index)
        // and negate the number of passenger when they leave(drop index)
        for(int[] trip : trips){
            list[trip[1]] += trip[0];
            list[trip[2]] -= trip[0];
        }

        // as people adds the numbers the negative value will make it obsolete
        // but if at any time the capacity is less than people then return false
        int count = 0;
        for(int people: list){
            count += people;
            if(count > capacity){
                return false;
            }
        }
        return true;
    }
}
