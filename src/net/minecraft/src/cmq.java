package net.minecraft.src;
class cmq {
	static final int[] a;
	static final int[] b;
	static {
		b=new int[EnumAxis.values().length];
		try {b[EnumAxis.X.ordinal()] = 1;} catch (NoSuchFieldError e) { }
		try {b[EnumAxis.Y.ordinal()] = 2;} catch (NoSuchFieldError e) { }
		try {b[EnumAxis.Z.ordinal()] = 3;} catch (NoSuchFieldError e) { }
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
 * Qualified Name:     cmq
 * JD-Core Version:    0.7.0.1
 */