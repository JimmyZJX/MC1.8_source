package net.minecraft.src;
/*  1:   */ public class azo
/*  2:   */   extends ati
/*  3:   */ {
/*  4:11 */   public static final BlockDataEnum b = BlockDataEnum.getInstance("shape", EnumRailState.class);
/*  5:   */   
/*  6:   */   protected azo()
/*  7:   */   {
/*  8:14 */     super(false);
/*  9:15 */     j(this.L.b().setData(b, EnumRailState.a));
/* 10:   */   }
/* 11:   */   
/* 12:   */   protected void b(World paramaqu, BlockPosition paramdt, Block parambec, BlockType paramatr)
/* 13:   */   {
/* 14:20 */     if ((paramatr.blockType_g()) && 
/* 15:21 */       (new atk(this, paramaqu, paramdt, parambec).a() == 3)) {
/* 16:22 */       a(paramaqu, paramdt, parambec, false);
/* 17:   */     }
/* 18:   */   }
/* 19:   */   
/* 20:   */   public IBlockData<Enum<?>> l()
/* 21:   */   {
/* 22:29 */     return b;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public Block instance(int paramInt)
/* 26:   */   {
/* 27:34 */     return instance().setData(b, EnumRailState.a(paramInt));
/* 28:   */   }
/* 29:   */   
/* 30:   */   public int c(Block parambec)
/* 31:   */   {
/* 32:40 */     return ((EnumRailState)parambec.getData(b)).a();
/* 33:   */   }
/* 34:   */   
/* 35:   */   protected bed e()
/* 36:   */   {
/* 37:45 */     return new bed(this, new IBlockData[] { b });
/* 38:   */   }
/* 39:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     azo
 * JD-Core Version:    0.7.0.1
 */