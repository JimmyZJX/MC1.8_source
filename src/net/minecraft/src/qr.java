package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.List;
/*   3:    */ import org.apache.logging.log4j.Logger;
/*   4:    */ 
/*   5:    */ class qr
/*   6:    */ {
/*   7: 29 */   private final List b = Lists.newArrayList();
/*   8:    */   private final ChunkID c;
/*   9: 32 */   private short[] d = new short[64];
/*  10:    */   private int e;
/*  11:    */   private int f;
/*  12:    */   private long g;
				private final qq a;
/*  13:    */   
/*  14:    */   public qr(qq paramqq, int paramInt1, int paramInt2)
/*  15:    */   {
				  a=paramqq;
/*  16: 38 */     this.c = new ChunkID(paramInt1, paramInt2);
/*  17: 39 */     paramqq.a().b.c(paramInt1, paramInt2);
/*  18:    */   }
/*  19:    */   
/*  20:    */   public void a(qw paramqw)
/*  21:    */   {
/*  22: 43 */     if (this.b.contains(paramqw))
/*  23:    */     {
/*  24: 44 */       qq.c().debug("Failed to add player. {} already is in chunk {}, {}", new Object[] { paramqw, Integer.valueOf(this.c.x), Integer.valueOf(this.c.z) });
/*  25: 45 */       return;
/*  26:    */     }
/*  27: 48 */     if (this.b.isEmpty()) {
/*  28: 49 */       this.g = qq.a(this.a).K();
/*  29:    */     }
/*  30: 52 */     this.b.add(paramqw);
/*  31: 53 */     paramqw.f.add(this.c);
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void b(qw paramqw)
/*  35:    */   {
/*  36: 57 */     if (!this.b.contains(paramqw)) {
/*  37: 58 */       return;
/*  38:    */     }
/*  39: 61 */     Chunk localbfh = qq.a(this.a).getChunk(this.c.x, this.c.z);
/*  40: 62 */     if (localbfh.i()) {
/*  41: 63 */       paramqw.a.a(new jq(localbfh, true, 0));
/*  42:    */     }
/*  43: 65 */     this.b.remove(paramqw);
/*  44: 66 */     paramqw.f.remove(this.c);
/*  45: 68 */     if (this.b.isEmpty())
/*  46:    */     {
/*  47: 69 */       long l = this.c.x + 2147483647L | this.c.z + 2147483647L << 32;
/*  48: 70 */       a(localbfh);
/*  49: 71 */       qq.b(this.a).d(l);
/*  50: 72 */       qq.c(this.a).remove(this);
/*  51: 73 */       if (this.e > 0) {
/*  52: 74 */         qq.d(this.a).remove(this);
/*  53:    */       }
/*  54: 76 */       this.a.a().b.b(this.c.x, this.c.z);
/*  55:    */     }
/*  56:    */   }
/*  57:    */   
/*  58:    */   public void a()
/*  59:    */   {
/*  60: 81 */     a(qq.a(this.a).getChunk(this.c.x, this.c.z));
/*  61:    */   }
/*  62:    */   
/*  63:    */   private void a(Chunk parambfh)
/*  64:    */   {
/*  65: 85 */     parambfh.c(parambfh.w() + qq.a(this.a).K() - this.g);
/*  66:    */     
/*  67: 87 */     this.g = qq.a(this.a).K();
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void a(int paramInt1, int paramInt2, int paramInt3)
/*  71:    */   {
/*  72: 91 */     if (this.e == 0) {
/*  73: 92 */       qq.d(this.a).add(this);
/*  74:    */     }
/*  75: 94 */     this.f |= 1 << (paramInt2 >> 4);
/*  76: 96 */     if (this.e < 64)
/*  77:    */     {
/*  78: 97 */       short i = (short)(paramInt1 << 12 | paramInt3 << 8 | paramInt2);
/*  79: 99 */       for (int j = 0; j < this.e; j++) {
/*  80:100 */         if (this.d[j] == i) {
/*  81:101 */           return;
/*  82:    */         }
/*  83:    */       }
/*  84:105 */       this.d[(this.e++)] = i;
/*  85:    */     }
/*  86:    */   }
/*  87:    */   
/*  88:    */   public void a(id paramid)
/*  89:    */   {
/*  90:110 */     for (int i = 0; i < this.b.size(); i++)
/*  91:    */     {
/*  92:111 */       qw localqw = (qw)this.b.get(i);
/*  93:112 */       if (!localqw.f.contains(this.c)) {
/*  94:113 */         localqw.a.a(paramid);
/*  95:    */       }
/*  96:    */     }
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void b()
/* 100:    */   {
/* 101:119 */     if (this.e == 0) {
/* 102:    */       return;
/* 103:    */     }
/* 104:    */     int i;
/* 105:    */     int j;
/* 106:    */     int k;
/* 107:123 */     if (this.e == 1)
/* 108:    */     {
/* 109:124 */       i = (this.d[0] >> 12 & 0xF) + this.c.x * 16;
/* 110:125 */       j = this.d[0] & 0xFF;
/* 111:126 */       k = (this.d[0] >> 8 & 0xF) + this.c.z * 16;
/* 112:    */       
/* 113:128 */       BlockPosition localdt = new BlockPosition(i, j, k);
/* 114:129 */       a(new iw(qq.a(this.a), localdt));
/* 115:130 */       if (qq.a(this.a).getBlock(localdt).getProto().x()) {
/* 116:131 */         a(qq.a(this.a).s(localdt));
/* 117:    */       }
/* 118:    */     }
/* 119:    */     else
/* 120:    */     {
/* 121:    */       int m;
/* 122:    */       Object localObject;
/* 123:133 */       if (this.e == 64)
/* 124:    */       {
/* 125:134 */         i = this.c.x * 16;
/* 126:135 */         j = this.c.z * 16;
/* 127:    */         
/* 128:137 */         a(new jq(qq.a(this.a).getChunk(this.c.x, this.c.z), false, this.f));
/* 129:139 */         for (k = 0; k < 16; k++) {
/* 130:140 */           if ((this.f & 1 << k) != 0)
/* 131:    */           {
/* 132:141 */             m = k << 4;
/* 133:142 */             localObject = qq.a(this.a).a(i, m, j, i + 16, m + 16, j + 16);
/* 134:143 */             for (int n = 0; n < ((List)localObject).size(); n++) {
/* 135:144 */               a((bcm)((List)localObject).get(n));
/* 136:    */             }
/* 137:    */           }
/* 138:    */         }
/* 139:    */       }
/* 140:    */       else
/* 141:    */       {
/* 142:149 */         a(new ja(this.e, this.d, qq.a(this.a).getChunk(this.c.x, this.c.z)));
/* 143:151 */         for (i = 0; i < this.e; i++)
/* 144:    */         {
/* 145:152 */           j = (this.d[i] >> 12 & 0xF) + this.c.x * 16;
/* 146:153 */           k = this.d[i] & 0xFF;
/* 147:154 */           m = (this.d[i] >> 8 & 0xF) + this.c.z * 16;
/* 148:    */           
/* 149:156 */           localObject = new BlockPosition(j, k, m);
/* 150:157 */           if (qq.a(this.a).getBlock((BlockPosition)localObject).getProto().x()) {
/* 151:158 */             a(qq.a(this.a).s((BlockPosition)localObject));
/* 152:    */           }
/* 153:    */         }
/* 154:    */       }
/* 155:    */     }
/* 156:162 */     this.e = 0;
/* 157:163 */     this.f = 0;
/* 158:    */   }
/* 159:    */   
/* 160:    */   private void a(bcm parambcm)
/* 161:    */   {
/* 162:167 */     if (parambcm != null)
/* 163:    */     {
/* 164:168 */       id localid = parambcm.x_();
/* 165:169 */       if (localid != null) {
/* 166:170 */         a(localid);
/* 167:    */       }
/* 168:    */     }
/* 169:    */   }
				static ChunkID a(qr arg0) {return arg0.c;}
				static List b(qr arg0) {return arg0.b;}
/* 170:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     qr
 * JD-Core Version:    0.7.0.1
 */