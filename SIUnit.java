package com.dz_fs_dev.physics;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

/**
 * Contains all International System of Units constants and definitions.
 * 
 * @author DZ_FSDev
 * @since 17.0.1
 * @version 0.0.7
 */
public enum SIUnit implements IUnit{
	/** Electric Current */
	AMPERE(BigDecimal.ZERO){
		@Override
		public String symbol() {
			return "A";
		}
	},
	
	/** Luminous Intensity */
	CANDELA(BigDecimal.ZERO){
		@Override
		public String symbol() {
			return "cd";
		}
	},
	
	/** Thermodynamic Temperature */
	KELVIN(BigDecimal.ZERO){
		@Override
		public String symbol() {
			return "K";
		}
	},
	
	/** Mass */
	KILOGRAM(BigDecimal.ZERO){
		@Override
		public String symbol() {
			return "g";
		}
	},
	
	/** Distance */
	METER(BigDecimal.ZERO){
		@Override
		public String symbol() {
			return "m";
		}
	},
	
	/** Substance */
	MOLE(BigDecimal.ZERO){
		@Override
		public String symbol() {
			return "mol";
		}
	},
	
	/** Time */
	SECOND(BigDecimal.ZERO){
		@Override
		public String symbol() {
			return "s";
		}
	};
	
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
	final static BigDecimal PLANCK = new BigDecimal("6.62607015e−34");
	
	/**
	 * The magnitude of electric charge carried by a single proton or, single electron.
	 * <br>
	 * <p>Measured in Coulombs. 
	 */
	final static BigDecimal ELEMENTARY_CHARGE = new BigDecimal("1.602176634e−19");
	
	/**
	 * Relates the average relative kinetic energy of particles with the thermodynamic temperature of gases.
	 * <br>
	 * <p>Measured in Joules per Kelvin. 
	 */
	final static BigDecimal BOLTZMANN = new BigDecimal("1.380649e−23");
	
	/**
	 * Relates the number of particles with the amount of substance in said sample.
	 * <br>
	 * <p>Measured in Mole<sup>-1</sup>. 
	 */
	final static BigDecimal AVAGADRO = new BigDecimal("6.02214076e23");
	
	/**
	 * A measure of how well a light source producing monochromatic 540e<sup>12</sup> Hz radiation
	 * is visible to the human eye.
	 * <br>
	 * <p>Measured in Lumens per Watt. 
	 */
	final static BigDecimal LUMINOUS_EFFICACY = new BigDecimal("683");
	
	private @Getter @Setter BigDecimal value;
	
	private SIUnit(BigDecimal value) {
		this.setValue(value);
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
	
	/**
	 * @since 0.0.5
	 */
	@Override
	public boolean canAdd(IUnit o) {
		return o.symbol().equals(this.symbol());
	}
}
