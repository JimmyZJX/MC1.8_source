package net.minecraft.src;
/*   1:    */ public class vp
/*   2:    */   implements vy
/*   3:    */ {
/*   4:    */   private String a;
/*   5:    */   private vy b;
/*   6:    */   private vy c;
/*   7:    */   
/*   8:    */   public vp(String paramString, vy paramvy1, vy paramvy2)
/*   9:    */   {
/*  10: 19 */     this.a = paramString;
/*  11: 20 */     if (paramvy1 == null) {
/*  12: 21 */       paramvy1 = paramvy2;
/*  13:    */     }
/*  14: 23 */     if (paramvy2 == null) {
/*  15: 24 */       paramvy2 = paramvy1;
/*  16:    */     }
/*  17: 26 */     this.b = paramvy1;
/*  18: 27 */     this.c = paramvy2;
/*  19: 29 */     if (paramvy1.q_()) {
/*  20: 30 */       paramvy2.a(paramvy1.i());
/*  21: 31 */     } else if (paramvy2.q_()) {
/*  22: 32 */       paramvy1.a(paramvy2.i());
/*  23:    */     }
/*  24:    */   }
/*  25:    */   
/*  26:    */   public int n_()
/*  27:    */   {
/*  28: 38 */     return this.b.n_() + this.c.n_();
/*  29:    */   }
/*  30:    */   
/*  31:    */   public boolean a(vq paramvq)
/*  32:    */   {
/*  33: 42 */     return (this.b == paramvq) || (this.c == paramvq);
/*  34:    */   }
/*  35:    */   
/*  36:    */   public String getName()
/*  37:    */   {
/*  38: 47 */     if (this.b.k_()) {
/*  39: 48 */       return this.b.getName();
/*  40:    */     }
/*  41: 50 */     if (this.c.k_()) {
/*  42: 51 */       return this.c.getName();
/*  43:    */     }
/*  44: 53 */     return this.a;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public boolean k_()
/*  48:    */   {
/*  49: 58 */     return (this.b.k_()) || (this.c.k_());
/*  50:    */   }
/*  51:    */   
/*  52:    */   public ho e_()
/*  53:    */   {
/*  54: 63 */     if (k_()) {
/*  55: 64 */       return new hy(getName());
/*  56:    */     }
/*  57: 66 */     return new hz(getName(), new Object[0]);
/*  58:    */   }
/*  59:    */   
/*  60:    */   public ItemStack a(int paramInt)
/*  61:    */   {
/*  62: 72 */     if (paramInt >= this.b.n_()) {
/*  63: 73 */       return this.c.a(paramInt - this.b.n_());
/*  64:    */     }
/*  65: 75 */     return this.b.a(paramInt);
/*  66:    */   }
/*  67:    */   
/*  68:    */   public ItemStack a(int paramInt1, int paramInt2)
/*  69:    */   {
/*  70: 82 */     if (paramInt1 >= this.b.n_()) {
/*  71: 83 */       return this.c.a(paramInt1 - this.b.n_(), paramInt2);
/*  72:    */     }
/*  73: 85 */     return this.b.a(paramInt1, paramInt2);
/*  74:    */   }
/*  75:    */   
/*  76:    */   public ItemStack b(int paramInt)
/*  77:    */   {
/*  78: 92 */     if (paramInt >= this.b.n_()) {
/*  79: 93 */       return this.c.b(paramInt - this.b.n_());
/*  80:    */     }
/*  81: 95 */     return this.b.b(paramInt);
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void a(int paramInt, ItemStack paramamj)
/*  85:    */   {
/*  86:101 */     if (paramInt >= this.b.n_()) {
/*  87:102 */       this.c.a(paramInt - this.b.n_(), paramamj);
/*  88:    */     } else {
/*  89:104 */       this.b.a(paramInt, paramamj);
/*  90:    */     }
/*  91:    */   }
/*  92:    */   
/*  93:    */   public int p_()
/*  94:    */   {
/*  95:110 */     return this.b.p_();
/*  96:    */   }
/*  97:    */   
/*  98:    */   public void o_()
/*  99:    */   {
/* 100:115 */     this.b.o_();
/* 101:116 */     this.c.o_();
/* 102:    */   }
/* 103:    */   
/* 104:    */   public boolean a(EntityPlayer paramahd)
/* 105:    */   {
/* 106:121 */     return (this.b.a(paramahd)) && (this.c.a(paramahd));
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void b(EntityPlayer paramahd)
/* 110:    */   {
/* 111:126 */     this.b.b(paramahd);
/* 112:127 */     this.c.b(paramahd);
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void c(EntityPlayer paramahd)
/* 116:    */   {
/* 117:132 */     this.b.c(paramahd);
/* 118:133 */     this.c.c(paramahd);
/* 119:    */   }
/* 120:    */   
/* 121:    */   public boolean b(int paramInt, ItemStack paramamj)
/* 122:    */   {
/* 123:138 */     return true;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public int a_(int paramInt)
/* 127:    */   {
/* 128:143 */     return 0;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public void b(int paramInt1, int paramInt2) {}
/* 132:    */   
/* 133:    */   public int g()
/* 134:    */   {
/* 135:152 */     return 0;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public boolean q_()
/* 139:    */   {
/* 140:157 */     return (this.b.q_()) || (this.c.q_());
/* 141:    */   }
/* 142:    */   
/* 143:    */   public void a(vx paramvx)
/* 144:    */   {
/* 145:162 */     this.b.a(paramvx);
/* 146:163 */     this.c.a(paramvx);
/* 147:    */   }
/* 148:    */   
/* 149:    */   public vx i()
/* 150:    */   {
/* 151:168 */     return this.b.i();
/* 152:    */   }
/* 153:    */   
/* 154:    */   public String k()
/* 155:    */   {
/* 156:179 */     return this.b.k();
/* 157:    */   }
/* 158:    */   
/* 159:    */   public aib a(ahb paramahb, EntityPlayer paramahd)
/* 160:    */   {
/* 161:184 */     return new aim(paramahb, this, paramahd);
/* 162:    */   }
/* 163:    */   
/* 164:    */   public void l()
/* 165:    */   {
/* 166:189 */     this.b.l();
/* 167:190 */     this.c.l();
/* 168:    */   }
/* 169:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     vp
 * JD-Core Version:    0.7.0.1
 */