package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Maps;
/*   2:    */ import java.util.Map;
/*   3:    */ import javax.vecmath.AxisAngle4d;
/*   4:    */ import javax.vecmath.Matrix4d;
/*   5:    */ 
/*   6:    */ public enum cxf
/*   7:    */ { a(0,0),b(0,90),c(0,180),d(0,270),
				e(90,0),f(90,90),g(90,180),h(90,270),
				i(180,0),j(180,90),k(180,180),l(180,270),
				m(270,0),n(270,90),o(270,180),p(270,270); // TODO: BROKEN
/*   8:    */   private static final Map<Integer,cxf> q;
/*   9:    */   private final int r;
/*  10:    */   private final Matrix4d s;
/*  11:    */   private final int t;
/*  12:    */   private final int u;
/*  13:    */   
/*  14:    */   static
/*  15:    */   {
/*  16: 32 */     q = Maps.newHashMap();
/*  17: 34 */     for (cxf localcxf : values()) {
/*  18: 35 */       q.put(Integer.valueOf(localcxf.r), localcxf);
/*  19:    */     }
/*  20:    */   }
/*  21:    */   
/*  22:    */   private static int b(int paramInt1, int paramInt2)
/*  23:    */   {
/*  24: 40 */     return paramInt1 * 360 + paramInt2;
/*  25:    */   }
/*  26:    */   
/*  27:    */   private cxf(int paramInt1, int paramInt2)
/*  28:    */   {
/*  29: 49 */     this.r = b(paramInt1, paramInt2);
/*  30:    */     
/*  31: 51 */     this.s = new Matrix4d();
/*  32:    */     
/*  33: 53 */     Matrix4d localMatrix4d1 = new Matrix4d();
/*  34: 54 */     localMatrix4d1.setIdentity();
/*  35: 55 */     localMatrix4d1.setRotation(new AxisAngle4d(1.0D, 0.0D, 0.0D, -paramInt1 * 0.01745329F));
/*  36: 56 */     this.t = MathUtils.abs(paramInt1 / 90);
/*  37:    */     
/*  38: 58 */     Matrix4d localMatrix4d2 = new Matrix4d();
/*  39: 59 */     localMatrix4d2.setIdentity();
/*  40: 60 */     localMatrix4d2.setRotation(new AxisAngle4d(0.0D, 1.0D, 0.0D, -paramInt2 * 0.01745329F));
/*  41: 61 */     this.u = MathUtils.abs(paramInt2 / 90);
/*  42:    */     
/*  43: 63 */     this.s.mul(localMatrix4d2, localMatrix4d1);
/*  44:    */   }
/*  45:    */   
/*  46:    */   public Matrix4d a()
/*  47:    */   {
/*  48: 67 */     return this.s;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public EnumDirection a(EnumDirection paramej)
/*  52:    */   {
/*  53: 71 */     EnumDirection localej = paramej;
/*  54: 72 */     for (int i1 = 0; i1 < this.t; i1++) {
/*  55: 73 */       localej = localej.a(EnumAxis.X);
/*  56:    */     }
/*  57: 76 */     if (localej.getAxis() != EnumAxis.Y) {
/*  58: 77 */       for (int i1 = 0; i1 < this.u; i1++) {
/*  59: 78 */         localej = localej.a(EnumAxis.Y);
/*  60:    */       }
/*  61:    */     }
/*  62: 82 */     return localej;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public int a(EnumDirection paramej, int paramInt)
/*  66:    */   {
/*  67: 86 */     int i1 = paramInt;
/*  68: 87 */     if (paramej.getAxis() == EnumAxis.X) {
/*  69: 88 */       i1 = (i1 + this.t) % 4;
/*  70:    */     }
/*  71: 91 */     EnumDirection localej = paramej;
/*  72: 92 */     for (int i2 = 0; i2 < this.t; i2++) {
/*  73: 93 */       localej = localej.a(EnumAxis.X);
/*  74:    */     }
/*  75: 96 */     if (localej.getAxis() == EnumAxis.Y) {
/*  76: 97 */       i1 = (i1 + this.u) % 4;
/*  77:    */     }
/*  78:100 */     return i1;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public static cxf a(int paramInt1, int paramInt2)
/*  82:    */   {
/*  83:104 */     return (cxf)q.get(Integer.valueOf(b(MathUtils.b(paramInt1, 360), MathUtils.b(paramInt2, 360))));
/*  84:    */   }
/*  85:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cxf
 * JD-Core Version:    0.7.0.1
 */