package net.minecraft.src;
/*  1:   */ public class czq
/*  2:   */   extends czs
/*  3:   */ {
/*  4:   */   public czq(EntityLiving paramxm1, EntityLiving paramxm2)
/*  5:   */   {
/*  6: 9 */     super("player_combat");
/*  7:   */     
/*  8:11 */     a("player", paramxm1.getName());
/*  9:12 */     if (paramxm2 != null) {
/* 10:13 */       a("primary_opponent", paramxm2.getName());
/* 11:   */     }
/* 12:16 */     if (paramxm2 != null) {
/* 13:17 */       a("Combat between " + paramxm1.getName() + " and " + paramxm2.getName());
/* 14:   */     } else {
/* 15:19 */       a("Combat between " + paramxm1.getName() + " and others");
/* 16:   */     }
/* 17:   */   }
/* 18:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     czq
 * JD-Core Version:    0.7.0.1
 */