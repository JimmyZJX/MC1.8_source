package net.minecraft.src;
class aum {
	static final int[] a;
	static {
		a=new int[EnumDirection.values().length];
		try {a[EnumDirection.SOUTH.ordinal()] = 1;} catch (NoSuchFieldError e) { }
		try {a[EnumDirection.NORTH.ordinal()] = 2;} catch (NoSuchFieldError e) { }
		try {a[EnumDirection.WEST.ordinal()] = 3;} catch (NoSuchFieldError e) { }
		try {a[EnumDirection.EAST.ordinal()] = 4;} catch (NoSuchFieldError e) { }
	}
}


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aum
 * JD-Core Version:    0.7.0.1
 */