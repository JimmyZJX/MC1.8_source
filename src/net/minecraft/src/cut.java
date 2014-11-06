package net.minecraft.src;
class cut {
	static final int[] a;
	static
	{
		a=new int[EnumVertexElementType.values().length];
		try {a[EnumVertexElementType.NORMAL.ordinal()] = 1;} catch (NoSuchFieldError e) { }
		try {a[EnumVertexElementType.COLOR.ordinal()] = 2;} catch (NoSuchFieldError e) { }
		try {a[EnumVertexElementType.UV.ordinal()] = 3;} catch (NoSuchFieldError e) { }
	}
}


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cut
 * JD-Core Version:    0.7.0.1
 */