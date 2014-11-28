package net.minecraft.src;
/*  1:   */ public class aut
/*  2:   */   implements vv
/*  3:   */ {
/*  4:   */   private final World a;
/*  5:   */   private final BlockPosition b;
/*  6:   */   
/*  7:   */   public aut(World paramaqu, BlockPosition paramdt)
/*  8:   */   {
/*  9:38 */     this.a = paramaqu;
/* 10:39 */     this.b = paramdt;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public String getName()
/* 14:   */   {
/* 15:44 */     return null;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public boolean k_()
/* 19:   */   {
/* 20:49 */     return false;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public ho e_()
/* 24:   */   {
/* 25:54 */     return new hz(BlockList.ai.a() + ".name", new Object[0]);
/* 26:   */   }
/* 27:   */   
/* 28:   */   public aib a(Inventory paramahb, EntityPlayer paramahd)
/* 29:   */   {
/* 30:59 */     return new aio(paramahb, this.a, this.b);
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String k()
/* 34:   */   {
/* 35:64 */     return "minecraft:crafting_table";
/* 36:   */   }
/* 37:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aut
 * JD-Core Version:    0.7.0.1
 */