package net.minecraft.src;
class ek {
	static final int[] a;
	static final int[] b;
	static final int[] c;
	static {
		c=new int[en.values().length];
		try {c[en.HORIZONTAL.ordinal()] = 1;} catch (NoSuchFieldError e) { }
		try {c[en.VERTICAL.ordinal()] = 2;} catch (NoSuchFieldError e) { }
		b=new int[EnumDirection.values().length];
		try {b[EnumDirection.NORTH.ordinal()] = 1;} catch (NoSuchFieldError e) { }
		try {b[EnumDirection.EAST.ordinal()] = 2;} catch (NoSuchFieldError e) { }
		try {b[EnumDirection.SOUTH.ordinal()] = 3;} catch (NoSuchFieldError e) { }
		try {b[EnumDirection.WEST.ordinal()] = 4;} catch (NoSuchFieldError e) { }
		try {b[EnumDirection.UP.ordinal()] = 5;} catch (NoSuchFieldError e) { }
		try {b[EnumDirection.DOWN.ordinal()] = 6;} catch (NoSuchFieldError e) { }
		a=new int[EnumAxis.values().length];
		try {a[EnumAxis.X.ordinal()] = 1;} catch (NoSuchFieldError e) { }
		try {a[EnumAxis.Y.ordinal()] = 2;} catch (NoSuchFieldError e) { }
		try {a[EnumAxis.Z.ordinal()] = 3;} catch (NoSuchFieldError e) { }
	}
}


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ek
 * JD-Core Version:    0.7.0.1
 */