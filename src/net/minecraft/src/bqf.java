package net.minecraft.src;
/*  2:   */ 
/*  3:   */ public class bqf
/*  4:   */ {
/*  5:   */   public final EntityPlayer player;
			  private final MapInfo mapInfo;
/*  6:32 */   private boolean d = true;
/*  7:33 */   private int xmin = 0;
/*  8:34 */   private int ymin = 0;
/*  9:35 */   private int xmax = 127;
/* 10:36 */   private int ymax = 127;
/* 11:   */   private int i;
/* 12:   */   public int b;
/* 13:   */   
/* 14:   */   public bqf(MapInfo _mapInfo, EntityPlayer entityPlayer)
/* 15:   */   {
/* 16:41 */     this.player = entityPlayer;mapInfo=_mapInfo;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public id<ik> a(ItemStack paramamj)
/* 20:   */   {
/* 21:45 */     if (this.d)
/* 22:   */     {
/* 23:46 */       this.d = false;
/* 24:47 */       return new jx(paramamj.i(), this.mapInfo.scale, this.mapInfo.icons.values(), this.mapInfo.content, this.xmin, this.ymin, this.xmax + 1 - this.xmin, this.ymax + 1 - this.ymin);
/* 25:   */     }
/* 26:48 */     if (this.i++ % 5 == 0) {
/* 27:49 */       return new jx(paramamj.i(), this.mapInfo.scale, this.mapInfo.icons.values(), this.mapInfo.content, 0, 0, 0, 0);
/* 28:   */     }
/* 29:52 */     return null;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void a(int x, int y)
/* 33:   */   {
/* 34:56 */     if (this.d)
/* 35:   */     {
/* 36:57 */       this.xmin = Math.min(this.xmin, x);
/* 37:58 */       this.ymin = Math.min(this.ymin, y);
/* 38:59 */       this.xmax = Math.max(this.xmax, x);
/* 39:60 */       this.ymax = Math.max(this.ymax, y);
/* 40:   */     }
/* 41:   */     else
/* 42:   */     {
/* 43:62 */       this.d = true;
/* 44:63 */       this.xmin = x;
/* 45:64 */       this.ymin = y;
/* 46:65 */       this.xmax = x;
/* 47:66 */       this.ymax = y;
/* 48:   */     }
/* 49:   */   }
/* 50:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bqf
 * JD-Core Version:    0.7.0.1
 */