package net.minecraft.src;
/*  1:   */ public class bdi
/*  2:   */   extends bcm
/*  3:   */ {
/*  4:   */   public byte a;
/*  5:   */   public boolean f;
/*  6:   */   
/*  7:   */   public void writeToNBT(NBTTagCompound paramfn)
/*  8:   */   {
/*  9:16 */     super.writeToNBT(paramfn);
/* 10:17 */     paramfn.setByte("note", this.a);
/* 11:   */   }
/* 12:   */   
/* 13:   */   public void readFromNBT(NBTTagCompound paramfn)
/* 14:   */   {
/* 15:22 */     super.readFromNBT(paramfn);
/* 16:23 */     this.a = paramfn.d("note");
/* 17:24 */     this.a = ((byte)MathUtils.clamp(this.a, 0, 24));
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void b()
/* 21:   */   {
/* 22:28 */     this.a = ((byte)((this.a + 1) % 25));
/* 23:29 */     o_();
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void a(World paramaqu, BlockPosition paramdt)
/* 27:   */   {
/* 28:33 */     if (paramaqu.getBlock(paramdt.up()).getProto().getMaterial() != Material.air) {
/* 29:34 */       return;
/* 30:   */     }
/* 31:37 */     Material localbof = paramaqu.getBlock(paramdt.down()).getProto().getMaterial();
/* 32:   */     
/* 33:39 */     int i = 0;
/* 34:40 */     if (localbof == Material.rock) {
/* 35:41 */       i = 1;
/* 36:   */     }
/* 37:43 */     if (localbof == Material.p) {
/* 38:44 */       i = 2;
/* 39:   */     }
/* 40:46 */     if (localbof == Material.s) {
/* 41:47 */       i = 3;
/* 42:   */     }
/* 43:49 */     if (localbof == Material.d) {
/* 44:50 */       i = 4;
/* 45:   */     }
/* 46:53 */     paramaqu.c(paramdt, BlockList.B, i, this.a);
/* 47:   */   }
/* 48:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bdi
 * JD-Core Version:    0.7.0.1
 */