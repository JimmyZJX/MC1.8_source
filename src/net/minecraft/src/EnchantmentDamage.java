package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class EnchantmentDamage
/*  4:   */   extends Enchantment
/*  5:   */ {
/*  6:18 */   private static final String[] E = { "all", "undead", "arthropods" };
/*  7:22 */   private static final int[] F = { 1, 5, 5 };
/*  8:26 */   private static final int[] G = { 11, 8, 8 };
/*  9:30 */   private static final int[] H = { 20, 20, 20 };
/* 10:   */   public final int a;
/* 11:   */   
/* 12:   */   public EnchantmentDamage(int paramInt1, oa paramoa, int paramInt2, int paramInt3)
/* 13:   */   {
/* 14:37 */     super(paramInt1, paramoa, paramInt2, apg.g);
/* 15:38 */     this.a = paramInt3;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public int a(int paramInt)
/* 19:   */   {
/* 20:43 */     return F[this.a] + (paramInt - 1) * G[this.a];
/* 21:   */   }
/* 22:   */   
/* 23:   */   public int b(int paramInt)
/* 24:   */   {
/* 25:48 */     return a(paramInt) + H[this.a];
/* 26:   */   }
/* 27:   */   
/* 28:   */   public int b()
/* 29:   */   {
/* 30:53 */     return 5;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public float a(int paramInt, xs paramxs)
/* 34:   */   {
/* 35:58 */     if (this.a == 0) {
/* 36:59 */       return paramInt * 1.25F;
/* 37:   */     }
/* 38:61 */     if ((this.a == 1) && (paramxs == xs.b)) {
/* 39:62 */       return paramInt * 2.5F;
/* 40:   */     }
/* 41:64 */     if ((this.a == 2) && (paramxs == xs.c)) {
/* 42:65 */       return paramInt * 2.5F;
/* 43:   */     }
/* 44:67 */     return 0.0F;
/* 45:   */   }
/* 46:   */   
/* 47:   */   public String a()
/* 48:   */   {
/* 49:72 */     return "enchantment.damage." + E[this.a];
/* 50:   */   }
/* 51:   */   
/* 52:   */   public boolean a(Enchantment paramapf)
/* 53:   */   {
/* 54:77 */     return !(paramapf instanceof EnchantmentDamage);
/* 55:   */   }
/* 56:   */   
/* 57:   */   public boolean a(ItemStack paramamj)
/* 58:   */   {
/* 59:82 */     if ((paramamj.getItem() instanceof ItemAxe)) {
/* 60:83 */       return true;
/* 61:   */     }
/* 62:85 */     return super.a(paramamj);
/* 63:   */   }
/* 64:   */   
/* 65:   */   public void a(EntityLiving paramxm, Entity paramwv, int paramInt)
/* 66:   */   {
/* 67:90 */     if ((paramwv instanceof EntityLiving))
/* 68:   */     {
/* 69:91 */       EntityLiving localxm = (EntityLiving)paramwv;
/* 70:93 */       if ((this.a == 2) && (localxm.by() == xs.c))
/* 71:   */       {
/* 72:94 */         int i = 20 + paramxm.bb().nextInt(10 * paramInt);
/* 73:95 */         localxm.c(new wq(Potion.d.id, i, 3));
/* 74:   */       }
/* 75:   */     }
/* 76:   */   }
/* 77:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     apc
 * JD-Core Version:    0.7.0.1
 */