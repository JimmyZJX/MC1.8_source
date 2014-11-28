package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ class aen
/*   4:    */   extends GoalType
/*   5:    */ {
/*   6:    */   private EntityBlaze a;
/*   7:    */   private int b;
/*   8:    */   private int c;
/*   9:    */   
/*  10:    */   public aen(EntityBlaze paramaem)
/*  11:    */   {
/*  12:171 */     this.a = paramaem;
/*  13:    */     
/*  14:173 */     a(3);
/*  15:    */   }
/*  16:    */   
/*  17:    */   public boolean canStart()
/*  18:    */   {
/*  19:178 */     EntityLiving localxm = this.a.u();
/*  20:179 */     if ((localxm == null) || (!localxm.ai())) {
/*  21:180 */       return false;
/*  22:    */     }
/*  23:183 */     return true;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public void start()
/*  27:    */   {
/*  28:188 */     this.b = 0;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public void stop()
/*  32:    */   {
/*  33:193 */     this.a.a(false);
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void tick()
/*  37:    */   {
/*  38:198 */     this.c -= 1;
/*  39:    */     
/*  40:200 */     EntityLiving localxm = this.a.u();
/*  41:    */     
/*  42:202 */     double d1 = this.a.h(localxm);
/*  43:204 */     if (d1 < 4.0D)
/*  44:    */     {
/*  45:206 */       if (this.c <= 0)
/*  46:    */       {
/*  47:207 */         this.c = 20;
/*  48:208 */         this.a.r(localxm);
/*  49:    */       }
/*  50:210 */       this.a.q().setTarget(localxm.xPos, localxm.yPos, localxm.zPos, 1.0D);
/*  51:    */     }
/*  52:211 */     else if (d1 < 256.0D)
/*  53:    */     {
/*  54:212 */       double d2 = localxm.xPos - this.a.xPos;
/*  55:213 */       double d3 = localxm.getAABB().minY + localxm.height / 2.0F - (this.a.yPos + this.a.height / 2.0F);
/*  56:214 */       double d4 = localxm.zPos - this.a.zPos;
/*  57:216 */       if (this.c <= 0)
/*  58:    */       {
/*  59:217 */         this.b += 1;
/*  60:218 */         if (this.b == 1)
/*  61:    */         {
/*  62:219 */           this.c = 60;
/*  63:220 */           this.a.a(true);
/*  64:    */         }
/*  65:221 */         else if (this.b <= 4)
/*  66:    */         {
/*  67:222 */           this.c = 6;
/*  68:    */         }
/*  69:    */         else
/*  70:    */         {
/*  71:224 */           this.c = 100;
/*  72:225 */           this.b = 0;
/*  73:226 */           this.a.a(false);
/*  74:    */         }
/*  75:229 */         if (this.b > 1)
/*  76:    */         {
/*  77:230 */           float f = MathUtils.sqrt(MathUtils.sqrt(d1)) * 0.5F;
/*  78:    */           
/*  79:232 */           this.a.world.playLevelEvent(null, 1009, new BlockPosition((int)this.a.xPos, (int)this.a.yPos, (int)this.a.zPos), 0);
/*  80:233 */           for (int i = 0; i < 1; i++)
/*  81:    */           {
/*  82:234 */             ahp localahp = new ahp(this.a.world, this.a, d2 + this.a.getRNG().nextGaussian() * f, d3, d4 + this.a.getRNG().nextGaussian() * f);
/*  83:235 */             localahp.yPos = (this.a.yPos + this.a.height / 2.0F + 0.5D);
/*  84:236 */             this.a.world.spawnEntity(localahp);
/*  85:    */           }
/*  86:    */         }
/*  87:    */       }
/*  88:240 */       this.a.p().a(localxm, 10.0F, 10.0F);
/*  89:    */     }
/*  90:    */     else
/*  91:    */     {
/*  92:242 */       this.a.getNavigator().n();
/*  93:243 */       this.a.q().setTarget(localxm.xPos, localxm.yPos, localxm.zPos, 1.0D);
/*  94:    */     }
/*  95:246 */     super.tick();
/*  96:    */   }
/*  97:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aen
 * JD-Core Version:    0.7.0.1
 */