package net.minecraft.src;
/*   1:    */ public class bpw
/*   2:    */ {
/*   3: 10 */   private bps a = new bps();
/*   4: 12 */   private bpt[] b = new bpt[32];
/*   5:    */   private bpu c;
/*   6:    */   
/*   7:    */   public bpw(bpu parambpu)
/*   8:    */   {
/*   9: 17 */     this.c = parambpu;
/*  10:    */   }
/*  11:    */   
/*  12:    */   public bpv a(IBlockAccess world, Entity paramwv1, Entity paramwv2, float paramFloat)
/*  13:    */   {
/*  14: 22 */     return a(world, paramwv1, paramwv2.xPos, paramwv2.getAABB().minY, paramwv2.zPos, paramFloat);
/*  15:    */   }
/*  16:    */   
/*  17:    */   public bpv a(IBlockAccess paramard, Entity paramwv, BlockPosition paramdt, float paramFloat)
/*  18:    */   {
/*  19: 27 */     return a(paramard, paramwv, paramdt.getX() + 0.5F, paramdt.getY() + 0.5F, paramdt.getZ() + 0.5F, paramFloat);
/*  20:    */   }
/*  21:    */   
/*  22:    */   private bpv a(IBlockAccess paramard, Entity paramwv, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat)
/*  23:    */   {
/*  24: 32 */     this.a.a();
/*  25: 33 */     this.c.a(paramard, paramwv);
/*  26: 34 */     bpt localbpt1 = this.c.a(paramwv);
/*  27: 35 */     bpt localbpt2 = this.c.a(paramwv, paramDouble1, paramDouble2, paramDouble3);
/*  28:    */     
/*  29: 37 */     bpv localbpv = a(paramwv, localbpt1, localbpt2, paramFloat);
/*  30:    */     
/*  31: 39 */     this.c.a();
/*  32: 40 */     return localbpv;
/*  33:    */   }
/*  34:    */   
/*  35:    */   private bpv a(Entity paramwv, bpt parambpt1, bpt parambpt2, float paramFloat)
/*  36:    */   {
/*  37: 46 */     parambpt1.e = 0.0F;
/*  38: 47 */     parambpt1.f = parambpt1.b(parambpt2);
/*  39: 48 */     parambpt1.g = parambpt1.f;
/*  40:    */     
/*  41: 50 */     this.a.a();
/*  42: 51 */     this.a.a(parambpt1);
/*  43:    */     
/*  44: 53 */     Object localObject = parambpt1;
/*  45: 55 */     while (!this.a.e())
/*  46:    */     {
/*  47: 56 */       bpt localbpt1 = this.a.c();
/*  48: 58 */       if (localbpt1.equals(parambpt2)) {
/*  49: 59 */         return a(parambpt1, parambpt2);
/*  50:    */       }
/*  51: 62 */       if (localbpt1.b(parambpt2) < ((bpt)localObject).b(parambpt2)) {
/*  52: 63 */         localObject = localbpt1;
/*  53:    */       }
/*  54: 65 */       localbpt1.i = true;
/*  55:    */       
/*  56: 67 */       int i = this.c.a(this.b, paramwv, localbpt1, parambpt2, paramFloat);
/*  57: 68 */       for (int j = 0; j < i; j++)
/*  58:    */       {
/*  59: 69 */         bpt localbpt2 = this.b[j];
/*  60:    */         
/*  61: 71 */         float f = localbpt1.e + localbpt1.b(localbpt2);
/*  62: 72 */         if ((f < paramFloat * 2.0F) && ((!localbpt2.a()) || (f < localbpt2.e)))
/*  63:    */         {
/*  64: 73 */           localbpt2.h = localbpt1;
/*  65: 74 */           localbpt2.e = f;
/*  66: 75 */           localbpt2.f = localbpt2.b(parambpt2);
/*  67: 76 */           if (localbpt2.a())
/*  68:    */           {
/*  69: 77 */             this.a.a(localbpt2, localbpt2.e + localbpt2.f);
/*  70:    */           }
/*  71:    */           else
/*  72:    */           {
/*  73: 79 */             localbpt2.g = (localbpt2.e + localbpt2.f);
/*  74: 80 */             this.a.a(localbpt2);
/*  75:    */           }
/*  76:    */         }
/*  77:    */       }
/*  78:    */     }
/*  79: 86 */     if (localObject == parambpt1) {
/*  80: 87 */       return null;
/*  81:    */     }
/*  82: 89 */     return a(parambpt1, (bpt)localObject);
/*  83:    */   }
/*  84:    */   
/*  85:    */   private bpv a(bpt parambpt1, bpt parambpt2)
/*  86:    */   {
/*  87:102 */     int i = 1;
/*  88:103 */     bpt localbpt = parambpt2;
/*  89:104 */     while (localbpt.h != null)
/*  90:    */     {
/*  91:105 */       i++;
/*  92:106 */       localbpt = localbpt.h;
/*  93:    */     }
/*  94:109 */     bpt[] arrayOfbpt = new bpt[i];
/*  95:110 */     localbpt = parambpt2;
/*  96:111 */     arrayOfbpt[(--i)] = localbpt;
/*  97:112 */     while (localbpt.h != null)
/*  98:    */     {
/*  99:113 */       localbpt = localbpt.h;
/* 100:114 */       arrayOfbpt[(--i)] = localbpt;
/* 101:    */     }
/* 102:116 */     return new bpv(arrayOfbpt);
/* 103:    */   }
/* 104:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bpw
 * JD-Core Version:    0.7.0.1
 */