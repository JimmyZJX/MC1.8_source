package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class ahs
/*  4:   */   extends ahr
/*  5:   */ {
/*  6:   */   public ahs(World paramaqu)
/*  7:   */   {
/*  8:14 */     super(paramaqu);
/*  9:   */   }
/* 10:   */   
/* 11:   */   public ahs(World paramaqu, EntityLiving paramxm)
/* 12:   */   {
/* 13:18 */     super(paramaqu, paramxm);
/* 14:   */   }
/* 15:   */   
/* 16:   */   public ahs(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/* 17:   */   {
/* 18:22 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3);
/* 19:   */   }
/* 20:   */   
/* 21:   */   protected void a(HitResult parambru)
/* 22:   */   {
/* 23:27 */     if (parambru.d != null) {
/* 24:28 */       parambru.d.a(wh.a(this, n()), 0.0F);
/* 25:   */     }
/* 26:30 */     if ((!this.world.isClient) && (this.random.nextInt(8) == 0))
/* 27:   */     {
/* 28:31 */       int i = 1;
/* 29:32 */       if (this.random.nextInt(32) == 0) {
/* 30:33 */         i = 4;
/* 31:   */       }
/* 32:35 */       for (int j = 0; j < i; j++)
/* 33:   */       {
/* 34:36 */         EntityChicken localabr = new EntityChicken(this.world);
/* 35:37 */         localabr.b(-24000);
/* 36:   */         
/* 37:39 */         localabr.setPositionAndAngles(this.xPos, this.yPos, this.zPos, this.yaw, 0.0F);
/* 38:40 */         this.world.spawnEntity(localabr);
/* 39:   */       }
/* 40:   */     }
/* 41:44 */     double d = 0.08D;
/* 42:45 */     for (int k = 0; k < 8; k++) {
/* 43:46 */       this.world.a(ew.K, this.xPos, this.yPos, this.zPos, (this.random.nextFloat() - 0.5D) * 0.08D, (this.random.nextFloat() - 0.5D) * 0.08D, (this.random.nextFloat() - 0.5D) * 0.08D, new int[] { Item.b(ItemList.aP) });
/* 44:   */     }
/* 45:49 */     if (!this.world.isClient) {
/* 46:50 */       setDead();
/* 47:   */     }
/* 48:   */   }
/* 49:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ahs
 * JD-Core Version:    0.7.0.1
 */