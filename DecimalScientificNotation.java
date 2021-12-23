package com.dz_fs_dev.physics;

import java.math.BigInteger;

import lombok.Getter;

/**
 * Contains supported base decimal scientific notations.
 * 
 * @author DZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public enum DecimalScientificNotation implements IScientificNotation{
	KILO ("k", "kilo", 3);
	
	private final @Getter String prefix;
	private final @Getter String prefixLong;
	private final @Getter int order;
	
	/**
	 * 
	 * @param prefix
	 * @param prefixLong
	 * @param order
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
	 */
	@Override
	public BigInteger base() {
		return BigInteger.TEN;
	}
}
