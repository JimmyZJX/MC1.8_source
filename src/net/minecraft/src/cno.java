package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Maps;
/*   2:    */ import java.util.Map;
/*   3:    */ 
/*   4:    */ public class cno
/*   5:    */ {
/*   6: 20 */   private Map<Class,cnp> m = Maps.newHashMap();
/*   7: 22 */   public static cno a = new cno();
/*   8:    */   private bty n;
/*   9:    */   public static double b;
/*  10:    */   public static double c;
/*  11:    */   public static double d;
/*  12:    */   public cug e;
/*  13:    */   public World f;
/*  14:    */   public Entity g;
/*  15:    */   public float h;
/*  16:    */   public float i;
/*  17:    */   public double j;
/*  18:    */   public double k;
/*  19:    */   public double l;
/*  20:    */   
/*  21:    */   private cno()
/*  22:    */   {
/*  23: 36 */     this.m.put(bdj.class, new cnv());
/*  24: 37 */     this.m.put(bdg.class, new cnt());
/*  25: 38 */     this.m.put(bdv.class, new cnu());
/*  26: 39 */     this.m.put(bcr.class, new cnq());
/*  27: 40 */     this.m.put(bda.class, new cns());
/*  28: 41 */     this.m.put(bcz.class, new cnr());
/*  29: 42 */     this.m.put(bdn.class, new cny());
/*  30: 43 */     this.m.put(bck.class, new cnn());
/*  31: 44 */     this.m.put(bdm.class, new cnw());
/*  32: 45 */     this.m.put(bci.class, new cnk());
/*  33: 47 */     for (cnp localcnp : this.m.values()) {
/*  34: 48 */       localcnp.a(this);
/*  35:    */     }
/*  36:    */   }
/*  37:    */   
/*  38:    */   public cnp a(Class paramClass)
/*  39:    */   {
/*  40: 54 */     cnp localcnp = (cnp)this.m.get(paramClass);
/*  41: 55 */     if ((localcnp == null) && (paramClass != bcm.class))
/*  42:    */     {
/*  43: 56 */       localcnp = a(paramClass.getSuperclass());
/*  44: 57 */       this.m.put(paramClass, localcnp);
/*  45:    */     }
/*  46: 59 */     return localcnp;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public boolean a(bcm parambcm)
/*  50:    */   {
/*  51: 63 */     return b(parambcm) != null;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public cnp b(bcm parambcm)
/*  55:    */   {
/*  56: 68 */     if (parambcm == null) {
/*  57: 69 */       return null;
/*  58:    */     }
/*  59: 71 */     return a(parambcm.getClass());
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void a(World paramaqu, cug paramcug, bty parambty, Entity paramwv, float paramFloat)
/*  63:    */   {
/*  64: 75 */     if (this.f != paramaqu) {
/*  65: 76 */       a(paramaqu);
/*  66:    */     }
/*  67: 78 */     this.e = paramcug;
/*  68: 79 */     this.g = paramwv;
/*  69: 80 */     this.n = parambty;
/*  70:    */     
/*  71: 82 */     this.h = (paramwv.lastYaw + (paramwv.yaw - paramwv.lastYaw) * paramFloat);
/*  72: 83 */     this.i = (paramwv.lastPitch + (paramwv.pitch - paramwv.lastPitch) * paramFloat);
/*  73:    */     
/*  74: 85 */     this.j = (paramwv.P + (paramwv.xPos - paramwv.P) * paramFloat);
/*  75: 86 */     this.k = (paramwv.Q + (paramwv.yPos - paramwv.Q) * paramFloat);
/*  76: 87 */     this.l = (paramwv.R + (paramwv.zPos - paramwv.R) * paramFloat);
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void a(bcm parambcm, float paramFloat, int paramInt)
/*  80:    */   {
/*  81: 95 */     if (parambcm.a(this.j, this.k, this.l) < parambcm.s())
/*  82:    */     {
/*  83: 96 */       int i1 = this.f.b(parambcm.v(), 0);
/*  84: 97 */       int i2 = i1 % 65536;
/*  85: 98 */       int i3 = i1 / 65536;
/*  86: 99 */       dax.glMultiTexCoord2f(dax.q, i2 / 1.0F, i3 / 1.0F);
/*  87:100 */       cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/*  88:101 */       BlockPosition localdt = parambcm.v();
/*  89:102 */       a(parambcm, localdt.getX() - b, localdt.getY() - c, localdt.getZ() - d, paramFloat, paramInt);
/*  90:    */     }
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void a(bcm parambcm, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat)
/*  94:    */   {
/*  95:107 */     a(parambcm, paramDouble1, paramDouble2, paramDouble3, paramFloat, -1);
/*  96:    */   }
/*  97:    */   
/*  98:    */   public void a(bcm parambcm, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat, int paramInt)
/*  99:    */   {
/* 100:111 */     cnp localcnp = b(parambcm);
/* 101:112 */     if (localcnp != null) {
/* 102:    */       try
/* 103:    */       {
/* 104:114 */         localcnp.a(parambcm, paramDouble1, paramDouble2, paramDouble3, paramFloat, paramInt);
/* 105:    */       }
/* 106:    */       catch (Throwable localThrowable)
/* 107:    */       {
/* 108:116 */         b localb = net.minecraft.src.b.a(localThrowable, "Rendering Block Entity");
/* 109:117 */         j localj = localb.a("Block Entity Details");
/* 110:    */         
/* 111:119 */         parambcm.a(localj);
/* 112:    */         
/* 113:121 */         throw new u(localb);
/* 114:    */       }
/* 115:    */     }
/* 116:    */   }
/* 117:    */   
/* 118:    */   public void a(World paramaqu)
/* 119:    */   {
/* 120:127 */     this.f = paramaqu;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public bty a()
/* 124:    */   {
/* 125:131 */     return this.n;
/* 126:    */   }
/* 127:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cno
 * JD-Core Version:    0.7.0.1
 */