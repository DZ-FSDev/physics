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
 * @version 0.0.4
 * @since 17.0.1
 */
public class Rational extends Number implements Comparable<Rational>{
	/**
	 * @since 0.0.1
	 */
	private static final long serialVersionUID = 957014047269914354L;
	
	private final int denominator;
	private final int numerator;
	
	/**
	 * Initializes a new instance of a Rational number.
	 * 
	 * @param denominator
	 * @param numerator
	 */
	public Rational(int denominator, int numerator) {
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
	
	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compareTo(Rational o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
