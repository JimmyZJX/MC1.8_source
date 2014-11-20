package net.minecraft.src;
/*  1:   */ public class aea
/*  2:   */   extends aed
/*  3:   */ {
/*  4:   */   public aea(World paramaqu)
/*  5:   */   {
/*  6:18 */     super(paramaqu);
/*  7:   */   }
/*  8:   */   
/*  9:   */   public aea(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/* 10:   */   {
/* 11:22 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3);
/* 12:   */   }
/* 13:   */   
/* 14:   */   public void a(DamageSource paramwh)
/* 15:   */   {
/* 16:27 */     super.a(paramwh);
/* 17:   */     
/* 18:29 */     a(Item.fromProtoBlock(BlockList.ae), 1, 0.0F);
/* 19:   */   }
/* 20:   */   
/* 21:   */   public int getSize()
/* 22:   */   {
/* 23:34 */     return 27;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public EnumMinecartVariant s()
/* 27:   */   {
/* 28:39 */     return EnumMinecartVariant.b;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public Block u()
/* 32:   */   {
/* 33:44 */     return BlockList.ae.instance().a(auj.a, EnumDirection.NORTH);
/* 34:   */   }
/* 35:   */   
/* 36:   */   public int w()
/* 37:   */   {
/* 38:49 */     return 8;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public String k()
/* 42:   */   {
/* 43:54 */     return "minecraft:chest";
/* 44:   */   }
/* 45:   */   
/* 46:   */   public aib a(ahb paramahb, EntityPlayer paramahd)
/* 47:   */   {
/* 48:59 */     return new aim(paramahb, this, paramahd);
/* 49:   */   }
/* 50:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aea
 * JD-Core Version:    0.7.0.1
 */