package Level0.ReturnLongestString;

public class ReturnLongestString {
    public String longest(String[] s){
<<<<<<< HEAD
        return null;
    }
}
=======

        String r = new String();

        for(int i = 0; i < s.length; i++) {
            if (s[i].chars().count() > r.chars().count()) {
                r = s[i];
            }
        }


        return r;
    }
}
>>>>>>> d3396f2d5f2610a6d9026a38e3d364bbc9ab3ec9
