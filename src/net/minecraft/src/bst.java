package net.minecraft.src;
/*  1:   */ import java.nio.ByteBuffer;
/*  2:   */ import java.nio.ByteOrder;
/*  3:   */ import java.nio.FloatBuffer;
/*  4:   */ import java.nio.IntBuffer;
/*  5:   */ import org.lwjgl.opengl.GL11;
/*  6:   */ import org.lwjgl.util.glu.GLU;
/*  7:   */ 
/*  8:   */ public class bst
/*  9:   */ {
/* 10:   */   public static synchronized int a(int paramInt)
/* 11:   */   {
/* 12:16 */     int i = GL11.glGenLists(paramInt);
/* 13:17 */     if (i == 0)
/* 14:   */     {
/* 15:18 */       int j = GL11.glGetError();
/* 16:19 */       String str = "No error code reported";
/* 17:20 */       if (j != 0) {
/* 18:21 */         str = GLU.gluErrorString(j);
/* 19:   */       }
/* 20:23 */       throw new IllegalStateException("glGenLists returned an ID of 0 for a count of " + paramInt + ", GL error (" + j + "): " + str);
/* 21:   */     }
/* 22:25 */     return i;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public static synchronized void a(int paramInt1, int paramInt2)
/* 26:   */   {
/* 27:29 */     GL11.glDeleteLists(paramInt1, paramInt2);
/* 28:   */   }
/* 29:   */   
/* 30:   */   public static synchronized void b(int paramInt)
/* 31:   */   {
/* 32:33 */     GL11.glDeleteLists(paramInt, 1);
/* 33:   */   }
/* 34:   */   
/* 35:   */   public static synchronized ByteBuffer c(int paramInt)
/* 36:   */   {
/* 37:37 */     return ByteBuffer.allocateDirect(paramInt).order(ByteOrder.nativeOrder());
/* 38:   */   }
/* 39:   */   
/* 40:   */   public static IntBuffer f(int paramInt)
/* 41:   */   {
/* 42:49 */     return c(paramInt << 2).asIntBuffer();
/* 43:   */   }
/* 44:   */   
/* 45:   */   public static FloatBuffer h(int paramInt)
/* 46:   */   {
/* 47:57 */     return c(paramInt << 2).asFloatBuffer();
/* 48:   */   }
/* 49:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bst
 * JD-Core Version:    0.7.0.1
 */