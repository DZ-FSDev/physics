package com.dz_fs_dev.physics;

/**
 * The user of this interface should implement a representation of a scalar.
 * Scalars do not contain directionality.
 *
 * @author DZ-FSDev
 * @since 17.0.1
 * @version 0.0.2
 */
public interface IScalar {
	/**
	 * Returns a string representation of this scalar measurement with units
	 * represented as symbols. 
	 * 
	 * @return A string representation of this scalar measurement with units
	 * represented as symbols. 
	 */
	public String toShortString();
	
	/**
	 * Returns a string representation of this scalar measurement with units
	 * explicitly spelled out.
	 * 
	 * @return A string representation of this scalar measurement with units
	 * explicitly spelled out.
	 */
	public String toLongString();
}
