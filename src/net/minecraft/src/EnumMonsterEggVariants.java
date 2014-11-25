package net.minecraft.src;
/*   1:    */ public enum EnumMonsterEggVariants
/*   2:    */   implements va
/*   3:    */ { a(0,"stone") {
					@Override
					public Block d() {
						return BlockList.stone.instance().a(bba.a, EnumStoneVariants.STONE);
					}
				},
				b(1,"cobblestone","cobble") {
					@Override
					public Block d() {
						return BlockList.cobblestone.instance();
					}
				},
				c(2,"stone_brick","brick") {
					@Override
					public Block d() {
						return BlockList.stoneBrick.instance().a(bbc.a, bbd.a);
					}
				},
				d(3,"mossy_brick","mossybrick") {
					@Override
					public Block d() {
						return BlockList.stoneBrick.instance().a(bbc.a, bbd.b);
					}
				},
				e(4,"cracked_brick","crackedbrick") {
					@Override
					public Block d() {
						return BlockList.stoneBrick.instance().a(bbc.a, bbd.c);
					}
				},
				f(5,"chiseled_brick","chiseledbrick") {
					@Override
					public Block d() {
						return BlockList.stoneBrick.instance().a(bbc.a, bbd.d);
					}
				};
/*   4:    */   private static final EnumMonsterEggVariants[] g;
/*   5:    */   private final int h;
/*   6:    */   private final String i;
/*   7:    */   private final String j;
/*   8:    */   
/*   9:    */   static
/*  10:    */   {
/*  11:144 */     g = new EnumMonsterEggVariants[values().length];
/*  12:146 */     for (EnumMonsterEggVariants localaxu : values()) {
/*  13:147 */       g[localaxu.a()] = localaxu;
/*  14:    */     }
/*  15:    */   }
/*  16:    */   
/*  17:    */   private EnumMonsterEggVariants(int paramInt, String paramString)
/*  18:    */   {
/*  19:152 */     this(paramInt, paramString, paramString);
/*  20:    */   }
/*  21:    */   
/*  22:    */   private EnumMonsterEggVariants(int paramInt, String paramString1, String paramString2)
/*  23:    */   {
/*  24:156 */     this.h = paramInt;
/*  25:157 */     this.i = paramString1;
/*  26:158 */     this.j = paramString2;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public int a()
/*  30:    */   {
/*  31:162 */     return this.h;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public String toString()
/*  35:    */   {
/*  36:171 */     return this.i;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public static EnumMonsterEggVariants a(int paramInt)
/*  40:    */   {
/*  41:175 */     if ((paramInt < 0) || (paramInt >= g.length)) {
/*  42:176 */       paramInt = 0;
/*  43:    */     }
/*  44:178 */     return g[paramInt];
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String toString2()
/*  48:    */   {
/*  49:183 */     return this.i;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public String c()
/*  53:    */   {
/*  54:187 */     return this.j;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public static EnumMonsterEggVariants a(Block parambec)
/*  58:    */   {
/*  59:193 */     for (EnumMonsterEggVariants localaxu : values()) {
/*  60:194 */       if (parambec == localaxu.d()) {
/*  61:195 */         return localaxu;
/*  62:    */       }
/*  63:    */     }
/*  64:199 */     return a;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public abstract Block d();
/*  68:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     axu
 * JD-Core Version:    0.7.0.1
 */