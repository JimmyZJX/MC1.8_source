package net.minecraft.src;
/*   1:    */ class bsv
/*   2:    */   implements tm
/*   3:    */ {
				private final bsu a;
/*   4:    */   bsv(bsu parambsu) {a=parambsu;}
/*   5:    */   
/*   6:    */   public String a(String paramString)
/*   7:    */   {
/*   8:    */     try
/*   9:    */     {
/*  10:405 */       return String.format(paramString, new Object[] { bto.c(this.a.t.aa.i()) });
/*  11:    */     }
/*  12:    */     catch (Exception localException)
/*  13:    */     {
/*  14:407 */       return "Error: " + localException.getLocalizedMessage();
/*  15:    */     }
/*  16:    */   }
/*  17:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bsv
 * JD-Core Version:    0.7.0.1
 */