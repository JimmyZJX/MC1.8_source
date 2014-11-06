package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public abstract class bzy
/*   4:    */   implements buv
/*   5:    */ {
/*   6: 13 */   private static final oa c = new oa("textures/gui/resource_packs.png");
/*   7:    */   protected final bsu a;
/*   8:    */   protected final bzx b;
/*   9:    */   
/*  10:    */   public bzy(bzx parambzx)
/*  11:    */   {
/*  12: 28 */     this.b = parambzx;
/*  13: 29 */     this.a = bsu.z();
/*  14:    */   }
/*  15:    */   
/*  16:    */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean)
/*  17:    */   {
/*  18: 34 */     c();
/*  19:    */     
/*  20: 36 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/*  21: 37 */     bub.a(paramInt2, paramInt3, 0.0F, 0.0F, 32, 32, 32.0F, 32.0F);
/*  22: 39 */     if (((this.a.t.z) || (paramBoolean)) && (d()))
/*  23:    */     {
/*  24: 40 */       this.a.N().a(c);
/*  25: 41 */       bub.a(paramInt2, paramInt3, paramInt2 + 32, paramInt3 + 32, -1601138544);
/*  26: 42 */       cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/*  27: 43 */       int i = paramInt6 - paramInt2;
/*  28: 44 */       int j = paramInt7 - paramInt3;
/*  29: 46 */       if (e())
/*  30:    */       {
/*  31: 47 */         if (i < 32) {
/*  32: 48 */           bub.a(paramInt2, paramInt3, 0.0F, 32.0F, 32, 32, 256.0F, 256.0F);
/*  33:    */         } else {
/*  34: 50 */           bub.a(paramInt2, paramInt3, 0.0F, 0.0F, 32, 32, 256.0F, 256.0F);
/*  35:    */         }
/*  36:    */       }
/*  37:    */       else
/*  38:    */       {
/*  39: 53 */         if (f()) {
/*  40: 54 */           if (i < 16) {
/*  41: 55 */             bub.a(paramInt2, paramInt3, 32.0F, 32.0F, 32, 32, 256.0F, 256.0F);
/*  42:    */           } else {
/*  43: 57 */             bub.a(paramInt2, paramInt3, 32.0F, 0.0F, 32, 32, 256.0F, 256.0F);
/*  44:    */           }
/*  45:    */         }
/*  46: 60 */         if (g()) {
/*  47: 61 */           if ((i < 32) && (i > 16) && (j < 16)) {
/*  48: 62 */             bub.a(paramInt2, paramInt3, 96.0F, 32.0F, 32, 32, 256.0F, 256.0F);
/*  49:    */           } else {
/*  50: 64 */             bub.a(paramInt2, paramInt3, 96.0F, 0.0F, 32, 32, 256.0F, 256.0F);
/*  51:    */           }
/*  52:    */         }
/*  53: 67 */         if (h()) {
/*  54: 68 */           if ((i < 32) && (i > 16) && (j > 16)) {
/*  55: 69 */             bub.a(paramInt2, paramInt3, 64.0F, 32.0F, 32, 32, 256.0F, 256.0F);
/*  56:    */           } else {
/*  57: 71 */             bub.a(paramInt2, paramInt3, 64.0F, 0.0F, 32, 32, 256.0F, 256.0F);
/*  58:    */           }
/*  59:    */         }
/*  60:    */       }
/*  61:    */     }
/*  62: 77 */     String str = b();
/*  63: 78 */     int j = this.a.k.a(str);
/*  64: 79 */     if (j > 157) {
/*  65: 80 */       str = this.a.k.a(str, 157 - this.a.k.a("...")) + "...";
/*  66:    */     }
/*  67: 82 */     this.a.k.a(str, paramInt2 + 32 + 2, paramInt3 + 1, 16777215);
/*  68: 83 */     List localList = this.a.k.c(a(), 157);
/*  69: 85 */     for (int k = 0; (k < 2) && (k < localList.size()); k++) {
/*  70: 86 */       this.a.k.a((String)localList.get(k), paramInt2 + 32 + 2, paramInt3 + 12 + 10 * k, 8421504);
/*  71:    */     }
/*  72:    */   }
/*  73:    */   
/*  74:    */   protected abstract String a();
/*  75:    */   
/*  76:    */   protected abstract String b();
/*  77:    */   
/*  78:    */   protected abstract void c();
/*  79:    */   
/*  80:    */   protected boolean d()
/*  81:    */   {
/*  82: 97 */     return true;
/*  83:    */   }
/*  84:    */   
/*  85:    */   protected boolean e()
/*  86:    */   {
/*  87:101 */     return !this.b.a(this);
/*  88:    */   }
/*  89:    */   
/*  90:    */   protected boolean f()
/*  91:    */   {
/*  92:105 */     return this.b.a(this);
/*  93:    */   }
/*  94:    */   
/*  95:    */   protected boolean g()
/*  96:    */   {
/*  97:109 */     List localList = this.b.b(this);
/*  98:110 */     int i = localList.indexOf(this);
/*  99:111 */     return (i > 0) && (((bzy)localList.get(i - 1)).d());
/* 100:    */   }
/* 101:    */   
/* 102:    */   protected boolean h()
/* 103:    */   {
/* 104:115 */     List localList = this.b.b(this);
/* 105:116 */     int i = localList.indexOf(this);
/* 106:117 */     return (i >= 0) && (i < localList.size() - 1) && (((bzy)localList.get(i + 1)).d());
/* 107:    */   }
/* 108:    */   
/* 109:    */   public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/* 110:    */   {
/* 111:122 */     if ((d()) && (paramInt5 <= 32))
/* 112:    */     {
/* 113:123 */       if (e())
/* 114:    */       {
/* 115:125 */         this.b.b(this).remove(this);
/* 116:126 */         this.b.f().add(0, this);
/* 117:127 */         this.b.g();
/* 118:128 */         return true;
/* 119:    */       }
/* 120:130 */       if ((paramInt5 < 16) && (f()))
/* 121:    */       {
/* 122:132 */         this.b.b(this).remove(this);
/* 123:133 */         this.b.a().add(0, this);
/* 124:134 */         this.b.g();
/* 125:135 */         return true;
/* 126:    */       }
/* 127:    */       List localList;
/* 128:    */       int i;
/* 129:137 */       if ((paramInt5 > 16) && (paramInt6 < 16) && (g()))
/* 130:    */       {
/* 131:139 */         localList = this.b.b(this);
/* 132:140 */         i = localList.indexOf(this);
/* 133:141 */         localList.remove(this);
/* 134:142 */         localList.add(i - 1, this);
/* 135:143 */         this.b.g();
/* 136:144 */         return true;
/* 137:    */       }
/* 138:146 */       if ((paramInt5 > 16) && (paramInt6 > 16) && (h()))
/* 139:    */       {
/* 140:148 */         localList = this.b.b(this);
/* 141:149 */         i = localList.indexOf(this);
/* 142:150 */         localList.remove(this);
/* 143:151 */         localList.add(i + 1, this);
/* 144:152 */         this.b.g();
/* 145:153 */         return true;
/* 146:    */       }
/* 147:    */     }
/* 148:158 */     return false;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public void a(int paramInt1, int paramInt2, int paramInt3) {}
/* 152:    */   
/* 153:    */   public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {}
/* 154:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bzy
 * JD-Core Version:    0.7.0.1
 */