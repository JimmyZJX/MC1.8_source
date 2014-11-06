package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ import org.lwjgl.opengl.GL11;
/*  3:   */ 
/*  4:   */ public class cky
/*  5:   */   extends cjc
/*  6:   */ {
/*  7:   */   public void a(aql paramaql)
/*  8:   */   {
/*  9:15 */     if (!this.b) {
/* 10:16 */       return;
/* 11:   */     }
/* 12:19 */     for (cop localcop : this.a)
/* 13:   */     {
/* 14:20 */       cur localcur = localcop.b(paramaql.ordinal());
/* 15:   */       
/* 16:22 */       cjm.glPushMatrix();
/* 17:23 */       a(localcop);
/* 18:24 */       localcop.f();
/* 19:   */       
/* 20:26 */       localcur.a();
/* 21:   */       
/* 22:28 */       a();
/* 23:   */       
/* 24:30 */       localcur.a(7);
/* 25:   */       
/* 26:32 */       cjm.glPopMatrix();
/* 27:   */     }
/* 28:35 */     dax.g(dax.P, 0);
/* 29:   */     
/* 30:37 */     cjm.G();
/* 31:   */     
/* 32:39 */     this.a.clear();
/* 33:   */   }
/* 34:   */   
/* 35:   */   private void a()
/* 36:   */   {
/* 37:43 */     GL11.glVertexPointer(3, 5126, 28, 0L);
/* 38:44 */     GL11.glColorPointer(4, 5121, 28, 12L);
/* 39:45 */     GL11.glTexCoordPointer(2, 5126, 28, 16L);
/* 40:46 */     dax.l(dax.q);
/* 41:47 */     GL11.glTexCoordPointer(2, 5122, 28, 24L);
/* 42:48 */     dax.l(dax.p);
/* 43:   */   }
/* 44:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cky
 * JD-Core Version:    0.7.0.1
 */