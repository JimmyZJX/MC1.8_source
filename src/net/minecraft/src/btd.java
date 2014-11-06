package net.minecraft.src;
class btd {
	static final int[] a;
	static final int[] b;
	static {
		b=new int[EnumMinecartVariant.values().length];
		try {b[EnumMinecartVariant.c.ordinal()] = 1;} catch (NoSuchFieldError e) { }
		try {b[EnumMinecartVariant.b.ordinal()] = 2;} catch (NoSuchFieldError e) { }
		try {b[EnumMinecartVariant.d.ordinal()] = 3;} catch (NoSuchFieldError e) { }
		try {b[EnumMinecartVariant.f.ordinal()] = 4;} catch (NoSuchFieldError e) { }
		try {b[EnumMinecartVariant.g.ordinal()] = 5;} catch (NoSuchFieldError e) { }
		a=new int[brv.values().length];
		try {a[brv.ENTITY.ordinal()] = 1;} catch (NoSuchFieldError e) { }
		try {a[brv.BLOCK.ordinal()] = 2;} catch (NoSuchFieldError e) { }
		try {a[brv.MISS.ordinal()] = 3;} catch (NoSuchFieldError e) { }
	}
}


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     btd
 * JD-Core Version:    0.7.0.1
 */