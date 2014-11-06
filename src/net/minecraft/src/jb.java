package net.minecraft.src;
/*  1:   */ public class jb
/*  2:   */ {
/*  3:   */   private final short b;
/*  4:   */   private final Block c;
			  private final ja a;
/*  5:   */   
/*  6:   */   public jb(ja paramja, short paramShort, Block parambec)
/*  7:   */   {
				a=paramja;
/*  8:65 */     this.b = paramShort;
/*  9:66 */     this.c = parambec;
/* 10:   */   }
/* 11:   */   
/* 12:   */   public jb(ja paramja, short paramShort, Chunk parambfh)
/* 13:   */   {
				a=paramja;
/* 14:70 */     this.b = paramShort;
/* 15:71 */     this.c = parambfh.g(a());
/* 16:   */   }
/* 17:   */   
/* 18:   */   public BlockPosition a()
/* 19:   */   {
/* 20:75 */     return new BlockPosition(ja.a(this.a).getBlockPos(this.b >> 12 & 0xF, this.b & 0xFF, this.b >> 8 & 0xF));
/* 21:   */   }
/* 22:   */   
/* 23:   */   public short b()
/* 24:   */   {
/* 25:79 */     return this.b;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public Block c()
/* 29:   */   {
/* 30:83 */     return this.c;
/* 31:   */   }
/* 32:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     jb
 * JD-Core Version:    0.7.0.1
 */