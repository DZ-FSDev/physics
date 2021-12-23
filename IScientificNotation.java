package com.dz_fs_dev.physics;

import java.math.BigInteger;

/**
 * The user of this interface should implement a representation of 
 * scientific notation.
 * 
 * @author DZ-FSDev
 * @since 17.0.1
 * @version 0.0.2
 */
public interface IScientificNotation {
	/**
	 * Returns the prefix that represents this order of scientific notation.
	 * Is typically less than 3 letters.
	 * 
	 * @return The prefix that represents this order of scientific notation.
	 */
	public String prefix();
	
	/**
	 * Returns the prefix that represents this order of scientific notation
	 * fully spelled out.
	 * 
	 * @return The prefix that represents this order of scientific notation
	 *         fully spelled out.
	 */
	public String prefixLong();
	
	/**
	 * Returns the order of the measurement. This is independent of the
	 * mantissa or base of the numbering system used.
	 * 
	 * @return The order of the measurement.
	 */
	public BigInteger order();
	
	/**
	 * Returns the number system the scientific notation is based off.
	 * 
	 * @return The number system the scientific notation is based off.
	 */
	public BigInteger base();
}
