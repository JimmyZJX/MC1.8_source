package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.ArrayList;
/*   3:    */ import java.util.List;
/*   4:    */ 
/*   5:    */ public class bdy
/*   6:    */ {
/*   7:    */   private final World a;
/*   8:    */   private final BlockPosition b;
/*   9:    */   private final BlockPosition c;
/*  10:    */   private final EnumDirection d;
/*  11: 20 */   private final List e = Lists.newArrayList();
/*  12: 21 */   private final List f = Lists.newArrayList();
/*  13:    */   
/*  14:    */   public bdy(World paramaqu, BlockPosition paramdt, EnumDirection paramej, boolean paramBoolean)
/*  15:    */   {
/*  16: 24 */     this.a = paramaqu;
/*  17: 25 */     this.b = paramdt;
/*  18: 27 */     if (paramBoolean)
/*  19:    */     {
/*  20: 28 */       this.d = paramej;
/*  21: 29 */       this.c = paramdt.a(paramej);
/*  22:    */     }
/*  23:    */     else
/*  24:    */     {
/*  25: 31 */       this.d = paramej.d();
/*  26: 32 */       this.c = paramdt.offset(paramej, 2);
/*  27:    */     }
/*  28:    */   }
/*  29:    */   
/*  30:    */   public boolean a()
/*  31:    */   {
/*  32: 37 */     this.e.clear();
/*  33: 38 */     this.f.clear();
/*  34:    */     
/*  35: 40 */     ProtoBlock localatr = this.a.getBlock(this.c).getProto();
/*  36: 42 */     if (!bdq.a(localatr, this.a, this.c, this.d, false))
/*  37:    */     {
/*  38: 43 */       if (localatr.i() != 1) {
/*  39: 45 */         return false;
/*  40:    */       }
/*  41: 47 */       this.f.add(this.c);
/*  42: 48 */       return true;
/*  43:    */     }
/*  44: 52 */     if (!a(this.c)) {
/*  45: 54 */       return false;
/*  46:    */     }
/*  47: 57 */     for (int i = 0; i < this.e.size(); i++)
/*  48:    */     {
/*  49: 58 */       BlockPosition localdt = (BlockPosition)this.e.get(i);
/*  50: 61 */       if ((this.a.getBlock(localdt).getProto() == BlockList.cE) && 
/*  51: 62 */         (!b(localdt))) {
/*  52: 64 */         return false;
/*  53:    */       }
/*  54:    */     }
/*  55: 69 */     return true;
/*  56:    */   }
/*  57:    */   
/*  58:    */   private boolean a(BlockPosition paramdt)
/*  59:    */   {
/*  60: 73 */     ProtoBlock localatr = this.a.getBlock(paramdt).getProto();
/*  61: 74 */     if (localatr.getMaterial() == Material.air) {
/*  62: 76 */       return true;
/*  63:    */     }
/*  64: 77 */     if (!bdq.a(localatr, this.a, paramdt, this.d, false)) {
/*  65: 79 */       return true;
/*  66:    */     }
/*  67: 80 */     if (paramdt.equals(this.b)) {
/*  68: 82 */       return true;
/*  69:    */     }
/*  70: 83 */     if (this.e.contains(paramdt)) {
/*  71: 85 */       return true;
/*  72:    */     }
/*  73: 88 */     int i = 1;
/*  74: 89 */     if (i + this.e.size() > 12) {
/*  75: 91 */       return false;
/*  76:    */     }
/*  77: 94 */     while (localatr == BlockList.cE)
/*  78:    */     {
/*  79: 95 */       BlockPosition localdt1 = paramdt.offset(this.d.d(), i);
/*  80: 96 */       localatr = this.a.getBlock(localdt1).getProto();
/*  81: 98 */       if ((localatr.getMaterial() == Material.air) || (!bdq.a(localatr, this.a, localdt1, this.d, false)) || (localdt1.equals(this.b))) {
/*  82:    */         break;
/*  83:    */       }
/*  84:101 */       i++;
/*  85:102 */       if (i + this.e.size() > 12) {
/*  86:103 */         return false;
/*  87:    */       }
/*  88:    */     }
/*  89:108 */     int j = 0;
/*  90:111 */     for (int k = i - 1; k >= 0; k--)
/*  91:    */     {
/*  92:112 */       this.e.add(paramdt.offset(this.d.d(), k));
/*  93:113 */       j++;
/*  94:    */     }
/*  95:117 */     for (int k = 1;; k++)
/*  96:    */     {
/*  97:118 */       BlockPosition localdt2 = paramdt.offset(this.d, k);
/*  98:    */       
/*  99:120 */       int m = this.e.indexOf(localdt2);
/* 100:121 */       if (m > -1)
/* 101:    */       {
/* 102:123 */         a(j, m);
/* 103:128 */         for (int n = 0; n <= m + j; n++)
/* 104:    */         {
/* 105:129 */           BlockPosition localdt3 = (BlockPosition)this.e.get(n);
/* 106:130 */           if ((this.a.getBlock(localdt3).getProto() == BlockList.cE) && 
/* 107:131 */             (!b(localdt3))) {
/* 108:132 */             return false;
/* 109:    */           }
/* 110:    */         }
/* 111:137 */         return true;
/* 112:    */       }
/* 113:140 */       localatr = this.a.getBlock(localdt2).getProto();
/* 114:142 */       if (localatr.getMaterial() == Material.air) {
/* 115:144 */         return true;
/* 116:    */       }
/* 117:147 */       if ((!bdq.a(localatr, this.a, localdt2, this.d, true)) || (localdt2.equals(this.b))) {
/* 118:149 */         return false;
/* 119:    */       }
/* 120:152 */       if (localatr.i() == 1)
/* 121:    */       {
/* 122:153 */         this.f.add(localdt2);
/* 123:154 */         return true;
/* 124:    */       }
/* 125:157 */       if (this.e.size() >= 12) {
/* 126:158 */         return false;
/* 127:    */       }
/* 128:161 */       this.e.add(localdt2);
/* 129:162 */       j++;
/* 130:    */     }
/* 131:    */   }
/* 132:    */   
/* 133:    */   private void a(int paramInt1, int paramInt2)
/* 134:    */   {
/* 135:167 */     ArrayList localArrayList1 = Lists.newArrayList();
/* 136:168 */     ArrayList localArrayList2 = Lists.newArrayList();
/* 137:169 */     ArrayList localArrayList3 = Lists.newArrayList();
/* 138:    */     
/* 139:171 */     localArrayList1.addAll(this.e.subList(0, paramInt2));
/* 140:172 */     localArrayList2.addAll(this.e.subList(this.e.size() - paramInt1, this.e.size()));
/* 141:173 */     localArrayList3.addAll(this.e.subList(paramInt2, this.e.size() - paramInt1));
/* 142:    */     
/* 143:175 */     this.e.clear();
/* 144:176 */     this.e.addAll(localArrayList1);
/* 145:177 */     this.e.addAll(localArrayList2);
/* 146:178 */     this.e.addAll(localArrayList3);
/* 147:    */   }
/* 148:    */   
/* 149:    */   private boolean b(BlockPosition paramdt)
/* 150:    */   {
/* 151:182 */     for (EnumDirection localej : EnumDirection.values()) {
/* 152:183 */       if ((localej.k() != this.d.k()) && 
/* 153:184 */         (!a(paramdt.a(localej)))) {
/* 154:185 */         return false;
/* 155:    */       }
/* 156:    */     }
/* 157:190 */     return true;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public List c()
/* 161:    */   {
/* 162:198 */     return this.e;
/* 163:    */   }
/* 164:    */   
/* 165:    */   public List d()
/* 166:    */   {
/* 167:202 */     return this.f;
/* 168:    */   }
/* 169:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bdy
 * JD-Core Version:    0.7.0.1
 */