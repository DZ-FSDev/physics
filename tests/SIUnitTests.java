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

import org.junit.jupiter.api.Test;

/**
 * Contains a battery of tests to assess whether the {@link SIUnit} class
 * conforms to requirements.
 * 
 * @author DZ_FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
class SIUnitTests {

	@Test
	void allSIUnits_nonDefaulOrder_initializesOrder() {
		assertAll(new Throwable().getStackTrace()[0].getMethodName(),
				() -> assertEquals(new SIUnit.Ampere(2).getOrder(), 2, "Ampere"),
				() -> assertEquals(new SIUnit.Candela(2).getOrder(), 2, "Candela"),
				() -> assertEquals(new SIUnit.Gram(2).getOrder(), 2, "Gram"),
				() -> assertEquals(new SIUnit.Kelvin(2).getOrder(), 2, "Kelvin"),
				() -> assertEquals(new SIUnit.Meter(2).getOrder(), 2, "Meter"),
				() -> assertEquals(new SIUnit.Mole(2).getOrder(), 2, "Mole"),
				() -> assertEquals(new SIUnit.Second(2).getOrder(), 2, "Second")
				);
	}

	@Test
	void squared_doublesOrder() {
		assertAll(new Throwable().getStackTrace()[0].getMethodName(),
				() -> assertEquals(new SIUnit.Ampere(2).squared().getOrder(), 4, "Ampere"),
				() -> assertEquals(new SIUnit.Candela(2).squared().getOrder(), 4, "Candela"),
				() -> assertEquals(new SIUnit.Gram(2).squared().getOrder(), 4, "Gram"),
				() -> assertEquals(new SIUnit.Kelvin(2).squared().getOrder(), 4, "Kelvin"),
				() -> assertEquals(new SIUnit.Meter(2).squared().getOrder(), 4, "Meter"),
				() -> assertEquals(new SIUnit.Mole(2).squared().getOrder(), 4, "Mole"),
				() -> assertEquals(new SIUnit.Second(2).squared().getOrder(), 4, "Second")
				);
	}
}
