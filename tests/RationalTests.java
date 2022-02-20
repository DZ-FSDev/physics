/*  Original Licensing Copyright
 * 
 *  Copyright (C) 2022  DZ-FSDev
 *  
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.dz_fs_dev.physics;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Contains a battery of tests to assess whether the {@link Rational} class
 * conforms to requirements.
 * 
 * @author DZ_FSDev
 * @since 17.0.1
 * @version 0.0.4
 */
class RationalTest {
	@ParameterizedTest
	@CsvSource({
		"-1",
		"0",
		"1"
	})
	void constructor1_initializes(long value) throws NoSuchFieldException, SecurityException {
		// Arrange
		Field numeratorField = Rational.class.getDeclaredField("numerator");
		Field denominatorField = Rational.class.getDeclaredField("denominator");
		numeratorField.setAccessible(true);
		denominatorField.setAccessible(true);
		
		// Act
		Rational target = new Rational(value);
		
		// Assert
		assertAll(
				() -> assertEquals(value, numeratorField.get(target)),
				() -> assertEquals(1L, denominatorField.get(target))
				);
	}

	@ParameterizedTest
	@CsvSource({
		"-1,-1,1,1",
		"0,1,0,1",
		"1,-1,-1,1",
		"10,5,2,1",
		"5,10,1,2",
		"-10,5,-2,1",
		"5,10,1,2"
	})
	void constructor2_initializes(long numerator, long denominator, long expectedNumerator, long expectedDenominator) throws NoSuchFieldException, SecurityException {
		// Arrange
		Field numeratorField = Rational.class.getDeclaredField("numerator");
		Field denominatorField = Rational.class.getDeclaredField("denominator");
		numeratorField.setAccessible(true);
		denominatorField.setAccessible(true);
		
		// Act
		Rational target = new Rational(numerator, denominator);
		
		// Assert
		assertAll(
				() -> assertEquals(expectedNumerator, numeratorField.get(target)),
				() -> assertEquals(expectedDenominator, denominatorField.get(target))
				);
	}
	
	@ParameterizedTest
	@CsvSource({
		"-1,1,-1",
		"1,1,1",
		"0,1,0",
		"1,2,0.5",
		"5,2,2.5"
	})
	void doubleValue_returns(long numerator, long denominator, double expected) {
		// Arrange
		Rational target = new Rational(numerator, denominator);
		
		// Act
		double actual = target.doubleValue();
		
		// Assert
		assertEquals(expected, actual);
	}
	
	@ParameterizedTest
	@CsvSource({
		"-1,1,-1",
		"1,1,1",
		"0,1,0",
		"1,2,0",
		"5,2,2",
		"-7,2,-3"
	})
	void intValue_returns(long numerator, long denominator, int expected) {
		// Arrange
		Rational target = new Rational(numerator, denominator);
		
		// Act
		int actual = target.intValue();
		
		// Assert
		assertEquals(expected, actual);
	}
}
