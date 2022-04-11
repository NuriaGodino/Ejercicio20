package modelo.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.negocio.GestorCoche;

class TestGestorCoche {

	@Test
	public void test8buscarPorID() {
		GestorCoche gc = new GestorCoche();
		int idEsperado = 3;
		int idOBtenido = gc.buscarPorID(3).getId();
		assertEquals(idEsperado, idOBtenido);
	}

}
