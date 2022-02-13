package com.dz_fs_dev.physics;

/**
 * 
 * @author DZ-FSDev
 *
 * @param <T>
 */
public interface IPowable<T> {
	public T squared();
	
	public T cubed();
	
	public T inverse();
	
	/**
	 * Returns new units that represent the specified exponentiation of this
	 * quantity.
	 * 
	 * @param exponent The exponentiation to be applied.
	 * @return New quantity that represent the specified exponentiation of this
	 *         quantity.
	 */
	public T pow(int exponent);
}
