package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public class bzj
/*   4:    */   extends bzd
/*   5:    */ {
/*   6:    */   private float u;
/*   7:    */   private float v;
/*   8:    */   
/*   9:    */   public bzj(EntityPlayer paramahd)
/*  10:    */   {
/*  11: 18 */     super(paramahd.bh);
/*  12: 19 */     this.p = true;
/*  13:    */   }
/*  14:    */   
/*  15:    */   public void e()
/*  16:    */   {
/*  17: 24 */     if (this.j.c.h()) {
/*  18: 25 */       this.j.a(new byz(this.j.h));
/*  19:    */     }
/*  20: 27 */     g();
/*  21:    */   }
/*  22:    */   
/*  23:    */   public void b()
/*  24:    */   {
/*  25: 32 */     this.n.clear();
/*  26: 33 */     if (this.j.c.h()) {
/*  27: 34 */       this.j.a(new byz(this.j.h));
/*  28:    */     } else {
/*  29: 36 */       super.b();
/*  30:    */     }
/*  31:    */   }
/*  32:    */   
/*  33:    */   protected void b(int paramInt1, int paramInt2)
/*  34:    */   {
/*  35: 42 */     this.q.a(cwc.a("container.crafting", new Object[0]), 86, 16, 4210752);
/*  36:    */   }
/*  37:    */   
/*  38:    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*  39:    */   {
/*  40: 47 */     super.a(paramInt1, paramInt2, paramFloat);
/*  41: 48 */     this.u = paramInt1;
/*  42: 49 */     this.v = paramInt2;
/*  43:    */   }
/*  44:    */   
/*  45:    */   protected void a(float paramFloat, int paramInt1, int paramInt2)
/*  46:    */   {
/*  47: 54 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/*  48: 55 */     this.j.N().a(a);
/*  49: 56 */     int i = this.i;
/*  50: 57 */     int j = this.r;
/*  51: 58 */     b(i, j, 0, 0, this.f, this.g);
/*  52:    */     
/*  53: 60 */     a(i + 51, j + 75, 30, i + 51 - this.u, j + 75 - 50 - this.v, this.j.h);
/*  54:    */   }
/*  55:    */   
/*  56:    */   public static void a(int paramInt1, int paramInt2, int paramInt3, float paramFloat1, float paramFloat2, EntityLiving paramxm)
/*  57:    */   {
/*  58: 64 */     cjm.g();
/*  59:    */     
/*  60: 66 */     cjm.glPushMatrix();
/*  61: 67 */     cjm.glTranslatef(paramInt1, paramInt2, 50.0F);
/*  62: 68 */     cjm.glScalef(-paramInt3, paramInt3, paramInt3);
/*  63: 69 */     cjm.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
/*  64:    */     
/*  65: 71 */     float f1 = paramxm.aG;
/*  66: 72 */     float f2 = paramxm.yaw;
/*  67: 73 */     float f3 = paramxm.pitch;
/*  68: 74 */     float f4 = paramxm.aJ;
/*  69: 75 */     float f5 = paramxm.aI;
/*  70:    */     
/*  71: 77 */     cjm.glRotatef(135.0F, 0.0F, 1.0F, 0.0F);
/*  72: 78 */     bss.b();
/*  73: 79 */     cjm.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
/*  74:    */     
/*  75: 81 */     cjm.glRotatef(-(float)Math.atan(paramFloat2 / 40.0F) * 20.0F, 1.0F, 0.0F, 0.0F);
/*  76:    */     
/*  77: 83 */     paramxm.aG = ((float)Math.atan(paramFloat1 / 40.0F) * 20.0F);
/*  78: 84 */     paramxm.yaw = ((float)Math.atan(paramFloat1 / 40.0F) * 40.0F);
/*  79: 85 */     paramxm.pitch = (-(float)Math.atan(paramFloat2 / 40.0F) * 20.0F);
/*  80: 86 */     paramxm.aI = paramxm.yaw;
/*  81: 87 */     paramxm.aJ = paramxm.yaw;
/*  82:    */     
/*  83: 89 */     cjm.glTranslatef(0.0F, 0.0F, 0.0F);
/*  84:    */     
/*  85: 91 */     cpt localcpt = bsu.z().ae();
/*  86: 92 */     localcpt.a(180.0F);
/*  87: 93 */     localcpt.a(false);
/*  88: 94 */     localcpt.a(paramxm, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F);
/*  89: 95 */     localcpt.a(true);
/*  90:    */     
/*  91: 97 */     paramxm.aG = f1;
/*  92: 98 */     paramxm.yaw = f2;
/*  93: 99 */     paramxm.pitch = f3;
/*  94:100 */     paramxm.aJ = f4;
/*  95:101 */     paramxm.aI = f5;
/*  96:102 */     cjm.glPopMatrix();
/*  97:103 */     bss.a();
/*  98:104 */     cjm.C();
/*  99:    */     
/* 100:106 */     cjm.g(dax.q);
/* 101:107 */     cjm.x();
/* 102:108 */     cjm.g(dax.p);
/* 103:    */   }
/* 104:    */   
/* 105:    */   protected void a(bug parambug)
/* 106:    */   {
/* 107:113 */     if (parambug.k == 0) {
/* 108:114 */       this.j.a(new AchievementGUI(this, this.j.h.x()));
/* 109:    */     }
/* 110:116 */     if (parambug.k == 1) {
/* 111:117 */       this.j.a(new bxv(this, this.j.h.x()));
/* 112:    */     }
/* 113:    */   }
/* 114:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bzj
 * JD-Core Version:    0.7.0.1
 */