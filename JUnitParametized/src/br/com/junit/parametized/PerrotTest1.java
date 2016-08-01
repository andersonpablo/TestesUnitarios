package br.com.junit.parametized;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author nconde
 */
@RunWith(value = Parameterized.class)
public class PerrotTest1 {

	private String nombre;
	private int edadPerro;

	public PerrotTest1(String nombre, int edadPerro) {
		this.nombre = nombre;
		this.edadPerro = edadPerro;
	}

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { { "Fido", 4 }, { "Dido", 5 }, { "Rudo", 10 } };
		return Arrays.asList(data);
	}

	@Test
	public void testNombrePerros() {
		System.out.println("Nombre del perro: " + nombre + ", Edad: " + edadPerro);
	}
}