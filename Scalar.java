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
 * @version 0.0.2
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
	public BigDecimal pow(int n, MathContext mc) {
		// TODO Auto-generated method stub
		return super.pow(n, mc);
	}



	@Override
	public BigDecimal abs() {
		// TODO Auto-generated method stub
		return super.abs();
	}



	@Override
	public BigDecimal abs(MathContext mc) {
		// TODO Auto-generated method stub
		return super.abs(mc);
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
	public BigInteger toBigInteger() {
		// TODO Auto-generated method stub
		return super.toBigInteger();
	}



	@Override
	public BigInteger toBigIntegerExact() {
		// TODO Auto-generated method stub
		return super.toBigIntegerExact();
	}



	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return super.longValue();
	}



	@Override
	public long longValueExact() {
		// TODO Auto-generated method stub
		return super.longValueExact();
	}



	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return super.intValue();
	}



	@Override
	public int intValueExact() {
		// TODO Auto-generated method stub
		return super.intValueExact();
	}



	@Override
	public short shortValueExact() {
		// TODO Auto-generated method stub
		return super.shortValueExact();
	}



	@Override
	public byte byteValueExact() {
		// TODO Auto-generated method stub
		return super.byteValueExact();
	}



	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return super.floatValue();
	}



	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return super.doubleValue();
	}



	@Override
	public BigDecimal ulp() {
		// TODO Auto-generated method stub
		return super.ulp();
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
