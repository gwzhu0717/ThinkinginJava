package holding;

import net.mindview.util.Stack;

/**
 * Created by Zhugw on 2017/6/21.
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<String>();
        for (String s:"My dog has fleas".split(" ")) {
            stack.push(s);
        }
        while (!stack.empty()){
            System.out.print(stack.pop()+" ");
        }
        System.out.println();
    }
}
