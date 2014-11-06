package net.minecraft.src;
class cqw {
	static final int[] a;
	static {
		a=new int[bsg.values().length];
		try {a[bsg.ALWAYS.ordinal()] = 1;} catch (NoSuchFieldError e) { }
		try {a[bsg.NEVER.ordinal()] = 2;} catch (NoSuchFieldError e) { }
		try {a[bsg.HIDE_FOR_OTHER_TEAMS.ordinal()] = 3;} catch (NoSuchFieldError e) { }
		try {a[bsg.HIDE_FOR_OWN_TEAM.ordinal()] = 4;} catch (NoSuchFieldError e) { }
	}
}


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cqw
 * JD-Core Version:    0.7.0.1
 */