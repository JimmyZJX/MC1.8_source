package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class asd
/*   5:    */   extends arm
/*   6:    */ {
/*   7:    */   private int aG;
/*   8: 24 */   protected static final bhf aD = new bhf(false, true);
/*   9: 25 */   protected static final bhf aE = new bhf(false, false);
/*  10: 26 */   protected static final DarkOakGenerator aF = new DarkOakGenerator(false);
/*  11:    */   
/*  12:    */   public asd(int paramInt1, int paramInt2)
/*  13:    */   {
/*  14: 29 */     super(paramInt1);
/*  15: 30 */     this.aG = paramInt2;
/*  16: 31 */     this.as.A = 10;
/*  17: 32 */     this.as.C = 2;
/*  18: 34 */     if (this.aG == 1)
/*  19:    */     {
/*  20: 35 */       this.as.A = 6;
/*  21: 36 */       this.as.B = 100;
/*  22: 37 */       this.as.C = 1;
/*  23:    */     }
/*  24: 39 */     a(5159473);
/*  25: 40 */     a(0.7F, 0.8F);
/*  26: 42 */     if (this.aG == 2)
/*  27:    */     {
/*  28: 43 */       this.aj = 353825;
/*  29: 44 */       this.ai = 3175492;
/*  30: 45 */       a(0.6F, 0.6F);
/*  31:    */     }
/*  32: 48 */     if (this.aG == 0) {
/*  33: 49 */       this.au.add(new SpawnListEntry(EntityWolf.class, 5, 4, 4));
/*  34:    */     }
/*  35: 52 */     if (this.aG == 3) {
/*  36: 53 */       this.as.A = -999;
/*  37:    */     }
/*  38:    */   }
/*  39:    */   
/*  40:    */   protected arm a(int paramInt, boolean paramBoolean)
/*  41:    */   {
/*  42: 59 */     if (this.aG == 2)
/*  43:    */     {
/*  44: 60 */       this.aj = 353825;
/*  45: 61 */       this.ai = paramInt;
/*  46: 63 */       if (paramBoolean) {
/*  47: 64 */         this.aj = ((this.aj & 0xFEFEFE) >> 1);
/*  48:    */       }
/*  49: 66 */       return this;
/*  50:    */     }
/*  51: 68 */     return super.a(paramInt, paramBoolean);
/*  52:    */   }
/*  53:    */   
/*  54:    */   public bhc a(Random paramRandom)
/*  55:    */   {
/*  56: 74 */     if ((this.aG == 3) && (paramRandom.nextInt(3) > 0)) {
/*  57: 75 */       return aF;
/*  58:    */     }
/*  59: 77 */     if ((this.aG == 2) || (paramRandom.nextInt(5) == 0)) {
/*  60: 78 */       return aE;
/*  61:    */     }
/*  62: 80 */     return this.aA;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public EnumFlowerVariant a(Random paramRandom, BlockPosition paramdt)
/*  66:    */   {
/*  67: 85 */     if (this.aG == 1)
/*  68:    */     {
/*  69: 86 */       double d = MathUtils.clamp((1.0D + af.a(paramdt.getX() / 48.0D, paramdt.getZ() / 48.0D)) / 2.0D, 0.0D, 0.9999D);
/*  70: 87 */       EnumFlowerVariant localawa = EnumFlowerVariant.values()[((int)(d * EnumFlowerVariant.values().length))];
/*  71: 88 */       if (localawa == EnumFlowerVariant.c) {
/*  72: 89 */         return EnumFlowerVariant.b;
/*  73:    */       }
/*  74: 91 */       return localawa;
/*  75:    */     }
/*  76: 94 */     return super.a(paramRandom, paramdt);
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void a(World paramaqu, Random paramRandom, BlockPosition paramdt)
/*  80:    */   {
/*  81:    */     int k;
/*  82:    */     int m;
/*  83: 99 */     if (this.aG == 3) {
/*  84:100 */       for (int i = 0; i < 4; i++) {
/*  85:101 */         for (int j = 0; j < 4; j++)
/*  86:    */         {
/*  87:102 */           k = i * 4 + 1 + 8 + paramRandom.nextInt(3);
/*  88:103 */           m = j * 4 + 1 + 8 + paramRandom.nextInt(3);
/*  89:    */           
/*  90:105 */           BlockPosition localdt = paramaqu.m(paramdt.offset(k, 0, m));
/*  91:    */           Object localObject;
/*  92:106 */           if (paramRandom.nextInt(20) == 0)
/*  93:    */           {
/*  94:107 */             localObject = new bhv();
/*  95:108 */             ((bhv)localObject).generate(paramaqu, paramRandom, localdt);
/*  96:    */           }
/*  97:    */           else
/*  98:    */           {
/*  99:110 */             localObject = a(paramRandom);
/* 100:111 */             ((bhc)localObject).e();
/* 101:112 */             if (((bhc)localObject).generate(paramaqu, paramRandom, localdt)) {
/* 102:113 */               ((bhc)localObject).a(paramaqu, paramRandom, localdt);
/* 103:    */             }
/* 104:    */           }
/* 105:    */         }
/* 106:    */       }
/* 107:    */     }
/* 108:119 */     int i = paramRandom.nextInt(5) - 3;
/* 109:120 */     if (this.aG == 1) {
/* 110:121 */       i += 2;
/* 111:    */     }
/* 112:123 */     for (int j = 0; j < i; j++)
/* 113:    */     {
/* 114:124 */       k = paramRandom.nextInt(3);
/* 115:125 */       if (k == 0) {
/* 116:126 */         ag.a(avk.b);
/* 117:127 */       } else if (k == 1) {
/* 118:128 */         ag.a(avk.e);
/* 119:129 */       } else if (k == 2) {
/* 120:130 */         ag.a(avk.f);
/* 121:    */       }
/* 122:133 */       for (m = 0; m < 5; m++)
/* 123:    */       {
/* 124:134 */         int n = paramRandom.nextInt(16) + 8;
/* 125:135 */         int i1 = paramRandom.nextInt(16) + 8;
/* 126:136 */         int i2 = paramRandom.nextInt(paramaqu.m(paramdt.offset(n, 0, i1)).getY() + 32);
/* 127:138 */         if (ag.generate(paramaqu, paramRandom, new BlockPosition(paramdt.getX() + n, i2, paramdt.getZ() + i1))) {
/* 128:    */           break;
/* 129:    */         }
/* 130:    */       }
/* 131:    */     }
/* 132:143 */     super.a(paramaqu, paramRandom, paramdt);
/* 133:    */   }
/* 134:    */   
/* 135:    */   public int b(BlockPosition paramdt)
/* 136:    */   {
/* 137:148 */     int i = super.b(paramdt);
/* 138:150 */     if (this.aG == 3) {
/* 139:151 */       return (i & 0xFEFEFE) + 2634762 >> 1;
/* 140:    */     }
/* 141:154 */     return i;
/* 142:    */   }
/* 143:    */   
/* 144:    */   protected arm d(int paramInt)
/* 145:    */   {
/* 146:159 */     if (this.az == arm.t.az)
/* 147:    */     {
/* 148:160 */       asd localasd = new asd(paramInt, 1);
/* 149:161 */       localasd.a(new aro(this.an, this.ao + 0.2F));
/* 150:162 */       localasd.a("Flower Forest");
/* 151:163 */       localasd.a(6976549, true);
/* 152:164 */       localasd.a(8233509);
/* 153:165 */       return localasd;
/* 154:    */     }
/* 155:167 */     if ((this.az == arm.Q.az) || (this.az == arm.R.az)) {
/* 156:168 */       return new ase(this, paramInt, this);
/* 157:    */     }
/* 158:178 */     return new asf(this, paramInt, this);
/* 159:    */   }
/* 160:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     asd
 * JD-Core Version:    0.7.0.1
 */