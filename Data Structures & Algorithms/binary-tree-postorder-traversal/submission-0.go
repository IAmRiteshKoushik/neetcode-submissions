/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */

func postorderTraversal(root *TreeNode) []int {
	result := []int{}

	var aux func(node *TreeNode)
	aux = func(node *TreeNode) {
		if node == nil {
			return
		}
		aux(node.Left)
		aux(node.Right)
		result = append(result, node.Val)
	}

	aux(root)
	return result
}
