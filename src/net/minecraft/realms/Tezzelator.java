/*  1:   */ package net.minecraft.realms;
import net.minecraft.src.cix;
import net.minecraft.src.ckx;
/*  6:   */ 
/*  7:   */ public class Tezzelator
/*  8:   */ {
/*  9: 7 */   public static ckx t = null; // TODO: BROKEN
/* 10: 9 */   public static final Tezzelator instance = new Tezzelator();
/* 11:   */   
/* 12:   */   public int end()
/* 13:   */   {
/* 14:12 */     return t.draw();
/* 15:   */   }
/* 16:   */   
/* 17:   */   public void vertex(double paramDouble1, double paramDouble2, double paramDouble3)
/* 18:   */   {
/* 19:16 */     t.getBuffer().addVertex(paramDouble1, paramDouble2, paramDouble3);
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void color(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
/* 23:   */   {
/* 24:20 */     t.getBuffer().setColor(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void color(int paramInt1, int paramInt2, int paramInt3)
/* 28:   */   {
/* 29:24 */     t.getBuffer().setColor(paramInt1, paramInt2, paramInt3);
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void tex2(int paramInt)
/* 33:   */   {
/* 34:28 */     t.getBuffer().b(paramInt);
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void normal(float paramFloat1, float paramFloat2, float paramFloat3)
/* 38:   */   {
/* 39:32 */     t.getBuffer().d(paramFloat1, paramFloat2, paramFloat3);
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void noColor()
/* 43:   */   {
/* 44:36 */     t.getBuffer().c();
/* 45:   */   }
/* 46:   */   
/* 47:   */   public void color(int paramInt)
/* 48:   */   {
/* 49:40 */     t.getBuffer().setColor(paramInt);
/* 50:   */   }
/* 51:   */   
/* 52:   */   public void color(float paramFloat1, float paramFloat2, float paramFloat3)
/* 53:   */   {
/* 54:44 */     t.getBuffer().setColor(paramFloat1, paramFloat2, paramFloat3);
/* 55:   */   }
/* 56:   */   
/* 57:   */   public cix sortQuads(float paramFloat1, float paramFloat2, float paramFloat3)
/* 58:   */   {
/* 59:48 */     return t.getBuffer().a(paramFloat1, paramFloat2, paramFloat3);
/* 60:   */   }
/* 61:   */   
/* 62:   */   public void restoreState(cix paramcix)
/* 63:   */   {
/* 64:52 */     t.getBuffer().a(paramcix);
/* 65:   */   }
/* 66:   */   
/* 67:   */   public void begin(int paramInt)
/* 68:   */   {
/* 69:56 */     t.getBuffer().a(paramInt);
/* 70:   */   }
/* 71:   */   
/* 72:   */   public void begin()
/* 73:   */   {
/* 74:60 */     t.getBuffer().begin();
/* 75:   */   }
/* 76:   */   
/* 77:   */   public void vertexUV(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5)
/* 78:   */   {
/* 79:64 */     t.getBuffer().addVertexWithUV(paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5);
/* 80:   */   }
/* 81:   */   
/* 82:   */   public void color(int paramInt1, int paramInt2)
/* 83:   */   {
/* 84:68 */     t.getBuffer().setColor(paramInt1, paramInt2);
/* 85:   */   }
/* 86:   */   
/* 87:   */   public void offset(double paramDouble1, double paramDouble2, double paramDouble3)
/* 88:   */   {
/* 89:72 */     t.getBuffer().c(paramDouble1, paramDouble2, paramDouble3);
/* 90:   */   }
/* 91:   */   
/* 92:   */   public void color(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/* 93:   */   {
/* 94:76 */     t.getBuffer().setColor(paramInt1, paramInt2, paramInt3, paramInt4);
/* 95:   */   }
/* 96:   */   
/* 97:   */   public void tex(double paramDouble1, double paramDouble2)
/* 98:   */   {
/* 99:80 */     t.getBuffer().setUV(paramDouble1, paramDouble2);
/* :0:   */   }
/* :1:   */   
/* :2:   */   public void color(byte paramByte1, byte paramByte2, byte paramByte3)
/* :3:   */   {
/* :4:84 */     t.getBuffer().setColor(paramByte1, paramByte2, paramByte3);
/* :5:   */   }
/* :6:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     net.minecraft.realms.Tezzelator
 * JD-Core Version:    0.7.0.1
 */