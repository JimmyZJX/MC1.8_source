package net.minecraft.src;
/*  1:   */ public class amm
/*  2:   */   extends aju
/*  3:   */ {
/*  4:   */   private final BlockLeaves b;
/*  5:   */   
/*  6:   */   public amm(BlockLeaves paramaxg)
/*  7:   */   {
/*  8: 9 */     super(paramaxg);
/*  9:10 */     this.b = paramaxg;
/* 10:   */     
/* 11:12 */     setMaxDamage(0);
/* 12:13 */     a(true);
/* 13:   */   }
/* 14:   */   
/* 15:   */   public int a(int paramInt)
/* 16:   */   {
/* 17:18 */     return paramInt | 0x4;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public int a(ItemStack paramamj, int paramInt)
/* 21:   */   {
/* 22:23 */     return this.b.h(this.b.instance(paramamj.getDamage2()));
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String e_(ItemStack paramamj)
/* 26:   */   {
/* 27:28 */     return super.a() + "." + this.b.b(paramamj.getDamage2()).c();
/* 28:   */   }
/* 29:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     amm
 * JD-Core Version:    0.7.0.1
 */