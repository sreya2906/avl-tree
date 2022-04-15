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
public class AVLTreeBugHuntTest {
	
	
	/**
	 * Test method for {@link com.baeldung.avltree.AVLTree#delete(int)}.
	 */
	@Test
	public void testDelete() {
		//Not able to delete root correctly with only left node 
		AVLTree tree = new AVLTree();
		tree = new AVLTree();	
		tree.insert(5);
		tree.insert(1);
		tree.delete(5);
		assertEquals(1, tree.getRoot().key);
		
	}

}
