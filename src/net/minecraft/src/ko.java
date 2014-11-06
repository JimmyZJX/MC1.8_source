package net.minecraft.src;
/*  1:   */ public class ko
/*  2:   */   implements id<ik>
/*  3:   */ {
/*  4:   */   private String a;
/*  5:   */   private String b;
/*  6:   */   
/*  7:   */   public ko() {}
/*  8:   */   
/*  9:   */   public ko(String paramString1, String paramString2)
/* 10:   */   {
/* 11:20 */     this.a = paramString1;
/* 12:21 */     this.b = paramString2;
/* 13:23 */     if (paramString2.length() > 40) {
/* 14:24 */       throw new IllegalArgumentException("Hash is too long (max 40, was " + paramString2.length() + ")");
/* 15:   */     }
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 19:   */   {
/* 20:30 */     this.a = paramhd.c(32767);
/* 21:31 */     this.b = paramhd.c(40);
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 25:   */   {
/* 26:36 */     paramhd.a(this.a);
/* 27:37 */     paramhd.a(this.b);
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void a(ik paramik)
/* 31:   */   {
/* 32:42 */     paramik.a(this);
/* 33:   */   }
/* 34:   */   
/* 35:   */   public String a()
/* 36:   */   {
/* 37:46 */     return this.a;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public String b()
/* 41:   */   {
/* 42:50 */     return this.b;
/* 43:   */   }
/* 44:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ko
 * JD-Core Version:    0.7.0.1
 */