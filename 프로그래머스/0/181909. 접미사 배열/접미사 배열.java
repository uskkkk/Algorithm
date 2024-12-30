import java.util.*;

class Solution {
    public List<String> list = new ArrayList<>();
    
    public String[] solution(String my_string) {
        String[] answer = {};
        
        splitString(my_string,my_string.length() - 1);
        Collections.sort(list);
        
        return list.toArray(new String[list.size()]);
    }
    
    public void splitString(String text, int size) {
        String sumText = "";
        for (int i = size ; i < text.length() ; i++ ) {
            sumText += text.charAt(i);
        }
        list.add(sumText);
        if(size > 0) {
            splitString(text,size - 1);    
        }
        
    }
}