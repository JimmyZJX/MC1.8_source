package net.minecraft.src;
/*  1:   */ public class lf
/*  2:   */   implements id<ik>
/*  3:   */ {
/*  4:13 */   private String a = "";
/*  5:14 */   private String b = "";
/*  6:   */   private int c;
/*  7:   */   private lg d;
/*  8:   */   
/*  9:   */   public lf() {}
/* 10:   */   
/* 11:   */   public lf(bsa parambsa)
/* 12:   */   {
/* 13:22 */     this.a = parambsa.e();
/* 14:23 */     this.b = parambsa.d().b();
/* 15:24 */     this.c = parambsa.c();
/* 16:25 */     this.d = lg.a;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public lf(String paramString)
/* 20:   */   {
/* 21:29 */     this.a = paramString;
/* 22:30 */     this.b = "";
/* 23:31 */     this.c = 0;
/* 24:32 */     this.d = lg.b;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public lf(String paramString, bry parambry)
/* 28:   */   {
/* 29:36 */     this.a = paramString;
/* 30:37 */     this.b = parambry.b();
/* 31:38 */     this.c = 0;
/* 32:39 */     this.d = lg.b;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 36:   */   {
/* 37:44 */     this.a = paramhd.c(40);
/* 38:45 */     this.d = ((lg)paramhd.a(lg.class));
/* 39:46 */     this.b = paramhd.c(16);
/* 40:48 */     if (this.d != lg.b) {
/* 41:49 */       this.c = paramhd.e();
/* 42:   */     }
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 46:   */   {
/* 47:55 */     paramhd.a(this.a);
/* 48:56 */     paramhd.a(this.d);
/* 49:57 */     paramhd.a(this.b);
/* 50:59 */     if (this.d != lg.b) {
/* 51:60 */       paramhd.b(this.c);
/* 52:   */     }
/* 53:   */   }
/* 54:   */   
/* 55:   */   public void a(ik paramik)
/* 56:   */   {
/* 57:66 */     paramik.a(this);
/* 58:   */   }
/* 59:   */   
/* 60:   */   public String a()
/* 61:   */   {
/* 62:70 */     return this.a;
/* 63:   */   }
/* 64:   */   
/* 65:   */   public String b()
/* 66:   */   {
/* 67:74 */     return this.b;
/* 68:   */   }
/* 69:   */   
/* 70:   */   public int c()
/* 71:   */   {
/* 72:78 */     return this.c;
/* 73:   */   }
/* 74:   */   
/* 75:   */   public lg d()
/* 76:   */   {
/* 77:82 */     return this.d;
/* 78:   */   }
/* 79:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     lf
 * JD-Core Version:    0.7.0.1
 */