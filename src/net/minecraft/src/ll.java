package net.minecraft.src;
/*  1:   */ public class ll
/*  2:   */   implements id<ik>
/*  3:   */ {
/*  4:   */   private World a;
/*  5:   */   private BlockPosition b;
/*  6:   */   private ho[] c;
/*  7:   */   
/*  8:   */   public ll() {}
/*  9:   */   
/* 10:   */   public ll(World paramaqu, BlockPosition paramdt, ho[] paramArrayOfho)
/* 11:   */   {
/* 12:20 */     this.a = paramaqu;
/* 13:21 */     this.b = paramdt;
/* 14:22 */     this.c = new ho[] { paramArrayOfho[0], paramArrayOfho[1], paramArrayOfho[2], paramArrayOfho[3] };
/* 15:   */   }
/* 16:   */   
/* 17:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 18:   */   {
/* 19:29 */     this.b = paramhd.readBlockPosition();
/* 20:30 */     this.c = new ho[4];
/* 21:31 */     for (int i = 0; i < 4; i++) {
/* 22:32 */       this.c[i] = paramhd.d();
/* 23:   */     }
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 27:   */   {
/* 28:38 */     paramhd.writeBlockPosition(this.b);
/* 29:39 */     for (int i = 0; i < 4; i++) {
/* 30:40 */       paramhd.a(this.c[i]);
/* 31:   */     }
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void a(ik paramik)
/* 35:   */   {
/* 36:46 */     paramik.a(this);
/* 37:   */   }
/* 38:   */   
/* 39:   */   public BlockPosition a()
/* 40:   */   {
/* 41:50 */     return this.b;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public ho[] b()
/* 45:   */   {
/* 46:54 */     return this.c;
/* 47:   */   }
/* 48:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ll
 * JD-Core Version:    0.7.0.1
 */