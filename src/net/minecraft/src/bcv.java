package net.minecraft.src;
/*  1:   */ public class bcv
/*  2:   */   extends bcm
/*  3:   */ {
/*  4:   */   private int a;
/*  5:   */   
/*  6:   */   public void b(NBTTagCompound paramfn)
/*  7:   */   {
/*  8:10 */     super.b(paramfn);
/*  9:11 */     paramfn.setInt("OutputSignal", this.a);
/* 10:   */   }
/* 11:   */   
/* 12:   */   public void a(NBTTagCompound paramfn)
/* 13:   */   {
/* 14:16 */     super.a(paramfn);
/* 15:17 */     this.a = paramfn.getInteger("OutputSignal");
/* 16:   */   }
/* 17:   */   
/* 18:   */   public int b()
/* 19:   */   {
/* 20:21 */     return this.a;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void a(int paramInt)
/* 24:   */   {
/* 25:25 */     this.a = paramInt;
/* 26:   */   }
/* 27:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bcv
 * JD-Core Version:    0.7.0.1
 */