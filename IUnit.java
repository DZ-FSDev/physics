/*  Original Licensing Copyright
 * 
 *  This interface represents a value which containing measurement units.
 *  Copyright (C) 2021  DZ-FSDev
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

/**
 * The user of this interface should implement a representation
 * of a mathematical value which contains measurement units.
 * 
 * @see <a href=https://physics.nist.gov/cuu/Units/checklist.html>
 *      NIST SI Unit Rules and Style Conventions</a>
 * @author DZ-FSDev
 * @since 17.0.2
 * @version 0.0.11
 */
public interface IUnit {
	/**
	 * Returns the fully qualified name of the unit of measure.
	 * 
	 * @return The fully qualified name of the unit of measure.
	 */
	public String name();

	/**
	 * Return the symbol that represents the unit of measure.
	 * 
	 * @return The symbol that represents the unit of measure.
	 */
	public String symbol();

	/**
	 * Returns the order of this unit of measure.
	 * 
	 * @return The order of this unit of measure.
	 * @since 0.0.11
	 */
	public Rational getOrder();

	/**
	 * Returns a new IUnit corresponding to if this IUnit was divided by
	 * another IUnit.
	 * 
	 * @param o The denominating IUnit.
	 * @return The resulting quotient IUnit.
	 */
	public IUnit divideBy(IUnit o);

	/**
	 * Returns a new IUnit corresponding to if this IUnit was multiplied by
	 * another IUnit. 
	 * 
	 * @param o The multiplicand or factor IUnit.
	 * @return The resulting product IUnit.
	 */
	public IUnit multiplyBy(IUnit o);

	/**
	 * Returns true if this IUnit can be modified in quantity by another IUnit.
	 * 
	 * @param o The other IUnit.
	 * @return True if this IUnit can be modified in quantity by another IUnit.
	 * @since 0.0.11
	 */
	public default boolean canAdd(IUnit o) {
		return o.getClass().equals(this.getClass()) &&
				o.getOrder().equals(this.getOrder());
	}
}
