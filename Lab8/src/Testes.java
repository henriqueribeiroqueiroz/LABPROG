import static org.junit.Assert.*;
import org.junit.Test;

// Classe de testes (TDD).

public class Testes {

	Produto p = null;

	@Test
	public void teste() {
		try {
			p = new Produto(null, 1);
			fail("Não deve entrar aqui.");
		} catch (Exception e) {
			assertEquals("O produto deve ter uma descrição.", e.getMessage());
		}

		try {
			p = new Produto("  ", 1);
			fail("Não deve entrar aqui.");
		} catch (Exception e) {
			assertEquals("O produto deve ter uma descrição.", e.getMessage());
		}

		try {
			p = new Produto("Tênis", -1);
			fail("Não deve entrar aqui.");
		} catch (Exception e) {
			assertEquals(
					"O produto deve ter um valor de venda maior que zero.",
					e.getMessage());
		}

		try {
			p = new Produto("Tênis", 0);
			fail("Não deve entrar aqui.");
		} catch (Exception e) {
			assertEquals(
					"O produto deve ter um valor de venda maior que zero.",
					e.getMessage());
		}

		try {
			p = new Produto("Tênis", 199.00);
		} catch (Exception e) {
			fail("Não deve entrar aqui.");
		}
	}

	@Test
	public void inserirOpiniao() {
		try {
			p = new Produto("VW Golf", 69000);
		} catch (Exception e) {
			fail("Não deve entrar aqui.");
		}

		try {
			p.inserirOpiniao("Ivan", null, 2);
			fail("Não deve entrar aqui.");
		} catch (Exception e) {
			assertEquals(
					"Comente sobre o produto.",
					e.getMessage());
		}

		try {
			p.inserirOpiniao("Ivan", "", 2);
			fail("Não deve entrar aqui.");
		} catch (Exception e) {
			assertEquals(
					"Comente sobre o produto.",
					e.getMessage());
		}

		try {
			p.inserirOpiniao("Ivan", "    ", 2);
			fail("Não deve entrar aqui.");
		} catch (Exception e) {
			assertEquals(
					"Comente sobre o produto.",
					e.getMessage());
		}

		String comentario141caracteres = "Henriqueribeiroioujfhdjhdhqwertyuiopasdfghjklçzxcvbnmghjqwerty99999sdfghjklçzxcvbnmghjqwertyuiopasdfghjklçzxcvbnmghjqwertyuio8ujhpasdfghjklçz";
		try {
			p.inserirOpiniao("Ivan", comentario141caracteres, 2);
			fail("Não deve entrar aqui.");
		} catch (Exception e) {
			assertEquals("Seu feedback deve conter no máximo 140 caracteres.",
					e.getMessage());
		}

		try {
			p.inserirOpiniao("Ivan", "Produto excelente!", -3);
			fail("Não deve entrar aqui.");
		} catch (Exception e) {
			assertEquals("A nota atribuída ao produto é inválida.",
					e.getMessage());
		}
		try {
			p.inserirOpiniao("Ivan", "Produto excelente!", 3);
			fail("Não deve entrar aqui.");
		} catch (Exception e) {
			assertEquals("A nota atribuída ao produto é inválida.",
					e.getMessage());
		}

		try {
			p.inserirOpiniao("Ivan", "Produto excelente!", 2);
		} catch (Exception e) {
			fail("Não deve entrar aqui.");
		}
	}
}