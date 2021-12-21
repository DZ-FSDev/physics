package com.dz_fs_dev.physics;

/**
 * The user of this interface should implement a representation
 * of a mathematical value which contains measurement units.
 * 
 * @see <a href=https://physics.nist.gov/cuu/Units/checklist.html>
 *      NIST SI Unit Rules and Style Conventions</a>
 * @author DZ-FSDev
 * @since 17.0.1
 * @version 0.0.5
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
	 */
	public default boolean canAdd(IUnit o) {
		return o.symbol().equals(this.symbol());
	}
}
