/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */

func preorderTraversal(root *TreeNode) []int {
	result := []int{}

	// Auxiliary function to actually handle the 
	// recursion. The parent function is just a 
	// runner with a variable that is flushed on 
	// each test case
	var aux func(node *TreeNode)
	aux = func(node *TreeNode) {
		if node == nil {
			return
		}

		result = append(result, node.Val)
		aux(node.Left)
		aux(node.Right)
	}

	aux(root)
	return result
}