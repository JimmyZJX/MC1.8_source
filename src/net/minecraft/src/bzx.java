package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.io.File;
/*   3:    */ import java.io.IOException;
/*   4:    */ import java.lang.reflect.Method;
/*   5:    */ import java.net.URI;
/*   6:    */ import java.util.ArrayList;
/*   7:    */ import java.util.Collections;
/*   8:    */ import java.util.Iterator;
/*   9:    */ import java.util.List;
/*  10:    */ import org.apache.logging.log4j.LogManager;
/*  11:    */ import org.apache.logging.log4j.Logger;
/*  12:    */ import org.lwjgl.Sys;
/*  13:    */ 
/*  14:    */ public class bzx
/*  15:    */   extends bxf
/*  16:    */ {
/*  17: 26 */   private static final Logger a = LogManager.getLogger();
/*  18:    */   private bxf f;
/*  19:    */   private List<caa> g;
/*  20:    */   private List h;
/*  21:    */   private cac i;
/*  22:    */   private cae r;
/*  23: 37 */   private boolean s = false;
/*  24:    */   
/*  25:    */   public bzx(bxf parambxf)
/*  26:    */   {
/*  27: 40 */     this.f = parambxf;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void b()
/*  31:    */   {
/*  32: 45 */     this.n.add(new buw(2, this.l / 2 - 154, this.m - 48, cwc.a("resourcePack.openFolder", new Object[0])));
/*  33: 46 */     this.n.add(new buw(1, this.l / 2 + 4, this.m - 48, cwc.a("gui.done", new Object[0])));
/*  34:    */     
/*  35: 48 */     this.g = Lists.newArrayList();
/*  36: 49 */     this.h = Lists.newArrayList();
/*  37:    */     
/*  38: 51 */     cvo localcvo = this.j.P();
/*  39: 52 */     localcvo.a();
/*  40: 53 */     ArrayList localArrayList = Lists.newArrayList(localcvo.b());
/*  41: 54 */     localArrayList.removeAll(localcvo.c());
/*  42: 55 */     for (Iterator localIterator = localArrayList.iterator(); localIterator.hasNext();)
/*  43:    */     {
/*  44: 55 */       cvs localcvs = (cvs)localIterator.next();
/*  45: 56 */       this.g.add(new caa(this, localcvs));
/*  46:    */     }
/*  47:    */     cvs localcvs;
/*  48: 58 */     for (Iterator<cvs> localIterator = Lists.reverse(localcvo.c()).iterator(); localIterator.hasNext();)
/*  49:    */     {
/*  50: 58 */       localcvs = (cvs)localIterator.next();
/*  51: 59 */       this.h.add(new caa(this, localcvs));
/*  52:    */     }
/*  53: 62 */     this.h.add(new bzz(this));
/*  54:    */     
/*  55: 64 */     this.i = new cac(this.j, 200, this.m, this.g);
/*  56: 65 */     this.i.h(this.l / 2 - 4 - 200);
/*  57: 66 */     this.i.d(7, 8);
/*  58: 67 */     this.r = new cae(this.j, 200, this.m, this.h);
/*  59: 68 */     this.r.h(this.l / 2 + 4);
/*  60: 69 */     this.r.d(7, 8);
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void k()
/*  64:    */   {
/*  65: 74 */     super.k();
/*  66: 75 */     this.r.p();
/*  67: 76 */     this.i.p();
/*  68:    */   }
/*  69:    */   
/*  70:    */   public boolean a(bzy parambzy)
/*  71:    */   {
/*  72: 80 */     return this.h.contains(parambzy);
/*  73:    */   }
/*  74:    */   
/*  75:    */   public List b(bzy parambzy)
/*  76:    */   {
/*  77: 84 */     if (a(parambzy)) {
/*  78: 85 */       return this.h;
/*  79:    */     }
/*  80: 87 */     return this.g;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public List a()
/*  84:    */   {
/*  85: 92 */     return this.g;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public List f()
/*  89:    */   {
/*  90: 96 */     return this.h;
/*  91:    */   }
/*  92:    */   
/*  93:    */   protected void a(bug parambug)
/*  94:    */   {
/*  95:101 */     if (!parambug.l) {
/*  96:    */       return;
/*  97:    */     }
/*  98:    */     Object localObject1;
/*  99:    */     Object localObject2;
/* 100:105 */     if (parambug.k == 2)
/* 101:    */     {
/* 102:106 */       localObject1 = this.j.P().d();
/* 103:107 */       String localObject21 = ((File)localObject1).getAbsolutePath();
/* 104:109 */       if (w.a() == x.d)
/* 105:    */       {
/* 106:    */         try
/* 107:    */         {
/* 108:111 */           a.info((String)localObject21);
/* 109:112 */           Runtime.getRuntime().exec(new String[] { "/usr/bin/open", localObject21 });
/* 110:    */           
/* 111:    */ 
/* 112:115 */           return;
/* 113:    */         }
/* 114:    */         catch (IOException localIOException1)
/* 115:    */         {
/* 116:117 */           a.error("Couldn't open file", localIOException1);
/* 117:    */         }
/* 118:    */       }
/* 119:119 */       else if (w.a() == x.c)
/* 120:    */       {
/* 121:122 */         String str = String.format("cmd.exe /C start \"Open file\" \"%s\"", new Object[] { localObject21 });
/* 122:    */         try
/* 123:    */         {
/* 124:124 */           Runtime.getRuntime().exec(str);
/* 125:125 */           return;
/* 126:    */         }
/* 127:    */         catch (IOException localIOException2)
/* 128:    */         {
/* 129:127 */           a.error("Couldn't open file", localIOException2);
/* 130:    */         }
/* 131:    */       }
/* 132:131 */       int j = 0;
/* 133:    */       try
/* 134:    */       {
/* 135:133 */         Class localClass = Class.forName("java.awt.Desktop");
/* 136:134 */         Object localObject4 = localClass.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
/* 137:135 */         localClass.getMethod("browse", new Class[] { URI.class }).invoke(localObject4, new Object[] { ((File)localObject1).toURI() });
/* 138:    */       }
/* 139:    */       catch (Throwable localThrowable)
/* 140:    */       {
/* 141:137 */         a.error("Couldn't open link", localThrowable);
/* 142:138 */         j = 1;
/* 143:    */       }
/* 144:140 */       if (j != 0)
/* 145:    */       {
/* 146:141 */         a.info("Opening via system class!");
/* 147:142 */         Sys.openURL("file://" + (String)localObject21);
/* 148:    */       }
/* 149:    */     }
/* 150:144 */     else if (parambug.k == 1)
/* 151:    */     {
/* 152:145 */       if (this.s)
/* 153:    */       {
/* 154:146 */         localObject1 = Lists.newArrayList();
/* 155:147 */         for (localObject2 = this.h.iterator(); ((Iterator)localObject2).hasNext();)
/* 156:    */         {
/* 157:147 */           bzy localObject3 = (bzy)((Iterator)localObject2).next();
/* 158:148 */           if ((localObject3 instanceof caa)) {
/* 159:149 */             ((List)localObject1).add(((caa)localObject3).i());
/* 160:    */           }
/* 161:    */         }
/* 162:    */         Object localObject3;
/* 163:152 */         Collections.reverse((List)localObject1);
/* 164:153 */         this.j.P().a((List)localObject1);
/* 165:154 */         this.j.t.k.clear();
/* 166:156 */         for (localObject2 = ((List)localObject1).iterator(); ((Iterator)localObject2).hasNext();)
/* 167:    */         {
/* 168:156 */           localObject3 = (cvs)((Iterator)localObject2).next();
/* 169:157 */           this.j.t.k.add(((cvs)localObject3).d());
/* 170:    */         }
/* 171:160 */         this.j.t.b();
/* 172:161 */         this.j.e();
/* 173:    */       }
/* 174:163 */       this.j.a(this.f);
/* 175:    */     }
/* 176:    */   }
/* 177:    */   
/* 178:    */   protected void a(int paramInt1, int paramInt2, int paramInt3)
/* 179:    */   {
/* 180:169 */     super.a(paramInt1, paramInt2, paramInt3);
/* 181:170 */     this.i.b(paramInt1, paramInt2, paramInt3);
/* 182:171 */     this.r.b(paramInt1, paramInt2, paramInt3);
/* 183:    */   }
/* 184:    */   
/* 185:    */   protected void b(int paramInt1, int paramInt2, int paramInt3)
/* 186:    */   {
/* 187:176 */     super.b(paramInt1, paramInt2, paramInt3);
/* 188:    */   }
/* 189:    */   
/* 190:    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/* 191:    */   {
/* 192:181 */     c(0);
/* 193:    */     
/* 194:183 */     this.i.a(paramInt1, paramInt2, paramFloat);
/* 195:184 */     this.r.a(paramInt1, paramInt2, paramFloat);
/* 196:    */     
/* 197:186 */     a(this.q, cwc.a("resourcePack.title", new Object[0]), this.l / 2, 16, 16777215);
/* 198:187 */     a(this.q, cwc.a("resourcePack.folderInfo", new Object[0]), this.l / 2 - 77, this.m - 26, 8421504);
/* 199:    */     
/* 200:189 */     super.a(paramInt1, paramInt2, paramFloat);
/* 201:    */   }
/* 202:    */   
/* 203:    */   public void g()
/* 204:    */   {
/* 205:193 */     this.s = true;
/* 206:    */   }
/* 207:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bzx
 * JD-Core Version:    0.7.0.1
 */