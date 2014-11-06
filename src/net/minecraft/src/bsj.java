package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class bsj
/*  4:   */   extends bsi
/*  5:   */ {
/*  6:   */   public bsj(String paramString)
/*  7:   */   {
/*  8:10 */     super(paramString);
/*  9:   */   }
/* 10:   */   
/* 11:   */   public int a(List<EntityPlayer> paramList)
/* 12:   */   {
/* 13:15 */     float f = 0.0F;
/* 14:17 */     for (EntityPlayer localahd : paramList) {
/* 15:18 */       f += localahd.getHealth() + localahd.bM();
/* 16:   */     }
/* 17:21 */     if (paramList.size() > 0) {
/* 18:22 */       f /= paramList.size();
/* 19:   */     }
/* 20:25 */     return MathUtils.ceil(f);
/* 21:   */   }
/* 22:   */   
/* 23:   */   public boolean b()
/* 24:   */   {
/* 25:30 */     return true;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public bsl c()
/* 29:   */   {
/* 30:35 */     return bsl.b;
/* 31:   */   }
/* 32:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bsj
 * JD-Core Version:    0.7.0.1
 */