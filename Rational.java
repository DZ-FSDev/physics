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
 * @version 0.0.8
 * @since 17.0.1
 */
public class Rational extends Number implements Comparable<Rational>{
	/**
	 * @since 0.0.1
	 */
	private static final long serialVersionUID = 957014047269914354L;
	
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
	 * numerator and denominator.
	 * 
	 * @param numerator The numerator of this rational number.
	 * @param denominator The denominator of this rational number.
	 * @since 0.0.5
	 */
	public Rational(long numerator, long denominator) {
		this.denominator = denominator;
		this.numerator = numerator;
	}

	public Rational add(Rational augend) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Rational subtract(Rational subtrahend) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Rational multiply(Rational multiplicand) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Rational divide(Rational divisor) {
		// TODO Auto-generated method stub
		return null;
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

	@Override
	public int compareTo(Rational o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
