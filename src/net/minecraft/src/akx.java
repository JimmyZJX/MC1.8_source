package net.minecraft.src;
/*  1:   */ public class akx
/*  2:   */   extends aju
/*  3:   */ {
/*  4:   */   public akx(ProtoBlock paramatr)
/*  5:   */   {
/*  6: 7 */     super(paramatr);
/*  7:   */     
/*  8: 9 */     setMaxDamage(0);
/*  9:10 */     a(true);
/* 10:   */   }
/* 11:   */   
/* 12:   */   public int a(int paramInt)
/* 13:   */   {
/* 14:15 */     return paramInt;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public String e_(ItemStack paramamj)
/* 18:   */   {
/* 19:20 */     return super.a() + "." + EnumDyeColor.b(paramamj.getDamage2()).d();
/* 20:   */   }
/* 21:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     akx
 * JD-Core Version:    0.7.0.1
 */