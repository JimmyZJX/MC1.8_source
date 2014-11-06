package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   4:    */ import java.net.URI;
/*   6:    */ import java.util.List;

/*   7:    */ import org.apache.logging.log4j.LogManager;
/*   8:    */ import org.apache.logging.log4j.Logger;
/*  10:    */ import org.lwjgl.opengl.GL11;
/*  11:    */ import org.lwjgl.opengl.GLContext;

/*  12:    */ import tv.twitch.ErrorCode;
/*  13:    */ 
/*  14:    */ public class cak
/*  15:    */   extends bxf
/*  16:    */ {
/*  17: 25 */   private static final Logger a = LogManager.getLogger();
/*  18: 29 */   private final ho f = new hz("stream.unavailable.title", new Object[0]);
/*  19:    */   private final bxf g;
/*  20:    */   private final cam h;
/*  21:    */   private final List<hz> i;
/*  22: 33 */   private final List<String> r = Lists.newArrayList();
/*  23:    */   
/*  24:    */   public cak(bxf parambxf, cam paramcam)
/*  25:    */   {
/*  26: 36 */     this(parambxf, paramcam, null);
/*  27:    */   }
/*  28:    */   
/*  29:    */   public cak(bxf parambxf, cam paramcam, List<hz> paramList)
/*  30:    */   {
/*  31: 40 */     this.g = parambxf;
/*  32: 41 */     this.h = paramcam;
/*  33: 42 */     this.i = paramList;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void b()
/*  37:    */   {
/*  38: 47 */     if (this.r.isEmpty())
/*  39:    */     {
/*  40: 48 */       this.r.addAll(this.q.c(this.h.a().d(), (int)(this.l * 0.75F)));
/*  41: 50 */       if (this.i != null)
/*  42:    */       {
/*  43: 51 */         this.r.add("");
/*  44: 52 */         for (hz localhz : this.i) {
/*  45: 53 */           this.r.add(localhz.e());
/*  46:    */         }
/*  47:    */       }
/*  48:    */     }
/*  49: 58 */     if (this.h.b() != null)
/*  50:    */     {
/*  51: 59 */       this.n.add(new bug(0, this.l / 2 - 155, this.m - 50, 150, 20, cwc.a("gui.cancel", new Object[0])));
/*  52: 60 */       this.n.add(new bug(1, this.l / 2 - 155 + 160, this.m - 50, 150, 20, cwc.a(this.h.b().d(), new Object[0])));
/*  53:    */     }
/*  54:    */     else
/*  55:    */     {
/*  56: 62 */       this.n.add(new bug(0, this.l / 2 - 75, this.m - 50, 150, 20, cwc.a("gui.cancel", new Object[0])));
/*  57:    */     }
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void m() {}
/*  61:    */   
/*  62:    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*  63:    */   {
/*  64: 72 */     c();
/*  65:    */     
/*  66: 74 */     int j = Math.max((int)(this.m * 0.85D / 2.0D - this.r.size() * this.q.a / 2.0F), 50);
/*  67: 75 */     a(this.q, this.f.d(), this.l / 2, j - this.q.a * 2, 16777215);
/*  68: 77 */     for (String str : this.r)
/*  69:    */     {
/*  70: 78 */       a(this.q, str, this.l / 2, j, 10526880);
/*  71: 79 */       j += this.q.a;
/*  72:    */     }
/*  73: 82 */     super.a(paramInt1, paramInt2, paramFloat);
/*  74:    */   }
/*  75:    */   
/*  76:    */   protected void a(bug parambug)
/*  77:    */   {
/*  78: 87 */     if (!parambug.l) {
/*  79: 88 */       return;
/*  80:    */     }
/*  81: 91 */     if (parambug.k == 1) {
/*  82: 92 */       switch (cal.a[this.h.ordinal()])
/*  83:    */       {
/*  84:    */       case 1: 
/*  85:    */       case 2: 
/*  86: 95 */         a("https://account.mojang.com/me/settings");
/*  87: 96 */         break;
/*  88:    */       case 3: 
/*  89: 98 */         a("https://account.mojang.com/migrate");
/*  90: 99 */         break;
/*  91:    */       case 4: 
/*  92:101 */         a("http://www.apple.com/osx/");
/*  93:102 */         break;
/*  94:    */       case 5: 
/*  95:    */       case 6: 
/*  96:    */       case 7: 
/*  97:106 */         a("http://bugs.mojang.com/browse/MC");
/*  98:    */       }
/*  99:    */     }
/* 100:111 */     this.j.a(this.g);
/* 101:    */   }
/* 102:    */   
/* 103:    */   private void a(String paramString)
/* 104:    */   {
/* 105:    */     try
/* 106:    */     {
/* 107:116 */       Class<?> localClass = Class.forName("java.awt.Desktop");
/* 108:117 */       Object localObject = localClass.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
/* 109:118 */       localClass.getMethod("browse", new Class[] { URI.class }).invoke(localObject, new Object[] { new URI(paramString) });
/* 110:    */     }
/* 111:    */     catch (Throwable localThrowable)
/* 112:    */     {
/* 113:120 */       a.error("Couldn't open link", localThrowable);
/* 114:    */     }
/* 115:    */   }
/* 116:    */   
/* 117:    */   public static void a(bxf parambxf)
/* 118:    */   {
/* 119:125 */     bsu localbsu = bsu.z();
/* 120:126 */     dao localdao = localbsu.W();
/* 121:    */     
/* 122:128 */     if (!dax.k)
/* 123:    */     {
/* 124:129 */       List<hz> localObject = Lists.newArrayList();
/* 125:130 */       (localObject).add(new hz("stream.unavailable.no_fbo.version", new Object[] { GL11.glGetString(7938) }));
/* 126:131 */       (localObject).add(new hz("stream.unavailable.no_fbo.blend", new Object[] { Boolean.valueOf(GLContext.getCapabilities().GL_EXT_blend_func_separate) }));
/* 127:132 */       (localObject).add(new hz("stream.unavailable.no_fbo.arb", new Object[] { Boolean.valueOf(GLContext.getCapabilities().GL_ARB_framebuffer_object) }));
/* 128:133 */       (localObject).add(new hz("stream.unavailable.no_fbo.ext", new Object[] { Boolean.valueOf(GLContext.getCapabilities().GL_EXT_framebuffer_object) }));
/* 129:    */       
/* 130:135 */       localbsu.a(new cak(parambxf, cam.a, localObject));
/* 131:    */     }
/* 132:136 */     else if ((localdao instanceof dat))
/* 133:    */     {
/* 134:137 */       if (((dat)localdao).a().getMessage().contains("Can't load AMD 64-bit .dll on a IA 32-bit platform")) {
/* 135:138 */         localbsu.a(new cak(parambxf, cam.b));
/* 136:    */       } else {
/* 137:140 */         localbsu.a(new cak(parambxf, cam.c));
/* 138:    */       }
/* 139:    */     }
/* 140:    */     else
/* 141:    */     {
/* 142:142 */       if ((!localdao.A()) && (localdao.B() == ErrorCode.TTV_EC_OS_TOO_OLD)) {}
/* 143:143 */       switch (cal.b[w.a().ordinal()])
/* 144:    */       {
/* 145:    */       case 1: 
/* 146:145 */         localbsu.a(new cak(parambxf, cam.d));
/* 147:146 */         break;
/* 148:    */       case 2: 
/* 149:148 */         localbsu.a(new cak(parambxf, cam.e));
/* 150:149 */         break;
/* 151:    */       default: 
/* 152:151 */         localbsu.a(new cak(parambxf, cam.f)); break;
/* 153:153 */         //if (!localbsu.L().containsKey("twitch_access_token"))
/* 154:    */         //{
/* 155:154 */         //  if (localbsu.K().f() == btx.a) {
/* 156:155 */         //    localbsu.a(new cak(parambxf, cam.g));
/* 157:    */         //  } else {
/* 158:157 */         //    localbsu.a(new cak(parambxf, cam.h));
/* 159:    */         //  }
/* 160:    */         //}
/* 161:159 */         //else if (!localdao.C())
/* 162:    */         //{
/* 163:160 */         //  switch (cal.c[localdao.E().ordinal()])
/* 164:    */         //  {
/* 165:    */         //  case 1: 
/* 166:162 */         //    localbsu.a(new cak(parambxf, cam.i));
/* 167:163 */         //    break;
/* 168:    */         //  case 2: 
/* 169:    */         //  default: 
/* 170:166 */         //    localbsu.a(new cak(parambxf, cam.j)); break;
/* 171:    */         //  }
/* 172:    */         //}
/* 173:168 */         //else if (localdao.B() != null)
/* 174:    */         //{
/* 175:169 */         //  List<hz> localObject = Arrays.asList(new hz[] { new hz("stream.unavailable.initialization_failure.extra", new Object[] { ErrorCode.getString(localdao.B()) }) });
/* 176:170 */         //  localbsu.a(new cak(parambxf, cam.k, localObject));
/* 177:    */         //}
/* 178:    */         //else
/* 179:    */         //{
/* 180:172 */         //  localbsu.a(new cak(parambxf, cam.l));
/* 181:    */         //}
/* 182:    */         //break;
/* 183:    */       }
/* 184:    */     }
/* 185:    */   }
/* 186:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cak
 * JD-Core Version:    0.7.0.1
 */