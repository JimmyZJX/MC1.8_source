package net.minecraft.src;
/*  1:   */ import java.nio.FloatBuffer;
/*  2:   */ import org.lwjgl.opengl.GL11;
/*  3:   */ 
/*  4:   */ public class bss
/*  5:   */ {
/*  6:11 */   private static FloatBuffer a = bst.h(16);
/*  7:12 */   private static final Vec3 b = new Vec3(0.2000000029802322D, 1.0D, -0.699999988079071D).normalize();
/*  8:13 */   private static final Vec3 c = new Vec3(-0.2000000029802322D, 1.0D, 0.699999988079071D).normalize();
/*  9:   */   
/* 10:   */   public static void a()
/* 11:   */   {
/* 12:16 */     cjm.disableLighting();
/* 13:17 */     cjm.b(0);
/* 14:18 */     cjm.b(1);
/* 15:19 */     cjm.h();
/* 16:   */   }
/* 17:   */   
/* 18:   */   public static void b()
/* 19:   */   {
/* 20:23 */     cjm.enableLighting();
/* 21:24 */     cjm.a(0);
/* 22:25 */     cjm.a(1);
/* 23:26 */     cjm.g();
/* 24:27 */     cjm.a(1032, 5634);
/* 25:28 */     float f1 = 0.4F;
/* 26:29 */     float f2 = 0.6F;
/* 27:30 */     float f3 = 0.0F;
/* 28:   */     
/* 29:32 */     GL11.glLight(16384, 4611, a(b.x, b.y, b.z, 0.0D));
/* 30:33 */     GL11.glLight(16384, 4609, a(f2, f2, f2, 1.0F));
/* 31:34 */     GL11.glLight(16384, 4608, a(0.0F, 0.0F, 0.0F, 1.0F));
/* 32:35 */     GL11.glLight(16384, 4610, a(f3, f3, f3, 1.0F));
/* 33:   */     
/* 34:37 */     GL11.glLight(16385, 4611, a(c.x, c.y, c.z, 0.0D));
/* 35:38 */     GL11.glLight(16385, 4609, a(f2, f2, f2, 1.0F));
/* 36:39 */     GL11.glLight(16385, 4608, a(0.0F, 0.0F, 0.0F, 1.0F));
/* 37:40 */     GL11.glLight(16385, 4610, a(f3, f3, f3, 1.0F));
/* 38:   */     
/* 39:42 */     cjm.j(7424);
/* 40:43 */     GL11.glLightModel(2899, a(f1, f1, f1, 1.0F));
/* 41:   */   }
/* 42:   */   
/* 43:   */   private static FloatBuffer a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
/* 44:   */   {
/* 45:47 */     return a((float)paramDouble1, (float)paramDouble2, (float)paramDouble3, (float)paramDouble4);
/* 46:   */   }
/* 47:   */   
/* 48:   */   private static FloatBuffer a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
/* 49:   */   {
/* 50:51 */     a.clear();
/* 51:52 */     a.put(paramFloat1).put(paramFloat2).put(paramFloat3).put(paramFloat4);
/* 52:53 */     a.flip();
/* 53:54 */     return a;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public static void c()
/* 57:   */   {
/* 58:58 */     cjm.glPushMatrix();
/* 59:59 */     cjm.glRotatef(-30.0F, 0.0F, 1.0F, 0.0F);
/* 60:60 */     cjm.glRotatef(165.0F, 1.0F, 0.0F, 0.0F);
/* 61:61 */     b();
/* 62:62 */     cjm.glPopMatrix();
/* 63:   */   }
/* 64:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bss
 * JD-Core Version:    0.7.0.1
 */