package com.dz_fs_dev.physics;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents a scalar quantity. Scalars do confer directionality.
 *
 * @author DZ-FSDev
 * @since 17.0.1
 * @version 0.0.3
 */
public class Scalar extends BigDecimal implements IScalar{
	/**
	 * @since 0.0.1
	 */
	private static final long serialVersionUID = -6321022537548657934L;

	private @Getter @Setter(AccessLevel.PRIVATE) IUnit units; 

	/**
	 * Constructs a new Scalar based off a String representing a Scalar
	 * quantity.
	 * 
	 * @param value The scalar quantity.
	 */
	public Scalar(String value) {
		super(value);
	}

	@Builder
	private static Scalar buildScalar(String value, IUnit units) {
		Scalar scalar = new Scalar(value);
		scalar.setUnits(units);
		return scalar;
	}

	/**
	 * @since 0.0.1
	 */
	@Override
	public Scalar add(BigDecimal augend) {
		if(!(augend instanceof Scalar))
			throw new IllegalArgumentException();
		return Scalar.builder()
				.value(super.add(augend).toString())
				.units(units)
				.build();
	}

	/**
	 * @since 0.0.2
	 */
	@Override
	public BigDecimal add(BigDecimal augend, MathContext mc) {
		if(!(augend instanceof Scalar))
			throw new IllegalArgumentException();
		return Scalar.builder()
				.value(super.add(augend, mc).toString())
				.units(units)
				.build();
	}


	/**
	 * @since 0.0.2
	 */
	@Override
	public BigDecimal subtract(BigDecimal subtrahend) {
		if(!(subtrahend instanceof Scalar))
			throw new IllegalArgumentException();
		return Scalar.builder()
				.value(super.subtract(subtrahend).toString())
				.units(units)
				.build();
	}


	/**
	 * @since 0.0.2
	 */
	@Override
	public BigDecimal subtract(BigDecimal subtrahend, MathContext mc) {
		if(!(subtrahend instanceof Scalar))
			throw new IllegalArgumentException();
		return Scalar.builder()
				.value(super.subtract(subtrahend, mc).toString())
				.units(units)
				.build();
	}



	@Override
	public BigDecimal multiply(BigDecimal multiplicand) {
		// TODO Auto-generated method stub
		return super.multiply(multiplicand);
	}



	@Override
	public BigDecimal multiply(BigDecimal multiplicand, MathContext mc) {
		// TODO Auto-generated method stub
		return super.multiply(multiplicand, mc);
	}



	@SuppressWarnings("deprecation")
	@Override
	public BigDecimal divide(BigDecimal divisor, int scale, int roundingMode) {
		// TODO Auto-generated method stub
		return super.divide(divisor, scale, roundingMode);
	}



	@Override
	public BigDecimal divide(BigDecimal divisor, int scale, RoundingMode roundingMode) {
		// TODO Auto-generated method stub
		return super.divide(divisor, scale, roundingMode);
	}



	@SuppressWarnings("deprecation")
	@Override
	public BigDecimal divide(BigDecimal divisor, int roundingMode) {
		// TODO Auto-generated method stub
		return super.divide(divisor, roundingMode);
	}



	@Override
	public BigDecimal divide(BigDecimal divisor, RoundingMode roundingMode) {
		// TODO Auto-generated method stub
		return super.divide(divisor, roundingMode);
	}



	@Override
	public BigDecimal divide(BigDecimal divisor) {
		// TODO Auto-generated method stub
		return super.divide(divisor);
	}



	@Override
	public BigDecimal divide(BigDecimal divisor, MathContext mc) {
		// TODO Auto-generated method stub
		return super.divide(divisor, mc);
	}



	@Override
	public BigDecimal divideToIntegralValue(BigDecimal divisor) {
		// TODO Auto-generated method stub
		return super.divideToIntegralValue(divisor);
	}



	@Override
	public BigDecimal divideToIntegralValue(BigDecimal divisor, MathContext mc) {
		// TODO Auto-generated method stub
		return super.divideToIntegralValue(divisor, mc);
	}



	@Override
	public BigDecimal remainder(BigDecimal divisor) {
		// TODO Auto-generated method stub
		return super.remainder(divisor);
	}



	@Override
	public BigDecimal remainder(BigDecimal divisor, MathContext mc) {
		// TODO Auto-generated method stub
		return super.remainder(divisor, mc);
	}



	@Override
	public BigDecimal[] divideAndRemainder(BigDecimal divisor) {
		// TODO Auto-generated method stub
		return super.divideAndRemainder(divisor);
	}



	@Override
	public BigDecimal[] divideAndRemainder(BigDecimal divisor, MathContext mc) {
		// TODO Auto-generated method stub
		return super.divideAndRemainder(divisor, mc);
	}



	@Override
	public BigDecimal sqrt(MathContext mc) {
		// TODO Auto-generated method stub
		return super.sqrt(mc);
	}



