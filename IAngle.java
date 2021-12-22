package com.dz_fs_dev.physics;

import java.math.BigDecimal;

/**
 * The user of this interface should implement a representation of
 * directionality. The first three dimensions should be x, y, z.
 *
 * @author DZ-FSDev
 * @since 17.0.1
 * @version 0.0.2
 */
public interface IAngle {
	/**
	 * Returns the angle between the x-y dimensions.
	 * 
	 * @return
	 */
	BigDecimal getAngle();
	
	/**
	 * Returns the angle between the referenced dimension and another
	 * dimension.
	 * 
	 * @param referenceDimension The dimension to measure rotation from.
	 * @param dimension The dimension to measure rotation towards.
	 * @return The angle between the referenced dimension and another
	 * dimension.
	 */
	BigDecimal getAngleBetween(IDimension referenceDimension, IDimension dimension);
}
