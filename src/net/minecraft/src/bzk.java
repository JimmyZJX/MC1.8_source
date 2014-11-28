package net.minecraft.src;
/*   1:    */ import io.netty.buffer.Unpooled;
/*   2:    */ import java.util.List;
/*   3:    */ import org.apache.logging.log4j.LogManager;
/*   4:    */ import org.apache.logging.log4j.Logger;
/*   5:    */ 
/*   6:    */ public class bzk
/*   7:    */   extends byl
/*   8:    */ {
/*   9: 24 */   private static final Logger u = LogManager.getLogger();
/*  10: 25 */   private static final oa v = new oa("textures/gui/container/villager.png");
/*  11:    */   private aqb w;
/*  12:    */   private bzl x;
/*  13:    */   private bzl y;
/*  14:    */   private int z;
/*  15:    */   private ho A;
/*  16:    */   
/*  17:    */   public bzk(Inventory paramahb, aqb paramaqb, World paramaqu)
/*  18:    */   {
/*  19: 33 */     super(new ajf(paramahb, paramaqb, paramaqu));
/*  20: 34 */     this.w = paramaqb;
/*  21: 35 */     this.A = paramaqb.e_();
/*  22:    */   }
/*  23:    */   
/*  24:    */   public void b()
/*  25:    */   {
/*  26: 40 */     super.b();
/*  27:    */     
/*  28: 42 */     int i = (this.l - this.f) / 2;
/*  29: 43 */     int j = (this.m - this.g) / 2;
/*  30:    */     
/*  31: 45 */     this.n.add(this.x = new bzl(1, i + 120 + 27, j + 24 - 1, true));
/*  32: 46 */     this.n.add(this.y = new bzl(2, i + 36 - 19, j + 24 - 1, false));
/*  33:    */     
/*  34: 48 */     this.x.l = false;
/*  35: 49 */     this.y.l = false;
/*  36:    */   }
/*  37:    */   
/*  38:    */   protected void b(int paramInt1, int paramInt2)
/*  39:    */   {
/*  40: 54 */     String str = this.A.c();
/*  41: 55 */     this.q.a(str, this.f / 2 - this.q.a(str) / 2, 6, 4210752);
/*  42: 56 */     this.q.a(cwc.a("container.inventory", new Object[0]), 8, this.g - 96 + 2, 4210752);
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void e()
/*  46:    */   {
/*  47: 61 */     super.e();
/*  48:    */     
/*  49: 63 */     TradeOfferList localaqd = this.w.b_(this.j.h);
/*  50: 64 */     if (localaqd != null)
/*  51:    */     {
/*  52: 65 */       this.x.l = (this.z < localaqd.size() - 1);
/*  53: 66 */       this.y.l = (this.z > 0);
/*  54:    */     }
/*  55:    */   }
/*  56:    */   
/*  57:    */   protected void a(bug parambug)
/*  58:    */   {
/*  59: 72 */     int i = 0;
/*  60:    */     Object localObject;
/*  61: 73 */     if (parambug == this.x)
/*  62:    */     {
/*  63: 74 */       this.z += 1;
/*  64: 75 */       localObject = this.w.b_(this.j.h);
/*  65: 76 */       if ((localObject != null) && (this.z >= ((TradeOfferList)localObject).size())) {
/*  66: 77 */         this.z = (((TradeOfferList)localObject).size() - 1);
/*  67:    */       }
/*  68: 79 */       i = 1;
/*  69:    */     }
/*  70: 80 */     else if (parambug == this.y)
/*  71:    */     {
/*  72: 81 */       this.z -= 1;
/*  73: 82 */       if (this.z < 0) {
/*  74: 83 */         this.z = 0;
/*  75:    */       }
/*  76: 85 */       i = 1;
/*  77:    */     }
/*  78: 88 */     if (i != 0)
/*  79:    */     {
/*  80: 89 */       ((ajf)this.h).d(this.z);
/*  81:    */       
/*  82: 91 */       localObject = new ByteBufWrapper(Unpooled.buffer());
/*  83: 92 */       ((ByteBufWrapper)localObject).writeInt(this.z);
/*  84: 93 */       this.j.t().a(new mc("MC|TrSel", (ByteBufWrapper)localObject));
/*  85:    */     }
/*  86:    */   }
/*  87:    */   
/*  88:    */   protected void a(float paramFloat, int paramInt1, int paramInt2)
/*  89:    */   {
/*  90: 99 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/*  91:100 */     this.j.N().a(v);
/*  92:101 */     int i = (this.l - this.f) / 2;
/*  93:102 */     int j = (this.m - this.g) / 2;
/*  94:103 */     b(i, j, 0, 0, this.f, this.g);
/*  95:    */     
/*  96:105 */     TradeOfferList localaqd = this.w.b_(this.j.h);
/*  97:106 */     if ((localaqd != null) && (!localaqd.isEmpty()))
/*  98:    */     {
/*  99:107 */       int k = this.z;
/* 100:108 */       if ((k < 0) || (k >= localaqd.size())) {
/* 101:109 */         return;
/* 102:    */       }
/* 103:111 */       TradeOffer localaqc = (TradeOffer)localaqd.get(k);
/* 104:113 */       if (localaqc.isBlocked())
/* 105:    */       {
/* 106:114 */         this.j.N().a(v);
/* 107:115 */         cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 108:116 */         cjm.disableLighting();
/* 109:117 */         b(this.i + 83, this.r + 21, 212, 0, 28, 21);
/* 110:118 */         b(this.i + 83, this.r + 51, 212, 0, 28, 21);
/* 111:    */       }
/* 112:    */     }
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/* 116:    */   {
/* 117:125 */     super.a(paramInt1, paramInt2, paramFloat);
/* 118:    */     
/* 119:127 */     TradeOfferList localaqd = this.w.b_(this.j.h);
/* 120:128 */     if ((localaqd != null) && (!localaqd.isEmpty()))
/* 121:    */     {
/* 122:129 */       int i = (this.l - this.f) / 2;
/* 123:130 */       int j = (this.m - this.g) / 2;
/* 124:    */       
/* 125:132 */       int k = this.z;
/* 126:133 */       TradeOffer localaqc = (TradeOffer)localaqd.get(k);
/* 127:    */       
/* 128:135 */       ItemStack localamj1 = localaqc.getItemBought();
/* 129:136 */       ItemStack localamj2 = localaqc.getItemBoughtB();
/* 130:137 */       ItemStack localamj3 = localaqc.getItemSold();
/* 131:    */       
/* 132:139 */       cjm.glPushMatrix();
/* 133:    */       
/* 134:141 */       bss.c();
/* 135:142 */       cjm.disableLighting();
/* 136:143 */       cjm.B();
/* 137:144 */       cjm.g();
/* 138:145 */       cjm.enableLighting();
/* 139:    */       
/* 140:147 */       this.k.a = 100.0F;
/* 141:148 */       this.k.b(localamj1, i + 36, j + 24);
/* 142:149 */       this.k.a(this.q, localamj1, i + 36, j + 24);
/* 143:151 */       if (localamj2 != null)
/* 144:    */       {
/* 145:152 */         this.k.b(localamj2, i + 62, j + 24);
/* 146:153 */         this.k.a(this.q, localamj2, i + 62, j + 24);
/* 147:    */       }
/* 148:156 */       this.k.b(localamj3, i + 120, j + 24);
/* 149:157 */       this.k.a(this.q, localamj3, i + 120, j + 24);
/* 150:158 */       this.k.a = 0.0F;
/* 151:    */       
/* 152:160 */       cjm.disableLighting();
/* 153:162 */       if ((c(36, 24, 16, 16, paramInt1, paramInt2)) && (localamj1 != null)) {
/* 154:163 */         a(localamj1, paramInt1, paramInt2);
/* 155:164 */       } else if ((localamj2 != null) && (c(62, 24, 16, 16, paramInt1, paramInt2)) && (localamj2 != null)) {
/* 156:165 */         a(localamj2, paramInt1, paramInt2);
/* 157:166 */       } else if ((localamj3 != null) && (c(120, 24, 16, 16, paramInt1, paramInt2)) && (localamj3 != null)) {
/* 158:167 */         a(localamj3, paramInt1, paramInt2);
/* 159:168 */       } else if ((localaqc.isBlocked()) && ((c(83, 21, 28, 21, paramInt1, paramInt2)) || (c(83, 51, 28, 21, paramInt1, paramInt2)))) {
/* 160:169 */         a(cwc.a("merchant.deprecated", new Object[0]), paramInt1, paramInt2);
/* 161:    */       }
/* 162:172 */       cjm.glPopMatrix();
/* 163:    */       
/* 164:174 */       cjm.enableLighting();
/* 165:175 */       cjm.j();
/* 166:176 */       bss.b();
/* 167:    */     }
/* 168:    */   }
/* 169:    */   
/* 170:    */   public aqb a()
/* 171:    */   {
/* 172:181 */     return this.w;
/* 173:    */   }
				static oa f() {return v;}
/* 174:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bzk
 * JD-Core Version:    0.7.0.1
 */