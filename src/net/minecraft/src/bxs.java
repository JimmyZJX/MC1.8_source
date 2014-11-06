package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.io.BufferedReader;
/*   3:    */ import java.io.InputStreamReader;
/*   4:    */ import java.util.List;
/*   5:    */ import java.util.Random;
/*   6:    */ import org.apache.commons.io.Charsets;
/*   7:    */ import org.apache.logging.log4j.LogManager;
/*   8:    */ import org.apache.logging.log4j.Logger;
/*   9:    */ 
/*  10:    */ public class bxs
/*  11:    */   extends bxf
/*  12:    */ {
/*  13: 25 */   private static final Logger a = LogManager.getLogger();
/*  14: 26 */   private static final oa f = new oa("textures/gui/title/minecraft.png");
/*  15: 27 */   private static final oa g = new oa("textures/misc/vignette.png");
/*  16:    */   private int h;
/*  17:    */   private List<String> i;
/*  18:    */   private int r;
/*  19: 32 */   private float s = 0.5F;
/*  20:    */   
/*  21:    */   public void e()
/*  22:    */   {
/*  23: 36 */     this.h += 1;
/*  24: 37 */     float f1 = (this.r + this.m + this.m + 24) / this.s;
/*  25: 38 */     if (this.h > f1) {
/*  26: 39 */       a();
/*  27:    */     }
/*  28:    */   }
/*  29:    */   
/*  30:    */   protected void a(char paramChar, int paramInt)
/*  31:    */   {
/*  32: 45 */     if (paramInt == 1) {
/*  33: 46 */       a();
/*  34:    */     }
/*  35:    */   }
/*  36:    */   
/*  37:    */   private void a()
/*  38:    */   {
/*  39: 51 */     this.j.h.a.a(new lv(lw.PERFORM_RESPAWN));
/*  40: 52 */     this.j.a((bxf)null);
/*  41:    */   }
/*  42:    */   
/*  43:    */   public boolean d()
/*  44:    */   {
/*  45: 57 */     return true;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public void b()
/*  49:    */   {
/*  50: 62 */     if (this.i != null) {
/*  51: 63 */       return;
/*  52:    */     }
/*  53: 66 */     this.i = Lists.newArrayList();
/*  54:    */     try
/*  55:    */     {
/*  56: 68 */       String str1 = "";
/*  57: 69 */       String str2 = "" + net.minecraft.src.a.p + net.minecraft.src.a.q + net.minecraft.src.a.k + net.minecraft.src.a.l;
/*  58: 70 */       int j = 274;
/*  59: 71 */       BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(this.j.O().a(new oa("texts/end.txt")).b(), Charsets.UTF_8));
/*  60: 72 */       Random localRandom = new Random(8124371L);
/*  61: 73 */       while ((str1 = localBufferedReader.readLine()) != null)
/*  62:    */       {
/*  63: 74 */         str1 = str1.replaceAll("PLAYERNAME", this.j.K().c());
/*  64: 76 */         while (str1.contains(str2))
/*  65:    */         {
/*  66: 77 */           int k = str1.indexOf(str2);
/*  67: 78 */           String str3 = str1.substring(0, k);
/*  68: 79 */           String str4 = str1.substring(k + str2.length());
/*  69: 80 */           str1 = str3 + net.minecraft.src.a.p + net.minecraft.src.a.q + "XXXXXXXX".substring(0, localRandom.nextInt(4) + 3) + str4;
/*  70:    */         }
/*  71: 82 */         this.i.addAll(this.j.k.c(str1, j));
/*  72: 83 */         this.i.add("");
/*  73:    */       }
/*  74: 86 */       for (int k = 0; k < 8; k++) {
/*  75: 87 */         this.i.add("");
/*  76:    */       }
/*  77: 90 */       localBufferedReader = new BufferedReader(new InputStreamReader(this.j.O().a(new oa("texts/credits.txt")).b(), Charsets.UTF_8));
/*  78: 91 */       while ((str1 = localBufferedReader.readLine()) != null)
/*  79:    */       {
/*  80: 92 */         str1 = str1.replaceAll("PLAYERNAME", this.j.K().c());
/*  81: 93 */         str1 = str1.replaceAll("\t", "    ");
/*  82:    */         
/*  83: 95 */         this.i.addAll(this.j.k.c(str1, j));
/*  84: 96 */         this.i.add("");
/*  85:    */       }
/*  86: 99 */       this.r = (this.i.size() * 12);
/*  87:    */     }
/*  88:    */     catch (Exception localException)
/*  89:    */     {
/*  90:101 */       a.error("Couldn't load credits", localException);
/*  91:    */     }
/*  92:    */   }
/*  93:    */   
/*  94:    */   private void b(int paramInt1, int paramInt2, float paramFloat)
/*  95:    */   {
/*  96:106 */     ckx localckx = ckx.getInstance();
/*  97:107 */     VertexBuffer localciv = localckx.getBuffer();
/*  98:    */     
/*  99:109 */     this.j.N().a(bub.b);
/* 100:110 */     localciv.begin();
/* 101:111 */     localciv.setColor(1.0F, 1.0F, 1.0F, 1.0F);
/* 102:112 */     int j = this.l;
/* 103:113 */     float f1 = 0.0F - (this.h + paramFloat) * 0.5F * this.s;
/* 104:114 */     float f2 = this.m - (this.h + paramFloat) * 0.5F * this.s;
/* 105:115 */     float f3 = 0.015625F;
/* 106:    */     
/* 107:117 */     float f4 = (this.h + paramFloat - 0.0F) * 0.02F;
/* 108:    */     
/* 109:119 */     float f5 = (this.r + this.m + this.m + 24) / this.s;
/* 110:120 */     float f6 = (f5 - 20.0F - (this.h + paramFloat)) * 0.005F;
/* 111:121 */     if (f6 < f4) {
/* 112:122 */       f4 = f6;
/* 113:    */     }
/* 114:124 */     if (f4 > 1.0F) {
/* 115:125 */       f4 = 1.0F;
/* 116:    */     }
/* 117:127 */     f4 *= f4;
/* 118:128 */     f4 = f4 * 96.0F / 255.0F;
/* 119:129 */     localciv.setColor(f4, f4, f4);
/* 120:130 */     localciv.addVertexWithUV(0.0D, this.m, this.e, 0.0D, f1 * f3);
/* 121:131 */     localciv.addVertexWithUV(j, this.m, this.e, j * f3, f1 * f3);
/* 122:132 */     localciv.addVertexWithUV(j, 0.0D, this.e, j * f3, f2 * f3);
/* 123:133 */     localciv.addVertexWithUV(0.0D, 0.0D, this.e, 0.0D, f2 * f3);
/* 124:134 */     localckx.draw();
/* 125:    */   }
/* 126:    */   
/* 127:    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/* 128:    */   {
/* 129:139 */     b(paramInt1, paramInt2, paramFloat);
/* 130:140 */     ckx localckx = ckx.getInstance();
/* 131:141 */     VertexBuffer localciv = localckx.getBuffer();
/* 132:    */     
/* 133:143 */     int j = 274;
/* 134:144 */     int k = this.l / 2 - j / 2;
/* 135:145 */     int m = this.m + 50;
/* 136:    */     
/* 137:147 */     float f1 = -(this.h + paramFloat) * this.s;
/* 138:148 */     cjm.glPushMatrix();
/* 139:149 */     cjm.glTranslatef(0.0F, f1, 0.0F);
/* 140:150 */     this.j.N().a(f);
/* 141:151 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 142:152 */     b(k, m, 0, 0, 155, 44);
/* 143:153 */     b(k + 155, m, 0, 45, 155, 44);
/* 144:154 */     localciv.setColor(16777215);
/* 145:155 */     int n = m + 200;
/* 146:157 */     for (int i1 = 0; i1 < this.i.size(); i1++)
/* 147:    */     {
/* 148:158 */       if (i1 == this.i.size() - 1)
/* 149:    */       {
/* 150:159 */         float f2 = n + f1 - (this.m / 2 - 6);
/* 151:160 */         if (f2 < 0.0F) {
/* 152:161 */           cjm.glTranslatef(0.0F, -f2, 0.0F);
/* 153:    */         }
/* 154:    */       }
/* 155:164 */       if ((n + f1 + 12.0F + 8.0F > 0.0F) && (n + f1 < this.m))
/* 156:    */       {
/* 157:165 */         String str = (String)this.i.get(i1);
/* 158:166 */         if (str.startsWith("[C]"))
/* 159:    */         {
/* 160:167 */           this.q.a(str.substring(3), k + (j - this.q.a(str.substring(3))) / 2, n, 16777215);
/* 161:    */         }
/* 162:    */         else
/* 163:    */         {
/* 164:169 */           this.q.b.setSeed(i1 * 4238972211L + this.h / 4);
/* 165:170 */           this.q.a(str, k, n, 16777215);
/* 166:    */         }
/* 167:    */       }
/* 168:173 */       n += 12;
/* 169:    */     }
/* 170:176 */     cjm.glPopMatrix();
/* 171:    */     
/* 172:178 */     this.j.N().a(g);
/* 173:179 */     cjm.enableBlend();
/* 174:180 */     cjm.glBlendFunc(0, 769);
/* 175:181 */     localciv.begin();
/* 176:182 */     localciv.setColor(1.0F, 1.0F, 1.0F, 1.0F);
/* 177:183 */     int i1 = this.l;
/* 178:184 */     int i2 = this.m;
/* 179:185 */     localciv.addVertexWithUV(0.0D, i2, this.e, 0.0D, 1.0D);
/* 180:186 */     localciv.addVertexWithUV(i1, i2, this.e, 1.0D, 1.0D);
/* 181:187 */     localciv.addVertexWithUV(i1, 0.0D, this.e, 1.0D, 0.0D);
/* 182:188 */     localciv.addVertexWithUV(0.0D, 0.0D, this.e, 0.0D, 0.0D);
/* 183:189 */     localckx.draw();
/* 184:190 */     cjm.disableBlend();
/* 185:    */     
/* 186:192 */     super.a(paramInt1, paramInt2, paramFloat);
/* 187:    */   }
/* 188:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bxs
 * JD-Core Version:    0.7.0.1
 */