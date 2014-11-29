package net.minecraft.src;
class axj {
	static final int[] a;
	static final int[] b;
	static final int[] c;
	static {
		c=new int[EnumAxis.values().length];
		try {c[EnumAxis.X.ordinal()] = 1;} catch (NoSuchFieldError e) { }
		try {c[EnumAxis.Z.ordinal()] = 2;} catch (NoSuchFieldError e) { }
		b=new int[EnumLeverFacing.values().length];
		try {b[EnumLeverFacing.EAST.ordinal()] = 1;} catch (NoSuchFieldError e) { }
		try {b[EnumLeverFacing.WEST.ordinal()] = 2;} catch (NoSuchFieldError e) { }
		try {b[EnumLeverFacing.SOUTH.ordinal()] = 3;} catch (NoSuchFieldError e) { }
		try {b[EnumLeverFacing.NORTH.ordinal()] = 4;} catch (NoSuchFieldError e) { }
		try {b[EnumLeverFacing.UP_Z.ordinal()] = 5;} catch (NoSuchFieldError e) { }
		try {b[EnumLeverFacing.UP_X.ordinal()] = 6;} catch (NoSuchFieldError e) { }
		try {b[EnumLeverFacing.DOWN_X.ordinal()] = 7;} catch (NoSuchFieldError e) { }
		try {b[EnumLeverFacing.DOWN_Z.ordinal()] = 8;} catch (NoSuchFieldError e) { }
		a=new int[EnumDirection.values().length];
		try {a[EnumDirection.DOWN.ordinal()] = 1;} catch (NoSuchFieldError e) { }
		try {a[EnumDirection.UP.ordinal()] = 2;} catch (NoSuchFieldError e) { }
		try {a[EnumDirection.NORTH.ordinal()] = 3;} catch (NoSuchFieldError e) { }
		try {a[EnumDirection.SOUTH.ordinal()] = 4;} catch (NoSuchFieldError e) { }
		try {a[EnumDirection.WEST.ordinal()] = 5;} catch (NoSuchFieldError e) { }
		try {a[EnumDirection.EAST.ordinal()] = 6;} catch (NoSuchFieldError e) { }
	}
}


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     axj
 * JD-Core Version:    0.7.0.1
 */