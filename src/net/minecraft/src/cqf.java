package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class cqf
/*   4:    */   extends cpu<EntityItem>
/*   5:    */ {
/*   6:    */   private final cqh a;
/*   7: 28 */   private Random e = new Random();
/*   8:    */   
/*   9:    */   public cqf(cpt paramcpt, cqh paramcqh)
/*  10:    */   {
/*  11: 31 */     super(paramcpt);
/*  12: 32 */     this.a = paramcqh;
/*  13:    */     
/*  14: 34 */     this.c = 0.15F;
/*  15: 35 */     this.d = 0.75F;
/*  16:    */   }
/*  17:    */   
/*  18:    */   private int a(EntityItem paramadw, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat, cxe paramcxe)
/*  19:    */   {
/*  20: 39 */     ItemStack localamj = paramadw.getItemStack();
/*  21: 40 */     Item localalq = localamj.getItem();
/*  22: 42 */     if (localalq == null) {
/*  23: 43 */       return 0;
/*  24:    */     }
/*  25: 46 */     boolean bool = paramcxe.c();
/*  26: 47 */     int i = a(localamj);
/*  27:    */     
/*  28:    */ 
/*  29: 50 */     float f1 = 0.25F;
/*  30: 51 */     float f2 = MathUtils.sin((paramadw.getAge() + paramFloat) / 10.0F + paramadw.a) * 0.1F + 0.1F;
/*  31: 52 */     cjm.glTranslatef((float)paramDouble1, (float)paramDouble2 + f2 + 0.25F, (float)paramDouble3);
/*  32:    */     float f3;
/*  33: 55 */     if ((bool) || ((this.b.g != null) && (this.b.g.i)))
/*  34:    */     {
/*  35: 56 */       f3 = ((paramadw.getAge() + paramFloat) / 20.0F + paramadw.a) * 57.295776F;
/*  36: 57 */       cjm.glRotatef(f3, 0.0F, 1.0F, 0.0F);
/*  37:    */     }
/*  38: 60 */     if (!bool)
/*  39:    */     {
/*  40: 61 */       f3 = -0.0F * (i - 1) * 0.5F;
/*  41: 62 */       float f4 = -0.0F * (i - 1) * 0.5F;
/*  42: 63 */       float f5 = -0.046875F * (i - 1) * 0.5F;
/*  43: 64 */       cjm.glTranslatef(f3, f4, f5);
/*  44:    */     }
/*  45: 67 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/*  46:    */     
/*  47: 69 */     return i;
/*  48:    */   }
/*  49:    */   
/*  50:    */   private int a(ItemStack paramamj)
/*  51:    */   {
/*  52: 73 */     int i = 1;
/*  53: 74 */     if (paramamj.stackSize > 48) {
/*  54: 75 */       i = 5;
/*  55: 76 */     } else if (paramamj.stackSize > 32) {
/*  56: 77 */       i = 4;
/*  57: 78 */     } else if (paramamj.stackSize > 16) {
/*  58: 79 */       i = 3;
/*  59: 80 */     } else if (paramamj.stackSize > 1) {
/*  60: 81 */       i = 2;
/*  61:    */     }
/*  62: 84 */     return i;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void a(EntityItem paramadw, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*  66:    */   {
/*  67: 89 */     ItemStack localamj = paramadw.getItemStack();
/*  68:    */     
/*  69: 91 */     this.e.setSeed(187L);
/*  70:    */     
/*  71: 93 */     int i = 0;
/*  72: 94 */     if (c(paramadw))
/*  73:    */     {
/*  74: 95 */       this.b.a.b(a(paramadw)).b(false, false);
/*  75: 96 */       i = 1;
/*  76:    */     }
/*  77: 99 */     cjm.B();
/*  78:100 */     cjm.glAlphaFunc(516, 0.1F);
/*  79:101 */     cjm.enableBlend();
/*  80:102 */     cjm.glBlendFuncSeparate(770, 771, 1, 0);
/*  81:    */     
/*  82:104 */     cjm.glPushMatrix();
/*  83:    */     
/*  84:106 */     cxe localcxe = this.a.a().a(localamj);
/*  85:107 */     int j = a(paramadw, paramDouble1, paramDouble2, paramDouble3, paramFloat2, localcxe);
/*  86:109 */     for (int k = 0; k < j; k++) {
/*  87:110 */       if (localcxe.c())
/*  88:    */       {
/*  89:111 */         cjm.glPushMatrix();
/*  90:112 */         if (k > 0)
/*  91:    */         {
/*  92:113 */           float f1 = (this.e.nextFloat() * 2.0F - 1.0F) * 0.15F;
/*  93:114 */           float f2 = (this.e.nextFloat() * 2.0F - 1.0F) * 0.15F;
/*  94:115 */           float f3 = (this.e.nextFloat() * 2.0F - 1.0F) * 0.15F;
/*  95:116 */           cjm.glTranslatef(f1, f2, f3);
/*  96:    */         }
/*  97:118 */         cjm.glScalef(0.5F, 0.5F, 0.5F);
/*  98:119 */         this.a.a(localamj, localcxe);
/*  99:    */         
/* 100:121 */         cjm.glPopMatrix();
/* 101:    */       }
/* 102:    */       else
/* 103:    */       {
/* 104:123 */         this.a.a(localamj, localcxe);
/* 105:124 */         cjm.glTranslatef(0.0F, 0.0F, 0.046875F);
/* 106:    */       }
/* 107:    */     }
/* 108:127 */     cjm.glPopMatrix();
/* 109:    */     
/* 110:129 */     cjm.C();
/* 111:130 */     cjm.disableBlend();
/* 112:131 */     c(paramadw);
/* 113:132 */     if (i != 0) {
/* 114:133 */       this.b.a.b(a(paramadw)).a();
/* 115:    */     }
/* 116:135 */     super.a(paramadw, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/* 117:    */   }
/* 118:    */   
/* 119:    */   protected oa a(EntityItem paramadw)
/* 120:    */   {
/* 121:140 */     return cua.g;
/* 122:    */   }
/* 123:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cqf
 * JD-Core Version:    0.7.0.1
 */