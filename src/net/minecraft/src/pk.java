package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Sets;
/*   3:    */ import java.util.ArrayList;
/*   4:    */ import java.util.Arrays;
/*   5:    */ import java.util.Iterator;
/*   6:    */ import java.util.List;
/*   7:    */ import java.util.Set;
/*   8:    */ import net.minecraft.server.MinecraftServer;
/*   9:    */ 
/*  10:    */ public class pk
/*  11:    */   extends bsd
/*  12:    */ {
/*  13:    */   private final MinecraftServer a;
/*  14: 19 */   private final Set<bry> b = Sets.newHashSet();
/*  15:    */   private bse c;
/*  16:    */   
/*  17:    */   public pk(MinecraftServer paramMinecraftServer)
/*  18:    */   {
/*  19: 23 */     this.a = paramMinecraftServer;
/*  20:    */   }
/*  21:    */   
/*  22:    */   public void a(bsa parambsa)
/*  23:    */   {
/*  24: 32 */     super.a(parambsa);
/*  25: 34 */     if (this.b.contains(parambsa.d())) {
/*  26: 35 */       this.a.an().a(new lf(parambsa));
/*  27:    */     }
/*  28: 38 */     b();
/*  29:    */   }
/*  30:    */   
/*  31:    */   public void a(String paramString)
/*  32:    */   {
/*  33: 43 */     super.a(paramString);
/*  34: 44 */     this.a.an().a(new lf(paramString));
/*  35: 45 */     b();
/*  36:    */   }
/*  37:    */   
/*  38:    */   public void a(String paramString, bry parambry)
/*  39:    */   {
/*  40: 50 */     super.a(paramString, parambry);
/*  41: 51 */     this.a.an().a(new lf(paramString, parambry));
/*  42: 52 */     b();
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void a(int paramInt, bry parambry)
/*  46:    */   {
/*  47: 57 */     bry localbry = a(paramInt);
/*  48:    */     
/*  49: 59 */     super.a(paramInt, parambry);
/*  50: 61 */     if ((localbry != parambry) && (localbry != null)) {
/*  51: 62 */       if (h(localbry) > 0) {
/*  52: 63 */         this.a.an().a(new kw(paramInt, parambry));
/*  53:    */       } else {
/*  54: 65 */         g(localbry);
/*  55:    */       }
/*  56:    */     }
/*  57: 69 */     if (parambry != null) {
/*  58: 70 */       if (this.b.contains(parambry)) {
/*  59: 71 */         this.a.an().a(new kw(paramInt, parambry));
/*  60:    */       } else {
/*  61: 73 */         e(parambry);
/*  62:    */       }
/*  63:    */     }
/*  64: 77 */     b();
/*  65:    */   }
/*  66:    */   
/*  67:    */   public boolean a(String paramString1, String paramString2)
/*  68:    */   {
/*  69: 82 */     if (super.a(paramString1, paramString2))
/*  70:    */     {
/*  71: 83 */       brz localbrz = d(paramString2);
/*  72: 84 */       this.a.an().a(new le(localbrz, Arrays.asList(new String[] { paramString1 }), 3));
/*  73: 85 */       b();
/*  74:    */       
/*  75: 87 */       return true;
/*  76:    */     }
/*  77: 90 */     return false;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void a(String paramString, brz parambrz)
/*  81:    */   {
/*  82: 95 */     super.a(paramString, parambrz);
/*  83:    */     
/*  84: 97 */     this.a.an().a(new le(parambrz, Arrays.asList(new String[] { paramString }), 4));
/*  85:    */     
/*  86: 99 */     b();
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void a(bry parambry)
/*  90:    */   {
/*  91:104 */     super.a(parambry);
/*  92:105 */     b();
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void b(bry parambry)
/*  96:    */   {
/*  97:110 */     super.b(parambry);
/*  98:112 */     if (this.b.contains(parambry)) {
/*  99:113 */       this.a.an().a(new ld(parambry, 2));
/* 100:    */     }
/* 101:116 */     b();
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void c(bry parambry)
/* 105:    */   {
/* 106:121 */     super.c(parambry);
/* 107:123 */     if (this.b.contains(parambry)) {
/* 108:124 */       g(parambry);
/* 109:    */     }
/* 110:127 */     b();
/* 111:    */   }
/* 112:    */   
/* 113:    */   public void a(brz parambrz)
/* 114:    */   {
/* 115:132 */     super.a(parambrz);
/* 116:    */     
/* 117:134 */     this.a.an().a(new le(parambrz, 0));
/* 118:    */     
/* 119:136 */     b();
/* 120:    */   }
/* 121:    */   
/* 122:    */   public void b(brz parambrz)
/* 123:    */   {
/* 124:141 */     super.b(parambrz);
/* 125:    */     
/* 126:143 */     this.a.an().a(new le(parambrz, 2));
/* 127:    */     
/* 128:145 */     b();
/* 129:    */   }
/* 130:    */   
/* 131:    */   public void c(brz parambrz)
/* 132:    */   {
/* 133:150 */     super.c(parambrz);
/* 134:    */     
/* 135:152 */     this.a.an().a(new le(parambrz, 1));
/* 136:    */     
/* 137:154 */     b();
/* 138:    */   }
/* 139:    */   
/* 140:    */   public void a(bse parambse)
/* 141:    */   {
/* 142:158 */     this.c = parambse;
/* 143:    */   }
/* 144:    */   
/* 145:    */   protected void b()
/* 146:    */   {
/* 147:162 */     if (this.c != null) {
/* 148:163 */       this.c.c();
/* 149:    */     }
/* 150:    */   }
/* 151:    */   
/* 152:    */   public List<id> d(bry parambry)
/* 153:    */   {
/* 154:168 */     ArrayList<id> localArrayList = Lists.newArrayList();
/* 155:169 */     localArrayList.add(new ld(parambry, 0));
/* 156:171 */     for (int i = 0; i < 19; i++) {
/* 157:172 */       if (a(i) == parambry) {
/* 158:173 */         localArrayList.add(new kw(i, parambry));
/* 159:    */       }
/* 160:    */     }
/* 161:177 */     for (bsa localbsa : i(parambry)) {
/* 162:178 */       localArrayList.add(new lf(localbsa));
/* 163:    */     }
/* 164:181 */     return localArrayList;
/* 165:    */   }
/* 166:    */   
/* 167:    */   public void e(bry parambry)
/* 168:    */   {
/* 169:185 */     List<id> localList = d(parambry);
/* 170:187 */     for (Iterator<qw> localIterator1 = this.a.an().e.iterator(); localIterator1.hasNext();)
/* 171:    */     {
/* 172:187 */       qw localqw = localIterator1.next();
/* 173:188 */       for (id localid : localList) {
/* 174:189 */         localqw.a.a(localid);
/* 175:    */       }
/* 176:    */     }
/* 177:    */     
/* 178:193 */     this.b.add(parambry);
/* 179:    */   }
/* 180:    */   
/* 181:    */   public List<id> f(bry parambry)
/* 182:    */   {
/* 183:197 */     ArrayList<id> localArrayList = Lists.newArrayList();
/* 184:198 */     localArrayList.add(new ld(parambry, 1));
/* 185:200 */     for (int i = 0; i < 19; i++) {
/* 186:201 */       if (a(i) == parambry) {
/* 187:202 */         localArrayList.add(new kw(i, parambry));
/* 188:    */       }
/* 189:    */     }
/* 190:206 */     return localArrayList;
/* 191:    */   }
/* 192:    */   
/* 193:    */   public void g(bry parambry)
/* 194:    */   {
/* 195:210 */     List<id> localList = f(parambry);
/* 196:212 */     for (Iterator<qw> localIterator1 = this.a.an().e.iterator(); localIterator1.hasNext();)
/* 197:    */     {
/* 198:212 */       qw localqw = localIterator1.next();
/* 199:213 */       for (id localid : localList) {
/* 200:214 */         localqw.a.a(localid);
/* 201:    */       }
/* 202:    */     }
/* 203:    */     
/* 204:218 */     this.b.remove(parambry);
/* 205:    */   }
/* 206:    */   
/* 207:    */   public int h(bry parambry)
/* 208:    */   {
/* 209:222 */     int i = 0;
/* 210:224 */     for (int j = 0; j < 19; j++) {
/* 211:225 */       if (a(j) == parambry) {
/* 212:226 */         i++;
/* 213:    */       }
/* 214:    */     }
/* 215:230 */     return i;
/* 216:    */   }
/* 217:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     pk
 * JD-Core Version:    0.7.0.1
 */