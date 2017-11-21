package teste.Questao9;

public class Questao9 {
	
	public static Integer sumOfTreeChildrenNodes(BinnaryTree b) {
		
		if (b != null) {
			if (b.left != null) { b.valor += sumOfTreeChildrenNodes(b.left); }
			if (b.right != null) { b.valor += sumOfTreeChildrenNodes(b.right); }
			return b.valor;
		}
		
		return null;
	}
	
	
	/*
	 * Dados para fins de teste do conceito.
	 */
	public static void main(String[] args) {
		BinnaryTree tree = new BinnaryTree();
		tree.valor = 1;
		tree.right = new BinnaryTree();
		tree.left = new BinnaryTree();
		tree.right.valor = 5;
		tree.left.valor = 7;
		tree.left.left = new BinnaryTree();
		tree.left.left.valor = 5;
		
		System.out.println(Questao9.sumOfTreeChildrenNodes(tree.left));
	}

}
