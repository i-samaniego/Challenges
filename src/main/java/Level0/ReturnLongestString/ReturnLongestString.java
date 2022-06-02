package Level0.ReturnLongestString;

public class ReturnLongestString {
    public String longest(String[] s){

        String r = new String();

        for(int i = 0; i < s.length; i++) {
            if (s[i].chars().count() > r.chars().count()) {
                r = s[i];
            }
        }


        return r;
    }
}