package net.minecraft.src;
/*  1:   */ final class atn
/*  2:   */   implements Runnable
/*  3:   */ {
			  final World a;
			  private final BlockPosition b;
/*  4:   */   atn(World paramaqu, BlockPosition paramdt) {a=paramaqu;b=paramdt;}
/*  5:   */   
/*  6:   */   public void run()
/*  7:   */   {
/*  8:90 */     Chunk localbfh = this.a.getChunk(this.b);
/*  9:91 */     for (int i = this.b.getY() - 1; i >= 0; i--)
/* 10:   */     {
/* 11:92 */       BlockPosition localdt = new BlockPosition(this.b.getX(), i, this.b.getZ());
/* 12:93 */       if (!localbfh.hasDaylight(localdt)) {
/* 13:   */         break;
/* 14:   */       }
/* 15:94 */       Block localbec = this.a.getBlock(localdt);
/* 16:95 */       if (localbec.getType() == BlockList.bY) {
/* 17:96 */         ((WorldServer)this.a).a(new ato(this, localdt));
/* 18:   */       }
/* 19:   */     }
/* 20:   */   }
/* 21:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     atn
 * JD-Core Version:    0.7.0.1
 */