package net.minecraft.src;
/*  1:   */ public abstract class yv
/*  2:   */   extends GoalType
/*  3:   */ {
/*  4:   */   protected EntityMob a;
/*  5:14 */   protected BlockPosition b = BlockPosition.zero;
/*  6:   */   protected BlockDoor c;
/*  7:   */   boolean d;
/*  8:   */   float e;
/*  9:   */   float f;
/* 10:   */   
/* 11:   */   public yv(EntityMob paramxn)
/* 12:   */   {
/* 13:20 */     this.a = paramxn;
/* 14:21 */     if (!(paramxn.getNavigator() instanceof aay)) {
/* 15:22 */       throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
/* 16:   */     }
/* 17:   */   }
/* 18:   */   
/* 19:   */   public boolean canStart()
/* 20:   */   {
/* 21:28 */     if (!this.a.horizontalColliding) {
/* 22:29 */       return false;
/* 23:   */     }
/* 24:31 */     aay localaay = (aay)this.a.getNavigator();
/* 25:32 */     bpv localbpv = localaay.j();
/* 26:33 */     if ((localbpv == null) || (localbpv.b()) || (!localaay.g())) {
/* 27:34 */       return false;
/* 28:   */     }
/* 29:37 */     for (int i = 0; i < Math.min(localbpv.e() + 2, localbpv.d()); i++)
/* 30:   */     {
/* 31:38 */       bpt localbpt = localbpv.a(i);
/* 32:39 */       this.b = new BlockPosition(localbpt.a, localbpt.b + 1, localbpt.c);
/* 33:40 */       if (this.a.dist2(this.b.getX(), this.a.yPos, this.b.getZ()) <= 2.25D)
/* 34:   */       {
/* 35:43 */         this.c = a(this.b);
/* 36:44 */         if (this.c != null) {
/* 37:47 */           return true;
/* 38:   */         }
/* 39:   */       }
/* 40:   */     }
/* 41:50 */     this.b = new BlockPosition(this.a).up();
/* 42:51 */     this.c = a(this.b);
/* 43:52 */     return this.c != null;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public boolean canContinue()
/* 47:   */   {
/* 48:57 */     return !this.d;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public void start()
/* 52:   */   {
/* 53:62 */     this.d = false;
/* 54:63 */     this.e = ((float)(this.b.getX() + 0.5F - this.a.xPos));
/* 55:64 */     this.f = ((float)(this.b.getZ() + 0.5F - this.a.zPos));
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void tick()
/* 59:   */   {
/* 60:69 */     float f1 = (float)(this.b.getX() + 0.5F - this.a.xPos);
/* 61:70 */     float f2 = (float)(this.b.getZ() + 0.5F - this.a.zPos);
/* 62:71 */     float f3 = this.e * f1 + this.f * f2;
/* 63:72 */     if (f3 < 0.0F) {
/* 64:73 */       this.d = true;
/* 65:   */     }
/* 66:   */   }
/* 67:   */   
/* 68:   */   private BlockDoor a(BlockPosition paramdt)
/* 69:   */   {
/* 70:78 */     BlockType localatr = this.a.world.getBlock(paramdt).getType();
/* 71:79 */     if (((localatr instanceof BlockDoor)) && (localatr.getMaterial() == Material.wood)) {
/* 72:80 */       return (BlockDoor)localatr;
/* 73:   */     }
/* 74:82 */     return null;
/* 75:   */   }
/* 76:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     yv
 * JD-Core Version:    0.7.0.1
 */