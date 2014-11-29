package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.Iterator;
/*   3:    */ import java.util.List;
/*   4:    */ import java.util.concurrent.Callable;
/*   5:    */ 
/*   6:    */ public class j
/*   7:    */ {
/*   8:    */   private final b a;
/*   9:    */   private final String b;
/*  10: 14 */   private final List c = Lists.newArrayList();
/*  11: 15 */   private StackTraceElement[] d = new StackTraceElement[0];
/*  12:    */   
/*  13:    */   public j(b paramb, String paramString)
/*  14:    */   {
/*  15: 18 */     this.a = paramb;
/*  16: 19 */     this.b = paramString;
/*  17:    */   }
/*  18:    */   
/*  19:    */   public static String a(double paramDouble1, double paramDouble2, double paramDouble3)
/*  20:    */   {
/*  21: 23 */     return String.format("%.2f,%.2f,%.2f - %s", new Object[] { Double.valueOf(paramDouble1), Double.valueOf(paramDouble2), Double.valueOf(paramDouble3), a(new BlockPosition(paramDouble1, paramDouble2, paramDouble3)) });
/*  22:    */   }
/*  23:    */   
/*  24:    */   public static String a(BlockPosition paramdt)
/*  25:    */   {
/*  26: 27 */     int i = paramdt.getX();
/*  27: 28 */     int j = paramdt.getY();
/*  28: 29 */     int k = paramdt.getZ();
/*  29: 30 */     StringBuilder localStringBuilder = new StringBuilder();
/*  30:    */     try
/*  31:    */     {
/*  32: 33 */       localStringBuilder.append(String.format("World: (%d,%d,%d)", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) }));
/*  33:    */     }
/*  34:    */     catch (Throwable localThrowable1)
/*  35:    */     {
/*  36: 35 */       localStringBuilder.append("(Error finding world loc)");
/*  37:    */     }
/*  38: 38 */     localStringBuilder.append(", ");
/*  39:    */     int i1;
/*  40:    */     int i2;
/*  41:    */     int i3;
/*  42:    */     int i4;
/*  43:    */     int i5;
/*  44:    */     int i6;
/*  45:    */     int i7;
/*  46:    */     int i8;
/*  47:    */     try
/*  48:    */     {
/*  49: 41 */       int m = i >> 4;
/*  50: 42 */       i1 = k >> 4;
/*  51: 43 */       i2 = i & 0xF;
/*  52: 44 */       i3 = j >> 4;
/*  53: 45 */       i4 = k & 0xF;
/*  54: 46 */       i5 = m << 4;
/*  55: 47 */       i6 = i1 << 4;
/*  56: 48 */       i7 = (m + 1 << 4) - 1;
/*  57: 49 */       i8 = (i1 + 1 << 4) - 1;
/*  58: 50 */       localStringBuilder.append(String.format("Chunk: (at %d,%d,%d in %d,%d; contains blocks %d,0,%d to %d,255,%d)", new Object[] { Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(m), Integer.valueOf(i1), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8) }));
/*  59:    */     }
/*  60:    */     catch (Throwable localThrowable2)
/*  61:    */     {
/*  62: 52 */       localStringBuilder.append("(Error finding chunk loc)");
/*  63:    */     }
/*  64: 55 */     localStringBuilder.append(", ");
/*  65:    */     try
/*  66:    */     {
/*  67: 58 */       int n = i >> 9;
/*  68: 59 */       i1 = k >> 9;
/*  69: 60 */       i2 = n << 5;
/*  70: 61 */       i3 = i1 << 5;
/*  71: 62 */       i4 = (n + 1 << 5) - 1;
/*  72: 63 */       i5 = (i1 + 1 << 5) - 1;
/*  73: 64 */       i6 = n << 9;
/*  74: 65 */       i7 = i1 << 9;
/*  75: 66 */       i8 = (n + 1 << 9) - 1;
/*  76: 67 */       int i9 = (i1 + 1 << 9) - 1;
/*  77: 68 */       localStringBuilder.append(String.format("Region: (%d,%d; contains chunks %d,%d to %d,%d, blocks %d,0,%d to %d,255,%d)", new Object[] { Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9) }));
/*  78:    */     }
/*  79:    */     catch (Throwable localThrowable3)
/*  80:    */     {
/*  81: 70 */       localStringBuilder.append("(Error finding world loc)");
/*  82:    */     }
/*  83: 73 */     return localStringBuilder.toString();
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void a(String paramString, Callable paramCallable)
/*  87:    */   {
/*  88:    */     try
/*  89:    */     {
/*  90: 78 */       a(paramString, paramCallable.call());
/*  91:    */     }
/*  92:    */     catch (Throwable localThrowable)
/*  93:    */     {
/*  94: 80 */       a(paramString, localThrowable);
/*  95:    */     }
/*  96:    */   }
/*  97:    */   
/*  98:    */   public void a(String paramString, Object paramObject)
/*  99:    */   {
/* 100: 85 */     this.c.add(new r(paramString, paramObject));
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void a(String paramString, Throwable paramThrowable)
/* 104:    */   {
/* 105: 89 */     a(paramString, paramThrowable);
/* 106:    */   }
/* 107:    */   
/* 108:    */   public int a(int paramInt)
/* 109:    */   {
/* 110: 93 */     StackTraceElement[] arrayOfStackTraceElement = Thread.currentThread().getStackTrace();
/* 111: 96 */     if (arrayOfStackTraceElement.length <= 0) {
/* 112: 97 */       return 0;
/* 113:    */     }
/* 114:100 */     this.d = new StackTraceElement[arrayOfStackTraceElement.length - 3 - paramInt];
/* 115:101 */     System.arraycopy(arrayOfStackTraceElement, 3 + paramInt, this.d, 0, this.d.length);
/* 116:102 */     return this.d.length;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public boolean a(StackTraceElement paramStackTraceElement1, StackTraceElement paramStackTraceElement2)
/* 120:    */   {
/* 121:106 */     if ((this.d.length == 0) || (paramStackTraceElement1 == null)) {
/* 122:107 */       return false;
/* 123:    */     }
/* 124:110 */     StackTraceElement localStackTraceElement = this.d[0];
/* 125:113 */     if ((localStackTraceElement.isNativeMethod() != paramStackTraceElement1.isNativeMethod()) || (!localStackTraceElement.getClassName().equals(paramStackTraceElement1.getClassName())) || (!localStackTraceElement.getFileName().equals(paramStackTraceElement1.getFileName())) || (!localStackTraceElement.getMethodName().equals(paramStackTraceElement1.getMethodName()))) {
/* 126:118 */       return false;
/* 127:    */     }
/* 128:121 */     if ((paramStackTraceElement2 != null ? 1 : 0) != (this.d.length > 1 ? 1 : 0)) {
/* 129:122 */       return false;
/* 130:    */     }
/* 131:124 */     if ((paramStackTraceElement2 != null) && (!this.d[1].equals(paramStackTraceElement2))) {
/* 132:125 */       return false;
/* 133:    */     }
/* 134:128 */     this.d[0] = paramStackTraceElement1;
/* 135:    */     
/* 136:130 */     return true;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void b(int paramInt)
/* 140:    */   {
/* 141:134 */     StackTraceElement[] arrayOfStackTraceElement = new StackTraceElement[this.d.length - paramInt];
/* 142:135 */     System.arraycopy(this.d, 0, arrayOfStackTraceElement, 0, arrayOfStackTraceElement.length);
/* 143:136 */     this.d = arrayOfStackTraceElement;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public void a(StringBuilder paramStringBuilder)
/* 147:    */   {
/* 148:140 */     paramStringBuilder.append("-- ").append(this.b).append(" --\n");
/* 149:141 */     paramStringBuilder.append("Details:");
/* 150:143 */     for (Object localObject1 = this.c.iterator(); ((Iterator)localObject1).hasNext();)
/* 151:    */     {
/* 152:143 */       r localr = (r)((Iterator)localObject1).next();
/* 153:144 */       paramStringBuilder.append("\n\t");
/* 154:145 */       paramStringBuilder.append(localr.a());
/* 155:146 */       paramStringBuilder.append(": ");
/* 156:147 */       paramStringBuilder.append(localr.b());
/* 157:    */     }
/* 158:150 */     if ((this.d != null) && (this.d.length > 0))
/* 159:    */     {
/* 160:151 */       paramStringBuilder.append("\nStacktrace:");
/* 161:153 */       for (Object localObject2 : this.d)
/* 162:    */       {
/* 163:154 */         paramStringBuilder.append("\n\tat ");
/* 164:155 */         paramStringBuilder.append(localObject2.toString());
/* 165:    */       }
/* 166:    */     }
/* 167:    */   }
/* 168:    */   
/* 169:    */   public StackTraceElement[] a()
/* 170:    */   {
/* 171:161 */     return this.d;
/* 172:    */   }
/* 173:    */   
/* 174:    */   public static void a(j paramj, BlockPosition paramdt, BlockType paramatr, int paramInt)
/* 175:    */   {
/* 176:165 */     int i = BlockType.a(paramatr);
/* 177:166 */     paramj.a("Block type", new k(i, paramatr));
/* 178:    */     
/* 179:    */ 
/* 180:    */ 
/* 181:    */ 
/* 182:    */ 
/* 183:    */ 
/* 184:    */ 
/* 185:    */ 
/* 186:    */ 
/* 187:    */ 
/* 188:177 */     paramj.a("Block data value", new l(paramInt));
/* 189:    */     
/* 190:    */ 
/* 191:    */ 
/* 192:    */ 
/* 193:    */ 
/* 194:    */ 
/* 195:    */ 
/* 196:    */ 
/* 197:    */ 
/* 198:    */ 
/* 199:    */ 
/* 200:    */ 
/* 201:190 */     paramj.a("Block location", new m(paramdt));
/* 202:    */   }
/* 203:    */   
/* 204:    */   public static void a(j paramj, BlockPosition paramdt, Block parambec)
/* 205:    */   {
/* 206:222 */     paramj.a("Block", new p(parambec));
/* 207:    */     
/* 208:    */ 
/* 209:    */ 
/* 210:    */ 
/* 211:    */ 
/* 212:    */ 
/* 213:229 */     paramj.a("Block location", new q(paramdt));
/* 214:    */   }
/* 215:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     j
 * JD-Core Version:    0.7.0.1
 */