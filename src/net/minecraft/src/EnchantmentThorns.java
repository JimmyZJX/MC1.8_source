package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class EnchantmentThorns
/*  4:   */   extends Enchantment
/*  5:   */ {
/*  6:   */   public EnchantmentThorns(int paramInt1, oa paramoa, int paramInt2)
/*  7:   */   {
/*  8:16 */     super(paramInt1, paramoa, paramInt2, apg.e);
/*  9:   */     
/* 10:18 */     c("thorns");
/* 11:   */   }
/* 12:   */   
/* 13:   */   public int a(int paramInt)
/* 14:   */   {
/* 15:23 */     return 10 + 20 * (paramInt - 1);
/* 16:   */   }
/* 17:   */   
/* 18:   */   public int b(int paramInt)
/* 19:   */   {
/* 20:28 */     return super.a(paramInt) + 50;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public int b()
/* 24:   */   {
/* 25:33 */     return 3;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public boolean a(ItemStack paramamj)
/* 29:   */   {
/* 30:38 */     if ((paramamj.getItem() instanceof ajn)) {
/* 31:39 */       return true;
/* 32:   */     }
/* 33:41 */     return super.a(paramamj);
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void b(EntityLiving paramxm, Entity paramwv, int paramInt)
/* 37:   */   {
/* 38:46 */     Random localRandom = paramxm.bb();
/* 39:47 */     ItemStack localamj = aph.a(Enchantment.j, paramxm);
/* 40:49 */     if (a(paramInt, localRandom))
/* 41:   */     {
/* 42:50 */       paramwv.a(DamageSource.a(paramxm), b(paramInt, localRandom));
/* 43:51 */       paramwv.a("damage.thorns", 0.5F, 1.0F);
/* 44:53 */       if (localamj != null) {
/* 45:54 */         localamj.a(3, paramxm);
/* 46:   */       }
/* 47:   */     }
/* 48:57 */     else if (localamj != null)
/* 49:   */     {
/* 50:58 */       localamj.a(1, paramxm);
/* 51:   */     }
/* 52:   */   }
/* 53:   */   
/* 54:   */   public static boolean a(int paramInt, Random paramRandom)
/* 55:   */   {
/* 56:64 */     if (paramInt <= 0) {
/* 57:65 */       return false;
/* 58:   */     }
/* 59:67 */     return paramRandom.nextFloat() < 0.15F * paramInt;
/* 60:   */   }
/* 61:   */   
/* 62:   */   public static int b(int paramInt, Random paramRandom)
/* 63:   */   {
/* 64:71 */     if (paramInt > 10) {
/* 65:72 */       return paramInt - 10;
/* 66:   */     }
/* 67:74 */     return 1 + paramRandom.nextInt(4);
/* 68:   */   }
/* 69:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     apv
 * JD-Core Version:    0.7.0.1
 */