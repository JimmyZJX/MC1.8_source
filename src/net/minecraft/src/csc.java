package net.minecraft.src;
class csc {
	static final int[] a;
	static {
		a=new int[EnumArmorMaterial.values().length];
		try {a[EnumArmorMaterial.LEATHER.ordinal()] = 1;} catch (NoSuchFieldError e) { }
		try {a[EnumArmorMaterial.CHAIN.ordinal()] = 2;} catch (NoSuchFieldError e) { }
		try {a[EnumArmorMaterial.IRON.ordinal()] = 3;} catch (NoSuchFieldError e) { }
		try {a[EnumArmorMaterial.d.ordinal()] = 4;} catch (NoSuchFieldError e) { }
		try {a[EnumArmorMaterial.e.ordinal()] = 5;} catch (NoSuchFieldError e) { }
	}
}


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     csc
 * JD-Core Version:    0.7.0.1
 */