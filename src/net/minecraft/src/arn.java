package net.minecraft.src;
class arn {
	static final int[] a;
	static {
		a=new int[EnumCreatureType.values().length];
		try {a[EnumCreatureType.MONSTER.ordinal()] = 1;} catch (NoSuchFieldError e) { }
		try {a[EnumCreatureType.CREATURE.ordinal()] = 2;} catch (NoSuchFieldError e) { }
		try {a[EnumCreatureType.WATER_CREATURE.ordinal()] = 3;} catch (NoSuchFieldError e) { }
		try {a[EnumCreatureType.AMBIENT.ordinal()] = 4;} catch (NoSuchFieldError e) { }
	}
}


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     arn
 * JD-Core Version:    0.7.0.1
 */