package net.minecraft.src;
/*  1:   */ public class ea
/*  2:   */   implements dz
/*  3:   */ {
/*  4:   */   private final World a;
/*  5:   */   private final BlockPosition b;
/*  6:   */   
/*  7:   */   public ea(World paramaqu, BlockPosition paramdt)
/*  8:   */   {
/*  9:15 */     this.a = paramaqu;
/* 10:16 */     this.b = paramdt;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public World i()
/* 14:   */   {
/* 15:21 */     return this.a;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public double a()
/* 19:   */   {
/* 20:26 */     return this.b.getX() + 0.5D;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public double b()
/* 24:   */   {
/* 25:31 */     return this.b.getY() + 0.5D;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public double c()
/* 29:   */   {
/* 30:36 */     return this.b.getZ() + 0.5D;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public BlockPosition d()
/* 34:   */   {
/* 35:41 */     return this.b;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public ProtoBlock e()
/* 39:   */   {
/* 40:46 */     return this.a.getBlock(this.b).getProto();
/* 41:   */   }
/* 42:   */   
/* 43:   */   public int f()
/* 44:   */   {
/* 45:51 */     Block localbec = this.a.getBlock(this.b);
/* 46:52 */     return localbec.getProto().c(localbec);
/* 47:   */   }
/* 48:   */   
/* 49:   */   public bcm h()
/* 50:   */   {
/* 51:63 */     return this.a.s(this.b);
/* 52:   */   }
/* 53:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ea
 * JD-Core Version:    0.7.0.1
 */