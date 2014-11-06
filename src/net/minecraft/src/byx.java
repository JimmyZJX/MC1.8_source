package net.minecraft.src;
/*  1:   */ public class byx
/*  2:   */   extends byl
/*  3:   */ {
/*  4:12 */   private static final oa u = new oa("textures/gui/container/crafting_table.png");
/*  5:   */   
/*  6:   */   public byx(ahb paramahb, World paramaqu)
/*  7:   */   {
/*  8:16 */     this(paramahb, paramaqu, BlockPosition.a);
/*  9:   */   }
/* 10:   */   
/* 11:   */   public byx(ahb paramahb, World paramaqu, BlockPosition paramdt)
/* 12:   */   {
/* 13:20 */     super(new aio(paramahb, paramaqu, paramdt));
/* 14:   */   }
/* 15:   */   
/* 16:   */   protected void b(int paramInt1, int paramInt2)
/* 17:   */   {
/* 18:25 */     this.q.a(cwc.a("container.crafting", new Object[0]), 28, 6, 4210752);
/* 19:26 */     this.q.a(cwc.a("container.inventory", new Object[0]), 8, this.g - 96 + 2, 4210752);
/* 20:   */   }
/* 21:   */   
/* 22:   */   protected void a(float paramFloat, int paramInt1, int paramInt2)
/* 23:   */   {
/* 24:31 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 25:32 */     this.j.N().a(u);
/* 26:33 */     int i = (this.l - this.f) / 2;
/* 27:34 */     int j = (this.m - this.g) / 2;
/* 28:35 */     b(i, j, 0, 0, this.f, this.g);
/* 29:   */   }
/* 30:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     byx
 * JD-Core Version:    0.7.0.1
 */