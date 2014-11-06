package net.minecraft.src;
class blu {
	static final int[] a;
	static final int[] b;
	static {
		b=new int[EnumDirection.values().length];
		try {b[EnumDirection.NORTH.ordinal()] = 1;} catch (NoSuchFieldError e) { }
		try {b[EnumDirection.SOUTH.ordinal()] = 2;} catch (NoSuchFieldError e) { }
		try {b[EnumDirection.WEST.ordinal()] = 3;} catch (NoSuchFieldError e) { }
		try {b[EnumDirection.EAST.ordinal()] = 4;} catch (NoSuchFieldError e) { }
		a=new int[bml.values().length];
		try {a[bml.a.ordinal()] = 1;} catch (NoSuchFieldError e) { }
		try {a[bml.b.ordinal()] = 2;} catch (NoSuchFieldError e) { }
		try {a[bml.c.ordinal()] = 3;} catch (NoSuchFieldError e) { }
		try {a[bml.d.ordinal()] = 4;} catch (NoSuchFieldError e) { }
	}
}


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     blu
 * JD-Core Version:    0.7.0.1
 */