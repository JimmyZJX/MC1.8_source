package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class akb
/*   4:    */   extends Item
/*   5:    */ {
/*   6:    */   private ProtoBlock a;
/*   7:    */   
/*   8:    */   public akb(ProtoBlock paramatr)
/*   9:    */   {
/*  10: 19 */     this.maxStackSize = 1;
/*  11: 20 */     this.a = paramatr;
/*  12: 21 */     setTabToDisplayOn(CreativeTabs.tabMisc);
/*  13:    */   }
/*  14:    */   
/*  15:    */   public ItemStack a(ItemStack paramamj, World paramaqu, EntityPlayer paramahd)
/*  16:    */   {
/*  17: 26 */     boolean bool = this.a == BlockList.air;
/*  18:    */     
/*  19: 28 */     HitResult localbru = a(paramaqu, paramahd, bool);
/*  20: 29 */     if (localbru == null) {
/*  21: 30 */       return paramamj;
/*  22:    */     }
/*  23: 33 */     if (localbru.a == brv.BLOCK)
/*  24:    */     {
/*  25: 34 */       BlockPosition localdt = localbru.a();
/*  26: 36 */       if (!paramaqu.a(paramahd, localdt)) {
/*  27: 37 */         return paramamj;
/*  28:    */       }
/*  29:    */       Object localObject;
/*  30: 40 */       if (bool)
/*  31:    */       {
/*  32: 41 */         if (!paramahd.a(localdt.a(localbru.b), localbru.b, paramamj)) {
/*  33: 42 */           return paramamj;
/*  34:    */         }
/*  35: 44 */         localObject = paramaqu.getBlock(localdt);
/*  36: 45 */         Material localbof = ((Block)localObject).getProto().getMaterial();
/*  37: 47 */         if ((localbof == Material.water) && (((Integer)((Block)localObject).getProperty(BlockLiquid.level)).intValue() == 0))
/*  38:    */         {
/*  39: 48 */           paramaqu.g(localdt);
/*  40: 49 */           paramahd.b(StatList.J[Item.b(this)]);
/*  41: 50 */           return a(paramamj, paramahd, ItemList.ax);
/*  42:    */         }
/*  43: 53 */         if ((localbof == Material.lava) && (((Integer)((Block)localObject).getProperty(BlockLiquid.level)).intValue() == 0))
/*  44:    */         {
/*  45: 54 */           paramaqu.g(localdt);
/*  46: 55 */           paramahd.b(StatList.J[Item.b(this)]);
/*  47: 56 */           return a(paramamj, paramahd, ItemList.ay);
/*  48:    */         }
/*  49:    */       }
/*  50:    */       else
/*  51:    */       {
/*  52: 58 */         if (this.a == BlockList.air) {
/*  53: 59 */           return new ItemStack(ItemList.aw);
/*  54:    */         }
/*  55: 61 */         localObject = localdt.a(localbru.b);
/*  56: 63 */         if (!paramahd.a((BlockPosition)localObject, localbru.b, paramamj)) {
/*  57: 64 */           return paramamj;
/*  58:    */         }
/*  59: 67 */         if ((a(paramaqu, (BlockPosition)localObject)) && (!paramahd.by.d))
/*  60:    */         {
/*  61: 68 */           paramahd.b(StatList.J[Item.b(this)]);
/*  62: 69 */           return new ItemStack(ItemList.aw);
/*  63:    */         }
/*  64:    */       }
/*  65:    */     }
/*  66: 74 */     return paramamj;
/*  67:    */   }
/*  68:    */   
/*  69:    */   private ItemStack a(ItemStack paramamj, EntityPlayer paramahd, Item paramalq)
/*  70:    */   {
/*  71: 78 */     if (paramahd.by.d) {
/*  72: 79 */       return paramamj;
/*  73:    */     }
/*  74: 82 */     if (--paramamj.stackSize <= 0) {
/*  75: 83 */       return new ItemStack(paramalq);
/*  76:    */     }
/*  77: 85 */     if (!paramahd.bg.a(new ItemStack(paramalq))) {
/*  78: 86 */       paramahd.a(new ItemStack(paramalq, 1, 0), false);
/*  79:    */     }
/*  80: 88 */     return paramamj;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public boolean a(World paramaqu, BlockPosition paramdt)
/*  84:    */   {
/*  85: 93 */     if (this.a == BlockList.air) {
/*  86: 94 */       return false;
/*  87:    */     }
/*  88: 97 */     Material localbof = paramaqu.getBlock(paramdt).getProto().getMaterial();
/*  89: 98 */     int i = !localbof.a() ? 1 : 0;
/*  90: 99 */     if ((paramaqu.isEmpty(paramdt)) || (i != 0))
/*  91:    */     {
/*  92:100 */       if ((paramaqu.t.n()) && (this.a == BlockList.flowingWater))
/*  93:    */       {
/*  94:101 */         int j = paramdt.getX();
/*  95:102 */         int k = paramdt.getY();
/*  96:103 */         int m = paramdt.getZ();
/*  97:    */         
/*  98:105 */         paramaqu.a(j + 0.5F, k + 0.5F, m + 0.5F, "random.fizz", 0.5F, 2.6F + (paramaqu.rng.nextFloat() - paramaqu.rng.nextFloat()) * 0.8F);
/*  99:107 */         for (int n = 0; n < 8; n++) {
/* 100:108 */           paramaqu.a(ew.m, j + Math.random(), k + Math.random(), m + Math.random(), 0.0D, 0.0D, 0.0D, new int[0]);
/* 101:    */         }
/* 102:    */       }
/* 103:    */       else
/* 104:    */       {
/* 105:111 */         if ((!paramaqu.isClient) && (i != 0) && (!localbof.isLiquid())) {
/* 106:112 */           paramaqu.b(paramdt, true);
/* 107:    */         }
/* 108:115 */         paramaqu.setBlock(paramdt, this.a.instance(), 3);
/* 109:    */       }
/* 110:118 */       return true;
/* 111:    */     }
/* 112:121 */     return false;
/* 113:    */   }
/* 114:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     akb
 * JD-Core Version:    0.7.0.1
 */