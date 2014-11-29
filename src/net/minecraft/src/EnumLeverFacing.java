package net.minecraft.src;
/*   1:    */ public enum EnumLeverFacing
/*   2:    */   implements va
/*   3:    */ { DOWN_X(0,"down_x",EnumDirection.DOWN),
				EAST(1,"east",EnumDirection.EAST),
				WEST(2,"west",EnumDirection.WEST),
				SOUTH(3,"south",EnumDirection.SOUTH),
				NORTH(4,"north",EnumDirection.NORTH),
				UP_Z(5,"up_z",EnumDirection.UP),
				UP_X(6,"up_x",EnumDirection.UP),
				DOWN_Z(7,"down_z",EnumDirection.DOWN);
/*   4:    */   private static final EnumLeverFacing[] i;
/*   5:    */   private final int j;
/*   6:    */   private final String k;
/*   7:    */   private final EnumDirection l;
/*   8:    */   
/*   9:    */   static
/*  10:    */   {
/*  11:260 */     i = new EnumLeverFacing[values().length];
/*  12:262 */     for (EnumLeverFacing localaxk : values()) {
/*  13:263 */       i[localaxk.a()] = localaxk;
/*  14:    */     }
/*  15:    */   }
/*  16:    */   
/*  17:    */   private EnumLeverFacing(int paramInt, String paramString, EnumDirection paramej)
/*  18:    */   {
/*  19:268 */     this.j = paramInt;
/*  20:269 */     this.k = paramString;
/*  21:270 */     this.l = paramej;
/*  22:    */   }
/*  23:    */   
/*  24:    */   public int a()
/*  25:    */   {
/*  26:274 */     return this.j;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public EnumDirection c()
/*  30:    */   {
/*  31:282 */     return this.l;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public String toString()
/*  35:    */   {
/*  36:287 */     return this.k;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public static EnumLeverFacing a(int paramInt)
/*  40:    */   {
/*  41:291 */     if ((paramInt < 0) || (paramInt >= i.length)) {
/*  42:292 */       paramInt = 0;
/*  43:    */     }
/*  44:294 */     return i[paramInt];
/*  45:    */   }
/*  46:    */   
/*  47:    */   public static EnumLeverFacing a(EnumDirection paramej1, EnumDirection paramej2)
/*  48:    */   {
/*  49:298 */     switch (axj.a[paramej1.ordinal()])
/*  50:    */     {
/*  51:    */     case 1: 
/*  52:300 */       switch (axj.c[paramej2.getAxis().ordinal()])
/*  53:    */       {
/*  54:    */       case 1: 
/*  55:302 */         return DOWN_X;
/*  56:    */       case 2: 
/*  57:304 */         return DOWN_Z;
/*  58:    */       }
/*  59:306 */       throw new IllegalArgumentException("Invalid entityFacing " + paramej2 + " for facing " + paramej1);
/*  60:    */     case 2: 
/*  61:309 */       switch (axj.c[paramej2.getAxis().ordinal()])
/*  62:    */       {
/*  63:    */       case 1: 
/*  64:311 */         return UP_X;
/*  65:    */       case 2: 
/*  66:313 */         return UP_Z;
/*  67:    */       }
/*  68:315 */       throw new IllegalArgumentException("Invalid entityFacing " + paramej2 + " for facing " + paramej1);
/*  69:    */     case 3: 
/*  70:318 */       return NORTH;
/*  71:    */     case 4: 
/*  72:320 */       return SOUTH;
/*  73:    */     case 5: 
/*  74:322 */       return WEST;
/*  75:    */     case 6: 
/*  76:324 */       return EAST;
/*  77:    */     }
/*  78:327 */     throw new IllegalArgumentException("Invalid facing: " + paramej1);
/*  79:    */   }
/*  80:    */   
/*  81:    */   public String toString2()
/*  82:    */   {
/*  83:332 */     return this.k;
/*  84:    */   }
/*  85:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     axk
 * JD-Core Version:    0.7.0.1
 */