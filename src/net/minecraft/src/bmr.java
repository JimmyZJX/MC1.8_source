package net.minecraft.src;
/*  1:   */ public class bmr
/*  2:   */   extends bqc
/*  3:   */ {
/*  4:   */   private NBTTagCompound b;
/*  5:   */   
/*  6:   */   public bmr(String paramString)
/*  7:   */   {
/*  8:11 */     super(paramString);
/*  9:12 */     this.b = new NBTTagCompound();
/* 10:   */   }
/* 11:   */   
/* 12:   */   public void readFromNBT(NBTTagCompound paramfn)
/* 13:   */   {
/* 14:17 */     this.b = paramfn.getCompoundTag("Features");
/* 15:   */   }
/* 16:   */   
/* 17:   */   public void writeToNBT(NBTTagCompound paramfn)
/* 18:   */   {
/* 19:22 */     paramfn.setNBT("Features", this.b);
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void a(NBTTagCompound paramfn, int paramInt1, int paramInt2)
/* 23:   */   {
/* 24:30 */     this.b.setNBT(b(paramInt1, paramInt2), paramfn);
/* 25:   */   }
/* 26:   */   
/* 27:   */   public static String b(int paramInt1, int paramInt2)
/* 28:   */   {
/* 29:34 */     return "[" + paramInt1 + "," + paramInt2 + "]";
/* 30:   */   }
/* 31:   */   
/* 32:   */   public NBTTagCompound a()
/* 33:   */   {
/* 34:38 */     return this.b;
/* 35:   */   }
/* 36:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bmr
 * JD-Core Version:    0.7.0.1
 */