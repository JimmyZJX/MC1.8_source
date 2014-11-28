package net.minecraft.src;
/*   1:    */ public final class WorldSettings
/*   2:    */ {
/*   3:    */   private final long a;
/*   4:    */   private final EnumGameMode b;
/*   5:    */   private final boolean c;
/*   6:    */   private final boolean d;
/*   7:    */   private final WorldType e;
/*   8:    */   private boolean f;
/*   9:    */   private boolean g;
/*  10: 88 */   private String h = "";
/*  11:    */   
/*  12:    */   public WorldSettings(long paramLong, EnumGameMode paramarc, boolean paramBoolean1, boolean paramBoolean2, WorldType paramare)
/*  13:    */   {
/*  14: 91 */     this.a = paramLong;
/*  15: 92 */     this.b = paramarc;
/*  16: 93 */     this.c = paramBoolean1;
/*  17: 94 */     this.d = paramBoolean2;
/*  18: 95 */     this.e = paramare;
/*  19:    */   }
/*  20:    */   
/*  21:    */   public WorldSettings(WorldInfo parambqo)
/*  22:    */   {
/*  23: 99 */     this(parambqo.b(), parambqo.r(), parambqo.s(), parambqo.isHardcore(), parambqo.u());
/*  24:    */   }
/*  25:    */   
/*  26:    */   public WorldSettings a()
/*  27:    */   {
/*  28:103 */     this.g = true;
/*  29:104 */     return this;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public WorldSettings b()
/*  33:    */   {
/*  34:108 */     this.f = true;
/*  35:109 */     return this;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public WorldSettings a(String paramString)
/*  39:    */   {
/*  40:113 */     this.h = paramString;
/*  41:114 */     return this;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public boolean c()
/*  45:    */   {
/*  46:118 */     return this.g;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public long getSeed()
/*  50:    */   {
/*  51:122 */     return this.a;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public EnumGameMode getGameType()
/*  55:    */   {
/*  56:126 */     return this.b;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public boolean f()
/*  60:    */   {
/*  61:130 */     return this.d;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public boolean g()
/*  65:    */   {
/*  66:134 */     return this.c;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public WorldType h()
/*  70:    */   {
/*  71:138 */     return this.e;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public boolean i()
/*  75:    */   {
/*  76:142 */     return this.f;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public static EnumGameMode a(int paramInt)
/*  80:    */   {
/*  81:146 */     return EnumGameMode.a(paramInt);
/*  82:    */   }
/*  83:    */   
/*  84:    */   public String j()
/*  85:    */   {
/*  86:150 */     return this.h;
/*  87:    */   }
/*  88:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     arb
 * JD-Core Version:    0.7.0.1
 */