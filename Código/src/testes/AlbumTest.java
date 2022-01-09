package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import business.Album;

class AlbumTest {

	public static Album album;

	@BeforeEach
	void setUp() throws Exception {
		album = new Album("Thriller", 1982, "Michael Jackson");
	}

	@Test
	void testTituloAlbum() {
		assertEquals("Thriller", album.getTituloAlbum());
	}

	@Test
	void testAnoValido() {
		assertEquals(1982, album.getAnoDeLancamento());
	}

	@Test
	void testNomeBanda() {
		assertEquals("Michael Jackson", album.getNomeDaBanda());
	}

}
