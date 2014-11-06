package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class alm
/*  4:   */   extends all
/*  5:   */ {
/*  6:   */   public alm(int paramInt, float paramFloat, boolean paramBoolean)
/*  7:   */   {
/*  8:13 */     super(paramInt, paramFloat, paramBoolean);
/*  9:   */     
/* 10:15 */     a(true);
/* 11:   */   }
/* 12:   */   
/* 13:   */   public boolean f(ItemStack paramamj)
/* 14:   */   {
/* 15:20 */     return paramamj.i() > 0;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public amx g(ItemStack paramamj)
/* 19:   */   {
/* 20:25 */     if (paramamj.i() == 0) {
/* 21:26 */       return amx.c;
/* 22:   */     }
/* 23:28 */     return amx.d;
/* 24:   */   }
/* 25:   */   
/* 26:   */   protected void c(ItemStack paramamj, World paramaqu, EntityPlayer paramahd)
/* 27:   */   {
/* 28:33 */     if (!paramaqu.isClient) {
/* 29:34 */       paramahd.c(new wq(Potion.x.H, 2400, 0));
/* 30:   */     }
/* 31:37 */     if (paramamj.i() > 0)
/* 32:   */     {
/* 33:38 */       if (!paramaqu.isClient)
/* 34:   */       {
/* 35:39 */         paramahd.c(new wq(Potion.l.H, 600, 4));
/* 36:40 */         paramahd.c(new wq(Potion.m.H, 6000, 0));
/* 37:41 */         paramahd.c(new wq(Potion.n.H, 6000, 0));
/* 38:   */       }
/* 39:   */     }
/* 40:   */     else {
/* 41:44 */       super.c(paramamj, paramaqu, paramahd);
/* 42:   */     }
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void a(Item paramalq, CreativeTabs paramakf, List<ItemStack> paramList)
/* 46:   */   {
/* 47:50 */     paramList.add(new ItemStack(paramalq, 1, 0));
/* 48:51 */     paramList.add(new ItemStack(paramalq, 1, 1));
/* 49:   */   }
/* 50:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     alm
 * JD-Core Version:    0.7.0.1
 */