	@Override
	public BigDecimal pow(int n) {
		// TODO Auto-generated method stub
		return super.pow(n);
	}



	@Override
	public Scalar pow(int n, MathContext mc) {
		return new Scalar(super.pow(n, mc).toString());
	}


	/**
	 * @since 0.0.3
	 */
	@Override
	public Scalar abs() {
		return new Scalar(super.abs().toString());
	}


	/**
	 * @since 0.0.3
	 */
	@Override
	public Scalar abs(MathContext mc) {
		return new Scalar(super.abs(mc).toString());
	}



	@Override
	public BigDecimal negate() {
		// TODO Auto-generated method stub
		return super.negate();
	}



	@Override
	public BigDecimal negate(MathContext mc) {
		// TODO Auto-generated method stub
		return super.negate(mc);
	}



	@Override
	public BigDecimal plus() {
		// TODO Auto-generated method stub
		return super.plus();
	}



	@Override
	public BigDecimal plus(MathContext mc) {
		// TODO Auto-generated method stub
		return super.plus(mc);
	}



	@Override
	public int signum() {
		// TODO Auto-generated method stub
		return super.signum();
	}



	@Override
	public int scale() {
		// TODO Auto-generated method stub
		return super.scale();
	}



	@Override
	public int precision() {
		// TODO Auto-generated method stub
		return super.precision();
	}



	@Override
	public BigInteger unscaledValue() {
		// TODO Auto-generated method stub
		return super.unscaledValue();
	}



	@Override
	public BigDecimal round(MathContext mc) {
		// TODO Auto-generated method stub
		return super.round(mc);
	}



	@Override
	public BigDecimal setScale(int newScale, RoundingMode roundingMode) {
		// TODO Auto-generated method stub
		return super.setScale(newScale, roundingMode);
	}



	@SuppressWarnings("deprecation")
	@Override
	public BigDecimal setScale(int newScale, int roundingMode) {
		// TODO Auto-generated method stub
		return super.setScale(newScale, roundingMode);
	}



	@Override
	public BigDecimal setScale(int newScale) {
		// TODO Auto-generated method stub
		return super.setScale(newScale);
	}



	@Override
	public BigDecimal movePointLeft(int n) {
		// TODO Auto-generated method stub
		return super.movePointLeft(n);
	}



	@Override
	public BigDecimal movePointRight(int n) {
		// TODO Auto-generated method stub
		return super.movePointRight(n);
	}



	@Override
	public BigDecimal scaleByPowerOfTen(int n) {
		// TODO Auto-generated method stub
		return super.scaleByPowerOfTen(n);
	}



	@Override
	public BigDecimal stripTrailingZeros() {
		// TODO Auto-generated method stub
		return super.stripTrailingZeros();
	}



	@Override
	public int compareTo(BigDecimal val) {
		// TODO Auto-generated method stub
		return super.compareTo(val);
	}



	@Override
	public boolean equals(Object x) {
		// TODO Auto-generated method stub
		return super.equals(x);
	}



	@Override
	public BigDecimal min(BigDecimal val) {
		// TODO Auto-generated method stub
		return super.min(val);
	}



	@Override
	public BigDecimal max(BigDecimal val) {
		// TODO Auto-generated method stub
		return super.max(val);
	}



	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	/**
	 * @since 0.0.3
	 */
	@Override
	public BigInteger toBigInteger() {
		return super.toBigInteger();
	}


	/**
	 * @since 0.0.3
	 */
	@Override
	public BigInteger toBigIntegerExact() {
		return super.toBigIntegerExact();
	}


	/**
	 * @since 0.0.3
	 */
	@Override
	public long longValue() {
		return super.longValue();
	}


	/**
	 * @since 0.0.3
	 */
	@Override
	public long longValueExact() {
		return super.longValueExact();
	}


	/**
	 * @since 0.0.3
	 */
	@Override
	public int intValue() {
		return super.intValue();
	}


	/**
	 * @since 0.0.3
	 */
	@Override
	public int intValueExact() {
		return super.intValueExact();
	}


	/**
	 * @since 0.0.3
	 */
	@Override
	public short shortValueExact() {
		return super.shortValueExact();
	}


	/**
	 * @since 0.0.3
	 */
	@Override
	public byte byteValueExact() {
		return super.byteValueExact();
	}


	/**
	 * @since 0.0.3
	 */
	@Override
	public float floatValue() {
		return super.floatValue();
	}


	/**
	 * @since 0.0.3
	 */
	@Override
	public double doubleValue() {
		return super.doubleValue();
	}


	/**
	 * @since 0.0.3
	 */
	@Override
	public BigDecimal ulp() {
		return super.ulp();
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public String toEngineeringString() {
		// TODO Auto-generated method stub
		return super.toEngineeringString();
	}

	@Override
	public String toPlainString() {
		// TODO Auto-generated method stub
		return super.toPlainString();
	}

	@Override
	public String toLongString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toShortString() {
		// TODO Auto-generated method stub
		return null;
	}
}
