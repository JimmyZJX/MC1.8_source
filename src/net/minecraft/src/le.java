package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;

import java.util.Collection;
/*   3:    */ 
/*   4:    */ public class le
/*   5:    */   implements id<ik>
/*   6:    */ {
/*   7: 22 */   private String a = "";
/*   8: 23 */   private String b = "";
/*   9: 24 */   private String c = "";
/*  10: 25 */   private String d = "";
/*  11: 26 */   private String e = bsg.ALWAYS.e;
/*  12: 27 */   private int f = -1;
/*  13: 28 */   private Collection<String> g = Lists.newArrayList();
/*  14:    */   private int h;
/*  15:    */   private int i;
/*  16:    */   
/*  17:    */   public le() {}
/*  18:    */   
/*  19:    */   public le(brz parambrz, int paramInt)
/*  20:    */   {
/*  21: 36 */     this.a = parambrz.b();
/*  22: 37 */     this.h = paramInt;
/*  23: 39 */     if ((paramInt == 0) || (paramInt == 2))
/*  24:    */     {
/*  25: 40 */       this.b = parambrz.c();
/*  26: 41 */       this.c = parambrz.e();
/*  27: 42 */       this.d = parambrz.f();
/*  28: 43 */       this.i = parambrz.k();
/*  29: 44 */       this.e = parambrz.i().e;
/*  30: 45 */       this.f = parambrz.l().b();
/*  31:    */     }
/*  32: 47 */     if (paramInt == 0) {
/*  33: 48 */       this.g.addAll(parambrz.d());
/*  34:    */     }
/*  35:    */   }
/*  36:    */   
/*  37:    */   public le(brz parambrz, Collection<String> paramCollection, int paramInt)
/*  38:    */   {
/*  39: 53 */     if ((paramInt != 3) && (paramInt != 4)) {
/*  40: 54 */       throw new IllegalArgumentException("Method must be join or leave for player constructor");
/*  41:    */     }
/*  42: 56 */     if ((paramCollection == null) || (paramCollection.isEmpty())) {
/*  43: 57 */       throw new IllegalArgumentException("Players cannot be null/empty");
/*  44:    */     }
/*  45: 60 */     this.h = paramInt;
/*  46: 61 */     this.a = parambrz.b();
/*  47: 62 */     this.g.addAll(paramCollection);
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void fromBuffer(ByteBufWrapper paramhd)
/*  51:    */   {
/*  52: 67 */     this.a = paramhd.c(16);
/*  53: 68 */     this.h = paramhd.readByte();
/*  54: 70 */     if ((this.h == 0) || (this.h == 2))
/*  55:    */     {
/*  56: 71 */       this.b = paramhd.c(32);
/*  57: 72 */       this.c = paramhd.c(16);
/*  58: 73 */       this.d = paramhd.c(16);
/*  59: 74 */       this.i = paramhd.readByte();
/*  60: 75 */       this.e = paramhd.c(32);
/*  61: 76 */       this.f = paramhd.readByte();
/*  62:    */     }
/*  63: 79 */     if ((this.h == 0) || (this.h == 3) || (this.h == 4))
/*  64:    */     {
/*  65: 80 */       int j = paramhd.e();
/*  66: 82 */       for (int k = 0; k < j; k++) {
/*  67: 83 */         this.g.add(paramhd.c(40));
/*  68:    */       }
/*  69:    */     }
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void toBuffer(ByteBufWrapper paramhd)
/*  73:    */   {
/*  74: 90 */     paramhd.a(this.a);
/*  75: 91 */     paramhd.writeByte(this.h);
/*  76: 93 */     if ((this.h == 0) || (this.h == 2))
/*  77:    */     {
/*  78: 94 */       paramhd.a(this.b);
/*  79: 95 */       paramhd.a(this.c);
/*  80: 96 */       paramhd.a(this.d);
/*  81: 97 */       paramhd.writeByte(this.i);
/*  82: 98 */       paramhd.a(this.e);
/*  83: 99 */       paramhd.writeByte(this.f);
/*  84:    */     }
/*  85:102 */     if ((this.h == 0) || (this.h == 3) || (this.h == 4))
/*  86:    */     {
/*  87:103 */       paramhd.b(this.g.size());
/*  88:105 */       for (String str : this.g) {
/*  89:106 */         paramhd.a(str);
/*  90:    */       }
/*  91:    */     }
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void a(ik paramik)
/*  95:    */   {
/*  96:113 */     paramik.a(this);
/*  97:    */   }
/*  98:    */   
/*  99:    */   public String a()
/* 100:    */   {
/* 101:117 */     return this.a;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public String b()
/* 105:    */   {
/* 106:121 */     return this.b;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public String c()
/* 110:    */   {
/* 111:125 */     return this.c;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public String d()
/* 115:    */   {
/* 116:129 */     return this.d;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public Collection<String> e()
/* 120:    */   {
/* 121:133 */     return this.g;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public int f()
/* 125:    */   {
/* 126:137 */     return this.h;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public int g()
/* 130:    */   {
/* 131:141 */     return this.i;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public int h()
/* 135:    */   {
/* 136:145 */     return this.f;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public String i()
/* 140:    */   {
/* 141:149 */     return this.e;
/* 142:    */   }
/* 143:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     le
 * JD-Core Version:    0.7.0.1
 */