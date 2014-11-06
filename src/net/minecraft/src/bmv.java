package net.minecraft.src;
/*   1:    */ import java.util.Iterator;
/*   2:    */ import java.util.LinkedList;
/*   3:    */ import java.util.Random;
/*   4:    */ 
/*   5:    */ public abstract class bmv
/*   6:    */ {
/*   7: 14 */   protected LinkedList<bms> a = new LinkedList<bms>();
/*   8:    */   protected bjb b;
/*   9:    */   private int c;
/*  10:    */   private int d;
/*  11:    */   
/*  12:    */   public bmv() {}
/*  13:    */   
/*  14:    */   public bmv(int paramInt1, int paramInt2)
/*  15:    */   {
/*  16: 24 */     this.c = paramInt1;
/*  17: 25 */     this.d = paramInt2;
/*  18:    */   }
/*  19:    */   
/*  20:    */   public bjb a()
/*  21:    */   {
/*  22: 29 */     return this.b;
/*  23:    */   }
/*  24:    */   
/*  25:    */   public LinkedList<bms> b()
/*  26:    */   {
/*  27: 33 */     return this.a;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void a(World paramaqu, Random paramRandom, bjb parambjb)
/*  31:    */   {
/*  32: 37 */     Iterator<bms> localIterator = this.a.iterator();
/*  33: 38 */     while (localIterator.hasNext())
/*  34:    */     {
/*  35: 39 */       bms localbms = (bms)localIterator.next();
/*  36: 40 */       if ((localbms.c().a(parambjb)) && 
/*  37: 41 */         (!localbms.a(paramaqu, paramRandom, parambjb))) {
/*  38: 42 */         localIterator.remove();
/*  39:    */       }
/*  40:    */     }
/*  41:    */   }
/*  42:    */   
/*  43:    */   protected void c()
/*  44:    */   {
/*  45: 49 */     this.b = bjb.a();
/*  46: 51 */     for (bms localbms : this.a) {
/*  47: 52 */       this.b.b(localbms.c());
/*  48:    */     }
/*  49:    */   }
/*  50:    */   
/*  51:    */   public NBTTagCompound a(int paramInt1, int paramInt2)
/*  52:    */   {
/*  53: 57 */     NBTTagCompound localfn = new NBTTagCompound();
/*  54:    */     
/*  55: 59 */     localfn.setString("id", bmq.a(this));
/*  56: 60 */     localfn.setInt("ChunkX", paramInt1);
/*  57: 61 */     localfn.setInt("ChunkZ", paramInt2);
/*  58: 62 */     localfn.setNBT("BB", this.b.g());
/*  59:    */     
/*  60: 64 */     fv localfv = new fv();
/*  61: 65 */     for (bms localbms : this.a) {
/*  62: 66 */       localfv.a(localbms.b());
/*  63:    */     }
/*  64: 68 */     localfn.setNBT("Children", localfv);
/*  65:    */     
/*  66: 70 */     a(localfn);
/*  67:    */     
/*  68: 72 */     return localfn;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void a(NBTTagCompound paramfn) {}
/*  72:    */   
/*  73:    */   public void a(World paramaqu, NBTTagCompound paramfn)
/*  74:    */   {
/*  75: 79 */     this.c = paramfn.getInteger("ChunkX");
/*  76: 80 */     this.d = paramfn.getInteger("ChunkZ");
/*  77: 81 */     if (paramfn.c("BB")) {
/*  78: 82 */       this.b = new bjb(paramfn.l("BB"));
/*  79:    */     }
/*  80: 85 */     fv localfv = paramfn.c("Children", 10);
/*  81: 86 */     for (int i = 0; i < localfv.c(); i++) {
/*  82: 87 */       this.a.add(bmq.b(localfv.b(i), paramaqu));
/*  83:    */     }
/*  84: 90 */     b(paramfn);
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void b(NBTTagCompound paramfn) {}
/*  88:    */   
/*  89:    */   protected void a(World paramaqu, Random paramRandom, int paramInt)
/*  90:    */   {
/*  91: 97 */     int i = 63 - paramInt;
/*  92:    */     
/*  93:    */ 
/*  94:100 */     int j = this.b.d() + 1;
/*  95:102 */     if (j < i) {
/*  96:103 */       j += paramRandom.nextInt(i - j);
/*  97:    */     }
/*  98:107 */     int k = j - this.b.e;
/*  99:108 */     this.b.a(0, k, 0);
/* 100:109 */     for (bms localbms : this.a) {
/* 101:110 */       localbms.c().a(0, k, 0);
/* 102:    */     }
/* 103:    */   }
/* 104:    */   
/* 105:    */   protected void a(World paramaqu, Random paramRandom, int paramInt1, int paramInt2)
/* 106:    */   {
/* 107:115 */     int i = paramInt2 - paramInt1 + 1 - this.b.d();
/* 108:116 */     int j = 1;
/* 109:118 */     if (i > 1) {
/* 110:119 */       j = paramInt1 + paramRandom.nextInt(i);
/* 111:    */     } else {
/* 112:121 */       j = paramInt1;
/* 113:    */     }
/* 114:125 */     int k = j - this.b.b;
/* 115:126 */     this.b.a(0, k, 0);
/* 116:127 */     for (bms localbms : this.a) {
/* 117:128 */       localbms.c().a(0, k, 0);
/* 118:    */     }
/* 119:    */   }
/* 120:    */   
/* 121:    */   public boolean d()
/* 122:    */   {
/* 123:133 */     return true;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public boolean a(ChunkID paramaqm)
/* 127:    */   {
/* 128:137 */     return true;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public void b(ChunkID paramaqm) {}
/* 132:    */   
/* 133:    */   public int e()
/* 134:    */   {
/* 135:144 */     return this.c;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public int f()
/* 139:    */   {
/* 140:148 */     return this.d;
/* 141:    */   }
/* 142:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bmv
 * JD-Core Version:    0.7.0.1
 */