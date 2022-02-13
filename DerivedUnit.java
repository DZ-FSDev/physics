package com.dz_fs_dev.physics;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * Contains all International System of Units constants and definitions.
 * 
 * @author DZ-FSDev
 * @since 17.0.1
 * @version 0.0.7
 */
public abstract class DerivedUnit implements IUnit{
	/**
	 * @since 0.0.7
	 */
	static final class Newton extends DerivedUnit implements IPowable<Newton>{
		public Newton() {
			super(new SIUnit[] {new SIUnit.Meter(1), new SIUnit.Gram(1),
					new SIUnit.Second(-2)});
		}

		@Override
		public String symbol() {
			return "N";
		}

		@Override
		public String name() {
			return "Newton";
		}

		@Override
		public Newton pow(int exponent) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Newton pow(Rational exponent) {
			// TODO Auto-generated method stub
			return null;
		}
	}
	
	/**
	 * @since 0.0.7
	 */
	static final class Volt extends DerivedUnit implements IPowable<Volt> {
		public Volt() {
			super(new SIUnit[] {new SIUnit.Gram(3), new SIUnit.Meter(1), 
					new SIUnit.Ampere(-1), new SIUnit.Second(-3)});
		}

		@Override
		public String symbol() {
			return "V";
		}

		@Override
		public String name() {
			return "Volt";
		}

		@Override
		public Volt pow(int exponent) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Volt pow(Rational exponent) {
			// TODO Auto-generated method stub
			return null;
		}
	}

	private @Getter(AccessLevel.PRIVATE) @Setter(AccessLevel.PRIVATE) SIUnit[] constituents;
	
	private final int order;

	private DerivedUnit(SIUnit[] constituents) {
		this.setConstituents(constituents);
		order = 1;
	}
	
	@Override
	public int getOrder() {
		return this.order;
	}

	@Override
	public IUnit divideBy(IUnit o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IUnit multiplyBy(IUnit o) {
		// TODO Auto-generated method stub
		return null;
	}
}
