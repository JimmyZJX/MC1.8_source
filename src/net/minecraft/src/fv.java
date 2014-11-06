package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;

/*   2:    */ import java.io.DataInput;
/*   3:    */ import java.io.DataOutput;
import java.io.IOException;
/*   4:    */ import java.util.List;

/*   5:    */ import org.apache.logging.log4j.LogManager;
/*   6:    */ import org.apache.logging.log4j.Logger;
/*   7:    */ 
/*   8:    */ public class fv
/*   9:    */   extends NBTBase
/*  10:    */ {
/*  11: 15 */   private static final Logger b = LogManager.getLogger();
/*  12: 17 */   private List<NBTBase> c = Lists.newArrayList();
/*  13: 18 */   private byte d = 0;
/*  14:    */   
/*  15:    */   void a(DataOutput paramDataOutput) throws IOException
/*  16:    */   {
/*  17: 25 */     if (!this.c.isEmpty()) {
/*  18: 26 */       this.d = this.c.get(0).a();
/*  19:    */     } else {
/*  20: 28 */       this.d = 0;
/*  21:    */     }
/*  22: 31 */     paramDataOutput.writeByte(this.d);
/*  23: 32 */     paramDataOutput.writeInt(this.c.size());
/*  24: 33 */     for (int i = 0; i < this.c.size(); i++) {
/*  25: 34 */       ((NBTBase)this.c.get(i)).a(paramDataOutput);
/*  26:    */     }
/*  27:    */   }
/*  28:    */   
/*  29:    */   void a(DataInput paramDataInput, int paramInt, fx paramfx) throws IOException
/*  30:    */   {
/*  31: 40 */     if (paramInt > 512) {
/*  32: 41 */       throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
/*  33:    */     }
/*  34: 43 */     paramfx.a(8L);
/*  35: 44 */     this.d = paramDataInput.readByte();
/*  36: 45 */     int i = paramDataInput.readInt();
/*  37:    */     
/*  38: 47 */     this.c = Lists.newArrayList();
/*  39: 48 */     for (int j = 0; j < i; j++)
/*  40:    */     {
/*  41: 49 */       NBTBase localgd = NBTBase.a(this.d);
/*  42: 50 */       localgd.a(paramDataInput, paramInt + 1, paramfx);
/*  43: 51 */       this.c.add(localgd);
/*  44:    */     }
/*  45:    */   }
/*  46:    */   
/*  47:    */   public byte a()
/*  48:    */   {
/*  49: 57 */     return 9;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public String toString()
/*  53:    */   {
/*  54: 62 */     String str = "[";
/*  55: 63 */     int i = 0;
/*  56: 64 */     for (NBTBase localgd : this.c)
/*  57:    */     {
/*  58: 65 */       str = str + "" + i + ':' + localgd + ',';
/*  59: 66 */       i++;
/*  60:    */     }
/*  61: 68 */     return str + "]";
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void a(NBTBase paramgd)
/*  65:    */   {
/*  66: 85 */     if (this.d == 0)
/*  67:    */     {
/*  68: 86 */       this.d = paramgd.a();
/*  69:    */     }
/*  70: 87 */     else if (this.d != paramgd.a())
/*  71:    */     {
/*  72: 88 */       b.warn("Adding mismatching tag types to tag list");
/*  73: 89 */       return;
/*  74:    */     }
/*  75: 91 */     this.c.add(paramgd);
/*  76:    */   }
/*  77:    */   
/*  78:    */   public void a(int paramInt, NBTBase paramgd)
/*  79:    */   {
/*  80: 95 */     if ((paramInt < 0) || (paramInt >= this.c.size()))
/*  81:    */     {
/*  82: 96 */       b.warn("index out of bounds to set tag in tag list");
/*  83: 97 */       return;
/*  84:    */     }
/*  85: 99 */     if (this.d == 0)
/*  86:    */     {
/*  87:100 */       this.d = paramgd.a();
/*  88:    */     }
/*  89:101 */     else if (this.d != paramgd.a())
/*  90:    */     {
/*  91:102 */       b.warn("Adding mismatching tag types to tag list");
/*  92:103 */       return;
/*  93:    */     }
/*  94:105 */     this.c.set(paramInt, paramgd);
/*  95:    */   }
/*  96:    */   
/*  97:    */   public NBTBase a(int paramInt)
/*  98:    */   {
/*  99:109 */     return (NBTBase)this.c.remove(paramInt);
/* 100:    */   }
/* 101:    */   
/* 102:    */   public boolean c_()
/* 103:    */   {
/* 104:125 */     return this.c.isEmpty();
/* 105:    */   }
/* 106:    */   
/* 107:    */   public NBTTagCompound b(int paramInt)
/* 108:    */   {
/* 109:129 */     if ((paramInt < 0) || (paramInt >= this.c.size())) {
/* 110:130 */       return new NBTTagCompound();
/* 111:    */     }
/* 112:132 */     NBTBase localgd = (NBTBase)this.c.get(paramInt);
/* 113:133 */     if (localgd.a() == 10) {
/* 114:134 */       return (NBTTagCompound)localgd;
/* 115:    */     }
/* 116:136 */     return new NBTTagCompound();
/* 117:    */   }
/* 118:    */   
/* 119:    */   public int[] c(int paramInt)
/* 120:    */   {
/* 121:140 */     if ((paramInt < 0) || (paramInt >= this.c.size())) {
/* 122:141 */       return new int[0];
/* 123:    */     }
/* 124:143 */     NBTBase localgd = (NBTBase)this.c.get(paramInt);
/* 125:144 */     if (localgd.a() == 11) {
/* 126:145 */       return ((ft)localgd).c();
/* 127:    */     }
/* 128:147 */     return new int[0];
/* 129:    */   }
/* 130:    */   
/* 131:    */   public double d(int paramInt)
/* 132:    */   {
/* 133:151 */     if ((paramInt < 0) || (paramInt >= this.c.size())) {
/* 134:152 */       return 0.0D;
/* 135:    */     }
/* 136:154 */     NBTBase localgd = (NBTBase)this.c.get(paramInt);
/* 137:155 */     if (localgd.a() == 6) {
/* 138:156 */       return ((fq)localgd).g();
/* 139:    */     }
/* 140:158 */     return 0.0D;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public float e(int paramInt)
/* 144:    */   {
/* 145:162 */     if ((paramInt < 0) || (paramInt >= this.c.size())) {
/* 146:163 */       return 0.0F;
/* 147:    */     }
/* 148:165 */     NBTBase localgd = (NBTBase)this.c.get(paramInt);
/* 149:166 */     if (localgd.a() == 5) {
/* 150:167 */       return ((fs)localgd).h();
/* 151:    */     }
/* 152:169 */     return 0.0F;
/* 153:    */   }
/* 154:    */   
/* 155:    */   public String f(int paramInt)
/* 156:    */   {
/* 157:173 */     if ((paramInt < 0) || (paramInt >= this.c.size())) {
/* 158:174 */       return "";
/* 159:    */     }
/* 160:176 */     NBTBase localgd = (NBTBase)this.c.get(paramInt);
/* 161:177 */     if (localgd.a() == 8) {
/* 162:178 */       return localgd.a_();
/* 163:    */     }
/* 164:180 */     return localgd.toString();
/* 165:    */   }
/* 166:    */   
/* 167:    */   public NBTBase g(int paramInt)
/* 168:    */   {
/* 169:184 */     if ((paramInt < 0) || (paramInt >= this.c.size())) {
/* 170:185 */       return new fr();
/* 171:    */     }
/* 172:187 */     return (NBTBase)this.c.get(paramInt);
/* 173:    */   }
/* 174:    */   
/* 175:    */   public int c()
/* 176:    */   {
/* 177:191 */     return this.c.size();
/* 178:    */   }
/* 179:    */   
/* 180:    */   public NBTBase b()
/* 181:    */   {
/* 182:196 */     fv localfv = new fv();
/* 183:197 */     localfv.d = this.d;
/* 184:198 */     for (NBTBase localgd1 : this.c)
/* 185:    */     {
/* 186:199 */       NBTBase localgd2 = localgd1.b();
/* 187:200 */       localfv.c.add(localgd2);
/* 188:    */     }
/* 189:202 */     return localfv;
/* 190:    */   }
/* 191:    */   
/* 192:    */   public boolean equals(Object paramObject)
/* 193:    */   {
/* 194:207 */     if (super.equals(paramObject))
/* 195:    */     {
/* 196:208 */       fv localfv = (fv)paramObject;
/* 197:209 */       if (this.d == localfv.d) {
/* 198:210 */         return this.c.equals(localfv.c);
/* 199:    */       }
/* 200:    */     }
/* 201:213 */     return false;
/* 202:    */   }
/* 203:    */   
/* 204:    */   public int hashCode()
/* 205:    */   {
/* 206:218 */     return super.hashCode() ^ this.c.hashCode();
/* 207:    */   }
/* 208:    */   
/* 209:    */   public int f()
/* 210:    */   {
/* 211:222 */     return this.d;
/* 212:    */   }
/* 213:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     fv
 * JD-Core Version:    0.7.0.1
 */