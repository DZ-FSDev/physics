package com.dz_fs_dev.physics;

import java.lang.reflect.InvocationTargetException;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * Contains all International System of Units constants and definitions.
 * 
 * @author DZ-FSDev
 * @since 17.0.1
 * @version 0.0.5
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

	/**
	 * @since 0.05
	 */
	@Override
	public DerivedUnit inverse() {
		try {
			return this.getClass().getConstructor(new Class[] {Integer.TYPE}).newInstance(-this.order);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
