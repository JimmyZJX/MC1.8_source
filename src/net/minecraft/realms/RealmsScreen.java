/*   1:    */ package net.minecraft.realms;
/*   2:    */ 
/*   3:    */ /*   8:    */ import com.mojang.util.UUIDTypeAdapter;

/*  12:    */ import java.util.List;

import net.minecraft.src.ItemStack;
import net.minecraft.src.bsu;
import net.minecraft.src.bub;
import net.minecraft.src.bvt;
import net.minecraft.src.cil;
import net.minecraft.src.cug;
import net.minecraft.src.cva;
import net.minecraft.src.cwc;
import net.minecraft.src.oa;
/*  14:    */ 
/*  15:    */ public class RealmsScreen
/*  16:    */ {
/*  17:    */   public static final int SKIN_HEAD_U = 8;
/*  18:    */   public static final int SKIN_HEAD_V = 8;
/*  19:    */   public static final int SKIN_HEAD_WIDTH = 8;
/*  20:    */   public static final int SKIN_HEAD_HEIGHT = 8;
/*  21:    */   public static final int SKIN_HAT_U = 40;
/*  22:    */   public static final int SKIN_HAT_V = 8;
/*  23:    */   public static final int SKIN_HAT_WIDTH = 8;
/*  24:    */   public static final int SKIN_HAT_HEIGHT = 8;
/*  25:    */   public static final int SKIN_TEX_WIDTH = 64;
/*  26:    */   public static final int SKIN_TEX_HEIGHT = 64;
/*  27:    */   protected bsu minecraft;
/*  28:    */   public int width;
/*  29:    */   public int height;
/*  30:    */   private bvt proxy;
/*  31:    */   
/*  32:    */   public RealmsScreen()
/*  33:    */   {
/*  34: 36 */     this.proxy = new bvt(this);
/*  35:    */   }
/*  36:    */   
/*  37:    */   public bvt getProxy()
/*  38:    */   {
/*  39: 40 */     return this.proxy;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void init() {}
/*  43:    */   
/*  44:    */   public void init(bsu parambsu, int paramInt1, int paramInt2) {}
/*  45:    */   
/*  46:    */   public void drawCenteredString(String paramString, int paramInt1, int paramInt2, int paramInt3)
/*  47:    */   {
/*  48: 53 */     this.proxy.a(paramString, paramInt1, paramInt2, paramInt3);
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void drawString(String paramString, int paramInt1, int paramInt2, int paramInt3)
/*  52:    */   {
/*  53: 57 */     this.proxy.b(paramString, paramInt1, paramInt2, paramInt3);
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void blit(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*  57:    */   {
/*  58: 61 */     this.proxy.b(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*  59:    */   }
/*  60:    */   
/*  61:    */   public static void blit(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, float paramFloat3, float paramFloat4)
/*  62:    */   {
/*  63: 65 */     bub.a(paramInt1, paramInt2, paramFloat1, paramFloat2, paramInt3, paramInt4, paramInt5, paramInt6, paramFloat3, paramFloat4);
/*  64:    */   }
/*  65:    */   
/*  66:    */   public static void blit(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, int paramInt3, int paramInt4, float paramFloat3, float paramFloat4)
/*  67:    */   {
/*  68: 69 */     bub.a(paramInt1, paramInt2, paramFloat1, paramFloat2, paramInt3, paramInt4, paramFloat3, paramFloat4);
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void fillGradient(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*  72:    */   {
/*  73: 73 */     this.proxy.a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void renderBackground()
/*  77:    */   {
/*  78: 77 */     this.proxy.c();
/*  79:    */   }
/*  80:    */   
/*  81:    */   public boolean isPauseScreen()
/*  82:    */   {
/*  83: 81 */     return this.proxy.d();
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void renderBackground(int paramInt)
/*  87:    */   {
/*  88: 85 */     this.proxy.b_(paramInt);
/*  89:    */   }
/*  90:    */   
/*  91:    */   public void render(int paramInt1, int paramInt2, float paramFloat)
/*  92:    */   {
/*  93: 89 */     for (int i = 0; i < this.proxy.j().size(); i++) {
/*  94: 90 */       ((RealmsButton)this.proxy.j().get(i)).render(paramInt1, paramInt2);
/*  95:    */     }
/*  96:    */   }
/*  97:    */   
/*  98:    */   public void renderTooltip(ItemStack paramamj, int paramInt1, int paramInt2)
/*  99:    */   {
/* 100: 95 */     this.proxy.a(paramamj, paramInt1, paramInt2);
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void renderTooltip(String paramString, int paramInt1, int paramInt2)
/* 104:    */   {
/* 105: 99 */     this.proxy.a(paramString, paramInt1, paramInt2);
/* 106:    */   }
/* 107:    */   
/* 108:    */   public void renderTooltip(List paramList, int paramInt1, int paramInt2)
/* 109:    */   {
/* 110:103 */     this.proxy.a(paramList, paramInt1, paramInt2);
/* 111:    */   }
/* 112:    */   
/* 113:    */   public static void bindFace(String paramString1, String paramString2)
/* 114:    */   {
/* 115:107 */     oa localoa = cil.c(paramString2);
/* 116:108 */     if (localoa == null) {
/* 117:109 */       localoa = cva.a(UUIDTypeAdapter.fromString(paramString1));
/* 118:    */     }
/* 119:111 */     cil.a(localoa, paramString2);
/* 120:112 */     bsu.z().N().a(localoa);
/* 121:    */   }
/* 122:    */   
/* 123:    */   public static void bind(String paramString)
/* 124:    */   {
/* 125:116 */     oa localoa = new oa(paramString);
/* 126:117 */     bsu.z().N().a(localoa);
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void tick() {}
/* 130:    */   
/* 131:    */   public int width()
/* 132:    */   {
/* 133:124 */     return this.proxy.l;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public int height()
/* 137:    */   {
/* 138:128 */     return this.proxy.m;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public int fontLineHeight()
/* 142:    */   {
/* 143:136 */     return this.proxy.h();
/* 144:    */   }
/* 145:    */   
/* 146:    */   public int fontWidth(String paramString)
/* 147:    */   {
/* 148:140 */     return this.proxy.c(paramString);
/* 149:    */   }
/* 150:    */   
/* 151:    */   public void fontDrawShadow(String paramString, int paramInt1, int paramInt2, int paramInt3)
/* 152:    */   {
/* 153:144 */     this.proxy.c(paramString, paramInt1, paramInt2, paramInt3);
/* 154:    */   }
/* 155:    */   
/* 156:    */   public List<String> fontSplit(String paramString, int paramInt)
/* 157:    */   {
/* 158:148 */     return this.proxy.a(paramString, paramInt);
/* 159:    */   }
/* 160:    */   
/* 161:    */   public void buttonClicked(RealmsButton paramRealmsButton) {}
/* 162:    */   
/* 163:    */   public static RealmsButton newButton(int paramInt1, int paramInt2, int paramInt3, String paramString)
/* 164:    */   {
/* 165:160 */     return new RealmsButton(paramInt1, paramInt2, paramInt3, paramString);
/* 166:    */   }
/* 167:    */   
/* 168:    */   public static RealmsButton newButton(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, String paramString)
/* 169:    */   {
/* 170:164 */     return new RealmsButton(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramString);
/* 171:    */   }
/* 172:    */   
/* 173:    */   public void buttonsClear()
/* 174:    */   {
/* 175:168 */     this.proxy.i();
/* 176:    */   }
/* 177:    */   
/* 178:    */   public void buttonsAdd(RealmsButton paramRealmsButton)
/* 179:    */   {
/* 180:172 */     this.proxy.a(paramRealmsButton);
/* 181:    */   }
/* 182:    */   
/* 183:    */   public List buttons()
/* 184:    */   {
/* 185:176 */     return this.proxy.j();
/* 186:    */   }
/* 187:    */   
/* 188:    */   public void buttonsRemove(RealmsButton paramRealmsButton)
/* 189:    */   {
/* 190:180 */     this.proxy.b(paramRealmsButton);
/* 191:    */   }
/* 192:    */   
/* 193:    */   public RealmsEditBox newEditBox(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/* 194:    */   {
/* 195:188 */     return new RealmsEditBox(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 196:    */   }
/* 197:    */   
/* 198:    */   public void mouseClicked(int paramInt1, int paramInt2, int paramInt3) {}
/* 199:    */   
/* 200:    */   public void mouseEvent() {}
/* 201:    */   
/* 202:    */   public void keyboardEvent() {}
/* 203:    */   
/* 204:    */   public void mouseReleased(int paramInt1, int paramInt2, int paramInt3) {}
/* 205:    */   
/* 206:    */   public void mouseDragged(int paramInt1, int paramInt2, int paramInt3, long paramLong) {}
/* 207:    */   
/* 208:    */   public void keyPressed(char paramChar, int paramInt) {}
/* 209:    */   
/* 210:    */   public void confirmResult(boolean paramBoolean, int paramInt) {}
/* 211:    */   
/* 212:    */   public static String getLocalizedString(String paramString)
/* 213:    */   {
/* 214:221 */     return cwc.a(paramString, new Object[0]);
/* 215:    */   }
/* 216:    */   
/* 217:    */   public static String getLocalizedString(String paramString, Object... paramVarArgs)
/* 218:    */   {
/* 219:225 */     return cwc.a(paramString, paramVarArgs);
/* 220:    */   }
/* 221:    */   
/* 222:    */   public RealmsAnvilLevelStorageSource getLevelStorageSource()
/* 223:    */   {
/* 224:233 */     return new RealmsAnvilLevelStorageSource(bsu.z().f());
/* 225:    */   }
/* 226:    */   
/* 227:    */   public void removed() {}
/* 228:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     net.minecraft.realms.RealmsScreen
 * JD-Core Version:    0.7.0.1
 */