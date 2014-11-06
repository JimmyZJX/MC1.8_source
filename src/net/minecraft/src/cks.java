package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ import org.lwjgl.opengl.GL11;
/*  3:   */ 
/*  4:   */ public class cks
/*  5:   */   extends cjc
/*  6:   */ {
/*  7:   */   public void a(aql paramaql)
/*  8:   */   {
/*  9:11 */     if (!this.b) {
/* 10:12 */       return;
/* 11:   */     }
/* 12:14 */     for (cop localcop : this.a)
/* 13:   */     {
/* 14:15 */       coo localcoo = (coo)localcop;
/* 15:   */       
/* 16:17 */       cjm.glPushMatrix();
/* 17:18 */       a(localcop);
/* 18:   */       
/* 19:20 */       GL11.glCallList(localcoo.a(paramaql, localcoo.g()));
/* 20:   */       
/* 21:22 */       cjm.glPopMatrix();
/* 22:   */     }
/* 23:24 */     cjm.G();
/* 24:25 */     this.a.clear();
/* 25:   */   }
/* 26:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cks
 * JD-Core Version:    0.7.0.1
 */