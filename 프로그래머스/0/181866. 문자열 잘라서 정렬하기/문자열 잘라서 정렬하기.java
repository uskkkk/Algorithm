import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        Arrays.sort(answer);
        List<String> stringArr = Arrays.stream(answer).filter(e -> !e.equals("")).collect(Collectors.toList());
        
        return stringArr.toArray(size -> new String[size]);
    }
}