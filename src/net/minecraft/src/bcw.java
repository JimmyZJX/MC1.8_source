package net.minecraft.src;
/*  1:   */ public class bcw
/*  2:   */   extends bcm
/*  3:   */   implements pm
/*  4:   */ {
/*  5:   */   public void c()
/*  6:   */   {
/*  7:13 */     if ((this.world != null) && (!this.world.isClient) && (this.world.K() % 20L == 0L))
/*  8:   */     {
/*  9:14 */       this.e = w();
/* 10:15 */       if ((this.e instanceof BlockDaylightDetector)) {
/* 11:16 */         ((BlockDaylightDetector)this.e).d(this.world, this.pos);
/* 12:   */       }
/* 13:   */     }
/* 14:   */   }
/* 15:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bcw
 * JD-Core Version:    0.7.0.1
 */