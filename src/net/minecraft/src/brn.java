package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Maps;
/*   3:    */ import java.io.DataInputStream;
/*   4:    */ import java.io.DataOutput;
/*   5:    */ import java.io.DataOutputStream;
/*   6:    */ import java.io.File;
/*   7:    */ import java.io.FileInputStream;
/*   8:    */ import java.io.FileOutputStream;
/*  10:    */ import java.util.Iterator;
/*  11:    */ import java.util.List;
/*  12:    */ import java.util.Map;
/*  14:    */ 
/*  15:    */ public class brn
/*  16:    */ {
/*  17:    */   private bqy b;
/*  18: 17 */   protected Map<String,bqc> a = Maps.newHashMap();
/*  19: 18 */   private List<bqc> c = Lists.newArrayList();
/*  20: 19 */   private Map<String,Short> d = Maps.newHashMap();
/*  21:    */   
/*  22:    */   public brn(bqy parambqy)
/*  23:    */   {
/*  24: 22 */     this.b = parambqy;
/*  25: 23 */     b();
/*  26:    */   }
/*  27:    */   
/*  28:    */   public <T> bqc a(Class<T> paramClass, String paramString)
/*  29:    */   {
/*  30: 27 */     bqc localbqc = (bqc)this.a.get(paramString);
/*  31: 28 */     if (localbqc != null) {
/*  32: 29 */       return localbqc;
/*  33:    */     }
/*  34: 32 */     if (this.b != null) {
/*  35:    */       try
/*  36:    */       {
/*  37: 34 */         File localFile = this.b.a(paramString);
/*  38: 35 */         if ((localFile != null) && (localFile.exists()))
/*  39:    */         {
/*  40:    */           try
/*  41:    */           {
/*  42: 37 */             localbqc = (bqc)paramClass.getConstructor(new Class[] { String.class }).newInstance(new Object[] { paramString });
/*  43:    */           }
/*  44:    */           catch (Exception localException2)
/*  45:    */           {
/*  46: 39 */             throw new RuntimeException("Failed to instantiate " + paramClass.toString(), localException2);
/*  47:    */           }
/*  48: 42 */           FileInputStream localFileInputStream = new FileInputStream(localFile);
/*  49: 43 */           NBTTagCompound localfn = fz.a(localFileInputStream);
/*  50: 44 */           localFileInputStream.close();
/*  51:    */           
/*  52: 46 */           localbqc.a(localfn.getCompoundTag("data"));
/*  53:    */         }
/*  54:    */       }
/*  55:    */       catch (Exception localException1)
/*  56:    */       {
/*  57: 49 */         localException1.printStackTrace();
/*  58:    */       }
/*  59:    */     }
/*  60: 53 */     if (localbqc != null)
/*  61:    */     {
/*  62: 54 */       this.a.put(paramString, localbqc);
/*  63: 55 */       this.c.add(localbqc);
/*  64:    */     }
/*  65: 57 */     return localbqc;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public void a(String paramString, bqc parambqc)
/*  69:    */   {
/*  70: 61 */     if (this.a.containsKey(paramString)) {
/*  71: 62 */       this.c.remove(this.a.remove(paramString));
/*  72:    */     }
/*  73: 64 */     this.a.put(paramString, parambqc);
/*  74: 65 */     this.c.add(parambqc);
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void a()
/*  78:    */   {
/*  79: 69 */     for (int i = 0; i < this.c.size(); i++)
/*  80:    */     {
/*  81: 70 */       bqc localbqc = (bqc)this.c.get(i);
/*  82: 71 */       if (localbqc.d())
/*  83:    */       {
/*  84: 72 */         a(localbqc);
/*  85: 73 */         localbqc.a(false);
/*  86:    */       }
/*  87:    */     }
/*  88:    */   }
/*  89:    */   
/*  90:    */   private void a(bqc parambqc)
/*  91:    */   {
/*  92: 79 */     if (this.b == null) {
/*  93: 80 */       return;
/*  94:    */     }
/*  95:    */     try
/*  96:    */     {
/*  97: 83 */       File localFile = this.b.a(parambqc.a);
/*  98: 84 */       if (localFile != null)
/*  99:    */       {
/* 100: 85 */         NBTTagCompound localfn1 = new NBTTagCompound();
/* 101: 86 */         parambqc.b(localfn1);
/* 102:    */         
/* 103: 88 */         NBTTagCompound localfn2 = new NBTTagCompound();
/* 104: 89 */         localfn2.setNBT("data", localfn1);
/* 105:    */         
/* 106: 91 */         FileOutputStream localFileOutputStream = new FileOutputStream(localFile);
/* 107: 92 */         fz.a(localfn2, localFileOutputStream);
/* 108: 93 */         localFileOutputStream.close();
/* 109:    */       }
/* 110:    */     }
/* 111:    */     catch (Exception localException)
/* 112:    */     {
/* 113: 96 */       localException.printStackTrace();
/* 114:    */     }
/* 115:    */   }
/* 116:    */   
/* 117:    */   private void b()
/* 118:    */   {
/* 119:    */     try
/* 120:    */     {
/* 121:102 */       this.d.clear();
/* 122:103 */       if (this.b == null) {
/* 123:104 */         return;
/* 124:    */       }
/* 125:106 */       File localFile = this.b.a("idcounts");
/* 126:107 */       if ((localFile != null) && (localFile.exists()))
/* 127:    */       {
/* 128:108 */         DataInputStream localDataInputStream = new DataInputStream(new FileInputStream(localFile));
/* 129:109 */         NBTTagCompound localfn = fz.a(localDataInputStream);
/* 130:110 */         localDataInputStream.close();
/* 131:112 */         for (String str1 : localfn.c())
/* 132:    */         {
/* 133:113 */           NBTBase localgd = localfn.a(str1);
/* 134:114 */           if ((localgd instanceof gb))
/* 135:    */           {
/* 136:115 */             gb localgb = (gb)localgd;
/* 137:116 */             String str2 = str1;
/* 138:117 */             short s = localgb.e();
/* 139:118 */             this.d.put(str2, Short.valueOf(s));
/* 140:    */           }
/* 141:    */         }
/* 142:    */       }
/* 143:    */     }
/* 144:    */     catch (Exception localException)
/* 145:    */     {
/* 147:123 */       localException.printStackTrace();
/* 148:    */     }
/* 149:    */   }
/* 150:    */   
/* 151:    */   public int a(String paramString)
/* 152:    */   {
/* 153:128 */     Short localShort = (Short)this.d.get(paramString);
/* 154:    */     Object localObject1;
/* 155:    */     Object localObject2;
/* 156:129 */     if (localShort == null)
/* 157:    */     {
/* 158:130 */       localShort = Short.valueOf((short)0);
/* 159:    */     }
/* 160:    */     else
/* 161:    */     {
/* 162:132 */       localObject1 = localShort;localObject2 = localShort = Short.valueOf((short)(localShort.shortValue() + 1));
/* 163:    */     }
/* 164:135 */     this.d.put(paramString, localShort);
/* 165:136 */     if (this.b == null) {
/* 166:137 */       return localShort.shortValue();
/* 167:    */     }
/* 168:    */     try
/* 169:    */     {
/* 170:140 */       localObject1 = this.b.a("idcounts");
/* 171:141 */       if (localObject1 != null)
/* 172:    */       {
/* 173:142 */         localObject2 = new NBTTagCompound();
/* 174:144 */         for (Iterator<String> localObject3 = this.d.keySet().iterator(); localObject3.hasNext();)
/* 175:    */         {
/* 176:144 */           String str = localObject3.next();
/* 177:145 */           short s = this.d.get(str).shortValue();
/* 178:146 */           ((NBTTagCompound)localObject2).setShort(str, s);
/* 179:    */         }
/* 180:149 */         DataOutputStream localObject3 = new DataOutputStream(new FileOutputStream((File)localObject1));
/* 181:150 */         fz.a((NBTTagCompound)localObject2, (DataOutput)localObject3);
/* 182:151 */         ((DataOutputStream)localObject3).close();
/* 183:    */       }
/* 184:    */     }
/* 185:    */     catch (Exception localException)
/* 186:    */     {
/* 187:154 */       localException.printStackTrace();
/* 188:    */     }
/* 189:156 */     return localShort.shortValue();
/* 190:    */   }
/* 191:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     brn
 * JD-Core Version:    0.7.0.1
 */