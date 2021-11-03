// https://leetcode.com/problems/check-if-the-sentence-is-pangram/

class CheckIfPangram {
    public boolean checkerPangram(String sentence) {
        // you can use this for loop for incrementation as long as it is incremented inside the loop
        // a = 97 so on and so forth
        // .contains checks if the letter(i + 97) exists in the String array sentence
        // if not return false
        for(int i = 0; i < 26;) {
            if(sentence.contains(Character.toString(i + 97))){
                i++;
            } else {
                return false;
            }
        }
        return true;
    }
}