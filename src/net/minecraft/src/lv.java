package net.minecraft.src;
/*  1:   */ public class lv
/*  2:   */   implements id<ls>
/*  3:   */ {
/*  4:   */   private lw a;
/*  5:   */   
/*  6:   */   public lv() {}
/*  7:   */   
/*  8:   */   public lv(lw paramlw)
/*  9:   */   {
/* 10:16 */     this.a = paramlw;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 14:   */   {
/* 15:21 */     this.a = ((lw)paramhd.a(lw.class));
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 19:   */   {
/* 20:26 */     paramhd.a(this.a);
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void a(ls paramls)
/* 24:   */   {
/* 25:31 */     paramls.a(this);
/* 26:   */   }
/* 27:   */   
/* 28:   */   public lw a()
/* 29:   */   {
/* 30:35 */     return this.a;
/* 31:   */   }
/* 32:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     lv
 * JD-Core Version:    0.7.0.1
 */