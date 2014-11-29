package net.minecraft.src;
/*   1:    */ public class cll
/*   2:    */   implements cvl
/*   3:    */ {
/*   4:    */   private clc a;
/*   5:    */   private final bto b;
/*   6: 26 */   private final cln c = new cln();
/*   7: 27 */   private final clb d = new clb();
/*   8: 28 */   private final clm e = new clm();
/*   9:    */   
/*  10:    */   public cll(clc paramclc, bto parambto)
/*  11:    */   {
/*  12: 31 */     this.a = paramclc;
/*  13: 32 */     this.b = parambto;
/*  14:    */   }
/*  15:    */   
/*  16:    */   public clc a()
/*  17:    */   {
/*  18: 36 */     return this.a;
/*  19:    */   }
/*  20:    */   
/*  21:    */   public void a(Block parambec, BlockPosition paramdt, cue paramcue, IBlockAccess paramard)
/*  22:    */   {
/*  23: 40 */     BlockType localatr = parambec.getType();
/*  24: 41 */     int i = localatr.b();
/*  25: 42 */     if (i != 3) {
/*  26: 43 */       return;
/*  27:    */     }
/*  28: 46 */     parambec = localatr.a(parambec, paramard, paramdt);
/*  29:    */     
/*  30: 48 */     cxe localcxe1 = this.a.b(parambec);
/*  31: 49 */     cxe localcxe2 = new cxn(localcxe1, paramcue).b();
/*  32: 50 */     this.c.a(paramard, localcxe2, parambec, paramdt, ckx.getInstance().getBuffer());
/*  33:    */   }
/*  34:    */   
/*  35:    */   public boolean a(Block parambec, BlockPosition paramdt, IBlockAccess paramard, VertexBuffer paramciv)
/*  36:    */   {
/*  37:    */     try
/*  38:    */     {
/*  39: 55 */       int i = parambec.getType().b();
/*  40: 56 */       if (i == -1) {
/*  41: 57 */         return false;
/*  42:    */       }
/*  43: 59 */       switch (i)
/*  44:    */       {
/*  45:    */       case 3: 
/*  46: 61 */         cxe localObject = a(parambec, paramard, paramdt);
/*  47: 62 */         return this.c.a(paramard, (cxe)localObject, parambec, paramdt, paramciv);
/*  48:    */       case 2: 
/*  49: 65 */         return false;
/*  50:    */       case 1: 
/*  51: 67 */         return this.e.a(paramard, parambec, paramdt, paramciv);
/*  52:    */       }
/*  53:    */     }
/*  54:    */     catch (Throwable localThrowable)
/*  55:    */     {
/*  56: 70 */       Object localObject = net.minecraft.src.b.a(localThrowable, "Tesselating block in world");
/*  57: 71 */       j localj = ((b)localObject).a("Block being tesselated");
/*  58:    */       
/*  59: 73 */       j.a(localj, paramdt, parambec.getType(), parambec.getType().c(parambec));
/*  60:    */       
/*  61: 75 */       throw new u((b)localObject);
/*  62:    */     }
/*  63: 77 */     return false;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public cln b()
/*  67:    */   {
/*  68: 81 */     return this.c;
/*  69:    */   }
/*  70:    */   
/*  71:    */   private cxe a(Block parambec, BlockPosition paramdt)
/*  72:    */   {
/*  73: 85 */     cxe localcxe = this.a.b(parambec);
/*  74: 86 */     if ((paramdt != null) && (this.b.u) && ((localcxe instanceof cxo))) {
/*  75: 87 */       localcxe = ((cxo)localcxe).a(MathUtils.a(paramdt));
/*  76:    */     }
/*  77: 89 */     return localcxe;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public cxe a(Block parambec, IBlockAccess paramard, BlockPosition paramdt)
/*  81:    */   {
/*  82: 93 */     BlockType localatr = parambec.getType();
/*  83: 94 */     if (paramard.G() != WorldType.DEBUG_ALL_BLOCK_STATES) {
/*  84:    */       try
/*  85:    */       {
/*  86: 96 */         parambec = localatr.a(parambec, paramard, paramdt);
/*  87:    */       }
/*  88:    */       catch (Exception localException) {}
/*  89:    */     }
/*  90:101 */     cxe localcxe = this.a.b(parambec);
/*  91:102 */     if ((paramdt != null) && (this.b.u) && ((localcxe instanceof cxo))) {
/*  92:103 */       localcxe = ((cxo)localcxe).a(MathUtils.a(paramdt));
/*  93:    */     }
/*  94:106 */     return localcxe;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void a(Block parambec, float paramFloat)
/*  98:    */   {
/*  99:110 */     int i = parambec.getType().b();
/* 100:111 */     if (i == -1) {
/* 101:112 */       return;
/* 102:    */     }
/* 103:115 */     switch (i)
/* 104:    */     {
/* 105:    */     case 3: 
/* 106:117 */       cxe localcxe = a(parambec, null);
/* 107:118 */       this.c.a(localcxe, parambec, paramFloat, true);
/* 108:119 */       break;
/* 109:    */     case 2: 
/* 110:121 */       this.d.a(parambec.getType(), paramFloat);
/* 111:122 */       break;
/* 112:    */     }
/* 113:    */   }
/* 114:    */   
/* 115:    */   public boolean a(BlockType paramatr, int paramInt)
/* 116:    */   {
/* 117:131 */     if (paramatr == null) {
/* 118:132 */       return false;
/* 119:    */     }
/* 120:135 */     int i = paramatr.b();
/* 121:136 */     if (i == 3) {
/* 122:137 */       return false;
/* 123:    */     }
/* 124:140 */     return i == 2;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public void a(cvk paramcvk)
/* 128:    */   {
/* 129:145 */     this.e.a();
/* 130:    */   }
/* 131:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cll
 * JD-Core Version:    0.7.0.1
 */