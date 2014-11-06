package net.minecraft.src;
/*  1:   */ public class aus
/*  2:   */   extends ProtoBlock
/*  3:   */ {
/*  4:   */   protected aus()
/*  5:   */   {
/*  6:19 */     super(Material.d);
/*  7:20 */     setCreativeTab(CreativeTabs.tabDeco);
/*  8:   */   }
/*  9:   */   
/* 10:   */   public boolean a(World paramaqu, BlockPosition paramdt, Block parambec, EntityPlayer paramahd, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 11:   */   {
/* 12:25 */     if (paramaqu.isClient) {
/* 13:26 */       return true;
/* 14:   */     }
/* 15:28 */     paramahd.a(new aut(paramaqu, paramdt));
/* 16:29 */     return true;
/* 17:   */   }
/* 18:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aus
 * JD-Core Version:    0.7.0.1
 */