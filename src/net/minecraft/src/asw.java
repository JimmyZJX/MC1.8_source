package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class asw
/*  4:   */   extends ary
/*  5:   */ {
/*  6:13 */   protected bhp M = new bim(BlockList.endStone);
/*  7:   */   
/*  8:   */   protected void generate(arm paramarm)
/*  9:   */   {
/* 10:17 */     generateOres();
/* 11:19 */     if (this.random.nextInt(5) == 0)
/* 12:   */     {
/* 13:20 */       int i = this.random.nextInt(16) + 8;
/* 14:21 */       int j = this.random.nextInt(16) + 8;
/* 15:22 */       this.M.generate(this.world, this.random, this.world.r(this.position.offset(i, 0, j)));
/* 16:   */     }
/* 17:25 */     if ((this.position.getX() == 0) && (this.position.getZ() == 0))
/* 18:   */     {
/* 19:26 */       EntityEnderDragon localadb = new EntityEnderDragon(this.world);
/* 20:27 */       localadb.setPositionAndAngles(0.0D, 128.0D, 0.0D, this.random.nextFloat() * 360.0F, 0.0F);
/* 21:28 */       this.world.spawnEntity(localadb);
/* 22:   */     }
/* 23:   */   }
/* 24:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     asw
 * JD-Core Version:    0.7.0.1
 */