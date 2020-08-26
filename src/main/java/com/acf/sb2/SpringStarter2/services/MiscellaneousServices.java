package com.acf.sb2.SpringStarter2.services;

import java.util.Optional;
import java.util.Random;

import org.springframework.stereotype.Service;

/**
 * This class is to help illustrate various jUnit testing methods
 * @author andyfaust
 *
 */
@Service
public class MiscellaneousServices {
	
	private Random rand = new Random();

	public Integer getRandonNumber(Optional<Integer> upperBound) throws IllegalArgumentException {
		
		// First this can't be null else we're gonna puke
		Integer limitValue = upperBound.orElseThrow(IllegalArgumentException::new);
		
		return rand.nextInt(limitValue);
		
	}
	
}
