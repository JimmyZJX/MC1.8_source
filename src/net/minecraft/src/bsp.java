package net.minecraft.src;
/*   1:    */ import java.nio.FloatBuffer;
/*   2:    */ import java.nio.IntBuffer;
/*   3:    */ import org.lwjgl.opengl.GL11;
/*   4:    */ import org.lwjgl.util.glu.GLU;
/*   5:    */ 
/*   6:    */ public class bsp
/*   7:    */ {
/*   8: 21 */   private static final IntBuffer a = bst.f(16);
/*   9: 22 */   private static final FloatBuffer b = bst.h(16);
/*  10: 23 */   private static final FloatBuffer c = bst.h(16);
/*  11: 24 */   private static final FloatBuffer d = bst.h(3);
/*  12: 26 */   private static Vec3 e = new Vec3(0.0D, 0.0D, 0.0D);
/*  13:    */   private static float f;
/*  14:    */   private static float g;
/*  15:    */   private static float h;
/*  16:    */   private static float i;
/*  17:    */   private static float j;
/*  18:    */   
/*  19:    */   public static void a(EntityPlayer paramahd, boolean paramBoolean)
/*  20:    */   {
/*  21: 35 */     cjm.glGetFloat(2982, b);
/*  22: 36 */     cjm.glGetFloat(2983, c);
/*  23: 37 */     GL11.glGetInteger(2978, a);
/*  24:    */     
/*  25: 39 */     float f1 = (a.get(0) + a.get(2)) / 2;
/*  26: 40 */     float f2 = (a.get(1) + a.get(3)) / 2;
/*  27: 41 */     GLU.gluUnProject(f1, f2, 0.0F, b, c, a, d);
/*  28:    */     
/*  29: 43 */     e = new Vec3(d.get(0), d.get(1), d.get(2));
/*  30:    */     
/*  31: 45 */     int k = paramBoolean ? 1 : 0;
/*  32:    */     
/*  33: 47 */     float f3 = paramahd.pitch;
/*  34: 48 */     float f4 = paramahd.yaw;
/*  35:    */     
/*  36: 50 */     f = MathUtils.cos(f4 * 3.141593F / 180.0F) * (1 - k * 2);
/*  37: 51 */     h = MathUtils.sin(f4 * 3.141593F / 180.0F) * (1 - k * 2);
/*  38:    */     
/*  39: 53 */     i = -h * MathUtils.sin(f3 * 3.141593F / 180.0F) * (1 - k * 2);
/*  40: 54 */     j = f * MathUtils.sin(f3 * 3.141593F / 180.0F) * (1 - k * 2);
/*  41: 55 */     g = MathUtils.cos(f3 * 3.141593F / 180.0F);
/*  42:    */   }
/*  43:    */   
/*  44:    */   public static Vec3 a(Entity paramwv, double paramDouble)
/*  45:    */   {
/*  46: 59 */     double d1 = paramwv.lastX + (paramwv.xPos - paramwv.lastX) * paramDouble;
/*  47: 60 */     double d2 = paramwv.lastY + (paramwv.yPos - paramwv.lastY) * paramDouble;
/*  48: 61 */     double d3 = paramwv.lastZ + (paramwv.zPos - paramwv.lastZ) * paramDouble;
/*  49:    */     
/*  50: 63 */     double d4 = d1 + e.x;
/*  51: 64 */     double d5 = d2 + e.y;
/*  52: 65 */     double d6 = d3 + e.z;
/*  53:    */     
/*  54: 67 */     return new Vec3(d4, d5, d6);
/*  55:    */   }
/*  56:    */   
/*  57:    */   public static ProtoBlock a(World paramaqu, Entity paramwv, float paramFloat)
/*  58:    */   {
/*  59: 71 */     Vec3 localbrw = a(paramwv, paramFloat);
/*  60: 72 */     BlockPosition localdt = new BlockPosition(localbrw);
/*  61: 73 */     Block localbec = paramaqu.getBlock(localdt);
/*  62: 74 */     ProtoBlock localatr = localbec.getProto();
/*  63: 75 */     if (localatr.getMaterial().isLiquid())
/*  64:    */     {
/*  65: 76 */       float f1 = 0.0F;
/*  66: 77 */       if ((localbec.getProto() instanceof BlockLiquid)) {
/*  67: 78 */         f1 = BlockLiquid.b(((Integer)localbec.getData(BlockLiquid.level)).intValue()) - 0.1111111F;
/*  68:    */       }
/*  69: 80 */       float f2 = localdt.getY() + 1 - f1;
/*  70: 81 */       if (localbrw.y >= f2) {
/*  71: 82 */         localatr = paramaqu.getBlock(localdt.up()).getProto();
/*  72:    */       }
/*  73:    */     }
/*  74: 85 */     return localatr;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public static Vec3 a()
/*  78:    */   {
/*  79: 89 */     return e;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public static float b()
/*  83:    */   {
/*  84: 93 */     return f;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public static float c()
/*  88:    */   {
/*  89: 97 */     return g;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public static float d()
/*  93:    */   {
/*  94:101 */     return h;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public static float e()
/*  98:    */   {
/*  99:105 */     return i;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public static float f()
/* 103:    */   {
/* 104:109 */     return j;
/* 105:    */   }
/* 106:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bsp
 * JD-Core Version:    0.7.0.1
 */