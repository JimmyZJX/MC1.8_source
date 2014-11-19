package net.minecraft.src;
/*  1:   */ class bdk
/*  2:   */   implements ICommandSender
/*  3:   */ {
			  private final bdj a;
/*  4:   */   bdk(bdj parambdj) {a=parambdj;}
/*  5:   */   
/*  6:   */   public String getName()
/*  7:   */   {
/*  8:45 */     return "Sign";
/*  9:   */   }
/* 10:   */   
/* 11:   */   public ho e_()
/* 12:   */   {
/* 13:50 */     return new hy(getName());
/* 14:   */   }
/* 15:   */   
/* 16:   */   public void a(ho paramho) {}
/* 17:   */   
/* 18:   */   public boolean a(int paramInt, String paramString)
/* 19:   */   {
/* 20:59 */     return true;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public BlockPosition c()
/* 24:   */   {
/* 25:64 */     return this.a.pos;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public Vec3 d()
/* 29:   */   {
/* 30:69 */     return new Vec3(this.a.pos.getX() + 0.5D, this.a.pos.getY() + 0.5D, this.a.pos.getZ() + 0.5D);
/* 31:   */   }
/* 32:   */   
/* 33:   */   public World e()
/* 34:   */   {
/* 35:74 */     return this.a.world;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public Entity f()
/* 39:   */   {
/* 40:79 */     return null;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public boolean t_()
/* 44:   */   {
/* 45:84 */     return false;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void a(ag paramag, int paramInt) {}
/* 49:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bdk
 * JD-Core Version:    0.7.0.1
 */