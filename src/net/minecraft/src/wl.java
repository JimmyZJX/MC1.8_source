package net.minecraft.src;
/*  1:   */ public class wl
/*  2:   */   extends Potion
/*  3:   */ {
/*  4:   */   protected wl(int paramInt1, oa paramoa, boolean paramBoolean, int paramInt2)
/*  5:   */   {
/*  6: 9 */     super(paramInt1, paramoa, paramBoolean, paramInt2);
/*  7:   */   }
/*  8:   */   
/*  9:   */   public void a(EntityLiving paramxm, yc paramyc, int paramInt)
/* 10:   */   {
/* 11:14 */     paramxm.l(paramxm.bM() - 4 * (paramInt + 1));
/* 12:15 */     super.a(paramxm, paramyc, paramInt);
/* 13:   */   }
/* 14:   */   
/* 15:   */   public void b(EntityLiving paramxm, yc paramyc, int paramInt)
/* 16:   */   {
/* 17:20 */     paramxm.l(paramxm.bM() + 4 * (paramInt + 1));
/* 18:21 */     super.b(paramxm, paramyc, paramInt);
/* 19:   */   }
/* 20:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     wl
 * JD-Core Version:    0.7.0.1
 */