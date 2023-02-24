package practice_leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class solution257 {

	public static void main(String[] args) {
		TreeNode A = new TreeNode();
		A.val = 1;
		TreeNode B = new TreeNode();
		B.val = 2;
		TreeNode C = new TreeNode();
		C.val = 3;
		TreeNode D = new TreeNode();
		D.val = 5;
		
		A.left = B;
		A.right = C;
		B.right = D;
		
		System.out.println(binaryTreePaths(A));

	}
	
	public static List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        Stack<TreeNode> path = new Stack<>();
        Stack<String> str = new Stack<>();
        
        path.push(root);
        str.push("");
        while(!path.isEmpty()){
            TreeNode curr = path.pop();
            String currVal = str.pop();
            if(curr.left == null && curr.right == null){
                //leaf node
                result.add(currVal + curr.val);
            }
            if(curr.left != null){
                path.push(curr.left);
                str.push(currVal + curr.val + "->");
            }
            if(curr.right != null){
                path.push(curr.right);
                str.push(currVal + curr.val + "->");
            }    
        }    
        return result;    
    }

}
