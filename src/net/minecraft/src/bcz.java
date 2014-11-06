package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class bcz
/*   4:    */   extends bcm
/*   5:    */   implements pm, vv
/*   6:    */ {
/*   7:    */   public int a;
/*   8:    */   public float f;
/*   9:    */   public float g;
/*  10:    */   public float h;
/*  11:    */   public float i;
/*  12:    */   public float j;
/*  13:    */   public float k;
/*  14:    */   public float l;
/*  15:    */   public float m;
/*  16:    */   public float n;
/*  17: 25 */   private static Random o = new Random();
/*  18:    */   private String p;
/*  19:    */   
/*  20:    */   public void b(NBTTagCompound paramfn)
/*  21:    */   {
/*  22: 30 */     super.b(paramfn);
/*  23: 31 */     if (k_()) {
/*  24: 32 */       paramfn.setString("CustomName", this.p);
/*  25:    */     }
/*  26:    */   }
/*  27:    */   
/*  28:    */   public void a(NBTTagCompound paramfn)
/*  29:    */   {
/*  30: 38 */     super.a(paramfn);
/*  31: 39 */     if (paramfn.hasKey("CustomName", 8)) {
/*  32: 40 */       this.p = paramfn.getString("CustomName");
/*  33:    */     }
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void c()
/*  37:    */   {
/*  38: 46 */     this.k = this.j;
/*  39: 47 */     this.m = this.l;
/*  40:    */     
/*  41: 49 */     EntityPlayer localahd = this.b.a(this.c.getX() + 0.5F, this.c.getY() + 0.5F, this.c.getZ() + 0.5F, 3.0D);
/*  42: 50 */     if (localahd != null)
/*  43:    */     {
/*  44: 51 */       double d1 = localahd.xPos - (this.c.getX() + 0.5F);
/*  45: 52 */       double d2 = localahd.zPos - (this.c.getZ() + 0.5F);
/*  46:    */       
/*  47: 54 */       this.n = ((float)Math.atan2(d2, d1));
/*  48:    */       
/*  49: 56 */       this.j += 0.1F;
/*  50: 58 */       if ((this.j < 0.5F) || (o.nextInt(40) == 0))
/*  51:    */       {
/*  52: 59 */         float f4 = this.h;
/*  53:    */         do
/*  54:    */         {
/*  55: 61 */           this.h += o.nextInt(4) - o.nextInt(4);
/*  56: 62 */         } while (f4 == this.h);
/*  57:    */       }
/*  58:    */     }
/*  59:    */     else
/*  60:    */     {
/*  61: 65 */       this.n += 0.02F;
/*  62: 66 */       this.j -= 0.1F;
/*  63:    */     }
/*  64: 69 */     while (this.l >= 3.141593F) {
/*  65: 70 */       this.l -= 6.283186F;
/*  66:    */     }
/*  67: 72 */     while (this.l < -3.141593F) {
/*  68: 73 */       this.l += 6.283186F;
/*  69:    */     }
/*  70: 75 */     while (this.n >= 3.141593F) {
/*  71: 76 */       this.n -= 6.283186F;
/*  72:    */     }
/*  73: 78 */     while (this.n < -3.141593F) {
/*  74: 79 */       this.n += 6.283186F;
/*  75:    */     }
/*  76: 81 */     float f1 = this.n - this.l;
/*  77: 82 */     while (f1 >= 3.141593F) {
/*  78: 83 */       f1 -= 6.283186F;
/*  79:    */     }
/*  80: 85 */     while (f1 < -3.141593F) {
/*  81: 86 */       f1 += 6.283186F;
/*  82:    */     }
/*  83: 89 */     this.l += f1 * 0.4F;
/*  84:    */     
/*  85: 91 */     this.j = MathUtils.clamp(this.j, 0.0F, 1.0F);
/*  86:    */     
/*  87: 93 */     this.a += 1;
/*  88: 94 */     this.g = this.f;
/*  89:    */     
/*  90: 96 */     float f2 = (this.h - this.f) * 0.4F;
/*  91: 97 */     float f3 = 0.2F;
/*  92: 98 */     f2 = MathUtils.clamp(f2, -f3, f3);
/*  93: 99 */     this.i += (f2 - this.i) * 0.9F;
/*  94:    */     
/*  95:101 */     this.f += this.i;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public String getName()
/*  99:    */   {
/* 100:106 */     return k_() ? this.p : "container.enchant";
/* 101:    */   }
/* 102:    */   
/* 103:    */   public boolean k_()
/* 104:    */   {
/* 105:111 */     return (this.p != null) && (this.p.length() > 0);
/* 106:    */   }
/* 107:    */   
/* 108:    */   public void a(String paramString)
/* 109:    */   {
/* 110:115 */     this.p = paramString;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public ho e_()
/* 114:    */   {
/* 115:120 */     if (k_()) {
/* 116:121 */       return new hy(getName());
/* 117:    */     }
/* 118:123 */     return new hz(getName(), new Object[0]);
/* 119:    */   }
/* 120:    */   
/* 121:    */   public aib a(ahb paramahb, EntityPlayer paramahd)
/* 122:    */   {
/* 123:128 */     return new aiq(paramahb, this.b, this.c);
/* 124:    */   }
/* 125:    */   
/* 126:    */   public String k()
/* 127:    */   {
/* 128:133 */     return "minecraft:enchanting_table";
/* 129:    */   }
/* 130:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bcz
 * JD-Core Version:    0.7.0.1
 */