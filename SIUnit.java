/*  Original Licensing Copyright
 * 
 *  Contains all International System of Units constants and definitions.
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

import java.math.BigDecimal;

import lombok.Getter;

/**
 * Contains all International System of Units constants and definitions.
 * 
 * @see <a href=https://physics.nist.gov/cuu/Units/checklist.html>
 *      NIST SI Unit Rules and Style Conventions</a>
 * @author DZ-FSDev
 * @since 17.0.2
 * @version 0.0.22
 */
public abstract class SIUnit implements IUnit{
	/**
	 * Primary frequency standard in which the photon absorption by transitions between
	 * the two hyperfine ground states of cesium-133 atoms. Also known as the Cesium Standard.
	 * <br>
	 * <p>Measured in Hertz.
	 */
	final static BigDecimal HYPERFINE_TRANSITION_FREQUENCY_CESIUM = new BigDecimal("9192631770");

	/**
	 * The speed of light in a vacuum.
	 * <br>
	 * <p>Measured in Hertz.
	 */
	final static BigDecimal SPEED_OF_LIGHT = new BigDecimal("299792458");

	/**
	 * Predicts the spectral distribution of thermal black-body radiation.
	 * <br>
	 * <p>Measured in Joule seconds. 
	 */
	final static BigDecimal PLANCK = new BigDecimal("6.62607015e-34");

	/**
	 * The magnitude of electric charge carried by a single proton or, single electron.
	 * <br>
	 * <p>Measured in Coulombs. 
	 */
	final static BigDecimal ELEMENTARY_CHARGE = new BigDecimal("1.602176634e-19");

	/**
	 * Relates the average relative kinetic energy of particles with the thermodynamic temperature of gases.
	 * <br>
	 * <p>Measured in Joules per Kelvin. 
	 */
	final static BigDecimal BOLTZMANN = new BigDecimal("1.380649e-23");

	/**
	 * Relates the number of particles with the amount of substance in said sample.
	 * <br>
	 * <p>Measured in Mole<sup>-1</sup>. 
	 */
	final static BigDecimal AVAGADRO = new BigDecimal("6.02214076e+23");

	/**
	 * A measure of how well a light source producing monochromatic 540e<sup>12</sup> Hz radiation
	 * is visible to the human eye.
	 * <br>
	 * <p>Measured in Lumens per Watt. 
	 */
	final static BigDecimal LUMINOUS_EFFICACY = new BigDecimal("683");

	/** Electric Current */
	static class Ampere extends SIUnit implements IPowable<Ampere>{
		public Ampere(Rational order) {
			super(order);
		}

		@Override
		public String symbol() {
			return "A";
		}

		@Override
		public String name() {
			return "Ampere";
		}

		@Override
		public Ampere pow(int exponent) {
			return pow(new Rational(exponent));
		}

		@Override
		public Ampere pow(Rational exponent) {
			if(exponent.doubleValue() == 0)
				throw new IllegalArgumentException(
						String.format("Cannot raise %s to the power of 0!", 
								this.getClass().getName()));

			return new Ampere(exponent.multiply(this.getOrder()));
		}
	}

	/** Luminous Intensity */
	static class Candela extends SIUnit implements IPowable<Candela>{
		public Candela(Rational order) {
			super(order);
		}

		@Override
		public String symbol() {
			return "cd";
		}

		@Override
		public String name() {
			return "Candela";
		}

		@Override
		public Candela pow(int exponent) {
			return pow(new Rational(exponent));
		}

		@Override
		public Candela pow(Rational exponent) {
			if(exponent.doubleValue() == 0)
				throw new IllegalArgumentException(
						String.format("Cannot raise %s to the power of 0!", 
								this.getClass().getName()));

			return new Candela(exponent.multiply(this.getOrder()));
		}
	}

	/** Thermodynamic Temperature */
	static class Kelvin extends SIUnit implements IPowable<Kelvin>{
		public Kelvin(Rational order) {
			super(order);
		}

		@Override
		public String symbol() {
			return "K";
		}

		@Override
		public String name() {
			return "Kelvin";
		}

		@Override
		public Kelvin pow(int exponent) {
			return pow(new Rational(exponent));
		}

		@Override
		public Kelvin pow(Rational exponent) {
			// TODO Auto-generated method stub
			return null;
		}
	}

	/** Mass */
	static class Gram extends SIUnit implements IPowable<Gram>{
		public Gram(Rational order) {
			super(order);
		}

		@Override
		public String symbol() {
			return "g";
		}

		@Override
		public String name() {
			return "Gram";
		}

		@Override
		public Gram pow(int exponent) {
			return pow(new Rational(exponent));
		}

		@Override
		public Gram pow(Rational exponent) {
			// TODO Auto-generated method stub
			return null;
		}
	}

	/** Distance */
	static class Meter extends SIUnit implements IPowable<Meter>{
		public Meter(Rational order) {
			super(order);
		}

		@Override
		public String symbol() {
			return "m";
		}

		@Override
		public String name() {
			return "Meter";
		}

		@Override
		public Meter pow(int exponent) {
			return pow(new Rational(exponent));
		}

		@Override
		public Meter pow(Rational exponent) {
			// TODO Auto-generated method stub
			return null;
		}
	}

	/** Substance */
	static class Mole extends SIUnit implements IPowable<Mole>{
		public Mole(Rational order) {
			super(order);
		}

		@Override
		public String symbol() {
			return "mol";
		}

		@Override
		public String name() {
			return "Mole";
		}

		@Override
		public Mole pow(int exponent) {
			return pow(new Rational(exponent));
		}

		@Override
		public Mole pow(Rational exponent) {
			// TODO Auto-generated method stub
			return null;
		}
	}

	/** Time */
	static class Second extends SIUnit implements IPowable<Second>{
		public Second(Rational order) {
			super(order);
		}

		@Override
		public String symbol() {
			return "s";
		}

		@Override
		public String name() {
			return "Second";
		}

		@Override
		public Second pow(int exponent) {
			return pow(new Rational(exponent));
		}

		@Override
		public Second pow(Rational exponent) {
			// TODO Auto-generated method stub
			return null;
		}
	}

	private @Getter Rational order;

	/**
	 * 
	 * @param order
	 * @since 0.0.19
	 */
	private SIUnit(Rational order) {
		this.order = order;
	}

	/**
	 * @since 0.0.7
	 */
	@Override
	public IUnit divideBy(IUnit o) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @since 0.0.7
	 */
	@Override
	public IUnit multiplyBy(IUnit o) {
		// TODO Auto-generated method stub
		return null;
	}
}
