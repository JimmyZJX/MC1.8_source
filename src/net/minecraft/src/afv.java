package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ class afv
/*   4:    */   extends GoalType
/*   5:    */ {
/*   6:    */   private EntitySilverfish a;
/*   7:    */   private int b;
/*   8:    */   
/*   9:    */   public afv(EntitySilverfish paramaft)
/*  10:    */   {
/*  11:141 */     this.a = paramaft;
/*  12:    */   }
/*  13:    */   
/*  14:    */   public void f()
/*  15:    */   {
/*  16:145 */     if (this.b == 0) {
/*  17:146 */       this.b = 20;
/*  18:    */     }
/*  19:    */   }
/*  20:    */   
/*  21:    */   public boolean canStart()
/*  22:    */   {
/*  23:152 */     return this.b > 0;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public void tick()
/*  27:    */   {
/*  28:157 */     this.b -= 1;
/*  29:158 */     if (this.b <= 0)
/*  30:    */     {
/*  31:159 */       World localaqu = this.a.world;
/*  32:160 */       Random localRandom = this.a.getRNG();
/*  33:    */       
/*  34:    */ 
/*  35:163 */       BlockPosition localdt1 = new BlockPosition(this.a);
/*  36:165 */       for (int i = 0; (i <= 5) && (i >= -5); i = i <= 0 ? 1 - i : 0 - i) {
/*  37:166 */         for (int j = 0; (j <= 10) && (j >= -10); j = j <= 0 ? 1 - j : 0 - j) {
/*  38:167 */           for (int k = 0; (k <= 10) && (k >= -10); k = k <= 0 ? 1 - k : 0 - k)
/*  39:    */           {
/*  40:168 */             BlockPosition localdt2 = localdt1.offset(j, i, k);
/*  41:169 */             Block localbec = localaqu.getBlock(localdt2);
/*  42:171 */             if (localbec.getProto() == BlockList.monsterEgg)
/*  43:    */             {
/*  44:172 */               if (localaqu.getGameRules().getBoolean("mobGriefing")) {
/*  45:173 */                 localaqu.b(localdt2, true);
/*  46:    */               } else {
/*  47:175 */                 localaqu.setBlock(localdt2, ((EnumMonsterEggVariants)localbec.getProperty(axs.a)).d(), 3);
/*  48:    */               }
/*  49:177 */               if (localRandom.nextBoolean()) {
/*  50:    */                 return;
/*  51:    */               }
/*  52:    */             }
/*  53:    */           }
/*  54:    */         }
/*  55:    */       }
/*  56:    */     }
/*  57:    */   }
/*  58:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     afv
 * JD-Core Version:    0.7.0.1
 */