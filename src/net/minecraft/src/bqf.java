package net.minecraft.src;
/*  2:   */ 
/*  3:   */ public class bqf
/*  4:   */ {
/*  5:   */   public final EntityPlayer a;
			  private final bqe c;
/*  6:32 */   private boolean d = true;
/*  7:33 */   private int e = 0;
/*  8:34 */   private int f = 0;
/*  9:35 */   private int g = 127;
/* 10:36 */   private int h = 127;
/* 11:   */   private int i;
/* 12:   */   public int b;
/* 13:   */   
/* 14:   */   public bqf(bqe parambqe, EntityPlayer paramahd)
/* 15:   */   {
/* 16:41 */     this.a = paramahd;c=parambqe;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public id<ik> a(ItemStack paramamj)
/* 20:   */   {
/* 21:45 */     if (this.d)
/* 22:   */     {
/* 23:46 */       this.d = false;
/* 24:47 */       return new jx(paramamj.i(), this.c.scale, this.c.icons.values(), this.c.f, this.e, this.f, this.g + 1 - this.e, this.h + 1 - this.f);
/* 25:   */     }
/* 26:48 */     if (this.i++ % 5 == 0) {
/* 27:49 */       return new jx(paramamj.i(), this.c.scale, this.c.icons.values(), this.c.f, 0, 0, 0, 0);
/* 28:   */     }
/* 29:52 */     return null;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void a(int paramInt1, int paramInt2)
/* 33:   */   {
/* 34:56 */     if (this.d)
/* 35:   */     {
/* 36:57 */       this.e = Math.min(this.e, paramInt1);
/* 37:58 */       this.f = Math.min(this.f, paramInt2);
/* 38:59 */       this.g = Math.max(this.g, paramInt1);
/* 39:60 */       this.h = Math.max(this.h, paramInt2);
/* 40:   */     }
/* 41:   */     else
/* 42:   */     {
/* 43:62 */       this.d = true;
/* 44:63 */       this.e = paramInt1;
/* 45:64 */       this.f = paramInt2;
/* 46:65 */       this.g = paramInt1;
/* 47:66 */       this.h = paramInt2;
/* 48:   */     }
/* 49:   */   }
/* 50:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bqf
 * JD-Core Version:    0.7.0.1
 */