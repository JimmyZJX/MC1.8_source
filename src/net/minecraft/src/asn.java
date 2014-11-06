package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ import java.util.Random;
/*  3:   */ 
/*  4:   */ public class asn
/*  5:   */   extends arm
/*  6:   */ {
/*  7:   */   protected boolean aD;
/*  8:   */   
/*  9:   */   protected asn(int paramInt)
/* 10:   */   {
/* 11:15 */     super(paramInt);
/* 12:   */     
/* 13:17 */     a(0.8F, 0.4F);
/* 14:18 */     a(e);
/* 15:   */     
/* 16:20 */     this.au.add(new SpawnListEntry(EntityHorse.class, 5, 2, 6));
/* 17:   */     
/* 18:22 */     this.as.A = -999;
/* 19:23 */     this.as.B = 4;
/* 20:24 */     this.as.C = 10;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public EnumFlowerVariant a(Random paramRandom, BlockPosition paramdt)
/* 24:   */   {
/* 25:29 */     double d = af.a(paramdt.getX() / 200.0D, paramdt.getZ() / 200.0D);
/* 26:   */     int i;
/* 27:30 */     if (d < -0.8D)
/* 28:   */     {
/* 29:31 */       i = paramRandom.nextInt(4);
/* 30:32 */       switch (i)
/* 31:   */       {
/* 32:   */       case 0: 
/* 33:34 */         return EnumFlowerVariant.g;
/* 34:   */       case 1: 
/* 35:36 */         return EnumFlowerVariant.f;
/* 36:   */       case 2: 
/* 37:38 */         return EnumFlowerVariant.i;
/* 38:   */       }
/* 39:41 */       return EnumFlowerVariant.h;
/* 40:   */     }
/* 41:44 */     if (paramRandom.nextInt(3) > 0)
/* 42:   */     {
/* 43:45 */       i = paramRandom.nextInt(3);
/* 44:46 */       if (i == 0) {
/* 45:47 */         return EnumFlowerVariant.b;
/* 46:   */       }
/* 47:48 */       if (i == 1) {
/* 48:49 */         return EnumFlowerVariant.e;
/* 49:   */       }
/* 50:51 */       return EnumFlowerVariant.j;
/* 51:   */     }
/* 52:54 */     return EnumFlowerVariant.a;
/* 53:   */   }
/* 54:   */   
/* 55:   */   public void a(World paramaqu, Random paramRandom, BlockPosition paramdt)
/* 56:   */   {
/* 57:60 */     double d = af.a((paramdt.getX() + 8) / 200.0D, (paramdt.getZ() + 8) / 200.0D);
/* 58:   */     int i;
/* 59:   */     int j;
/* 60:   */     int k;
/* 61:   */     int m;
/* 62:61 */     if (d < -0.8D)
/* 63:   */     {
/* 64:62 */       this.as.B = 15;
/* 65:63 */       this.as.C = 5;
/* 66:   */     }
/* 67:   */     else
/* 68:   */     {
/* 69:65 */       this.as.B = 4;
/* 70:66 */       this.as.C = 10;
/* 71:   */       
/* 72:68 */       ag.a(avk.c);
/* 73:69 */       for (i = 0; i < 7; i++)
/* 74:   */       {
/* 75:70 */         j = paramRandom.nextInt(16) + 8;
/* 76:71 */         k = paramRandom.nextInt(16) + 8;
/* 77:72 */         m = paramRandom.nextInt(paramaqu.m(paramdt.offset(j, 0, k)).getY() + 32);
/* 78:73 */         ag.generate(paramaqu, paramRandom, paramdt.offset(j, m, k));
/* 79:   */       }
/* 80:   */     }
/* 81:76 */     if (this.aD)
/* 82:   */     {
/* 83:77 */       ag.a(avk.a);
/* 84:78 */       for (i = 0; i < 10; i++)
/* 85:   */       {
/* 86:79 */         j = paramRandom.nextInt(16) + 8;
/* 87:80 */         k = paramRandom.nextInt(16) + 8;
/* 88:81 */         m = paramRandom.nextInt(paramaqu.m(paramdt.offset(j, 0, k)).getY() + 32);
/* 89:82 */         ag.generate(paramaqu, paramRandom, paramdt.offset(j, m, k));
/* 90:   */       }
/* 91:   */     }
/* 92:85 */     super.a(paramaqu, paramRandom, paramdt);
/* 93:   */   }
/* 94:   */   
/* 95:   */   protected arm d(int paramInt)
/* 96:   */   {
/* 97:90 */     asn localasn = new asn(paramInt);
/* 98:91 */     localasn.a("Sunflower Plains");
/* 99:92 */     localasn.aD = true;
/* :0:93 */     localasn.b(9286496);
/* :1:94 */     localasn.aj = 14273354;
/* :2:95 */     return localasn;
/* :3:   */   }
/* :4:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     asn
 * JD-Core Version:    0.7.0.1
 */