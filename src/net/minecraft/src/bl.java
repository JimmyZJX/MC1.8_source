package net.minecraft.src;
/*   1:    */ import net.minecraft.server.MinecraftServer;
/*   2:    */ 
/*   3:    */ class bl
/*   4:    */   implements ICommandSender
/*   5:    */ {
				private final Entity a;
				private final ICommandSender b;
				private final BlockPosition c;
				private final double d;
				private final double e;
				private final double f;
				private final bk g;
/*   6:    */   bl(bk parambk, Entity paramwv, ICommandSender paramae, BlockPosition paramdt, double paramDouble1, double paramDouble2, double paramDouble3) {a=paramwv;b=paramae;c=paramdt;d=paramDouble1;e=paramDouble2;f=paramDouble3;g=parambk;}
/*   7:    */   
/*   8:    */   public String getName()
/*   9:    */   {
/*  10: 71 */     return this.a.getName();
/*  11:    */   }
/*  12:    */   
/*  13:    */   public ho e_()
/*  14:    */   {
/*  15: 76 */     return this.a.e_();
/*  16:    */   }
/*  17:    */   
/*  18:    */   public void a(ho paramho)
/*  19:    */   {
/*  20: 81 */     this.b.a(paramho);
/*  21:    */   }
/*  22:    */   
/*  23:    */   public boolean a(int paramInt, String paramString)
/*  24:    */   {
/*  25: 86 */     return this.b.a(paramInt, paramString);
/*  26:    */   }
/*  27:    */   
/*  28:    */   public BlockPosition c()
/*  29:    */   {
/*  30: 91 */     return this.c;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public Vec3 d()
/*  34:    */   {
/*  35: 96 */     return new Vec3(this.d, this.e, this.f);
/*  36:    */   }
/*  37:    */   
/*  38:    */   public World e()
/*  39:    */   {
/*  40:101 */     return this.a.world;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public Entity f()
/*  44:    */   {
/*  45:106 */     return this.a;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public boolean t_()
/*  49:    */   {
/*  50:111 */     MinecraftServer localMinecraftServer = MinecraftServer.M();
/*  51:112 */     return (localMinecraftServer == null) || (localMinecraftServer.c[0].getGameRules().getBoolean("commandBlockOutput"));
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void a(ag paramag, int paramInt)
/*  55:    */   {
/*  56:117 */     this.a.a(paramag, paramInt);
/*  57:    */   }
/*  58:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bl
 * JD-Core Version:    0.7.0.1
 */