package net.minecraft.src;
/*   1:    */ import io.netty.buffer.Unpooled;
/*   2:    */ import java.util.List;
/*   3:    */ import org.lwjgl.input.Keyboard;
/*   4:    */ 
/*   5:    */ public class bym
/*   6:    */   extends byl
/*   7:    */   implements ail
/*   8:    */ {
/*   9: 26 */   private static final oa u = new oa("textures/gui/container/anvil.png");
/*  10:    */   private aid v;
/*  11:    */   private bul w;
/*  12:    */   private Inventory x;
/*  13:    */   
/*  14:    */   public bym(Inventory paramahb, World paramaqu)
/*  15:    */   {
/*  16: 33 */     super(new aid(paramahb, paramaqu, bsu.z().h));
/*  17: 34 */     this.x = paramahb;
/*  18: 35 */     this.v = ((aid)this.h);
/*  19:    */   }
/*  20:    */   
/*  21:    */   public void b()
/*  22:    */   {
/*  23: 40 */     super.b();
/*  24: 41 */     Keyboard.enableRepeatEvents(true);
/*  25:    */     
/*  26: 43 */     int i = (this.l - this.f) / 2;
/*  27: 44 */     int j = (this.m - this.g) / 2;
/*  28:    */     
/*  29: 46 */     this.w = new bul(0, this.q, i + 62, j + 24, 103, 12);
/*  30: 47 */     this.w.g(-1);
/*  31: 48 */     this.w.h(-1);
/*  32: 49 */     this.w.a(false);
/*  33: 50 */     this.w.f(40);
/*  34:    */     
/*  35: 52 */     this.h.b(this);
/*  36: 53 */     this.h.a(this);
/*  37:    */   }
/*  38:    */   
/*  39:    */   public void m()
/*  40:    */   {
/*  41: 58 */     super.m();
/*  42:    */     
/*  43: 60 */     Keyboard.enableRepeatEvents(false);
/*  44: 61 */     this.h.b(this);
/*  45:    */   }
/*  46:    */   
/*  47:    */   protected void b(int paramInt1, int paramInt2)
/*  48:    */   {
/*  49: 66 */     cjm.disableLighting();
/*  50: 67 */     cjm.disableBlend();
/*  51: 68 */     this.q.a(cwc.a("container.repair", new Object[0]), 60, 6, 4210752);
/*  52: 70 */     if (this.v.a > 0)
/*  53:    */     {
/*  54: 71 */       int i = 8453920;
/*  55: 72 */       int j = 1;
/*  56: 73 */       String str = cwc.a("container.repair.cost", new Object[] { Integer.valueOf(this.v.a) });
/*  57: 74 */       if ((this.v.a >= 40) && (!this.j.h.abilities.instabuild))
/*  58:    */       {
/*  59: 75 */         str = cwc.a("container.repair.expensive", new Object[0]);
/*  60: 76 */         i = 16736352;
/*  61:    */       }
/*  62: 77 */       else if (!this.v.a(2).e())
/*  63:    */       {
/*  64: 78 */         j = 0;
/*  65:    */       }
/*  66: 79 */       else if (!this.v.a(2).a(this.x.d))
/*  67:    */       {
/*  68: 80 */         i = 16736352;
/*  69:    */       }
/*  70: 83 */       if (j != 0)
/*  71:    */       {
/*  72: 84 */         int k = 0xFF000000 | (i & 0xFCFCFC) >> 2 | i & 0xFF000000;
/*  73: 85 */         int m = this.f - 8 - this.q.a(str);
/*  74: 86 */         int n = 67;
/*  75: 87 */         if (this.q.a())
/*  76:    */         {
/*  77: 88 */           a(m - 3, n - 2, this.f - 7, n + 10, -16777216);
/*  78: 89 */           a(m - 2, n - 1, this.f - 8, n + 9, -12895429);
/*  79:    */         }
/*  80:    */         else
/*  81:    */         {
/*  82: 91 */           this.q.a(str, m, n + 1, k);
/*  83: 92 */           this.q.a(str, m + 1, n, k);
/*  84: 93 */           this.q.a(str, m + 1, n + 1, k);
/*  85:    */         }
/*  86: 95 */         this.q.a(str, m, n, i);
/*  87:    */       }
/*  88:    */     }
/*  89: 98 */     cjm.enableLighting();
/*  90:    */   }
/*  91:    */   
/*  92:    */   protected void a(char paramChar, int paramInt)
/*  93:    */   {
/*  94:103 */     if (this.w.a(paramChar, paramInt)) {
/*  95:104 */       a();
/*  96:    */     } else {
/*  97:106 */       super.a(paramChar, paramInt);
/*  98:    */     }
/*  99:    */   }
/* 100:    */   
/* 101:    */   private void a()
/* 102:    */   {
/* 103:111 */     String str = this.w.b();
/* 104:    */     
/* 105:113 */     ajk localajk = this.v.a(0);
/* 106:114 */     if ((localajk != null) && (localajk.e()) && 
/* 107:115 */       (!localajk.d().s()) && (str.equals(localajk.d().q()))) {
/* 108:116 */       str = "";
/* 109:    */     }
/* 110:120 */     this.v.a(str);
/* 111:121 */     this.j.h.a.a(new mc("MC|ItemName", new ByteBufWrapper(Unpooled.buffer()).a(str)));
/* 112:    */   }
/* 113:    */   
/* 114:    */   protected void a(int paramInt1, int paramInt2, int paramInt3)
/* 115:    */   {
/* 116:126 */     super.a(paramInt1, paramInt2, paramInt3);
/* 117:127 */     this.w.a(paramInt1, paramInt2, paramInt3);
/* 118:    */   }
/* 119:    */   
/* 120:    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/* 121:    */   {
/* 122:132 */     super.a(paramInt1, paramInt2, paramFloat);
/* 123:    */     
/* 124:134 */     cjm.disableLighting();
/* 125:135 */     cjm.disableBlend();
/* 126:136 */     this.w.g();
/* 127:    */   }
/* 128:    */   
/* 129:    */   protected void a(float paramFloat, int paramInt1, int paramInt2)
/* 130:    */   {
/* 131:141 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 132:142 */     this.j.N().a(u);
/* 133:143 */     int i = (this.l - this.f) / 2;
/* 134:144 */     int j = (this.m - this.g) / 2;
/* 135:145 */     b(i, j, 0, 0, this.f, this.g);
/* 136:    */     
/* 137:147 */     b(i + 59, j + 20, 0, this.g + (this.v.a(0).e() ? 0 : 16), 110, 16);
/* 138:149 */     if (((this.v.a(0).e()) || (this.v.a(1).e())) && (!this.v.a(2).e())) {
/* 139:150 */       b(i + 99, j + 45, this.f, 0, 28, 21);
/* 140:    */     }
/* 141:    */   }
/* 142:    */   
/* 143:    */   public void a(aib paramaib, List paramList)
/* 144:    */   {
/* 145:156 */     a(paramaib, 0, paramaib.a(0).d());
/* 146:    */   }
/* 147:    */   
/* 148:    */   public void a(aib paramaib, int paramInt, ItemStack paramamj)
/* 149:    */   {
/* 150:161 */     if (paramInt == 0)
/* 151:    */     {
/* 152:162 */       this.w.a(paramamj == null ? "" : paramamj.q());
/* 153:163 */       this.w.c(paramamj != null);
/* 154:164 */       if (paramamj != null) {
/* 155:165 */         a();
/* 156:    */       }
/* 157:    */     }
/* 158:    */   }
/* 159:    */   
/* 160:    */   public void a(aib paramaib, int paramInt1, int paramInt2) {}
/* 161:    */   
/* 162:    */   public void a(aib paramaib, vq paramvq) {}
/* 163:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bym
 * JD-Core Version:    0.7.0.1
 */