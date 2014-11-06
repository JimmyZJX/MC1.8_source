package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.List;
/*   3:    */ import java.util.Random;
/*   4:    */ 
/*   5:    */ public class bji
/*   6:    */   extends bms
/*   7:    */ {
/*   8: 82 */   private List<bjb> a = Lists.newLinkedList();
/*   9:    */   
/*  10:    */   public bji() {}
/*  11:    */   
/*  12:    */   public bji(int paramInt1, Random paramRandom, int paramInt2, int paramInt3)
/*  13:    */   {
/*  14: 89 */     super(paramInt1);
/*  15:    */     
/*  16: 91 */     this.l = new bjb(paramInt2, 50, paramInt3, paramInt2 + 7 + paramRandom.nextInt(6), 54 + paramRandom.nextInt(6), paramInt3 + 7 + paramRandom.nextInt(6));
/*  17:    */   }
/*  18:    */   
/*  19:    */   public void a(bms parambms, List<bms> paramList, Random paramRandom)
/*  20:    */   {
/*  21: 96 */     int i = d();
/*  22:    */     
/*  23:    */ 
/*  24:    */ 
/*  25:100 */     int k = this.l.d() - 3 - 1;
/*  26:101 */     if (k <= 0) {
/*  27:102 */       k = 1;
/*  28:    */     }
/*  29:106 */     int j = 0;
/*  30:    */     bms localbms;
/*  31:    */     bjb localbjb;
/*  32:107 */     while (j < this.l.c())
/*  33:    */     {
/*  34:108 */       j += paramRandom.nextInt(this.l.c());
/*  35:109 */       if (j + 3 > this.l.c()) {
/*  36:    */         break;
/*  37:    */       }
/*  38:112 */       localbms = bje.a(parambms, paramList, paramRandom, this.l.a + j, this.l.b + paramRandom.nextInt(k) + 1, this.l.c - 1, EnumDirection.NORTH, i);
/*  39:113 */       if (localbms != null)
/*  40:    */       {
/*  41:114 */         localbjb = localbms.c();
/*  42:115 */         this.a.add(new bjb(localbjb.a, localbjb.b, this.l.c, localbjb.d, localbjb.e, this.l.c + 1));
/*  43:    */       }
/*  44:117 */       j += 4;
/*  45:    */     }
/*  46:120 */     j = 0;
/*  47:121 */     while (j < this.l.c())
/*  48:    */     {
/*  49:122 */       j += paramRandom.nextInt(this.l.c());
/*  50:123 */       if (j + 3 > this.l.c()) {
/*  51:    */         break;
/*  52:    */       }
/*  53:126 */       localbms = bje.a(parambms, paramList, paramRandom, this.l.a + j, this.l.b + paramRandom.nextInt(k) + 1, this.l.f + 1, EnumDirection.SOUTH, i);
/*  54:127 */       if (localbms != null)
/*  55:    */       {
/*  56:128 */         localbjb = localbms.c();
/*  57:129 */         this.a.add(new bjb(localbjb.a, localbjb.b, this.l.f - 1, localbjb.d, localbjb.e, this.l.f));
/*  58:    */       }
/*  59:131 */       j += 4;
/*  60:    */     }
/*  61:134 */     j = 0;
/*  62:135 */     while (j < this.l.e())
/*  63:    */     {
/*  64:136 */       j += paramRandom.nextInt(this.l.e());
/*  65:137 */       if (j + 3 > this.l.e()) {
/*  66:    */         break;
/*  67:    */       }
/*  68:140 */       localbms = bje.a(parambms, paramList, paramRandom, this.l.a - 1, this.l.b + paramRandom.nextInt(k) + 1, this.l.c + j, EnumDirection.WEST, i);
/*  69:141 */       if (localbms != null)
/*  70:    */       {
/*  71:142 */         localbjb = localbms.c();
/*  72:143 */         this.a.add(new bjb(this.l.a, localbjb.b, localbjb.c, this.l.a + 1, localbjb.e, localbjb.f));
/*  73:    */       }
/*  74:145 */       j += 4;
/*  75:    */     }
/*  76:148 */     j = 0;
/*  77:149 */     while (j < this.l.e())
/*  78:    */     {
/*  79:150 */       j += paramRandom.nextInt(this.l.e());
/*  80:151 */       if (j + 3 > this.l.e()) {
/*  81:    */         break;
/*  82:    */       }
/*  83:154 */       localbms = bje.a(parambms, paramList, paramRandom, this.l.d + 1, this.l.b + paramRandom.nextInt(k) + 1, this.l.c + j, EnumDirection.EAST, i);
/*  84:155 */       if (localbms != null)
/*  85:    */       {
/*  86:156 */         localbjb = localbms.c();
/*  87:157 */         this.a.add(new bjb(this.l.d - 1, localbjb.b, localbjb.c, this.l.d, localbjb.e, localbjb.f));
/*  88:    */       }
/*  89:159 */       j += 4;
/*  90:    */     }
/*  91:    */   }
/*  92:    */   
/*  93:    */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/*  94:    */   {
/*  95:165 */     if (a(paramaqu, parambjb)) {
/*  96:166 */       return false;
/*  97:    */     }
/*  98:170 */     a(paramaqu, parambjb, this.l.a, this.l.b, this.l.c, this.l.d, this.l.b, this.l.f, BlockList.dirt.instance(), BlockList.air.instance(), true);
/*  99:    */     
/* 100:    */ 
/* 101:173 */     a(paramaqu, parambjb, this.l.a, this.l.b + 1, this.l.c, this.l.d, Math.min(this.l.b + 3, this.l.e), this.l.f, BlockList.air.instance(), BlockList.air.instance(), false);
/* 102:174 */     for (bjb localbjb : this.a) {
/* 103:175 */       a(paramaqu, parambjb, localbjb.a, localbjb.e - 2, localbjb.c, localbjb.d, localbjb.e, localbjb.f, BlockList.air.instance(), BlockList.air.instance(), false);
/* 104:    */     }
/* 105:177 */     a(paramaqu, parambjb, this.l.a, this.l.b + 4, this.l.c, this.l.d, this.l.e, this.l.f, BlockList.air.instance(), false);
/* 106:    */     
/* 107:179 */     return true;
/* 108:    */   }
/* 109:    */   
/* 110:    */   protected void a(NBTTagCompound paramfn)
/* 111:    */   {
/* 112:184 */     fv localfv = new fv();
/* 113:185 */     for (bjb localbjb : this.a) {
/* 114:186 */       localfv.a(localbjb.g());
/* 115:    */     }
/* 116:188 */     paramfn.setNBT("Entrances", localfv);
/* 117:    */   }
/* 118:    */   
/* 119:    */   protected void b(NBTTagCompound paramfn)
/* 120:    */   {
/* 121:193 */     fv localfv = paramfn.c("Entrances", 11);
/* 122:194 */     for (int i = 0; i < localfv.c(); i++) {
/* 123:195 */       this.a.add(new bjb(localfv.c(i)));
/* 124:    */     }
/* 125:    */   }
/* 126:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bji
 * JD-Core Version:    0.7.0.1
 */