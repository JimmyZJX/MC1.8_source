package net.minecraft.src;
/*   1:    */ import com.google.common.base.Objects;
/*   2:    */ import com.mojang.authlib.GameProfile;
/*   3:    */ 
/*   4:    */ public class ces
/*   5:    */ {
/*   6:    */   private final GameProfile a;
/*   7:    */   private EnumGameMode b;
/*   8:    */   private int c;
/*   9: 22 */   private boolean d = false;
/*  10:    */   private oa e;
/*  11:    */   private oa f;
/*  12:    */   private String g;
/*  13:    */   private ho h;
/*  14: 27 */   private int i = 0;
/*  15: 28 */   private int j = 0;
/*  16: 29 */   private long k = 0L;
/*  17: 30 */   private long l = 0L;
/*  18: 31 */   private long m = 0L;
/*  19:    */   
/*  20:    */   public ces(GameProfile paramGameProfile)
/*  21:    */   {
/*  22: 34 */     this.a = paramGameProfile;
/*  23:    */   }
/*  24:    */   
/*  25:    */   public ces(kk paramkk)
/*  26:    */   {
/*  27: 38 */     this.a = paramkk.a();
/*  28: 39 */     this.b = paramkk.c();
/*  29: 40 */     this.c = paramkk.b();
/*  30:    */   }
/*  31:    */   
/*  32:    */   public GameProfile a()
/*  33:    */   {
/*  34: 44 */     return this.a;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public EnumGameMode b()
/*  38:    */   {
/*  39: 48 */     return this.b;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public int c()
/*  43:    */   {
/*  44: 52 */     return this.c;
/*  45:    */   }
/*  46:    */   
/*  47:    */   protected void a(EnumGameMode paramarc)
/*  48:    */   {
/*  49: 56 */     this.b = paramarc;
/*  50:    */   }
/*  51:    */   
/*  52:    */   protected void a(int paramInt)
/*  53:    */   {
/*  54: 60 */     this.c = paramInt;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public boolean e()
/*  58:    */   {
/*  59: 68 */     return this.e != null;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public String f()
/*  63:    */   {
/*  64: 72 */     if (this.g == null) {
/*  65: 73 */       return cva.b(this.a.getId());
/*  66:    */     }
/*  67: 75 */     return this.g;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public oa g()
/*  71:    */   {
/*  72: 79 */     if (this.e == null) {
/*  73: 80 */       j();
/*  74:    */     }
/*  75: 83 */     return (oa)Objects.firstNonNull(this.e, cva.a(this.a.getId()));
/*  76:    */   }
/*  77:    */   
/*  78:    */   public oa h()
/*  79:    */   {
/*  80: 88 */     if (this.f == null) {
/*  81: 89 */       j();
/*  82:    */     }
/*  83: 92 */     return this.f;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public brz i()
/*  87:    */   {
/*  88: 97 */     return bsu.z().f.Z().h(a().getName());
/*  89:    */   }
/*  90:    */   
/*  91:    */   protected void j()
/*  92:    */   {
/*  93:101 */     synchronized (this)
/*  94:    */     {
/*  95:102 */       if (!this.d)
/*  96:    */       {
/*  97:103 */         this.d = true;
/*  98:104 */         bsu.z().Z().a(this.a, new cet(this), true);
/*  99:    */       }
/* 100:    */     }
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void a(ho paramho)
/* 104:    */   {
/* 105:130 */     this.h = paramho;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public ho k()
/* 109:    */   {
/* 110:135 */     return this.h;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public int l()
/* 114:    */   {
/* 115:139 */     return this.i;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public void b(int paramInt)
/* 119:    */   {
/* 120:143 */     this.i = paramInt;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public int m()
/* 124:    */   {
/* 125:147 */     return this.j;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public void c(int paramInt)
/* 129:    */   {
/* 130:151 */     this.j = paramInt;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public long n()
/* 134:    */   {
/* 135:155 */     return this.k;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public void a(long paramLong)
/* 139:    */   {
/* 140:159 */     this.k = paramLong;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public long o()
/* 144:    */   {
/* 145:163 */     return this.l;
/* 146:    */   }
/* 147:    */   
/* 148:    */   public void b(long paramLong)
/* 149:    */   {
/* 150:167 */     this.l = paramLong;
/* 151:    */   }
/* 152:    */   
/* 153:    */   public long p()
/* 154:    */   {
/* 155:171 */     return this.m;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public void c(long paramLong)
/* 159:    */   {
/* 160:175 */     this.m = paramLong;
/* 161:    */   }
				static oa a(ces arg0, oa arg1) {return arg0.e=arg1;}
				static String a(ces arg0, String arg1) {return arg0.g=arg1;}
				static String a(ces arg0) {return arg0.g;}
				static oa b(ces arg0, oa arg1) {return arg0.f=arg1;}
/* 162:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ces
 * JD-Core Version:    0.7.0.1
 */