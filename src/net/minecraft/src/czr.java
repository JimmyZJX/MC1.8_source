package net.minecraft.src;
/*  1:   */ public class czr
/*  2:   */   extends czs
/*  3:   */ {
/*  4:   */   public czr(EntityLiving paramxm1, EntityLiving paramxm2)
/*  5:   */   {
/*  6: 9 */     super("player_death");
/*  7:11 */     if (paramxm1 != null) {
/*  8:12 */       a("player", paramxm1.getName());
/*  9:   */     }
/* 10:14 */     if (paramxm2 != null) {
/* 11:15 */       a("killer", paramxm2.getName());
/* 12:   */     }
/* 13:   */   }
/* 14:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     czr
 * JD-Core Version:    0.7.0.1
 */