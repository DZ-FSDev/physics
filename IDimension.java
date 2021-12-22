package com.dz_fs_dev.physics;

/**
 * The user of this interface should implement a representation of a dimension.
 * A dimension is defined as an aspect or extent which can be measured as
 * a quantity irrespective of the number system.
 * <br>
 * <p>It is recommended that the name of the dimension be concise.
 * <p>For example, space-time can be represented with:
 * <ul>
 * 		<li>x
 * 		<li>y
 * 		<li>z
 * 		<li>t
 * </ul>
 *
 * @author DZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public interface IDimension {
	/**
	 * Returns the value of the measurement with respect to this dimension.
	 * 
	 * @return The value of the measurement with respect to this dimension.
	 */
	public Number getValue();
	
	/**
	 * Returns the name of this dimension.
	 * 
	 * @return The name of this dimension.
	 */
	public String getName();
}
