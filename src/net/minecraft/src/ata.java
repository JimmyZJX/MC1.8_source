package net.minecraft.src;
/*   1:    */ public class ata
/*   2:    */   implements vv
/*   3:    */ {
/*   4:    */   private final World a;
/*   5:    */   private final BlockPosition b;
/*   6:    */   
/*   7:    */   public ata(World paramaqu, BlockPosition paramdt)
/*   8:    */   {
/*   9:108 */     this.a = paramaqu;
/*  10:109 */     this.b = paramdt;
/*  11:    */   }
/*  12:    */   
/*  13:    */   public String getName()
/*  14:    */   {
/*  15:114 */     return "anvil";
/*  16:    */   }
/*  17:    */   
/*  18:    */   public boolean k_()
/*  19:    */   {
/*  20:119 */     return false;
/*  21:    */   }
/*  22:    */   
/*  23:    */   public ho e_()
/*  24:    */   {
/*  25:124 */     return new hz(BlockList.cf.a() + ".name", new Object[0]);
/*  26:    */   }
/*  27:    */   
/*  28:    */   public aib a(Inventory paramahb, EntityPlayer paramahd)
/*  29:    */   {
/*  30:129 */     return new aid(paramahb, this.a, this.b, paramahd);
/*  31:    */   }
/*  32:    */   
/*  33:    */   public String k()
/*  34:    */   {
/*  35:134 */     return "minecraft:anvil";
/*  36:    */   }
/*  37:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ata
 * JD-Core Version:    0.7.0.1
 */