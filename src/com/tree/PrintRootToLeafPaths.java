package com.tree;

public class PrintRootToLeafPaths {

	public static void main(String[] args) {
		TreeNode root = new TreeNode("CEO", null, null);

		TreeNode VP1 = new TreeNode("VP1", null, null);

		TreeNode VP2 = new TreeNode("VP2", null, null);
		TreeNode D1 = new TreeNode("D1", null, null);
		TreeNode D2 = new TreeNode("D2", null, null);
		TreeNode D3 = new TreeNode("D3", null, null);
		TreeNode D4 = new TreeNode("D4", null, null);
		

		root.left = VP1;
		root.right = VP2;

		VP1.left = D1;
		VP1.right = D2;
		

		VP2.left = D3;
		VP2.right = D4;
		
		
	    printPaths(root, new String[4], 0);
	}
	
	
	public  static void printPaths(TreeNode root, String[] pathArr, int pathLen){
		if(root == null){
			return;
		}
		
		pathArr[pathLen] = root.data;
		pathLen++;
		
		if(root.left == null && root.right == null){
			//print the path
			System.out.println("Printin...");
			for (int i = 0; i < pathArr.length; i++) {
				System.out.println(pathArr[i]);
			}
		}
		else{
			printPaths(root.left, pathArr, pathLen);
			printPaths(root.right, pathArr, pathLen);
		}
	}

}
