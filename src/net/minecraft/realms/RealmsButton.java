/*  1:   */ package net.minecraft.realms;
/*  2:   */ 
/*  3:   */ import net.minecraft.src.bsu;
import net.minecraft.src.bug;
import net.minecraft.src.bvr;
import net.minecraft.src.oa;
/*  7:   */ 
/*  8:   */ public class RealmsButton
/*  9:   */ {
/* 10:10 */   protected static final oa WIDGETS_LOCATION = new oa("textures/gui/widgets.png");
/* 11:   */   private bvr proxy;
/* 12:   */   
/* 13:   */   public RealmsButton(int paramInt1, int paramInt2, int paramInt3, String paramString)
/* 14:   */   {
/* 15:16 */     this.proxy = new bvr(this, paramInt1, paramInt2, paramInt3, paramString);
/* 16:   */   }
/* 17:   */   
/* 18:   */   public RealmsButton(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, String paramString)
/* 19:   */   {
/* 20:20 */     this.proxy = new bvr(this, paramInt1, paramInt2, paramInt3, paramString, paramInt4, paramInt5);
/* 21:   */   }
/* 22:   */   
/* 23:   */   public bug getProxy()
/* 24:   */   {
/* 25:24 */     return this.proxy;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public int id()
/* 29:   */   {
/* 30:28 */     return this.proxy.c();
/* 31:   */   }
/* 32:   */   
/* 33:   */   public boolean active()
/* 34:   */   {
/* 35:32 */     return this.proxy.d();
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void active(boolean paramBoolean)
/* 39:   */   {
/* 40:36 */     this.proxy.b(paramBoolean);
/* 41:   */   }
/* 42:   */   
/* 43:   */   public void msg(String paramString)
/* 44:   */   {
/* 45:40 */     this.proxy.a(paramString);
/* 46:   */   }
/* 47:   */   
/* 48:   */   public int getWidth()
/* 49:   */   {
/* 50:44 */     return this.proxy.b();
/* 51:   */   }
/* 52:   */   
/* 53:   */   public int getHeight()
/* 54:   */   {
/* 55:48 */     return this.proxy.g();
/* 56:   */   }
/* 57:   */   
/* 58:   */   public int y()
/* 59:   */   {
/* 60:52 */     return this.proxy.e();
/* 61:   */   }
/* 62:   */   
/* 63:   */   public void render(int paramInt1, int paramInt2)
/* 64:   */   {
/* 65:56 */     this.proxy.a(bsu.z(), paramInt1, paramInt2);
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void clicked(int paramInt1, int paramInt2) {}
/* 69:   */   
/* 70:   */   public void released(int paramInt1, int paramInt2) {}
/* 71:   */   
/* 72:   */   public void blit(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/* 73:   */   {
/* 74:66 */     this.proxy.b(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/* 75:   */   }
/* 76:   */   
/* 77:   */   public void renderBg(int paramInt1, int paramInt2) {}
/* 78:   */   
/* 79:   */   public int getYImage(boolean paramBoolean)
/* 80:   */   {
/* 81:73 */     return this.proxy.c(paramBoolean);
/* 82:   */   }
/* 83:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     net.minecraft.realms.RealmsButton
 * JD-Core Version:    0.7.0.1
 */