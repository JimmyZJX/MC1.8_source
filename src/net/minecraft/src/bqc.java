package net.minecraft.src;
/*  1:   */ public abstract class bqc
/*  2:   */ {
/*  3:   */   public final String a;
/*  4:   */   private boolean b;
/*  5:   */   
/*  6:   */   public bqc(String paramString)
/*  7:   */   {
/*  8:10 */     this.a = paramString;
/*  9:   */   }
/* 10:   */   
/* 11:   */   public abstract void a(NBTTagCompound paramfn);
/* 12:   */   
/* 13:   */   public abstract void b(NBTTagCompound paramfn);
/* 14:   */   
/* 15:   */   public void c()
/* 16:   */   {
/* 17:18 */     a(true);
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void a(boolean paramBoolean)
/* 21:   */   {
/* 22:22 */     this.b = paramBoolean;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public boolean d()
/* 26:   */   {
/* 27:26 */     return this.b;
/* 28:   */   }
/* 29:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bqc
 * JD-Core Version:    0.7.0.1
 */