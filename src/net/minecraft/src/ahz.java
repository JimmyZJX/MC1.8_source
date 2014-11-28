package net.minecraft.src;
/*   1:    */ public class ahz
/*   2:    */ {
/*   3:    */   private int a;
/*   4:    */   private float b;
/*   5:    */   private float c;
/*   6:    */   private int d;
/*   7:    */   private int e;
/*   8:    */   
/*   9:    */   public ahz()
/*  10:    */   {
/*  11: 23 */     this.a = 20;
/*  12: 24 */     this.e = 20;
/*  13: 25 */     this.b = 5.0F;
/*  14:    */   }
/*  15:    */   
/*  16:    */   public void a(int paramInt, float paramFloat)
/*  17:    */   {
/*  18: 29 */     this.a = Math.min(paramInt + this.a, 20);
/*  19: 30 */     this.b = Math.min(this.b + paramInt * paramFloat * 2.0F, this.a);
/*  20:    */   }
/*  21:    */   
/*  22:    */   public void a(all paramall, ItemStack paramamj)
/*  23:    */   {
/*  24: 34 */     a(paramall.h(paramamj), paramall.i(paramamj));
/*  25:    */   }
/*  26:    */   
/*  27:    */   public void a(EntityPlayer paramahd)
/*  28:    */   {
/*  29: 38 */     EnumDifficulty localvt = paramahd.world.getDifficulty();
/*  30:    */     
/*  31: 40 */     this.e = this.a;
/*  32: 42 */     if (this.c > 4.0F)
/*  33:    */     {
/*  34: 43 */       this.c -= 4.0F;
/*  35: 45 */       if (this.b > 0.0F) {
/*  36: 46 */         this.b = Math.max(this.b - 1.0F, 0.0F);
/*  37: 47 */       } else if (localvt != EnumDifficulty.PEACEFUL) {
/*  38: 48 */         this.a = Math.max(this.a - 1, 0);
/*  39:    */       }
/*  40:    */     }
/*  41: 52 */     if ((paramahd.world.getGameRules().getBoolean("naturalRegeneration")) && (this.a >= 18) && (paramahd.cl()))
/*  42:    */     {
/*  43: 53 */       this.d += 1;
/*  44: 54 */       if (this.d >= 80)
/*  45:    */       {
/*  46: 55 */         paramahd.g(1.0F);
/*  47: 56 */         a(3.0F);
/*  48: 57 */         this.d = 0;
/*  49:    */       }
/*  50:    */     }
/*  51: 59 */     else if (this.a <= 0)
/*  52:    */     {
/*  53: 60 */       this.d += 1;
/*  54: 61 */       if (this.d >= 80)
/*  55:    */       {
/*  56: 62 */         if ((paramahd.getHealth() > 10.0F) || (localvt == EnumDifficulty.HARD) || ((paramahd.getHealth() > 1.0F) && (localvt == EnumDifficulty.NORMAL))) {
/*  57: 63 */           paramahd.a(DamageSource.starve, 1.0F);
/*  58:    */         }
/*  59: 65 */         this.d = 0;
/*  60:    */       }
/*  61:    */     }
/*  62:    */     else
/*  63:    */     {
/*  64: 68 */       this.d = 0;
/*  65:    */     }
/*  66:    */   }
/*  67:    */   
/*  68:    */   public void a(NBTTagCompound paramfn)
/*  69:    */   {
/*  70: 73 */     if (paramfn.hasKey("foodLevel", 99))
/*  71:    */     {
/*  72: 74 */       this.a = paramfn.getInteger("foodLevel");
/*  73: 75 */       this.d = paramfn.getInteger("foodTickTimer");
/*  74: 76 */       this.b = paramfn.getFloat("foodSaturationLevel");
/*  75: 77 */       this.c = paramfn.getFloat("foodExhaustionLevel");
/*  76:    */     }
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void b(NBTTagCompound paramfn)
/*  80:    */   {
/*  81: 82 */     paramfn.setInt("foodLevel", this.a);
/*  82: 83 */     paramfn.setInt("foodTickTimer", this.d);
/*  83: 84 */     paramfn.setFloat("foodSaturationLevel", this.b);
/*  84: 85 */     paramfn.setFloat("foodExhaustionLevel", this.c);
/*  85:    */   }
/*  86:    */   
/*  87:    */   public int a()
/*  88:    */   {
/*  89: 89 */     return this.a;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public int b()
/*  93:    */   {
/*  94: 93 */     return this.e;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public boolean c()
/*  98:    */   {
/*  99: 97 */     return this.a < 20;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void a(float paramFloat)
/* 103:    */   {
/* 104:101 */     this.c = Math.min(this.c + paramFloat, 40.0F);
/* 105:    */   }
/* 106:    */   
/* 107:    */   public float e()
/* 108:    */   {
/* 109:109 */     return this.b;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public void a(int paramInt)
/* 113:    */   {
/* 114:113 */     this.a = paramInt;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public void b(float paramFloat)
/* 118:    */   {
/* 119:117 */     this.b = paramFloat;
/* 120:    */   }
/* 121:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ahz
 * JD-Core Version:    0.7.0.1
 */