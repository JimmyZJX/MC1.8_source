package net.minecraft.src;
/*  1:   */ public class mq
/*  2:   */   implements id<ls>
/*  3:   */ {
/*  4:   */   private String a;
/*  5:   */   private mr b;
/*  6:   */   
/*  7:   */   public mq() {}
/*  8:   */   
/*  9:   */   public mq(String paramString, mr parammr)
/* 10:   */   {
/* 11:19 */     if (paramString.length() > 40) {
/* 12:20 */       paramString = paramString.substring(0, 40);
/* 13:   */     }
/* 14:23 */     this.a = paramString;
/* 15:24 */     this.b = parammr;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 19:   */   {
/* 20:29 */     this.a = paramhd.c(40);
/* 21:30 */     this.b = ((mr)paramhd.a(mr.class));
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 25:   */   {
/* 26:35 */     paramhd.a(this.a);
/* 27:36 */     paramhd.a(this.b);
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void a(ls paramls)
/* 31:   */   {
/* 32:41 */     paramls.a(this);
/* 33:   */   }
/* 34:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     mq
 * JD-Core Version:    0.7.0.1
 */