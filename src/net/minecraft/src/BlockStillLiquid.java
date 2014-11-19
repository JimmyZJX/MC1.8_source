package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class BlockStillLiquid
/*  4:   */   extends BlockLiquid
/*  5:   */ {
/*  6:   */   protected BlockStillLiquid(Material parambof)
/*  7:   */   {
/*  8:14 */     super(parambof);
/*  9:   */     
/* 10:16 */     a(false);
/* 11:17 */     if (parambof == Material.lava) {
/* 12:18 */       a(true);
/* 13:   */     }
/* 14:   */   }
/* 15:   */   
/* 16:   */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, ProtoBlock paramatr)
/* 17:   */   {
/* 18:24 */     if (!e(paramaqu, paramdt, parambec)) {
/* 19:25 */       f(paramaqu, paramdt, parambec);
/* 20:   */     }
/* 21:   */   }
/* 22:   */   
/* 23:   */   private void f(World paramaqu, BlockPosition paramdt, Block parambec)
/* 24:   */   {
/* 25:30 */     BlockFlowingLiquid localavn = a(this.material);
/* 26:31 */     paramaqu.setBlock(paramdt, localavn.instance().a(level, parambec.getProperty(level)), 2);
/* 27:32 */     paramaqu.a(paramdt, localavn, a(paramaqu));
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void b(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/* 31:   */   {
/* 32:37 */     if (this.material != Material.lava) {
/* 33:38 */       return;
/* 34:   */     }
/* 35:41 */     if (!paramaqu.getGameRules().getBoolean("doFireTick")) {
/* 36:42 */       return;
/* 37:   */     }
/* 38:45 */     int i = paramRandom.nextInt(3);
/* 39:46 */     if (i > 0)
/* 40:   */     {
/* 41:47 */       BlockPosition localdt1 = paramdt;
/* 42:49 */       for (int k = 0; k < i; k++)
/* 43:   */       {
/* 44:50 */         localdt1 = localdt1.offset(paramRandom.nextInt(3) - 1, 1, paramRandom.nextInt(3) - 1);
/* 45:51 */         ProtoBlock localatr = paramaqu.getBlock(localdt1).getProto();
/* 46:52 */         if (localatr.material == Material.air)
/* 47:   */         {
/* 48:53 */           if (e(paramaqu, localdt1)) {
/* 49:54 */             paramaqu.setBlock(localdt1, BlockList.ab.instance());
/* 50:   */           }
/* 51:   */         }
/* 52:57 */         else if (localatr.material.c()) {
/* 53:58 */           return;
/* 54:   */         }
/* 55:   */       }
/* 56:   */     }
/* 57:   */     else
/* 58:   */     {
/* 59:62 */       for (int j = 0; j < 3; j++)
/* 60:   */       {
/* 61:63 */         BlockPosition localdt2 = paramdt.offset(paramRandom.nextInt(3) - 1, 0, paramRandom.nextInt(3) - 1);
/* 62:64 */         if ((paramaqu.isEmpty(localdt2.up())) && (m(paramaqu, localdt2))) {
/* 63:65 */           paramaqu.setBlock(localdt2.up(), BlockList.ab.instance());
/* 64:   */         }
/* 65:   */       }
/* 66:   */     }
/* 67:   */   }
/* 68:   */   
/* 69:   */   protected boolean e(World paramaqu, BlockPosition paramdt)
/* 70:   */   {
/* 71:72 */     for (EnumDirection localej : EnumDirection.values()) {
/* 72:73 */       if (m(paramaqu, paramdt.a(localej))) {
/* 73:74 */         return true;
/* 74:   */       }
/* 75:   */     }
/* 76:77 */     return false;
/* 77:   */   }
/* 78:   */   
/* 79:   */   private boolean m(World paramaqu, BlockPosition paramdt)
/* 80:   */   {
/* 81:81 */     return paramaqu.getBlock(paramdt).getProto().getMaterial().h();
/* 82:   */   }
/* 83:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bax
 * JD-Core Version:    0.7.0.1
 */