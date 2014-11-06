package net.minecraft.src;
/*   1:    */ public enum em
/*   2:    */ { a(1,"Towards positive"),b(-1,"Towards negative");
/*   3:    */   private final int c;
/*   4:    */   private final String d;
/*   5:    */   
/*   6:    */   private em(int paramInt, String paramString)
/*   7:    */   {
/*   8:377 */     this.c = paramInt;
/*   9:378 */     this.d = paramString;
/*  10:    */   }
/*  11:    */   
/*  12:    */   public int a()
/*  13:    */   {
/*  14:382 */     return this.c;
/*  15:    */   }
/*  16:    */   
/*  17:    */   public String toString()
/*  18:    */   {
/*  19:391 */     return this.d;
/*  20:    */   }
/*  21:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     em
 * JD-Core Version:    0.7.0.1
 */