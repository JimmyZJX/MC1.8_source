package net.minecraft.src;
/*  1:   */ public class iw
/*  2:   */   implements id<ik>
/*  3:   */ {
/*  4:   */   private BlockPosition a;
/*  5:   */   private Block b;
/*  6:   */   
/*  7:   */   public iw() {}
/*  8:   */   
/*  9:   */   public iw(World paramaqu, BlockPosition paramdt)
/* 10:   */   {
/* 11:22 */     this.a = paramdt;
/* 12:23 */     this.b = paramaqu.getBlock(paramdt);
/* 13:   */   }
/* 14:   */   
/* 15:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 16:   */   {
/* 17:28 */     this.a = paramhd.readBlockPosition();
/* 18:29 */     this.b = ((Block)BlockType.d.a(paramhd.e()));
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 22:   */   {
/* 23:34 */     paramhd.writeBlockPosition(this.a);
/* 24:35 */     paramhd.b(BlockType.d.b(this.b));
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void a(ik paramik)
/* 28:   */   {
/* 29:40 */     paramik.a(this);
/* 30:   */   }
/* 31:   */   
/* 32:   */   public Block a()
/* 33:   */   {
/* 34:44 */     return this.b;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public BlockPosition b()
/* 38:   */   {
/* 39:48 */     return this.a;
/* 40:   */   }
/* 41:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     iw
 * JD-Core Version:    0.7.0.1
 */