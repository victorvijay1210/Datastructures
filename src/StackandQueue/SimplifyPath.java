package StackandQueue;

import java.util.Stack;

//Time Complexity : O(N)
//Space Complexity: O(N)
public class SimplifyPath {
    public static String simplifyPath(String path) {
    	
    	Stack<String> str = new Stack<String>();
    	String[] st = path.split("/");
    	StringBuilder res = new StringBuilder();
    	
    	for (String s: st ) {
    		
    		if(!str.empty() && s.equals("..") ) {
    			str.pop();
    			}
    		
    		else if (!s.equals("") && !s.equals("..") && !s.equals(".")) {
    			str.push(s);
    		}
    	}
    	
    	if(str.isEmpty()) {
    		return "/";
    	}
    	
    	while(!str.isEmpty()) {
    		res.insert(0, "/"+str.pop());
    	}
    	
		return res.toString();
    

    }

    public static void main(String[] args) {
    //1	/.../a/../b/c/../d/./  Output: "/home"
    //2 "/home//foo/"  Output: "/home/foo"
    //3  "/home/user/Documents/../Pictures"  Output: "/home/user/Pictures"
    //4 "/home/user/Documents/../Pictures
    //5 "/../"  Output: "/"
    //6  "/.../a/../b/c/../d/./" Output: "/.../b/d"
    //7 "/home/" Output: "/home"
    
    System.out.println(simplifyPath("/home/user/Documents/../Pictures"));
    System.out.println(simplifyPath("/home/"));
    System.out.println(simplifyPath("/home//foo/"));
    System.out.println(simplifyPath("/../"));
    System.out.println(simplifyPath("/.../a/../b/c/../d/./"));
    }
}