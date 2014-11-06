package net.minecraft.src;
/*  1:   */ import io.netty.buffer.ByteBuf;
/*  2:   */ 
/*  3:   */ class aec
/*  4:   */   extends aqf
/*  5:   */ {
			  private final aeb a;
/*  6:   */   aec(aeb paramaeb) {a=paramaeb;}
/*  7:   */   
/*  8:   */   public void h()
/*  9:   */   {
/* 10:23 */     this.a.H().b(23, l());
/* 11:24 */     this.a.H().b(24, hp.a(k()));
/* 12:   */   }
/* 13:   */   
/* 14:   */   public int i()
/* 15:   */   {
/* 16:29 */     return 1;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void a(ByteBuf paramByteBuf)
/* 20:   */   {
/* 21:34 */     paramByteBuf.writeInt(this.a.getID());
/* 22:   */   }
/* 23:   */   
/* 24:   */   public BlockPosition c()
/* 25:   */   {
/* 26:39 */     return new BlockPosition(this.a.xPos, this.a.yPos + 0.5D, this.a.zPos);
/* 27:   */   }
/* 28:   */   
/* 29:   */   public Vec3 d()
/* 30:   */   {
/* 31:44 */     return new Vec3(this.a.xPos, this.a.yPos, this.a.zPos);
/* 32:   */   }
/* 33:   */   
/* 34:   */   public World e()
/* 35:   */   {
/* 36:49 */     return this.a.world;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public Entity f()
/* 40:   */   {
/* 41:54 */     return this.a;
/* 42:   */   }
/* 43:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aec
 * JD-Core Version:    0.7.0.1
 */