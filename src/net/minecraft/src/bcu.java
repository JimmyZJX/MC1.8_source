package net.minecraft.src;
/*  1:   */ import io.netty.buffer.ByteBuf;
/*  2:   */ 
/*  3:   */ class bcu
/*  4:   */   extends aqf
/*  5:   */ {
			  private final bct a;
/*  6:   */   bcu(bct parambct) {a=parambct;}
/*  7:   */   
/*  8:   */   public BlockPosition c()
/*  9:   */   {
/* 10:18 */     return this.a.c;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public Vec3 d()
/* 14:   */   {
/* 15:23 */     return new Vec3(this.a.c.getX() + 0.5D, this.a.c.getY() + 0.5D, this.a.c.getZ() + 0.5D);
/* 16:   */   }
/* 17:   */   
/* 18:   */   public World e()
/* 19:   */   {
/* 20:28 */     return this.a.z();
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void a(String paramString)
/* 24:   */   {
/* 25:33 */     super.a(paramString);
/* 26:34 */     this.a.o_();
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void h()
/* 30:   */   {
/* 31:39 */     this.a.z().h(this.a.c);
/* 32:   */   }
/* 33:   */   
/* 34:   */   public int i()
/* 35:   */   {
/* 36:44 */     return 0;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void a(ByteBuf paramByteBuf)
/* 40:   */   {
/* 41:49 */     paramByteBuf.writeInt(this.a.c.getX());
/* 42:50 */     paramByteBuf.writeInt(this.a.c.getY());
/* 43:51 */     paramByteBuf.writeInt(this.a.c.getZ());
/* 44:   */   }
/* 45:   */   
/* 46:   */   public Entity f()
/* 47:   */   {
/* 48:56 */     return null;
/* 49:   */   }
/* 50:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bcu
 * JD-Core Version:    0.7.0.1
 */