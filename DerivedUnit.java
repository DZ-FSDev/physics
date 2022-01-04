package com.dz_fs_dev.physics;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * Contains all International System of Units constants and definitions.
 * 
 * @author DZ-FSDev
 * @since 17.0.1
 * @version 0.0.3
 */
public abstract class DerivedUnit implements IUnit{
	static final class Newton extends DerivedUnit {
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
	}

	private @Getter(AccessLevel.PRIVATE) @Setter(AccessLevel.PRIVATE) SIUnit[] constituents;

	private DerivedUnit(SIUnit[] constituents) {
		this.setConstituents(constituents);
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

	@Override
	public IUnit squared() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IUnit cubed() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IUnit pow(int exponent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IUnit inverse() {
		// TODO Auto-generated method stub
		return null;
	}
}
