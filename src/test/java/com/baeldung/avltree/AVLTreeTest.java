/**
 * 
 */
package com.baeldung.avltree;

import junit.framework.TestCase;

/**
 * @author sreyabhattacharya
 *
 */
public class AVLTreeTest extends TestCase {
	
	AVLTree tree = new AVLTree();
	/**
	 * Test method for {@link com.baeldung.avltree.AVLTree#find(int)}.
	 */
	public void testFind() {
		
		tree.insert(1);
		assertEquals(tree.getRoot(), tree.find(1));
	}

	/**
	 * Test method for {@link com.baeldung.avltree.AVLTree#insert(int)}.
	 */
	public void testInsert() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.baeldung.avltree.AVLTree#delete(int)}.
	 */
	public void testDelete() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.baeldung.avltree.AVLTree#getRoot()}.
	 */
	public void testGetRoot() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.baeldung.avltree.AVLTree#height()}.
	 */
	public void testHeight() {
		//fail("Not yet implemented");
	}

	/** 
	 * Test method for {@link com.baeldung.avltree.AVLTree#getBalance(com.baeldung.avltree.AVLTree.Node)}.
	 */
	public void testGetBalance() {
		//fail("Not yet implemented");
	}

}
