package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class axb
/*  4:   */   extends awt
/*  5:   */ {
/*  6:   */   public axb()
/*  7:   */   {
/*  8:21 */     super(Material.w, false);
/*  9:22 */     this.K = 0.98F;
/* 10:23 */     a(true);
/* 11:24 */     setCreativeTab(CreativeTabs.tabBlock);
/* 12:   */   }
/* 13:   */   
/* 14:   */   public aql k()
/* 15:   */   {
/* 16:29 */     return aql.d;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void a(World paramaqu, EntityPlayer paramahd, BlockPosition paramdt, Block parambec, bcm parambcm)
/* 20:   */   {
/* 21:34 */     paramahd.increaseStat(StatList.H[ProtoBlock.a(this)]);
/* 22:35 */     paramahd.a(0.025F);
/* 23:37 */     if ((G()) && (aph.e(paramahd)))
/* 24:   */     {
/* 25:38 */       ItemStack localamj = i(parambec);
/* 26:39 */       if (localamj != null) {
/* 27:40 */         a(paramaqu, paramdt, localamj);
/* 28:   */       }
/* 29:   */     }
/* 30:   */     else
/* 31:   */     {
/* 32:43 */       if (paramaqu.t.n())
/* 33:   */       {
/* 34:44 */         paramaqu.g(paramdt);
/* 35:45 */         return;
/* 36:   */       }
/* 37:48 */       int i = aph.f(paramahd);
/* 38:49 */       b(paramaqu, paramdt, parambec, i);
/* 39:   */       
/* 40:51 */       Material localbof = paramaqu.getBlock(paramdt.down()).getProto().getMaterial();
/* 41:52 */       if ((localbof.material_c()) || (localbof.isLiquid())) {
/* 42:53 */         paramaqu.setBlock(paramdt, BlockList.flowingWater.instance());
/* 43:   */       }
/* 44:   */     }
/* 45:   */   }
/* 46:   */   
/* 47:   */   public int a(Random paramRandom)
/* 48:   */   {
/* 49:60 */     return 0;
/* 50:   */   }
/* 51:   */   
/* 52:   */   public void b(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/* 53:   */   {
/* 54:65 */     if (paramaqu.getLightLevel(EnumSkyBlock.BLOCK, paramdt) <= 11 - getLightOpacity()) {
/* 55:66 */       return;
/* 56:   */     }
/* 57:69 */     if (paramaqu.t.n())
/* 58:   */     {
/* 59:70 */       paramaqu.g(paramdt);
/* 60:71 */       return;
/* 61:   */     }
/* 62:74 */     b(paramaqu, paramdt, paramaqu.getBlock(paramdt), 0);
/* 63:75 */     paramaqu.setBlock(paramdt, BlockList.water.instance());
/* 64:   */   }
/* 65:   */   
/* 66:   */   public int i()
/* 67:   */   {
/* 68:80 */     return 0;
/* 69:   */   }
/* 70:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     axb
 * JD-Core Version:    0.7.0.1
 */