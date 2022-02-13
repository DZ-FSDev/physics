package com.dz_fs_dev.physics;

/**
 * The user of this interface should implement functionality such that the
 * specified type can be exponentiated.
 * 
 * @author DZ-FSDev
 * @since 17.0.1
 * @version 0.0.3
 * @param <T> The type which should contain the ability to be exponentiated.
 */
public interface IPowable<T> {
	/**
	 * Returns the square of this amount.
	 * 
	 * @return The square of this amount.
	 * @since 0.0.1
	 */
	public default T squared() {
		return this.pow(2);
	}
	
	/**
	 * Returns the cube of this amount.
	 * 
	 * @return The cube of this amount.
	 * @since 0.0.2
	 */
	public default T cubed() {
		return this.pow(3);
	}
	
	/**
	 * Returns the inverse of this amount.
	 * 
	 * @return The inverse of this amount.
	 * @since 0.0.3
	 */
	public default T inverse() {
		return this.pow(-1);
	};
	
	/**
	 * Returns new units that represent the specified exponentiation of this
	 * quantity.
	 * 
	 * @param exponent The exponentiation to be applied.
	 * @return New quantity that represent the specified exponentiation of this
	 *         quantity.
	 * @since 0.0.1
	 */
	public T pow(int exponent);
	
	/**
	 * Returns new units that represent the specified exponentiation of this
	 * quantity.
	 * 
	 * @param exponent The exponentiation to be applied.
	 * @return New quantity that represent the specified exponentiation of this
	 *         quantity.
	 * @since 0.0.3
	 */
	public T pow(double exponent);
}
