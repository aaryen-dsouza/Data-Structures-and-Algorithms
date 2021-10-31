import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SearchSuggestionSystem {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> ans = new ArrayList<>();
        // sorts in ascendeing order
        Arrays.sort(products);

        // creates List inside ans which is a list of lists
        for (int i = 0; i < searchWord.length(); i++){
            ans.add(new ArrayList<>());
        }

        /* for every element in product check if its equal to searchWord
        if yes then the list size should be less than 3
        add it to the list of lists in position
        else break it up and next word
         */
        for (String copy : products){
            for (int i = 0; i < searchWord.length(); i++){
                if(i < copy.length() && copy.charAt(i) == searchWord.charAt(i)){
                    if(ans.get(i).size() < 3) {
                        ans.get(i).add(copy);
                    }
                } else {
                    break;
                }
            }
        }
                   return ans;
    }
}