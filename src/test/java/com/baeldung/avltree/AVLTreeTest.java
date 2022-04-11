/**
 * 
 */
package com.baeldung.avltree;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author sreyabhattacharya
 *
 */
public class AVLTreeTest {
	
	AVLTree tree = new AVLTree();

	/**
	 * Test method for {@link com.baeldung.avltree.AVLTree#find(int)}.
	 */
	@Test
	public void testFind() {
		tree.insert(1);
		assertEquals(tree.getRoot(), tree.find(1));
		//when not root
		tree.insert(2);
		assertEquals(tree.getRoot().right, tree.find(2));
	}

	/**
	 * Test method for {@link com.baeldung.avltree.AVLTree#insert(int)}.
	 */
	@Test
	public void testInsert() {
		tree = new AVLTree();
		tree.insert(5);
		assertEquals(tree.getRoot(), tree.find(5));
		//for right node
		tree.insert(7);
		assertEquals(tree.getRoot().right, tree.find(7));
		//for left node
		tree.insert(4);
		assertEquals(tree.getRoot().left, tree.find(4));
		
		tree.insert(3);
		tree.insert(2);
		assertEquals(tree.getRoot().left.left, tree.find(2));
	}
	
	/**
	 * Test method for {@link com.baeldung.avltree.AVLTree#insert(int)}.
	 */
	@Test(expected = RuntimeException.class)
	public void testInsertException() {
		tree.insert(1);
		tree.insert(1);
	}

	/**
	 * Test method for {@link com.baeldung.avltree.AVLTree#delete(int)}.
	 */
	@Test
	public void testDelete() {
		tree = new AVLTree();		
		tree.delete(3);
		
		tree.insert(2);
		tree.insert(1);
		tree.insert(3);
		assertEquals(tree.getRoot().right, tree.find(3));
		assertEquals(tree.getRoot().left, tree.find(1));
		assertEquals(tree.getRoot(), tree.find(2));
		
		tree.delete(1);
		assertNull(tree.find(1));
		tree.delete(3);
		assertNull(tree.find(3));
		tree.delete(2);
		assertNull(tree.find(2));
		
		tree.insert(2);
		tree.insert(1);
		tree.insert(4);
		tree.insert(3);
		tree.delete(2);
		assertNull(tree.find(2));
		assertEquals(3, tree.getRoot().key);
		
		tree.delete(1);
		tree.delete(3);
		assertEquals(4, tree.getRoot().key);
		
	}

	/**
	 * Test method for {@link com.baeldung.avltree.AVLTree#getRoot()}.
	 */
	@Test
	public void testGetRoot() {
		tree = new AVLTree();	
		tree.insert(25);
		for(int i = 0; i<10;i++)
		{
		   tree.insert(i+1);
		}
		tree.delete(100);
		assertEquals(4, tree.getRoot().key);
		
		tree.insert(70);
		for(int i = 50; i<60;i++)
		{
		   tree.insert(i+1);
		}
		tree.delete(4);
		assertEquals(8, tree.getRoot().key);
		
		tree = new AVLTree();	
		tree.insert(5);
		for(int i = 6; i<13;i++)
		{
		   tree.insert(i+1);
		}
		tree.delete(9);
		assertEquals(10, tree.getRoot().key);
	}

	/**
	 * Test method for {@link com.baeldung.avltree.AVLTree#height()}.
	 */
	@Test
	public void testHeight() {
		tree = new AVLTree();
		assertEquals(-1, tree.height());
		tree.insert(2);
		tree.insert(1);
		tree.insert(3);
		tree.insert(4);
		assertEquals(2, tree.height());
	}

	/**
	 * Test method for {@link com.baeldung.avltree.AVLTree#getBalance(com.baeldung.avltree.AVLTree.Node)}.
	 */
	@Test
	public void testGetBalance() {
		assertEquals(0, tree.getBalance(null));
		tree.insert(2);
		tree.insert(1);
		tree.insert(3);
		tree.insert(4);
		assertEquals(1, tree.getBalance(tree.getRoot()));
	}

}
