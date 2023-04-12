package string_package;

import java.util.ArrayDeque;
import java.util.Deque;

public class SimplifyPath {
    public static String simplifyPath(String path){
        Deque<String> stack = new ArrayDeque<>();
        for(String dirs : path.split("/")){
            if(!stack.isEmpty() && dirs.equals("..")){
                stack.removeLast();
            }else if(!dirs.equals(".") && !dirs.equals("") && !dirs.equals("..")){
                stack.addLast(dirs);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(String s : stack){
            sb.append("/").append(s);
        }
        return sb.length()==0 ? "/" : sb.toString();
    }

    public static String simplifyPath1(String path){
        String[] dirs = path.split("/");
        Deque<String> stack = new ArrayDeque<>();
        for(String s : dirs){
            if(s.equals(""))
                continue;
            if(s.equals("."))
                continue;
            if(s.equals(".."))
                stack.pollLast();
            else
                stack.add(s);
        }
        return "/"+String.join("/", stack);
    }
    public static void main(String[] args) {
        String s = "/home/";
        String s1 = "/../";
        System.out.println(simplifyPath(s));
        System.out.println(simplifyPath(s1));
        System.out.println(simplifyPath1(s));
        System.out.println(simplifyPath1(s1));
    }
}
