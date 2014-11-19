package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public class bc
/*   4:    */   extends CommandBase
/*   5:    */ {
/*   6:    */   public String c()
/*   7:    */   {
/*   8: 25 */     return "testforblocks";
/*   9:    */   }
/*  10:    */   
/*  11:    */   public int a()
/*  12:    */   {
/*  13: 30 */     return 2;
/*  14:    */   }
/*  15:    */   
/*  16:    */   public String c(ICommandSender paramae)
/*  17:    */   {
/*  18: 35 */     return "commands.compare.usage";
/*  19:    */   }
/*  20:    */   
/*  21:    */   public void a(ICommandSender paramae, String[] paramArrayOfString) throws CommandException
/*  22:    */   {
/*  23: 40 */     if (paramArrayOfString.length < 9) {
/*  24: 41 */       throw new WrongUsageException("commands.compare.usage", new Object[0]);
/*  25:    */     }
/*  26: 43 */     paramae.a(ag.b, 0);
/*  27:    */     
/*  28: 45 */     BlockPosition localdt1 = a(paramae, paramArrayOfString, 0, false);
/*  29: 46 */     BlockPosition localdt2 = a(paramae, paramArrayOfString, 3, false);
/*  30: 47 */     BlockPosition localdt3 = a(paramae, paramArrayOfString, 6, false);
/*  31:    */     
/*  32: 49 */     bjb localbjb1 = new bjb(localdt1, localdt2);
/*  33: 50 */     bjb localbjb2 = new bjb(localdt3, localdt3.offset(localbjb1.b()));
/*  34:    */     
/*  35: 52 */     int i = localbjb1.c() * localbjb1.d() * localbjb1.e();
/*  36: 53 */     if (i > 524288) {
/*  37: 54 */       throw new CommandException("commands.compare.tooManyBlocks", new Object[] { Integer.valueOf(i), Integer.valueOf(524288) });
/*  38:    */     }
/*  39: 56 */     if ((localbjb1.b < 0) || (localbjb1.e >= 256) || (localbjb2.b < 0) || (localbjb2.e >= 256)) {
/*  40: 57 */       throw new CommandException("commands.compare.outOfWorld", new Object[0]);
/*  41:    */     }
/*  42: 59 */     World localaqu = paramae.e();
/*  43: 60 */     if ((!localaqu.a(localbjb1)) || (!localaqu.a(localbjb2))) {
/*  44: 61 */       throw new CommandException("commands.compare.outOfWorld", new Object[0]);
/*  45:    */     }
/*  46: 64 */     int j = 0;
/*  47: 65 */     if ((paramArrayOfString.length > 9) && 
/*  48: 66 */       (paramArrayOfString[9].equals("masked"))) {
/*  49: 67 */       j = 1;
/*  50:    */     }
/*  51: 71 */     i = 0;
/*  52: 72 */     BlockPosition localdt4 = new BlockPosition(localbjb2.a - localbjb1.a, localbjb2.b - localbjb1.b, localbjb2.c - localbjb1.c);
/*  53: 74 */     for (int k = localbjb1.c; k <= localbjb1.f; k++) {
/*  54: 75 */       for (int m = localbjb1.b; m <= localbjb1.e; m++) {
/*  55: 76 */         for (int n = localbjb1.a; n <= localbjb1.d; n++)
/*  56:    */         {
/*  57: 77 */           BlockPosition localdt5 = new BlockPosition(n, m, k);
/*  58: 78 */           BlockPosition localdt6 = localdt5.offset(localdt4);
/*  59:    */           
/*  60: 80 */           int i1 = 0;
/*  61: 81 */           Block localbec = localaqu.getBlock(localdt5);
/*  62: 82 */           if ((j == 0) || (localbec.getProto() != BlockList.air))
/*  63:    */           {
/*  64: 85 */             if (localbec == localaqu.getBlock(localdt6))
/*  65:    */             {
/*  66: 86 */               bcm localbcm1 = localaqu.s(localdt5);
/*  67: 87 */               bcm localbcm2 = localaqu.s(localdt6);
/*  68: 88 */               if ((localbcm1 != null) && (localbcm2 != null))
/*  69:    */               {
/*  70: 89 */                 NBTTagCompound localfn1 = new NBTTagCompound();
/*  71: 90 */                 localbcm1.writeToNBT(localfn1);
/*  72: 91 */                 localfn1.o("x");
/*  73: 92 */                 localfn1.o("y");
/*  74: 93 */                 localfn1.o("z");
/*  75:    */                 
/*  76: 95 */                 NBTTagCompound localfn2 = new NBTTagCompound();
/*  77: 96 */                 localbcm2.writeToNBT(localfn2);
/*  78: 97 */                 localfn2.o("x");
/*  79: 98 */                 localfn2.o("y");
/*  80: 99 */                 localfn2.o("z");
/*  81:101 */                 if (!localfn1.equals(localfn2)) {
/*  82:102 */                   i1 = 1;
/*  83:    */                 }
/*  84:    */               }
/*  85:104 */               else if (localbcm1 != null)
/*  86:    */               {
/*  87:105 */                 i1 = 1;
/*  88:    */               }
/*  89:    */             }
/*  90:    */             else
/*  91:    */             {
/*  92:108 */               i1 = 1;
/*  93:    */             }
/*  94:111 */             i++;
/*  95:112 */             if (i1 != 0) {
/*  96:113 */               throw new CommandException("commands.compare.failed", new Object[0]);
/*  97:    */             }
/*  98:    */           }
/*  99:    */         }
/* 100:    */       }
/* 101:    */     }
/* 102:119 */     paramae.a(ag.b, i);
/* 103:120 */     a(paramae, this, "commands.compare.success", new Object[] { Integer.valueOf(i) });
/* 104:    */   }
/* 105:    */   
/* 106:    */   public List a(ICommandSender paramae, String[] paramArrayOfString, BlockPosition paramdt)
/* 107:    */   {
/* 108:126 */     if ((paramArrayOfString.length > 0) && (paramArrayOfString.length <= 3)) {
/* 109:127 */       return a(paramArrayOfString, 0, paramdt);
/* 110:    */     }
/* 111:128 */     if ((paramArrayOfString.length > 3) && (paramArrayOfString.length <= 6)) {
/* 112:129 */       return a(paramArrayOfString, 3, paramdt);
/* 113:    */     }
/* 114:130 */     if ((paramArrayOfString.length > 6) && (paramArrayOfString.length <= 9)) {
/* 115:131 */       return a(paramArrayOfString, 6, paramdt);
/* 116:    */     }
/* 117:132 */     if (paramArrayOfString.length == 10) {
/* 118:133 */       return a(paramArrayOfString, new String[] { "masked", "all" });
/* 119:    */     }
/* 120:136 */     return null;
/* 121:    */   }
/* 122:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bc
 * JD-Core Version:    0.7.0.1
 */