package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.ArrayList;
/*   3:    */ import java.util.Collections;
/*   4:    */ import java.util.List;
/*   5:    */ import net.minecraft.realms.RealmsButton;
/*   6:    */ import net.minecraft.realms.RealmsScreen;
/*   7:    */ 
/*   8:    */ public class bvt
/*   9:    */   extends bxf
/*  10:    */ {
/*  11:    */   private RealmsScreen a;
/*  12:    */   
/*  13:    */   public bvt(RealmsScreen paramRealmsScreen)
/*  14:    */   {
/*  15: 26 */     this.a = paramRealmsScreen;
/*  16: 27 */     this.n = Collections.synchronizedList(Lists.<bug>newArrayList());
/*  17:    */   }
/*  18:    */   
/*  19:    */   public RealmsScreen a()
/*  20:    */   {
/*  21: 31 */     return this.a;
/*  22:    */   }
/*  23:    */   
/*  24:    */   public void b()
/*  25:    */   {
/*  26: 40 */     this.a.init();
/*  27: 41 */     super.b();
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void a(String paramString, int paramInt1, int paramInt2, int paramInt3)
/*  31:    */   {
/*  32: 45 */     super.a(this.q, paramString, paramInt1, paramInt2, paramInt3);
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void b(String paramString, int paramInt1, int paramInt2, int paramInt3)
/*  36:    */   {
/*  37: 49 */     super.c(this.q, paramString, paramInt1, paramInt2, paramInt3);
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*  41:    */   {
/*  42: 54 */     this.a.blit(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*  43: 55 */     super.b(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*  47:    */   {
/*  48: 68 */     super.a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void c()
/*  52:    */   {
/*  53: 73 */     super.c();
/*  54:    */   }
/*  55:    */   
/*  56:    */   public boolean d()
/*  57:    */   {
/*  58: 78 */     return super.d();
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void b_(int paramInt)
/*  62:    */   {
/*  63: 83 */     super.b_(paramInt);
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*  67:    */   {
/*  68: 88 */     this.a.render(paramInt1, paramInt2, paramFloat);
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void a(ItemStack paramamj, int paramInt1, int paramInt2)
/*  72:    */   {
/*  73: 93 */     super.a(paramamj, paramInt1, paramInt2);
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void a(String paramString, int paramInt1, int paramInt2)
/*  77:    */   {
/*  78: 98 */     super.a(paramString, paramInt1, paramInt2);
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void a(List paramList, int paramInt1, int paramInt2)
/*  82:    */   {
/*  83:103 */     super.a(paramList, paramInt1, paramInt2);
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void e()
/*  87:    */   {
/*  88:122 */     this.a.tick();
/*  89:123 */     super.e();
/*  90:    */   }
/*  91:    */   
/*  92:    */   public int h()
/*  93:    */   {
/*  94:139 */     return this.q.a;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public int c(String paramString)
/*  98:    */   {
/*  99:143 */     return this.q.a(paramString);
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void c(String paramString, int paramInt1, int paramInt2, int paramInt3)
/* 103:    */   {
/* 104:147 */     this.q.a(paramString, paramInt1, paramInt2, paramInt3);
/* 105:    */   }
/* 106:    */   
/* 107:    */   public List<String> a(String paramString, int paramInt)
/* 108:    */   {
/* 109:151 */     return this.q.c(paramString, paramInt);
/* 110:    */   }
/* 111:    */   
/* 112:    */   public final void a(bug parambug)
/* 113:    */   {
/* 114:161 */     this.a.buttonClicked(((bvr)parambug).f());
/* 115:    */   }
/* 116:    */   
/* 117:    */   public void i()
/* 118:    */   {
/* 119:176 */     this.n.clear();
/* 120:    */   }
/* 121:    */   
/* 122:    */   public void a(RealmsButton paramRealmsButton)
/* 123:    */   {
/* 124:180 */     this.n.add(paramRealmsButton.getProxy());
/* 125:    */   }
/* 126:    */   
/* 127:    */   public List j()
/* 128:    */   {
/* 129:184 */     ArrayList localArrayList = Lists.newArrayListWithExpectedSize(this.n.size());
/* 130:185 */     for (bug localbug : this.n) {
/* 131:186 */       localArrayList.add(((bvr)localbug).f());
/* 132:    */     }
/* 133:188 */     return localArrayList;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public void b(RealmsButton paramRealmsButton)
/* 137:    */   {
/* 138:192 */     this.n.remove(paramRealmsButton);
/* 139:    */   }
/* 140:    */   
/* 141:    */   public void a(int paramInt1, int paramInt2, int paramInt3)
/* 142:    */   {
/* 143:209 */     this.a.mouseClicked(paramInt1, paramInt2, paramInt3);
/* 144:210 */     super.a(paramInt1, paramInt2, paramInt3);
/* 145:    */   }
/* 146:    */   
/* 147:    */   public void k()
/* 148:    */   {
/* 149:215 */     this.a.mouseEvent();
/* 150:216 */     super.k();
/* 151:    */   }
/* 152:    */   
/* 153:    */   public void l()
/* 154:    */   {
/* 155:221 */     this.a.keyboardEvent();
/* 156:222 */     super.l();
/* 157:    */   }
/* 158:    */   
/* 159:    */   public void b(int paramInt1, int paramInt2, int paramInt3)
/* 160:    */   {
/* 161:227 */     this.a.mouseReleased(paramInt1, paramInt2, paramInt3);
/* 162:    */   }
/* 163:    */   
/* 164:    */   public void a(int paramInt1, int paramInt2, int paramInt3, long paramLong)
/* 165:    */   {
/* 166:232 */     this.a.mouseDragged(paramInt1, paramInt2, paramInt3, paramLong);
/* 167:    */   }
/* 168:    */   
/* 169:    */   public void a(char paramChar, int paramInt)
/* 170:    */   {
/* 171:237 */     this.a.keyPressed(paramChar, paramInt);
/* 172:    */   }
/* 173:    */   
/* 174:    */   public void a(boolean paramBoolean, int paramInt)
/* 175:    */   {
/* 176:242 */     this.a.confirmResult(paramBoolean, paramInt);
/* 177:    */   }
/* 178:    */   
/* 179:    */   public void m()
/* 180:    */   {
/* 181:246 */     this.a.removed();
/* 182:247 */     super.m();
/* 183:    */   }
/* 184:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bvt
 * JD-Core Version:    0.7.0.1
 */