package io.carlosaltamirano.facturacion.pruebasUnitarias.core.model;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import io.carlosaltamirano.facturacion.core.model.Usuario;
import io.carlosaltamirano.facturacion.test.categoria.PruebaUnitaria;

@Category(PruebaUnitaria.class)
public class UsuarioTest {

	private static Validator validator;
	
	@BeforeClass
	public static void setUp() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}
	
	@Test
	public void validacionCreacionUsuarioExitoso() {
		//TODO: implementar prueba unitaria
		Usuario usuario = new Usuario();
		int id = 12;
		String nombres = "Juan Pablo";
		String apellidos = "Perez Gonzales";
		String email = "juan@gmail.com";

		usuario.setId(id);
		usuario.setNombres(nombres);
		usuario.setApellidos(apellidos);
		usuario.setEmail(email);


		Set<ConstraintViolation<Usuario>> constraintViolations = validator.validate(usuario);
		assertThat(constraintViolations.size(), is(0));
	}
	
	@Test
	public void validacionCreacionUsuarioCuandoEmailEsVacio() {
		//TODO: implementar prueba de integración
		Usuario usuario = new Usuario();
		int id = 12;
		String nombres = "Juan Pablo";
		String apellidos = "Perez Gonzales";
		String email = "";

		usuario.setId(id);
		usuario.setNombres(nombres);
		usuario.setApellidos(apellidos);
		usuario.setEmail(email);


		Set<ConstraintViolation<Usuario>> constraintViolations = validator.validate(usuario);
		assertThat(constraintViolations.size(), is(1));
	}
	
}
