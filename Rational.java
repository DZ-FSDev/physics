/*  Original Licensing Copyright
 * 
 *  Represents a rational number.
 *  Copyright (C) 2021  DZ-FSDev
 *  
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.dz_fs_dev.physics;

/**
 * Represents a rational number. A rational number is one which can be
 * represented as a fraction where both the numerator and denominator
 * is a member of Integer.
 * 
 * @author DZ-FSDev
 * @since 17.0.2
 * @version 0.0.21
 */
public class Rational extends Number implements Comparable<Rational>{
	/**
	 * @since 0.0.20
	 */
	private static final long serialVersionUID = -8501455433949295842L;
	private final long denominator;
	private final long numerator;

	/**
	 * Initializes a new instance of a Rational number equivalent in value.
	 * 
	 * @param value The value this rational number should represent.
	 * @since 0.0.5
	 */
	public Rational(long value) {
		this(value, 1);
	}

	/**
	 * Initializes a new instance of a Rational number given an integral
	 * numerator and denominator. Denominators will be normalized positive.
	 * 
	 * @param numerator The numerator of this rational number.
	 * @param denominator The denominator of this rational number.
	 * @since 0.0.13
	 */
	public Rational(long numerator, long denominator) {
		if(denominator == 0)throw new IllegalArgumentException("Denominator cannot be zero!");
		if(denominator < 0) {
			numerator *= -1;
			denominator *= -1;
		}

		long gcd = numerator == 0 ? denominator : Math.abs(gcd(numerator, denominator));
		this.denominator = denominator / gcd;
		this.numerator = numerator / gcd;
	}

	/**
	 * Returns a new Rational which represents the result of addition between
	 * this Rational and the Augend.
	 * 
	 * @param augend The other Rational to be added.
	 * @return A new Rational which represents the result of addition.
	 * @since 0.0.16
	 */
	public Rational add(Rational augend) {
		return new Rational(
				this.numerator * augend.denominator + augend.numerator * this.denominator,
				this.denominator * augend.denominator);
	}

	/**
	 * Returns a new Rational which represents the result of subtraction from
	 * this Rational, the subtrahend.
	 * 
	 * @param subtrahend The other Rational to be subtracted.
	 * @return A new Rational which represents the result of subtraction.
	 * @since 0.0.15
	 */
	public Rational subtract(Rational subtrahend) {
		return new Rational(
				this.numerator * subtrahend.denominator - subtrahend.numerator * this.denominator,
				this.denominator * subtrahend.denominator);
	}

	/**
	 * Returns a new Rational which represents the result of multiplication
	 * between this Rational and the Multiplicand.
	 * 
	 * @param multiplicand The other Rational to be multiplied.
	 * @return A new Rational which represents the result of multiplication.
	 * @since 0.0.17
	 */
	public Rational multiply(Rational multiplicand) {
		return new Rational(
				this.numerator * multiplicand.numerator,
				this.denominator * multiplicand.denominator);
	}

	/**
	 * Returns a new Rational which represents the result of division
	 * between this Rational and the Divisor.
	 * 
	 * @param division The other Rational to be divided.
	 * @return A new Rational which represents the result of division.
	 * @since 0.0.18
	 */
	public Rational divide(Rational divisor) {
		return new Rational(
				this.numerator * divisor.denominator,
				this.denominator * divisor.numerator);
	}

	/**
	 * @since 0.0.8
	 */
	@Override
	public int intValue() {
		return (int)(numerator / denominator);
	}

	/**
	 * @since 0.0.8
	 */
	@Override
	public long longValue() {
		return numerator / denominator;
	}

	/**
	 * @since 0.0.8
	 */
	@Override
	public float floatValue() {
		return (float)numerator / denominator;
	}

	/**
	 * @since 0.0.8
	 */
	@Override
	public double doubleValue() {
		return (double)numerator / denominator;
	}

	/**
	 * Finds the lowest common multiple of two numbers.
	 * 
	 * @param a The first number.
	 * @param b The second number.
	 * @return The lowest common multiple of the two numbers.
	 * @since 0.0.7
	 */
	private static long lcm(long a, long b) {
		if (a == 0 || b == 0)
			return 0;
		else
			return Math.abs(a * b) / gcd(a, b);
	}

	/**
	 * Recursively finds the greatest common divisor using Euclid's Algorithm
	 * for two numbers.
	 * 
	 * @param a The first number.
	 * @param b The second number.
	 * @return The greatest common divisor of the two numbers.
	 * @since 0.0.6
	 */
	private static long gcd(long a, long b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	/**
	 * @since 0.0.19
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (denominator ^ (denominator >>> 32));
		result = prime * result + (int) (numerator ^ (numerator >>> 32));
		return result;
	}

	/**
	 * @since 0.0.20
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Rational))
			return false;
		Rational other = (Rational) obj;
		if (denominator != other.denominator)
			return false;
		if (numerator != other.numerator)
			return false;
		return true;
	}

	@Override
	public int compareTo(Rational o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/**
	 * @since 0.0.21
	 */
	@Override
	public Rational clone() {
		return new Rational(numerator, denominator);
	}

	@Override
	public String toString() {
		return numerator + "/" + denominator;
	}
}
