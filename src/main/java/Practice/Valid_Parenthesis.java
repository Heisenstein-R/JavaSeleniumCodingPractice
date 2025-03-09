package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Valid_Parenthesis {


    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();


        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');


        String lastItem = "";
        for (Character c : s.toCharArray()) {

            if (map.containsKey(c)) {
                stack.push(c);

            } else if(map.containsValue(c)){
                if (stack.isEmpty() || c != map.get(stack.pop())) {
                    return false;
                }

            }
        }

        return stack.isEmpty();

    }

    public static void main(String[] args) {
        System.out.println(Valid_Parenthesis.isValid("]"));
    }

}
