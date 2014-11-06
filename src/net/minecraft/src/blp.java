package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;

/*   2:    */ import java.util.ArrayList;
/*   3:    */ import java.util.LinkedList;
/*   4:    */ import java.util.List;
/*   5:    */ import java.util.Map;
/*   6:    */ import java.util.Map.Entry;
/*   7:    */ import java.util.Random;
/*   8:    */ 
/*   9:    */ public class blp
/*  10:    */   extends bmm
/*  11:    */ {
/*  12:    */   private List d;
/*  13:    */   private boolean f;
/*  14: 23 */   private ChunkID[] g = new ChunkID[3];
/*  15: 24 */   private double h = 32.0D;
/*  16: 25 */   private int i = 3;
/*  17:    */   
/*  18:    */   public blp()
/*  19:    */   {
/*  20: 29 */     this.d = Lists.newArrayList();
/*  21: 30 */     for (arm localarm : arm.n()) {
/*  22: 31 */       if ((localarm != null) && (localarm.an > 0.0F)) {
/*  23: 32 */         this.d.add(localarm);
/*  24:    */       }
/*  25:    */     }
/*  26:    */   }
/*  27:    */   
/*  28:    */   public blp(Map<String,String> paramMap)
/*  29:    */   {
/*  30: 38 */     this();
/*  31: 39 */     for (Map.Entry<String,String> localEntry : paramMap.entrySet()) {
/*  32: 40 */       if (((String)localEntry.getKey()).equals("distance")) {
/*  33: 41 */         this.h = MathUtils.getDouble((String)localEntry.getValue(), this.h, 1.0D);
/*  34: 42 */       } else if (((String)localEntry.getKey()).equals("count")) {
/*  35: 43 */         this.g = new ChunkID[MathUtils.getInt((String)localEntry.getValue(), this.g.length, 1)];
/*  36: 44 */       } else if (((String)localEntry.getKey()).equals("spread")) {
/*  37: 45 */         this.i = MathUtils.getInt((String)localEntry.getValue(), this.i, 1);
/*  38:    */       }
/*  39:    */     }
/*  40:    */   }
/*  41:    */   
/*  42:    */   public String a()
/*  43:    */   {
/*  44: 52 */     return "Stronghold";
/*  45:    */   }
/*  46:    */   
/*  47:    */   protected boolean a(int paramInt1, int paramInt2)
/*  48:    */   {
/*  49:    */     Object localObject1;
/*  50: 57 */     if (!this.f)
/*  51:    */     {
/*  52: 58 */       localObject1 = new Random();
/*  53:    */       
/*  54: 60 */       ((Random)localObject1).setSeed(this.c.J());
/*  55:    */       
/*  56: 62 */       double d1 = ((Random)localObject1).nextDouble() * 3.141592653589793D * 2.0D;
/*  57: 63 */       int m = 1;
/*  58: 65 */       for (int n = 0; n < this.g.length; n++)
/*  59:    */       {
/*  60: 66 */         double d2 = (1.25D * m + ((Random)localObject1).nextDouble()) * (this.h * m);
/*  61: 67 */         int i1 = (int)Math.round(Math.cos(d1) * d2);
/*  62: 68 */         int i2 = (int)Math.round(Math.sin(d1) * d2);
/*  63:    */         
/*  64: 70 */         BlockPosition localdt = this.c.v().a((i1 << 4) + 8, (i2 << 4) + 8, 112, this.d, (Random)localObject1);
/*  65: 71 */         if (localdt != null)
/*  66:    */         {
/*  67: 72 */           i1 = localdt.getX() >> 4;
/*  68: 73 */           i2 = localdt.getZ() >> 4;
/*  69:    */         }
/*  70: 76 */         this.g[n] = new ChunkID(i1, i2);
/*  71:    */         
/*  72: 78 */         d1 += 6.283185307179586D * m / this.i;
/*  73: 80 */         if (n == this.i)
/*  74:    */         {
/*  75: 81 */           m += 2 + ((Random)localObject1).nextInt(5);
/*  76: 82 */           this.i += 1 + ((Random)localObject1).nextInt(2);
/*  77:    */         }
/*  78:    */       }
/*  79: 86 */       this.f = true;
/*  80:    */     }
/*  81: 88 */     for (ChunkID localObject2 : this.g) {
/*  82: 89 */       if ((paramInt1 == localObject2.x) && (paramInt2 == localObject2.z)) {
/*  83: 90 */         return true;
/*  84:    */       }
/*  85:    */     }
/*  86: 93 */     return false;
/*  87:    */   }
/*  88:    */   
/*  89:    */   protected List y_()
/*  90:    */   {
/*  91: 98 */     ArrayList localArrayList = Lists.newArrayList();
/*  92: 99 */     for (ChunkID localaqm : this.g) {
/*  93:100 */       if (localaqm != null) {
/*  94:101 */         localArrayList.add(localaqm.getCenterBlockPos(64));
/*  95:    */       }
/*  96:    */     }
/*  97:104 */     return localArrayList;
/*  98:    */   }
/*  99:    */   
/* 100:    */   protected bmv b(int paramInt1, int paramInt2)
/* 101:    */   {
/* 102:109 */     blq localblq = new blq(this.c, this.b, paramInt1, paramInt2);
/* 103:111 */     while ((localblq.b().isEmpty()) || (((bmh)localblq.b().get(0)).b == null)) {
/* 104:113 */       localblq = new blq(this.c, this.b, paramInt1, paramInt2);
/* 105:    */     }
/* 106:116 */     return localblq;
/* 107:    */   }
/* 108:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     blp
 * JD-Core Version:    0.7.0.1
 */