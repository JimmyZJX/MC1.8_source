package net.minecraft.src;
/*  1:   */ public class kw
/*  2:   */   implements id<ik>
/*  3:   */ {
/*  4:   */   private int a;
/*  5:   */   private String b;
/*  6:   */   
/*  7:   */   public kw() {}
/*  8:   */   
/*  9:   */   public kw(int paramInt, bry parambry)
/* 10:   */   {
/* 11:17 */     this.a = paramInt;
/* 12:19 */     if (parambry == null) {
/* 13:20 */       this.b = "";
/* 14:   */     } else {
/* 15:22 */       this.b = parambry.b();
/* 16:   */     }
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 20:   */   {
/* 21:28 */     this.a = paramhd.readByte();
/* 22:29 */     this.b = paramhd.c(16);
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 26:   */   {
/* 27:34 */     paramhd.writeByte(this.a);
/* 28:35 */     paramhd.a(this.b);
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void a(ik paramik)
/* 32:   */   {
/* 33:40 */     paramik.a(this);
/* 34:   */   }
/* 35:   */   
/* 36:   */   public int a()
/* 37:   */   {
/* 38:44 */     return this.a;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public String b()
/* 42:   */   {
/* 43:48 */     return this.b;
/* 44:   */   }
/* 45:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     kw
 * JD-Core Version:    0.7.0.1
 */