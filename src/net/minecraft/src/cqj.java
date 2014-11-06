package net.minecraft.src;
class cqj {
	static final int[] a;
	static {
		a=new int[cmz.values().length];
		try {a[cmz.NONE.ordinal()] = 1;} catch (NoSuchFieldError e) { }
		try {a[cmz.THIRD_PERSON.ordinal()] = 2;} catch (NoSuchFieldError e) { }
		try {a[cmz.FIRST_PERSON.ordinal()] = 3;} catch (NoSuchFieldError e) { }
		try {a[cmz.HEAD.ordinal()] = 4;} catch (NoSuchFieldError e) { }
		try {a[cmz.GUI.ordinal()] = 5;} catch (NoSuchFieldError e) { }
	}
}


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cqj
 * JD-Core Version:    0.7.0.1
 */