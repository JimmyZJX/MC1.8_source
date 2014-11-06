package net.minecraft.src;
/*  1:   */ public class wn
/*  2:   */   extends Potion
/*  3:   */ {
/*  4:   */   public wn(int paramInt1, oa paramoa, boolean paramBoolean, int paramInt2)
/*  5:   */   {
/*  6: 9 */     super(paramInt1, paramoa, paramBoolean, paramInt2);
/*  7:   */   }
/*  8:   */   
/*  9:   */   public void a(EntityLiving paramxm, yc paramyc, int paramInt)
/* 10:   */   {
/* 11:14 */     super.a(paramxm, paramyc, paramInt);
/* 12:15 */     if (paramxm.getHealth() > paramxm.bt()) {
/* 13:16 */       paramxm.h(paramxm.bt());
/* 14:   */     }
/* 15:   */   }
/* 16:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     wn
 * JD-Core Version:    0.7.0.1
 */