package net.minecraft.src;
/*  1:   */ public class ld
/*  2:   */   implements id<ik>
/*  3:   */ {
/*  4:   */   private String a;
/*  5:   */   private String b;
/*  6:   */   private bsl c;
/*  7:   */   private int d;
/*  8:   */   
/*  9:   */   public ld() {}
/* 10:   */   
/* 11:   */   public ld(bry parambry, int paramInt)
/* 12:   */   {
/* 13:24 */     this.a = parambry.b();
/* 14:25 */     this.b = parambry.d();
/* 15:26 */     this.c = parambry.c().c();
/* 16:27 */     this.d = paramInt;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 20:   */   {
/* 21:32 */     this.a = paramhd.c(16);
/* 22:33 */     this.d = paramhd.readByte();
/* 23:35 */     if ((this.d == 0) || (this.d == 2))
/* 24:   */     {
/* 25:36 */       this.b = paramhd.c(32);
/* 26:37 */       this.c = bsl.a(paramhd.c(16));
/* 27:   */     }
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 31:   */   {
/* 32:43 */     paramhd.a(this.a);
/* 33:44 */     paramhd.writeByte(this.d);
/* 34:46 */     if ((this.d == 0) || (this.d == 2))
/* 35:   */     {
/* 36:47 */       paramhd.a(this.b);
/* 37:48 */       paramhd.a(this.c.a());
/* 38:   */     }
/* 39:   */   }
/* 40:   */   
/* 41:   */   public void a(ik paramik)
/* 42:   */   {
/* 43:54 */     paramik.a(this);
/* 44:   */   }
/* 45:   */   
/* 46:   */   public String a()
/* 47:   */   {
/* 48:58 */     return this.a;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public String b()
/* 52:   */   {
/* 53:62 */     return this.b;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public int c()
/* 57:   */   {
/* 58:66 */     return this.d;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public bsl d()
/* 62:   */   {
/* 63:70 */     return this.c;
/* 64:   */   }
/* 65:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ld
 * JD-Core Version:    0.7.0.1
 */