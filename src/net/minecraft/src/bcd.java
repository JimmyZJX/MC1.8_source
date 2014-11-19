package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class bcd
/*  4:   */   extends ath
/*  5:   */ {
/*  6:15 */   public static final BlockDataInteger a = BlockDataInteger.getInstance("power", 0, 15);
/*  7:   */   private final int b;
/*  8:   */   
/*  9:   */   protected bcd(String paramString, Material parambof, int paramInt)
/* 10:   */   {
/* 11:20 */     super(parambof);
/* 12:21 */     j(this.L.b().a(a, Integer.valueOf(0)));
/* 13:22 */     this.b = paramInt;
/* 14:   */   }
/* 15:   */   
/* 16:   */   protected int e(World paramaqu, BlockPosition paramdt)
/* 17:   */   {
/* 18:27 */     int i = Math.min(paramaqu.a(Entity.class, a(paramdt)).size(), this.b);
/* 19:28 */     if (i > 0)
/* 20:   */     {
/* 21:29 */       float f = Math.min(this.b, i) / this.b;
/* 22:30 */       return MathUtils.ceil(f * 15.0F);
/* 23:   */     }
/* 24:33 */     return 0;
/* 25:   */   }
/* 26:   */   
/* 27:   */   protected int e(Block parambec)
/* 28:   */   {
/* 29:38 */     return ((Integer)parambec.getProperty(a)).intValue();
/* 30:   */   }
/* 31:   */   
/* 32:   */   protected Block a(Block parambec, int paramInt)
/* 33:   */   {
/* 34:43 */     return parambec.a(a, Integer.valueOf(paramInt));
/* 35:   */   }
/* 36:   */   
/* 37:   */   public int a(World paramaqu)
/* 38:   */   {
/* 39:53 */     return 10;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public Block a(int paramInt)
/* 43:   */   {
/* 44:58 */     return instance().a(a, Integer.valueOf(paramInt));
/* 45:   */   }
/* 46:   */   
/* 47:   */   public int c(Block parambec)
/* 48:   */   {
/* 49:64 */     return ((Integer)parambec.getProperty(a)).intValue();
/* 50:   */   }
/* 51:   */   
/* 52:   */   protected bed e()
/* 53:   */   {
/* 54:69 */     return new bed(this, new IBlockData[] { a });
/* 55:   */   }
/* 56:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bcd
 * JD-Core Version:    0.7.0.1
 */