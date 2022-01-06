package api.tistech;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import api.tistech.model.BinaryTree;
import api.tistech.service.BinaryTreeService;

public class BinaryTreeServiceTest {

	@Autowired
	BinaryTreeService binaryTreeService;
	
	@Autowired
	BinaryTree binaryTree;

	@Before
	public void setup() throws Exception {
		
		binaryTreeService = new BinaryTreeService();
		binaryTree = new BinaryTree();
		BinaryTree left = new BinaryTree();
		BinaryTree right = new BinaryTree();
		
		left.setValor(15);
        right.setValor(12);
        binaryTree.setValor(3);
        binaryTree.setLeft(left);
        binaryTree.setRight(right);
		
	}
	
	@Test
	public void somaTodosNosSubsequentesTest() {
		int test1 = 30;
		
		/* Esperado sucesso para o conjunto de dados inseridos inicialmente na �rvore */
		Assert.assertEquals(test1, binaryTreeService.somaTodosNosSubsequentes(binaryTree));
	}
	
	@Test
	public void somaTodosNosSubsequentesFAILURETest() {
		int test2 = 21;
		
		/* Esperado fracasso para o conjunto de dados inseridos inicialmente na �rvore */
		Assert.assertEquals(test2, binaryTreeService.somaTodosNosSubsequentes(binaryTree));
	}
}
