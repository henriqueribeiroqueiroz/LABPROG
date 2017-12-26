import static org.junit.Assert.*;
import org.junit.Test;

// Classe de testes (TDD).

public class Testes {

	Produto p = null;

	@Test
	public void teste() {
		try {
			p = new Produto(null, 1);
			fail("N�o deve entrar aqui.");
		} catch (Exception e) {
			assertEquals("O produto deve ter uma descri��o.", e.getMessage());
		}

		try {
			p = new Produto("  ", 1);
			fail("N�o deve entrar aqui.");
		} catch (Exception e) {
			assertEquals("O produto deve ter uma descri��o.", e.getMessage());
		}

		try {
			p = new Produto("T�nis", -1);
			fail("N�o deve entrar aqui.");
		} catch (Exception e) {
			assertEquals(
					"O produto deve ter um valor de venda maior que zero.",
					e.getMessage());
		}

		try {
			p = new Produto("T�nis", 0);
			fail("N�o deve entrar aqui.");
		} catch (Exception e) {
			assertEquals(
					"O produto deve ter um valor de venda maior que zero.",
					e.getMessage());
		}

		try {
			p = new Produto("T�nis", 199.00);
		} catch (Exception e) {
			fail("N�o deve entrar aqui.");
		}
	}

	@Test
	public void inserirOpiniao() {
		try {
			p = new Produto("VW Golf", 69000);
		} catch (Exception e) {
			fail("N�o deve entrar aqui.");
		}

		try {
			p.inserirOpiniao("Ivan", null, 2);
			fail("N�o deve entrar aqui.");
		} catch (Exception e) {
			assertEquals(
					"Comente sobre o produto.",
					e.getMessage());
		}

		try {
			p.inserirOpiniao("Ivan", "", 2);
			fail("N�o deve entrar aqui.");
		} catch (Exception e) {
			assertEquals(
					"Comente sobre o produto.",
					e.getMessage());
		}

		try {
			p.inserirOpiniao("Ivan", "    ", 2);
			fail("N�o deve entrar aqui.");
		} catch (Exception e) {
			assertEquals(
					"Comente sobre o produto.",
					e.getMessage());
		}

		String comentario141caracteres = "Henriqueribeiroioujfhdjhdhqwertyuiopasdfghjkl�zxcvbnmghjqwerty99999sdfghjkl�zxcvbnmghjqwertyuiopasdfghjkl�zxcvbnmghjqwertyuio8ujhpasdfghjkl�z";
		try {
			p.inserirOpiniao("Ivan", comentario141caracteres, 2);
			fail("N�o deve entrar aqui.");
		} catch (Exception e) {
			assertEquals("Seu feedback deve conter no m�ximo 140 caracteres.",
					e.getMessage());
		}

		try {
			p.inserirOpiniao("Ivan", "Produto excelente!", -3);
			fail("N�o deve entrar aqui.");
		} catch (Exception e) {
			assertEquals("A nota atribu�da ao produto � inv�lida.",
					e.getMessage());
		}
		try {
			p.inserirOpiniao("Ivan", "Produto excelente!", 3);
			fail("N�o deve entrar aqui.");
		} catch (Exception e) {
			assertEquals("A nota atribu�da ao produto � inv�lida.",
					e.getMessage());
		}

		try {
			p.inserirOpiniao("Ivan", "Produto excelente!", 2);
		} catch (Exception e) {
			fail("N�o deve entrar aqui.");
		}
	}
}