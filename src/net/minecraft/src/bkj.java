package net.minecraft.src;
class bkj {
	static final int[] a;
	static {
		a=new int[EnumDirection.values().length];
		try {a[EnumDirection.NORTH.ordinal()] = 1;} catch (NoSuchFieldError e) { }
		try {a[EnumDirection.SOUTH.ordinal()] = 2;} catch (NoSuchFieldError e) { }
		try {a[EnumDirection.WEST.ordinal()] = 3;} catch (NoSuchFieldError e) { }
	}
}


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bkj
 * JD-Core Version:    0.7.0.1
 */