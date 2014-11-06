package net.minecraft.src;
/*  1:   */ public class ajm
/*  2:   */   extends amr
/*  3:   */ {
/*  4:   */   public ajm(ProtoBlock paramatr)
/*  5:   */   {
/*  6: 7 */     super(paramatr, paramatr, new String[] { "intact", "slightlyDamaged", "veryDamaged" });
/*  7:   */   }
/*  8:   */   
/*  9:   */   public int a(int paramInt)
/* 10:   */   {
/* 11:12 */     return paramInt << 2;
/* 12:   */   }
/* 13:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ajm
 * JD-Core Version:    0.7.0.1
 */