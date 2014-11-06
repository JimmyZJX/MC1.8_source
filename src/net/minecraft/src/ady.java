package net.minecraft.src;
class ady {
	static final int[] a;
	static final int[] b;
	static {
		b=new int[EnumRailState.values().length];
		try {b[EnumRailState.c.ordinal()] = 1;} catch (NoSuchFieldError e) { }
		try {b[EnumRailState.d.ordinal()] = 2;} catch (NoSuchFieldError e) { }
		try {b[EnumRailState.e.ordinal()] = 3;} catch (NoSuchFieldError e) { }
		try {b[EnumRailState.f.ordinal()] = 4;} catch (NoSuchFieldError e) { }
		a=new int[EnumMinecartVariant.values().length];
		try {a[EnumMinecartVariant.b.ordinal()] = 1;} catch (NoSuchFieldError e) { }
		try {a[EnumMinecartVariant.c.ordinal()] = 2;} catch (NoSuchFieldError e) { }
		try {a[EnumMinecartVariant.d.ordinal()] = 3;} catch (NoSuchFieldError e) { }
		try {a[EnumMinecartVariant.e.ordinal()] = 4;} catch (NoSuchFieldError e) { }
		try {a[EnumMinecartVariant.f.ordinal()] = 5;} catch (NoSuchFieldError e) { }
		try {a[EnumMinecartVariant.g.ordinal()] = 6;} catch (NoSuchFieldError e) { }
	}
}


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ady
 * JD-Core Version:    0.7.0.1
 */