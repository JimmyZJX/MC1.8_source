package net.minecraft.src;
/*  1:   */ public class kl
/*  2:   */   implements id<ik>
/*  3:   */ {
/*  4:   */   private int a;
/*  5:   */   private BlockPosition b;
/*  6:   */   
/*  7:   */   public kl() {}
/*  8:   */   
/*  9:   */   public kl(EntityPlayer paramahd, BlockPosition paramdt)
/* 10:   */   {
/* 11:21 */     this.a = paramahd.getID();
/* 12:22 */     this.b = paramdt;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 16:   */   {
/* 17:27 */     this.a = paramhd.e();
/* 18:28 */     this.b = paramhd.readBlockPosition();
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 22:   */   {
/* 23:33 */     paramhd.b(this.a);
/* 24:34 */     paramhd.writeBlockPosition(this.b);
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void a(ik paramik)
/* 28:   */   {
/* 29:39 */     paramik.a(this);
/* 30:   */   }
/* 31:   */   
/* 32:   */   public EntityPlayer a(World paramaqu)
/* 33:   */   {
/* 34:43 */     return (EntityPlayer)paramaqu.a(this.a);
/* 35:   */   }
/* 36:   */   
/* 37:   */   public BlockPosition a()
/* 38:   */   {
/* 39:47 */     return this.b;
/* 40:   */   }
/* 41:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     kl
 * JD-Core Version:    0.7.0.1
 */