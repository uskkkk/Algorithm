import java.util.*;

class Solution {
    public String solution(String rsp) {
        String[] game = rsp.split("");
        
        for (int i = 0 ; i < game.length ; i++ ) {
            switch(game[i]) {
                case "2" : 
                    game[i] = "0"; 
                    break;
                case "0" : 
                    game[i] = "5"; 
                    break;
                case "5" : 
                    game[i] = "2"; 
                    break;
            }
        }
            
        return String.join("",game);
    }
}