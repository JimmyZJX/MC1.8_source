package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.List;
/*   3:    */ import javax.vecmath.Matrix4f;
/*   4:    */ 
/*   5:    */ public class cth
/*   6:    */ {
/*   7:    */   private final ctf c;
/*   8:    */   public final ckw a;
/*   9:    */   public final ckw b;
/*  10: 19 */   private final List<Object> d = Lists.newArrayList();
/*  11: 20 */   private final List<String> e = Lists.newArrayList();
/*  12: 21 */   private final List<Integer> f = Lists.newArrayList();
/*  13: 22 */   private final List<Integer> g = Lists.newArrayList();
/*  14:    */   private Matrix4f h;
/*  15:    */   
/*  16:    */   public cth(cvk paramcvk, String paramString, ckw paramckw1, ckw paramckw2) throws ow
/*  17:    */   {
/*  18: 26 */     this.c = new ctf(paramcvk, paramString);
/*  19: 27 */     this.a = paramckw1;
/*  20: 28 */     this.b = paramckw2;
/*  21:    */   }
/*  22:    */   
/*  23:    */   public void b()
/*  24:    */   {
/*  25: 36 */     this.c.a();
/*  26:    */   }
/*  27:    */   
/*  28:    */   public void a(String paramString, Object paramObject, int paramInt1, int paramInt2)
/*  29:    */   {
/*  30: 40 */     this.e.add(this.e.size(), paramString);
/*  31: 41 */     this.d.add(this.d.size(), paramObject);
/*  32: 42 */     this.f.add(this.f.size(), Integer.valueOf(paramInt1));
/*  33: 43 */     this.g.add(this.g.size(), Integer.valueOf(paramInt2));
/*  34:    */   }
/*  35:    */   
/*  36:    */   private void d()
/*  37:    */   {
/*  38: 47 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/*  39: 48 */     cjm.disableBlend();
/*  40: 49 */     cjm.i();
/*  41: 50 */     cjm.disableAlphaTest();
/*  42: 51 */     cjm.n();
/*  43: 52 */     cjm.disableLighting();
/*  44: 53 */     cjm.h();
/*  45: 54 */     cjm.w();
/*  46: 55 */     cjm.i(0);
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void a(Matrix4f paramMatrix4f)
/*  50:    */   {
/*  51: 59 */     this.h = paramMatrix4f;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void a(float paramFloat)
/*  55:    */   {
/*  56: 63 */     d();
/*  57: 64 */     this.a.e();
/*  58:    */     
/*  59: 66 */     float f1 = this.b.a;
/*  60: 67 */     float f2 = this.b.b;
/*  61: 68 */     cjm.b(0, 0, (int)f1, (int)f2);
/*  62:    */     
/*  63: 70 */     this.c.a("DiffuseSampler", this.a);
/*  64: 73 */     for (int i = 0; i < this.d.size(); i++)
/*  65:    */     {
/*  66: 74 */       this.c.a((String)this.e.get(i), this.d.get(i));
/*  67: 75 */       this.c.b("AuxSize" + i).a(((Integer)this.f.get(i)).intValue(), ((Integer)this.g.get(i)).intValue());
/*  68:    */     }
/*  69: 78 */     this.c.b("ProjMat").a(this.h);
/*  70: 79 */     this.c.b("InSize").a(this.a.a, this.a.b);
/*  71: 80 */     this.c.b("OutSize").a(f1, f2);
/*  72: 81 */     this.c.b("Time").a(paramFloat);
/*  73:    */     
/*  74: 83 */     bsu localbsu = bsu.z();
/*  75: 84 */     this.c.b("ScreenSize").a(localbsu.d, localbsu.e);
/*  76: 85 */     this.c.c();
/*  77: 86 */     this.b.f();
/*  78: 87 */     this.b.a(false);
/*  79:    */     
/*  80: 89 */     cjm.a(false);
/*  81: 90 */     cjm.a(true, true, true, true);
/*  82:    */     
/*  83:    */ 
/*  84: 93 */     ckx localckx = ckx.getInstance();
/*  85: 94 */     VertexBuffer localciv = localckx.getBuffer();
/*  86: 95 */     localciv.begin();
/*  87: 96 */     localciv.setColor(-1);
/*  88: 97 */     localciv.addVertex(0.0D, f2, 500.0D);
/*  89: 98 */     localciv.addVertex(f1, f2, 500.0D);
/*  90: 99 */     localciv.addVertex(f1, 0.0D, 500.0D);
/*  91:100 */     localciv.addVertex(0.0D, 0.0D, 500.0D);
/*  92:101 */     localckx.draw();
/*  93:    */     
/*  94:103 */     cjm.a(true);
/*  95:104 */     cjm.a(true, true, true, true);
/*  96:    */     
/*  97:106 */     this.c.b();
/*  98:107 */     this.b.e();
/*  99:108 */     this.a.d();
/* 100:109 */     for (Object localObject : this.d) {
/* 101:110 */       if ((localObject instanceof ckw)) {
/* 102:111 */         ((ckw)localObject).d();
/* 103:    */       }
/* 104:    */     }
/* 105:    */   }
/* 106:    */   
/* 107:    */   public ctf c()
/* 108:    */   {
/* 109:117 */     return this.c;
/* 110:    */   }
/* 111:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cth
 * JD-Core Version:    0.7.0.1
 */