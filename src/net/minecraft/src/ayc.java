package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class ayc
/*  4:   */   extends ProtoBlock
/*  5:   */ {
/*  6:18 */   public static final bet a = bet.a("snowy");
/*  7:   */   
/*  8:   */   protected ayc()
/*  9:   */   {
/* 10:23 */     super(Material.grass);
/* 11:24 */     j(this.L.b().a(a, Boolean.valueOf(false)));
/* 12:25 */     a(true);
/* 13:26 */     setCreativeTab(CreativeTabs.tabBlock);
/* 14:   */   }
/* 15:   */   
/* 16:   */   public Block a(Block parambec, IBlockAccess paramard, BlockPosition paramdt)
/* 17:   */   {
/* 18:31 */     ProtoBlock localatr = paramard.getBlock(paramdt.up()).getProto();
/* 19:32 */     return parambec.a(a, Boolean.valueOf((localatr == BlockList.aJ) || (localatr == BlockList.aH)));
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void b(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/* 23:   */   {
/* 24:37 */     if (paramaqu.isClient) {
/* 25:38 */       return;
/* 26:   */     }
/* 27:41 */     if ((paramaqu.l(paramdt.up()) < 4) && (paramaqu.getBlock(paramdt.up()).getProto().getLightOpacity() > 2))
/* 28:   */     {
/* 29:42 */       paramaqu.setBlock(paramdt, BlockList.dirt.instance().a(BlockDirt.a, avd.a));
/* 30:43 */       return;
/* 31:   */     }
/* 32:46 */     if (paramaqu.l(paramdt.up()) >= 9) {
/* 33:47 */       for (int i = 0; i < 4; i++)
/* 34:   */       {
/* 35:48 */         BlockPosition localdt = paramdt.offset(paramRandom.nextInt(3) - 1, paramRandom.nextInt(5) - 3, paramRandom.nextInt(3) - 1);
/* 36:49 */         Block localbec = paramaqu.getBlock(localdt);
/* 37:50 */         ProtoBlock localatr = paramaqu.getBlock(localdt.up()).getProto();
/* 38:51 */         if ((localbec.getProto() == BlockList.dirt) && (localbec.getProperty(BlockDirt.a) == avd.a) && (paramaqu.l(localdt.up()) >= 4) && (localatr.getLightOpacity() <= 2)) {
/* 39:52 */           paramaqu.setBlock(localdt, instance());
/* 40:   */         }
/* 41:   */       }
/* 42:   */     }
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void c(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/* 46:   */   {
/* 47:60 */     super.c(paramaqu, paramdt, parambec, paramRandom);
/* 48:61 */     if (paramRandom.nextInt(10) == 0) {
/* 49:62 */       paramaqu.a(ew.w, paramdt.getX() + paramRandom.nextFloat(), paramdt.getY() + 1.1F, paramdt.getZ() + paramRandom.nextFloat(), 0.0D, 0.0D, 0.0D, new int[0]);
/* 50:   */     }
/* 51:   */   }
/* 52:   */   
/* 53:   */   public Item a(Block parambec, Random paramRandom, int paramInt)
/* 54:   */   {
/* 55:69 */     return BlockList.dirt.a(BlockList.dirt.instance().a(BlockDirt.a, avd.a), paramRandom, paramInt);
/* 56:   */   }
/* 57:   */   
/* 58:   */   public int c(Block parambec)
/* 59:   */   {
/* 60:74 */     return 0;
/* 61:   */   }
/* 62:   */   
/* 63:   */   protected bed e()
/* 64:   */   {
/* 65:79 */     return new bed(this, new bex[] { a });
/* 66:   */   }
/* 67:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ayc
 * JD-Core Version:    0.7.0.1
 */