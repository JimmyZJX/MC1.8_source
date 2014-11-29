package net.minecraft.src;
/*  2:   */ 
/*  3:   */ public class BlockBeacon
/*  4:   */   extends atg
/*  5:   */ {
/*  6:   */   public BlockBeacon()
/*  7:   */   {
/*  8:21 */     super(Material.s);
/*  9:22 */     c(3.0F);
/* 10:23 */     setCreativeTab(CreativeTabs.tabMisc);
/* 11:   */   }
/* 12:   */   
/* 13:   */   public bcm a(World paramaqu, int paramInt)
/* 14:   */   {
/* 15:28 */     return new bck();
/* 16:   */   }
/* 17:   */   
/* 18:   */   public boolean a(World paramaqu, BlockPosition paramdt, Block parambec, EntityPlayer paramahd, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 19:   */   {
/* 20:33 */     if (paramaqu.isClient) {
/* 21:34 */       return true;
/* 22:   */     }
/* 23:37 */     bcm localbcm = paramaqu.s(paramdt);
/* 24:38 */     if ((localbcm instanceof bck)) {
/* 25:39 */       paramahd.a((vq)localbcm);
/* 26:   */     }
/* 27:42 */     return true;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public boolean c()
/* 31:   */   {
/* 32:47 */     return false;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public boolean isOpaqueCube()
/* 36:   */   {
/* 37:52 */     return false;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public int b()
/* 41:   */   {
/* 42:57 */     return 3;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, EntityLiving paramxm, ItemStack paramamj)
/* 46:   */   {
/* 47:62 */     super.a(paramaqu, paramdt, parambec, paramxm, paramamj);
/* 48:64 */     if (paramamj.s())
/* 49:   */     {
/* 50:65 */       bcm localbcm = paramaqu.s(paramdt);
/* 51:66 */       if ((localbcm instanceof bck)) {
/* 52:67 */         ((bck)localbcm).a(paramamj.q());
/* 53:   */       }
/* 54:   */     }
/* 55:   */   }
/* 56:   */   
/* 57:   */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, BlockType paramatr)
/* 58:   */   {
/* 59:74 */     bcm localbcm = paramaqu.s(paramdt);
/* 60:75 */     if ((localbcm instanceof bck))
/* 61:   */     {
/* 62:76 */       ((bck)localbcm).m();
/* 63:77 */       paramaqu.c(paramdt, this, 1, 0);
/* 64:   */     }
/* 65:   */   }
/* 66:   */   
/* 67:   */   public aql k()
/* 68:   */   {
/* 69:83 */     return aql.c;
/* 70:   */   }
/* 71:   */   
/* 72:   */   public static void d(World paramaqu, BlockPosition paramdt)
/* 73:   */   {
/* 74:87 */     ui.a.submit(new atn(paramaqu, paramdt));
/* 75:   */   }
/* 76:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     atm
 * JD-Core Version:    0.7.0.1
 */