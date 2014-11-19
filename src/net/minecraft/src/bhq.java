package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bhq
/*  4:   */   extends bhp
/*  5:   */ {
/*  6:   */   private avy a;
/*  7:   */   private Block b;
/*  8:   */   
/*  9:   */   public bhq(avy paramavy, EnumFlowerVariant paramawa)
/* 10:   */   {
/* 11:16 */     a(paramavy, paramawa);
/* 12:   */   }
/* 13:   */   
/* 14:   */   public void a(avy paramavy, EnumFlowerVariant paramawa)
/* 15:   */   {
/* 16:20 */     this.a = paramavy;
/* 17:21 */     this.b = paramavy.instance().a(paramavy.l(), paramawa);
/* 18:   */   }
/* 19:   */   
/* 20:   */   public boolean generate(World paramaqu, Random paramRandom, BlockPosition paramdt)
/* 21:   */   {
/* 22:26 */     for (int i = 0; i < 64; i++)
/* 23:   */     {
/* 24:27 */       BlockPosition localdt = paramdt.offset(paramRandom.nextInt(8) - paramRandom.nextInt(8), paramRandom.nextInt(4) - paramRandom.nextInt(4), paramRandom.nextInt(8) - paramRandom.nextInt(8));
/* 25:28 */       if ((paramaqu.isEmpty(localdt)) && ((!paramaqu.t.o()) || (localdt.getY() < 255)) && 
/* 26:29 */         (this.a.f(paramaqu, localdt, this.b))) {
/* 27:30 */         paramaqu.setBlock(localdt, this.b, 2);
/* 28:   */       }
/* 29:   */     }
/* 30:35 */     return true;
/* 31:   */   }
/* 32:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bhq
 * JD-Core Version:    0.7.0.1
 */