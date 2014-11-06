package net.minecraft.src;
/*  1:   */ public class aeh
/*  2:   */   extends adx
/*  3:   */ {
/*  4:11 */   private final aqi a = new aei(this);
/*  5:   */   
/*  6:   */   public aeh(World paramaqu)
/*  7:   */   {
/*  8:29 */     super(paramaqu);
/*  9:   */   }
/* 10:   */   
/* 11:   */   public aeh(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/* 12:   */   {
/* 13:33 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3);
/* 14:   */   }
/* 15:   */   
/* 16:   */   public EnumMinecartVariant s()
/* 17:   */   {
/* 18:38 */     return EnumMinecartVariant.e;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public Block u()
/* 22:   */   {
/* 23:43 */     return BlockList.mobSpawner.instance();
/* 24:   */   }
/* 25:   */   
/* 26:   */   protected void readEntityFromNBT(NBTTagCompound paramfn)
/* 27:   */   {
/* 28:48 */     super.readEntityFromNBT(paramfn);
/* 29:49 */     this.a.a(paramfn);
/* 30:   */   }
/* 31:   */   
/* 32:   */   protected void writeEntityToNBT(NBTTagCompound paramfn)
/* 33:   */   {
/* 34:54 */     super.writeEntityToNBT(paramfn);
/* 35:55 */     this.a.b(paramfn);
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void a(byte paramByte)
/* 39:   */   {
/* 40:60 */     this.a.b(paramByte);
/* 41:   */   }
/* 42:   */   
/* 43:   */   public void onUpdate()
/* 44:   */   {
/* 45:65 */     super.onUpdate();
/* 46:66 */     this.a.c();
/* 47:   */   }
/* 48:   */   
/* 49:   */   public aqi j()
/* 50:   */   {
/* 51:70 */     return this.a;
/* 52:   */   }
/* 53:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aeh
 * JD-Core Version:    0.7.0.1
 */