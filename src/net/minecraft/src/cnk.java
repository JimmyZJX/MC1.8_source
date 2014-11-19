package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Maps;
/*   3:    */ import java.util.Iterator;
/*   4:    */ import java.util.List;
/*   5:    */ import java.util.Map;
/*   6:    */ import java.util.Set;
/*   7:    */ 
/*   8:    */ public class cnk
/*   9:    */   extends cnp<bci>
/*  10:    */ {
/*  11: 26 */   private static final Map<String,cnm> c = Maps.newHashMap();
/*  12: 27 */   private static final oa d = new oa("textures/entity/banner_base.png");
/*  13:    */   private cbw e;
/*  14:    */   
/*  15:    */   public cnk()
/*  16:    */   {
/*  17: 29 */     this.e = new cbw();
/*  18:    */   }
/*  19:    */   
/*  20:    */   public void a(bci parambci, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat, int paramInt)
/*  21:    */   {
/*  22: 33 */     int i = parambci.z() != null ? 1 : 0;
/*  23: 34 */     int j = (i == 0) || (parambci.w() == BlockList.cK) ? 1 : 0;
/*  24: 35 */     int f1 = i != 0 ? parambci.getData() : 0;
/*  25: 36 */     long l = i != 0 ? parambci.z().K() : 0L;
/*  26:    */     
/*  27: 38 */     cjm.glPushMatrix();
/*  28: 39 */     float f2 = 0.6666667F;
/*  29:    */     float f3;
/*  30: 40 */     if (j != 0)
/*  31:    */     {
/*  32: 41 */       cjm.glTranslatef((float)paramDouble1 + 0.5F, (float)paramDouble2 + 0.75F * f2, (float)paramDouble3 + 0.5F);
/*  33: 42 */       f3 = f1 * 360 / 16.0F;
/*  34: 43 */       cjm.glRotatef(-f3, 0.0F, 1.0F, 0.0F);
/*  35: 44 */       this.e.b.j = true;
/*  36:    */     }
/*  37:    */     else
/*  38:    */     {
/*  39: 46 */       int f31 = f1;
/*  40: 47 */       float f4 = 0.0F;
/*  41: 49 */       if (f31 == 2) {
/*  42: 50 */         f4 = 180.0F;
/*  43:    */       }
/*  44: 52 */       if (f31 == 4) {
/*  45: 53 */         f4 = 90.0F;
/*  46:    */       }
/*  47: 55 */       if (f31 == 5) {
/*  48: 56 */         f4 = -90.0F;
/*  49:    */       }
/*  50: 59 */       cjm.glTranslatef((float)paramDouble1 + 0.5F, (float)paramDouble2 - 0.25F * f2, (float)paramDouble3 + 0.5F);
/*  51: 60 */       cjm.glRotatef(-f4, 0.0F, 1.0F, 0.0F);
/*  52: 61 */       cjm.glTranslatef(0.0F, -0.3125F, -0.4375F);
/*  53:    */       
/*  54: 63 */       this.e.b.j = false;
/*  55:    */     }
/*  56: 66 */     BlockPosition localdt = parambci.v();
/*  57: 67 */     float f4 = localdt.getX() * 7 + localdt.getY() * 9 + localdt.getZ() * 13 + (float)l + paramFloat;
/*  58: 68 */     this.e.a.f = ((-0.0125F + 0.01F * MathUtils.cos(f4 * 3.141593F * 0.02F)) * 3.141593F);
/*  59:    */     
/*  60: 70 */     cjm.B();
/*  61: 71 */     oa localoa = a(parambci);
/*  62: 72 */     if (localoa != null)
/*  63:    */     {
/*  64: 73 */       a(localoa);
/*  65:    */       
/*  66: 75 */       cjm.glPushMatrix();
/*  67: 76 */       cjm.glScalef(f2, -f2, -f2);
/*  68: 77 */       this.e.a();
/*  69: 78 */       cjm.glPopMatrix();
/*  70:    */     }
/*  71: 80 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/*  72: 81 */     cjm.glPopMatrix();
/*  73:    */   }
/*  74:    */   
/*  75:    */   private oa a(bci parambci)
/*  76:    */   {
/*  77: 86 */     String str = parambci.e();
/*  78: 88 */     if (str.isEmpty()) {
/*  79: 89 */       return null;
/*  80:    */     }
/*  81: 92 */     cnm localcnm = (cnm)c.get(str);
/*  82: 93 */     if (localcnm == null)
/*  83:    */     {
/*  84:    */       
/*  85: 94 */       if (c.size() >= 256)
/*  86:    */       {
/*  87: 96 */         long l = System.currentTimeMillis();
/*  88: 97 */         Iterator<String> localObject1 = c.keySet().iterator();
/*  89: 98 */         while ((localObject1).hasNext())
/*  90:    */         {
/*  91: 99 */           String localObject2 = localObject1.next();
/*  92:100 */           cnm localObject3 = c.get(localObject2);
/*  93:101 */           if (l - ((cnm)localObject3).a > 60000L)
/*  94:    */           {
/*  95:102 */             bsu.z().N().c(((cnm)localObject3).b);
/*  96:103 */             localObject1.remove();
/*  97:    */           }
/*  98:    */         }
/*  99:107 */         if (c.size() >= 256) {
/* 100:109 */           return null;
/* 101:    */         }
/* 102:    */       }
/* 103:113 */       List<EnumBannerPattern> localList1 = parambci.c();
/* 104:114 */       List localList2 = parambci.d();
/* 105:    */       
/* 106:116 */       List<String> localObject1 = Lists.newArrayList();
/* 107:117 */       for (Iterator<EnumBannerPattern> localObject2 = localList1.iterator(); localObject2.hasNext();)
/* 108:    */       {
/* 109:117 */         EnumBannerPattern localObject3 = localObject2.next();
/* 110:118 */         localObject1.add("textures/entity/banner/" + ((EnumBannerPattern)localObject3).a() + ".png");
/* 111:    */       }
/* 112:121 */       localcnm = new cnm(null);
/* 113:122 */       localcnm.b = new oa(str);
/* 114:123 */       bsu.z().N().a(localcnm.b, new ctt(d, localObject1, localList2));
/* 115:124 */       c.put(str, localcnm);
/* 116:    */     }
/* 117:127 */     localcnm.a = System.currentTimeMillis();
/* 118:128 */     return localcnm.b;
/* 119:    */   }
/* 120:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cnk
 * JD-Core Version:    0.7.0.1
 */