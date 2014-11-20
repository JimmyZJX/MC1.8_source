package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class ada
/*  4:   */   extends Entity
/*  5:   */ {
/*  6:   */   public int a;
/*  7:   */   public int b;
/*  8:   */   
/*  9:   */   public ada(World paramaqu)
/* 10:   */   {
/* 11:22 */     super(paramaqu);
/* 12:23 */     this.k = true;
/* 13:24 */     a(2.0F, 2.0F);
/* 14:25 */     this.b = 5;
/* 15:   */     
/* 16:27 */     this.a = this.rng.nextInt(100000);
/* 17:   */   }
/* 18:   */   
/* 19:   */   public ada(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/* 20:   */   {
/* 21:31 */     this(paramaqu);
/* 22:32 */     b(paramDouble1, paramDouble2, paramDouble3);
/* 23:   */   }
/* 24:   */   
/* 25:   */   protected boolean r_()
/* 26:   */   {
/* 27:37 */     return false;
/* 28:   */   }
/* 29:   */   
/* 30:   */   protected void h()
/* 31:   */   {
/* 32:42 */     this.ac.a(8, Integer.valueOf(this.b));
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void onUpdate()
/* 36:   */   {
/* 37:47 */     this.lastX = this.xPos;
/* 38:48 */     this.lastY = this.yPos;
/* 39:49 */     this.lastZ = this.zPos;
/* 40:50 */     this.a += 1;
/* 41:   */     
/* 42:52 */     this.ac.b(8, Integer.valueOf(this.b));
/* 43:   */     
/* 44:54 */     int i = MathUtils.floor(this.xPos);
/* 45:55 */     int j = MathUtils.floor(this.yPos);
/* 46:56 */     int k = MathUtils.floor(this.zPos);
/* 47:57 */     if (((this.world.t instanceof bgh)) && (this.world.getBlock(new BlockPosition(i, j, k)).getProto() != BlockList.fire)) {
/* 48:58 */       this.world.setBlock(new BlockPosition(i, j, k), BlockList.fire.instance());
/* 49:   */     }
/* 50:   */   }
/* 51:   */   
/* 52:   */   protected void writeEntityToNBT(NBTTagCompound paramfn) {}
/* 53:   */   
/* 54:   */   protected void readEntityFromNBT(NBTTagCompound paramfn) {}
/* 55:   */   
/* 56:   */   public boolean ad()
/* 57:   */   {
/* 58:72 */     return true;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public boolean a(DamageSource paramwh, float paramFloat)
/* 62:   */   {
/* 63:77 */     if (b(paramwh)) {
/* 64:78 */       return false;
/* 65:   */     }
/* 66:80 */     if ((!this.isDead) && (!this.world.isClient))
/* 67:   */     {
/* 68:81 */       this.b = 0;
/* 69:82 */       if (this.b <= 0)
/* 70:   */       {
/* 71:83 */         setDead();
/* 72:84 */         if (!this.world.isClient) {
/* 73:85 */           this.world.a(null, this.xPos, this.yPos, this.zPos, 6.0F, true);
/* 74:   */         }
/* 75:   */       }
/* 76:   */     }
/* 77:89 */     return true;
/* 78:   */   }
/* 79:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ada
 * JD-Core Version:    0.7.0.1
 */