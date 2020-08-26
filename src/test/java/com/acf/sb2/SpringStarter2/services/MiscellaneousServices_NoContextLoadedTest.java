package com.acf.sb2.SpringStarter2.services;

import java.util.Optional;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * This illustrates how to run a true unit test on the
 * methods of the MiscellaenousServices service.  
 * 1.  Do NOT use the SpringBootTest annotation
 * 2.  Do NOT use Autowire, rather, just create an instance
 * 		of the service class to be tested
 * @author andyfaust
 *
 */

class MiscellaneousServices_NoContextLoadedTest {
	
	private MiscellaneousServices miscSvc = new MiscellaneousServices();

	@Test
	void generate_from_0_to_99_nocontext_test() {
		Integer result = miscSvc.getRandonNumber(Optional.of(100));
		assertThat(result).isBetween(0, 99);
	}

	@Test
	void generate_invalid_param_nocontext_test() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			Integer result = miscSvc.getRandonNumber(Optional.ofNullable(null));
	    });
		assertThat(exception).isInstanceOf(IllegalArgumentException.class);
	}
	
}
