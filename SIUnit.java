package com.dz_fs_dev.physics;

import java.math.BigInteger;

/**
 * Contains all International System of Units constants and definitions.
 * 
 * @author DZ_FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public enum SIUnit {
	/** Electric Current */
	AMPERE,
	
	/** Luminous Intensity */
	CANDELA,
	
	/** Thermodynamic Temperature */
	KELVIN,
	
	/** Mass */
	KILOGRAM,
	
	/** Distance */
	METER,
	
	/** Substance */
	MOLE,
	
	/** Time */
	SECOND;
	
	/**
	 * Primary frequency standard in which the photon absorption by transitions between
	 * the two hyperfine ground states of cesium-133 atoms. Also known as the Cesium Standard.
	 */
	final static BigInteger HYPERFINE_TRANSITION_FREQUENCY_CESIUM = new BigInteger("9192631770");
}
