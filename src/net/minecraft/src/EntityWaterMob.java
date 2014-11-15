package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public abstract class EntityWaterMob
/*  4:   */   extends EntityMob
/*  5:   */   implements wt
/*  6:   */ {
/*  7:   */   public EntityWaterMob(World paramaqu)
/*  8:   */   {
/*  9:20 */     super(paramaqu);
/* 10:   */   }
/* 11:   */   
/* 12:   */   public boolean aX()
/* 13:   */   {
/* 14:26 */     return true;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public boolean canSpawn()
/* 18:   */   {
/* 19:31 */     return true;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public boolean spawnAABBCheck()
/* 23:   */   {
/* 24:36 */     return this.world.isCollisionFree(getAABB(), this);
/* 25:   */   }
/* 26:   */   
/* 27:   */   public int w()
/* 28:   */   {
/* 29:41 */     return 120;
/* 30:   */   }
/* 31:   */   
/* 32:   */   protected boolean C()
/* 33:   */   {
/* 34:46 */     return true;
/* 35:   */   }
/* 36:   */   
/* 37:   */   protected int b(EntityPlayer paramahd)
/* 38:   */   {
/* 39:51 */     return 1 + this.world.rng.nextInt(3);
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void onEntityUpdate()
/* 43:   */   {
/* 44:56 */     int i = aA();
/* 45:   */     
/* 46:58 */     super.onEntityUpdate();
/* 47:60 */     if ((ai()) && (!V()))
/* 48:   */     {
/* 49:61 */       h(--i);
/* 50:62 */       if (aA() == -20)
/* 51:   */       {
/* 52:63 */         h(0);
/* 53:64 */         a(DamageSource.f, 2.0F);
/* 54:   */       }
/* 55:   */     }
/* 56:   */     else
/* 57:   */     {
/* 58:67 */       h(300);
/* 59:   */     }
/* 60:   */   }
/* 61:   */   
/* 62:   */   public boolean aK()
/* 63:   */   {
/* 64:74 */     return false;
/* 65:   */   }
/* 66:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     act
 * JD-Core Version:    0.7.0.1
 */