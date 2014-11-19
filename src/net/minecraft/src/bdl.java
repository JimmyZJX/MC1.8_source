package net.minecraft.src;
/*   1:    */ class bdl
/*   2:    */   implements ICommandSender
/*   3:    */ {
				private final EntityPlayer a;
				private final bdj b;
/*   4:    */   bdl(bdj parambdj, EntityPlayer paramahd) {a=paramahd;b=parambdj;}
/*   5:    */   
/*   6:    */   public String getName()
/*   7:    */   {
/*   8:138 */     return this.a.getName();
/*   9:    */   }
/*  10:    */   
/*  11:    */   public ho e_()
/*  12:    */   {
/*  13:143 */     return this.a.e_();
/*  14:    */   }
/*  15:    */   
/*  16:    */   public void a(ho paramho) {}
/*  17:    */   
/*  18:    */   public boolean a(int paramInt, String paramString)
/*  19:    */   {
/*  20:152 */     return true;
/*  21:    */   }
/*  22:    */   
/*  23:    */   public BlockPosition c()
/*  24:    */   {
/*  25:157 */     return this.b.pos;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public Vec3 d()
/*  29:    */   {
/*  30:162 */     return new Vec3(this.b.pos.getX() + 0.5D, this.b.pos.getY() + 0.5D, this.b.pos.getZ() + 0.5D);
/*  31:    */   }
/*  32:    */   
/*  33:    */   public World e()
/*  34:    */   {
/*  35:167 */     return this.a.e();
/*  36:    */   }
/*  37:    */   
/*  38:    */   public Entity f()
/*  39:    */   {
/*  40:172 */     return this.a;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public boolean t_()
/*  44:    */   {
/*  45:177 */     return false;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public void a(ag paramag, int paramInt)
/*  49:    */   {
/*  50:182 */     bdj.a(this.b).a(this, paramag, paramInt);
/*  51:    */   }
/*  52:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bdl
 * JD-Core Version:    0.7.0.1
 */