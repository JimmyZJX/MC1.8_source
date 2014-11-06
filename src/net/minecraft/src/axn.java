package net.minecraft.src;
class axn {
	static final int[] a;
	static {
		a=new int[EnumAxis.values().length];
		try {a[EnumAxis.X.ordinal()] = 1;} catch (NoSuchFieldError e) { }
		try {a[EnumAxis.Y.ordinal()] = 2;} catch (NoSuchFieldError e) { }
		try {a[EnumAxis.Z.ordinal()] = 3;} catch (NoSuchFieldError e) { }
	}
}


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     axn
 * JD-Core Version:    0.7.0.1
 */