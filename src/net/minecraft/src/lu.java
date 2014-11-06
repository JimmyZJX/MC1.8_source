package net.minecraft.src;
/*  1:   */ public class lu
/*  2:   */   implements id<ls>
/*  3:   */ {
/*  4:   */   private String a;
/*  5:   */   
/*  6:   */   public lu() {}
/*  7:   */   
/*  8:   */   public lu(String paramString)
/*  9:   */   {
/* 10:18 */     if (paramString.length() > 100) {
/* 11:19 */       paramString = paramString.substring(0, 100);
/* 12:   */     }
/* 13:22 */     this.a = paramString;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 17:   */   {
/* 18:27 */     this.a = paramhd.c(100);
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 22:   */   {
/* 23:32 */     paramhd.a(this.a);
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void a(ls paramls)
/* 27:   */   {
/* 28:37 */     paramls.a(this);
/* 29:   */   }
/* 30:   */   
/* 31:   */   public String a()
/* 32:   */   {
/* 33:41 */     return this.a;
/* 34:   */   }
/* 35:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     lu
 * JD-Core Version:    0.7.0.1
 */