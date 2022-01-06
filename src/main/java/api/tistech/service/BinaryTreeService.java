package api.tistech.service;

import org.springframework.stereotype.Service;

import api.tistech.model.BinaryTree;

@Service
public class BinaryTreeService {

	public int somaTodosNosSubsequentes(BinaryTree bt) {
		
		if(bt == null)
			return 0;
		else 
			return bt.getValor() + somaTodosNosSubsequentes(bt.getLeft()) + somaTodosNosSubsequentes(bt.getRight());
	}
}
