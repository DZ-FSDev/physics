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
	void allSIUnits_nonDefaultOrder_initializesOrder() {
		assertAll(new Throwable().getStackTrace()[0].getMethodName(),
				() -> assertEquals(2, new SIUnit.Ampere(2).getOrder(), "Ampere"),
				() -> assertEquals(2, new SIUnit.Candela(2).getOrder(), "Candela"),
				() -> assertEquals(2, new SIUnit.Gram(2).getOrder(), "Gram"),
				() -> assertEquals(2, new SIUnit.Kelvin(2).getOrder(), "Kelvin"),
				() -> assertEquals(2, new SIUnit.Meter(2).getOrder(), "Meter"),
				() -> assertEquals(2, new SIUnit.Mole(2).getOrder(), "Mole"),
				() -> assertEquals(2, new SIUnit.Second(2).getOrder(), "Second")
				);
	}

	@Test
	void allSIUnits_squared_doublesOrder() {
		assertAll(new Throwable().getStackTrace()[0].getMethodName(),
				() -> assertEquals(4, new SIUnit.Ampere(2).squared().getOrder(), "Ampere"),
				() -> assertEquals(4, new SIUnit.Candela(2).squared().getOrder(), "Candela"),
				() -> assertEquals(4, new SIUnit.Gram(2).squared().getOrder(), "Gram"),
				() -> assertEquals(4, new SIUnit.Kelvin(2).squared().getOrder(), "Kelvin"),
				() -> assertEquals(4, new SIUnit.Meter(2).squared().getOrder(), "Meter"),
				() -> assertEquals(4, new SIUnit.Mole(2).squared().getOrder(), "Mole"),
				() -> assertEquals(4, new SIUnit.Second(2).squared().getOrder(), "Second")
				);
	}
}
