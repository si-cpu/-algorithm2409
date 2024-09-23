package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str1 = bf.readLine();
        String str2 = bf.readLine();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str1.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        // str1: AAaab, A : 2
        // str2: AAAab

        String answer = "yes";
        for (char c : str2.toCharArray()) {
            if (!map.containsKey(c) || map.get(c)==0){
                answer = "no";
                break;
            }
                map.put(c, map.get(c)-1);
        }
        System.out.println(answer);
        bf.close();
    }
}
