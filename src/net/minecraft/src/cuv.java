package net.minecraft.src;
/*   1:    */ public enum cuv
/*   2:    */ { FLOAT(4,"Float",5126),
				UBYTE(1,"Unsigned Byte",5121),
				BYTE(1,"Byte",5120),
				USHORT(2,"Unsigned Short",5123),
				SHORT(2,"Short",5122),
				UINT(4,"Unsigned Int",5125),
				INT(4,"Int",5124);
/*   3:    */   private final int size;
/*   4:    */   private final String i;
/*   5:    */   private final int j;
/*   6:    */   
/*   7:    */   private cuv(int paramInt1, String paramString, int paramInt2)
/*   8:    */   {
/*   9:145 */     this.size = paramInt1;
/*  10:146 */     this.i = paramString;
/*  11:147 */     this.j = paramInt2;
/*  12:    */   }
/*  13:    */   
/*  14:    */   public int getSize()
/*  15:    */   {
/*  16:151 */     return this.size;
/*  17:    */   }
/*  18:    */   
/*  19:    */   public String b()
/*  20:    */   {
/*  21:155 */     return this.i;
/*  22:    */   }
/*  23:    */   
/*  24:    */   public int c()
/*  25:    */   {
/*  26:159 */     return this.j;
/*  27:    */   }
/*  28:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cuv
 * JD-Core Version:    0.7.0.1
 */