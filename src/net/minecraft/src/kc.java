package net.minecraft.src;
/*  1:   */ public class kc
/*  2:   */   implements id<ik>
/*  3:   */ {
/*  4:   */   private BlockPosition a;
/*  5:   */   
/*  6:   */   public kc() {}
/*  7:   */   
/*  8:   */   public kc(BlockPosition paramdt)
/*  9:   */   {
/* 10:16 */     this.a = paramdt;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public void a(ik paramik)
/* 14:   */   {
/* 15:21 */     paramik.a(this);
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 19:   */   {
/* 20:26 */     this.a = paramhd.readBlockPosition();
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 24:   */   {
/* 25:31 */     paramhd.writeBlockPosition(this.a);
/* 26:   */   }
/* 27:   */   
/* 28:   */   public BlockPosition a()
/* 29:   */   {
/* 30:35 */     return this.a;
/* 31:   */   }
/* 32:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     kc
 * JD-Core Version:    0.7.0.1
 */