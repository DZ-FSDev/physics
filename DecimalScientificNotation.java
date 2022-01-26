package com.dz_fs_dev.physics;

import java.math.BigDecimal;
import java.math.BigInteger;

import lombok.Getter;

/**
 * Contains supported base decimal scientific notations.
 * 
 * @author DZ-FSDev
 * @since 17.0.1
 * @version 0.0.3
 */
public enum DecimalScientificNotation implements IScientificNotation{
	MEGA ("M", "mega", 6),
	KILO ("k", "kilo", 3),
	HECTO ("h", "hecto", 2),
	DECA ("da", "deca", 1),
	DEFAULT("","",0),
	DECI ("k", "deci", -1);
	
	private final @Getter String prefix;
	private final @Getter String prefixLong;
	private final @Getter int order;
	
	/**
	 * Constructs a new decimal based order of magnitude.
	 * 
	 * @param prefix The short-form prefix representing the order of magnitude.
	 * @param prefixLong The long-form prefix representing the order of magnitude.
	 * @param order The order that the base is raised by to represent this magnitude.
	 */
	private DecimalScientificNotation(String prefix, String prefixLong, int order) {
		this.prefix = prefix;
		this.prefixLong = prefixLong;
		this.order = order;
		
	}

	/**
	 * {@inheritDoc}
	 * The prefixes will assume a decimal number system.
	 */
	@Override
	public String prefix() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 * The prefixes will assume a decimal number system.
	 */
	@Override
	public String prefixLong() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 * The prefixes will assume a decimal number system.
	 */
	@Override
	public BigInteger order() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 * The prefixes will assume a decimal number system.
	 * @since 0.0.2
	 */
	@Override
	public BigInteger base() {
		return BigInteger.TEN;
	}
	
	/**
	 * Returns the corresponding DecimalScientificNotation given a specified
	 * BigDecimal value. 
	 * 
	 * @param value The specified BigDecimal value.
	 * @return The corresponding DecimalScientificNotation.
	 * @since 0.0.3
	 */
	static DecimalScientificNotation valueOfGiven(BigDecimal value) {
		// TODO binary search
		return DecimalScientificNotation.values()[0];
	}
}
