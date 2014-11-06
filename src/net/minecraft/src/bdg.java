package net.minecraft.src;
/*  1:   */ public class bdg
/*  2:   */   extends bcm
/*  3:   */   implements pm
/*  4:   */ {
/*  5:13 */   private final aqi a = new bdh(this);
/*  6:   */   
/*  7:   */   public void a(NBTTagCompound paramfn)
/*  8:   */   {
/*  9:43 */     super.a(paramfn);
/* 10:44 */     this.a.a(paramfn);
/* 11:   */   }
/* 12:   */   
/* 13:   */   public void b(NBTTagCompound paramfn)
/* 14:   */   {
/* 15:49 */     super.b(paramfn);
/* 16:50 */     this.a.b(paramfn);
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void c()
/* 20:   */   {
/* 21:55 */     this.a.c();
/* 22:   */   }
/* 23:   */   
/* 24:   */   public id x_()
/* 25:   */   {
/* 26:60 */     NBTTagCompound localfn = new NBTTagCompound();
/* 27:61 */     b(localfn);
/* 28:62 */     localfn.o("SpawnPotentials");
/* 29:63 */     return new iu(this.c, 1, localfn);
/* 30:   */   }
/* 31:   */   
/* 32:   */   public boolean c(int paramInt1, int paramInt2)
/* 33:   */   {
/* 34:68 */     if (this.a.b(paramInt1)) {
/* 35:69 */       return true;
/* 36:   */     }
/* 37:71 */     return super.c(paramInt1, paramInt2);
/* 38:   */   }
/* 39:   */   
/* 40:   */   public aqi b()
/* 41:   */   {
/* 42:75 */     return this.a;
/* 43:   */   }
/* 44:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bdg
 * JD-Core Version:    0.7.0.1
 */