package com.acf.sb2.SpringStarter2.services;

import java.util.Optional;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * This is a standard jUnit test that REQUIRES the spring
 * context to be loaded in order to have access to the AutoWired injection
 * capability of Sprig
 * @author andyfaust
 *
 */
@SpringBootTest
class MiscellaneousServicesTest {
	
	@Autowired
	private MiscellaneousServices miscSvc;

	@Test
	void generate_from_0_to_99_test() {
		Integer result = miscSvc.getRandonNumber(Optional.of(100));
		assertThat(result).isBetween(0, 99);
	}

	@Test
	void generate_invalid_param_test() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			Integer result = miscSvc.getRandonNumber(Optional.ofNullable(null));
	    });
		assertThat(exception).isInstanceOf(IllegalArgumentException.class);
	}
	
}
