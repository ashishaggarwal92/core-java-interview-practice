# Binary Tree

1) Binary Tree is a special datastructure used for data storage purposes. 
2) Has a special condition that each node can have two children at maximum. 
3) Have benefits of both an ordered array and a linked list
4) As search is as quick as in sorted array and insertion or deletion operation are as fast as in linked list.


## Terms

Following are important terms with respect to tree.

Path − Path refers to sequence of nodes along the edges of a tree.

Root − Node at the top of the tree is called root. There is only one root per tree and one path from root node to any node.

Parent − Any node except root node has one edge upward to a node called parent.

Child − Node below a given node connected by its edge downward is called its child node.

Leaf − Node which does not have any child node is called leaf node.

Subtree − Subtree represents descendents of a node.

Visiting − Visiting refers to checking value of a node when control is on the node.

Traversing − Traversing means passing through nodes in a specific order.

Levels − Level of a node represents the generation of a node. If root node is at level 0, then its next child node is at level 1, its grandchild is at level 2 and so on.

keys − Key represents a value of a node based on which a search operation is to be carried out for a node.


## Binary Search Tree

Binary Search tree exibits a special behaviour. A node's left child must have value less than its parent's value and node's right child must have value greater than it's parent value.


## Basic Operations
Following are basic primary operations of a tree which are following.

1) Search − search an element in a tree.

2) Insert − insert an element in a tree.

3) Preorder Traversal − traverse a tree in a preorder manner.
- visit root node
- traverse left subtree
- traverse right subtree

4) Inorder Traversal − traverse a tree in an inorder manner.

- traverse left subtree 
- visit root node
- traverse right subtree

5) Postorder Traversal − traverse a tree in a postorder manner.

- traverse left subtree
- traverse right subtree
- visit root