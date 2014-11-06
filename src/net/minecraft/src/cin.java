package net.minecraft.src;
/*  1:   */ public class cin
/*  2:   */   extends cim
/*  3:   */ {
/*  4:   */   private final bto e;
/*  5:   */   
/*  6:   */   public cin(bto parambto)
/*  7:   */   {
/*  8: 9 */     this.e = parambto;
/*  9:   */   }
/* 10:   */   
/* 11:   */   public void a()
/* 12:   */   {
/* 13:14 */     this.a = 0.0F;
/* 14:15 */     this.b = 0.0F;
/* 15:16 */     if (this.e.U.d()) {
/* 16:17 */       this.b += 1.0F;
/* 17:   */     }
/* 18:19 */     if (this.e.W.d()) {
/* 19:20 */       this.b -= 1.0F;
/* 20:   */     }
/* 21:22 */     if (this.e.V.d()) {
/* 22:23 */       this.a += 1.0F;
/* 23:   */     }
/* 24:25 */     if (this.e.X.d()) {
/* 25:26 */       this.a -= 1.0F;
/* 26:   */     }
/* 27:28 */     this.c = this.e.Y.d();
/* 28:29 */     this.d = this.e.Z.d();
/* 29:30 */     if (this.d)
/* 30:   */     {
/* 31:31 */       this.a = ((float)(this.a * 0.3D));
/* 32:32 */       this.b = ((float)(this.b * 0.3D));
/* 33:   */     }
/* 34:   */   }
/* 35:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cin
 * JD-Core Version:    0.7.0.1
 */