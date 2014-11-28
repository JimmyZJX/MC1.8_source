package net.minecraft.src;
/*   1:    */ public class bql
/*   2:    */   extends WorldInfo
/*   3:    */ {
/*   4:    */   private final WorldInfo b;
/*   5:    */   
/*   6:    */   public bql(WorldInfo parambqo)
/*   7:    */   {
/*   8: 23 */     this.b = parambqo;
/*   9:    */   }
/*  10:    */   
/*  11:    */   public NBTTagCompound a()
/*  12:    */   {
/*  13: 28 */     return this.b.a();
/*  14:    */   }
/*  15:    */   
/*  16:    */   public NBTTagCompound a(NBTTagCompound paramfn)
/*  17:    */   {
/*  18: 33 */     return this.b.a(paramfn);
/*  19:    */   }
/*  20:    */   
/*  21:    */   public long b()
/*  22:    */   {
/*  23: 38 */     return this.b.b();
/*  24:    */   }
/*  25:    */   
/*  26:    */   public int c()
/*  27:    */   {
/*  28: 43 */     return this.b.c();
/*  29:    */   }
/*  30:    */   
/*  31:    */   public int d()
/*  32:    */   {
/*  33: 48 */     return this.b.d();
/*  34:    */   }
/*  35:    */   
/*  36:    */   public int e()
/*  37:    */   {
/*  38: 53 */     return this.b.e();
/*  39:    */   }
/*  40:    */   
/*  41:    */   public long getRealTime()
/*  42:    */   {
/*  43: 58 */     return this.b.getRealTime();
/*  44:    */   }
/*  45:    */   
/*  46:    */   public long getTime()
/*  47:    */   {
/*  48: 63 */     return this.b.getTime();
/*  49:    */   }
/*  50:    */   
/*  51:    */   public long h()
/*  52:    */   {
/*  53: 68 */     return this.b.h();
/*  54:    */   }
/*  55:    */   
/*  56:    */   public NBTTagCompound i()
/*  57:    */   {
/*  58: 73 */     return this.b.i();
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String k()
/*  62:    */   {
/*  63: 83 */     return this.b.k();
/*  64:    */   }
/*  65:    */   
/*  66:    */   public int l()
/*  67:    */   {
/*  68: 88 */     return this.b.l();
/*  69:    */   }
/*  70:    */   
/*  71:    */   public long m()
/*  72:    */   {
/*  73: 93 */     return this.b.m();
/*  74:    */   }
/*  75:    */   
/*  76:    */   public boolean n()
/*  77:    */   {
/*  78: 98 */     return this.b.n();
/*  79:    */   }
/*  80:    */   
/*  81:    */   public int o()
/*  82:    */   {
/*  83:103 */     return this.b.o();
/*  84:    */   }
/*  85:    */   
/*  86:    */   public boolean p()
/*  87:    */   {
/*  88:108 */     return this.b.p();
/*  89:    */   }
/*  90:    */   
/*  91:    */   public int q()
/*  92:    */   {
/*  93:113 */     return this.b.q();
/*  94:    */   }
/*  95:    */   
/*  96:    */   public EnumGameMode r()
/*  97:    */   {
/*  98:118 */     return this.b.r();
/*  99:    */   }
/* 100:    */   
/* 101:    */   public void a(int paramInt) {}
/* 102:    */   
/* 103:    */   public void b(int paramInt) {}
/* 104:    */   
/* 105:    */   public void c(int paramInt) {}
/* 106:    */   
/* 107:    */   public void setRealTime(long paramLong) {}
/* 108:    */   
/* 109:    */   public void setTime(long paramLong) {}
/* 110:    */   
/* 111:    */   public void a(BlockPosition paramdt) {}
/* 112:    */   
/* 113:    */   public void a(String paramString) {}
/* 114:    */   
/* 115:    */   public void e(int paramInt) {}
/* 116:    */   
/* 117:    */   public void a(boolean paramBoolean) {}
/* 118:    */   
/* 119:    */   public void f(int paramInt) {}
/* 120:    */   
/* 121:    */   public void b(boolean paramBoolean) {}
/* 122:    */   
/* 123:    */   public void g(int paramInt) {}
/* 124:    */   
/* 125:    */   public boolean s()
/* 126:    */   {
/* 127:187 */     return this.b.s();
/* 128:    */   }
/* 129:    */   
/* 130:    */   public boolean isHardcore()
/* 131:    */   {
/* 132:195 */     return this.b.isHardcore();
/* 133:    */   }
/* 134:    */   
/* 135:    */   public WorldType u()
/* 136:    */   {
/* 137:200 */     return this.b.u();
/* 138:    */   }
/* 139:    */   
/* 140:    */   public void a(WorldType paramare) {}
/* 141:    */   
/* 142:    */   public boolean v()
/* 143:    */   {
/* 144:209 */     return this.b.v();
/* 145:    */   }
/* 146:    */   
/* 147:    */   public void c(boolean paramBoolean) {}
/* 148:    */   
/* 149:    */   public boolean w()
/* 150:    */   {
/* 151:218 */     return this.b.w();
/* 152:    */   }
/* 153:    */   
/* 154:    */   public void d(boolean paramBoolean) {}
/* 155:    */   
/* 156:    */   public GameRules getGameRules()
/* 157:    */   {
/* 158:227 */     return this.b.getGameRules();
/* 159:    */   }
/* 160:    */   
/* 161:    */   public EnumDifficulty y()
/* 162:    */   {
/* 163:232 */     return this.b.y();
/* 164:    */   }
/* 165:    */   
/* 166:    */   public void setDifficulty(EnumDifficulty paramvt) {}
/* 167:    */   
/* 168:    */   public boolean z()
/* 169:    */   {
/* 170:241 */     return this.b.z();
/* 171:    */   }
/* 172:    */   
/* 173:    */   public void e(boolean paramBoolean) {}
/* 174:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bql
 * JD-Core Version:    0.7.0.1
 */