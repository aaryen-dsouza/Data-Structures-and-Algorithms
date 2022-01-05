// Amazon Qsn

import java.util.ArrayList;
import java.util.List;

public class DiceThrow {
    public static void main(String[] args) {
        dice("", 4);
        System.out.println(diceList("", 4));
        System.out.println(diceListFace("", 4, 8));
    }

    static void dice(String p, int target) {
        if(target == 0) {
            System.out.println(p);
            return;
        }

        for(int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);
        }
    }

    static List<String> diceList(String p, int target) {

        if(target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(diceList(p + i, target - i));
        }
        return list;
    }

    static List<String> diceListFace(String p, int target, int face) {

        if(target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i = 1; i <= face && i <= target; i++) {
            list.addAll(diceListFace(p + i, target - i, face));
        }
        return list;
    }
}
