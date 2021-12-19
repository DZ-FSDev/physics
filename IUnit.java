package com.dz_fs_dev.physics;

import java.math.BigInteger;

/**
 * The user of this interface should implement a representation
 * of a mathematical value which contains measurement units.
 * 
 * @see <a href=https://physics.nist.gov/cuu/Units/checklist.html>
 *      NIST SI Unit Rules and Style Conventions</a>
 * @author DZ_FSDev
 * @since 17.0.1
 * @version 0.0.2
 */
public interface IUnit {
	/**
	 * Returns the fully qualified name of the unit of measure.
	 * 
	 * @return The fully qualified name of the unit of measure.
	 */
	public String name();
	
	public String symbol();
	
	public BigInteger order();
	
	public IUnit divideBy(IUnit o);
	
	public IUnit multiplyBy(IUnit o);
	
	public boolean canAdd(IUnit o);
}
