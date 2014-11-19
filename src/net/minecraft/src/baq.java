package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.ArrayList;
/*   3:    */ import java.util.Iterator;
/*   4:    */ import java.util.LinkedList;
/*   5:    */ import java.util.List;
/*   6:    */ import java.util.Queue;
/*   7:    */ import java.util.Random;
/*   8:    */ 
/*   9:    */ public class baq
/*  10:    */   extends ProtoBlock
/*  11:    */ {
/*  12: 24 */   public static final BlockDataBoolean a = BlockDataBoolean.a("wet");
/*  13:    */   
/*  14:    */   protected baq()
/*  15:    */   {
/*  16: 33 */     super(Material.m);
/*  17: 34 */     j(this.L.b().a(a, Boolean.valueOf(false)));
/*  18: 35 */     setCreativeTab(CreativeTabs.tabBlock);
/*  19:    */   }
/*  20:    */   
/*  21:    */   public int a(Block parambec)
/*  22:    */   {
/*  23: 40 */     return ((Boolean)parambec.getProperty(a)).booleanValue() ? 1 : 0;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public void c(World paramaqu, BlockPosition paramdt, Block parambec)
/*  27:    */   {
/*  28: 45 */     e(paramaqu, paramdt, parambec);
/*  29:    */   }
/*  30:    */   
/*  31:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, ProtoBlock paramatr)
/*  32:    */   {
/*  33: 50 */     e(paramaqu, paramdt, parambec);
/*  34: 51 */     super.a(paramaqu, paramdt, parambec, paramatr);
/*  35:    */   }
/*  36:    */   
/*  37:    */   protected void e(World paramaqu, BlockPosition paramdt, Block parambec)
/*  38:    */   {
/*  39: 55 */     if ((!((Boolean)parambec.getProperty(a)).booleanValue()) && (d(paramaqu, paramdt)))
/*  40:    */     {
/*  41: 57 */       paramaqu.setBlock(paramdt, parambec.a(a, Boolean.valueOf(true)), 2);
/*  42: 58 */       paramaqu.playLevelEvent(2001, paramdt, ProtoBlock.a(BlockList.water));
/*  43:    */     }
/*  44:    */   }
/*  45:    */   
/*  46:    */   private boolean d(World paramaqu, BlockPosition paramdt)
/*  47:    */   {
/*  48: 63 */     LinkedList localLinkedList = Lists.newLinkedList();
/*  49: 64 */     ArrayList localArrayList = Lists.newArrayList();
/*  50: 65 */     localLinkedList.add(new vi(paramdt, Integer.valueOf(0)));
/*  51:    */     
/*  52: 67 */     int i = 0;
/*  53:    */     BlockPosition localdt1;
/*  54: 68 */     while (!localLinkedList.isEmpty())
/*  55:    */     {
/*  56: 69 */       vi localObject = (vi)localLinkedList.poll();
/*  57: 70 */       localdt1 = (BlockPosition)((vi)localObject).a();
/*  58: 71 */       int j = ((Integer)((vi)localObject).b()).intValue();
/*  59: 73 */       for (EnumDirection localej : EnumDirection.values())
/*  60:    */       {
/*  61: 74 */         BlockPosition localdt2 = localdt1.a(localej);
/*  62: 75 */         if (paramaqu.getBlock(localdt2).getProto().getMaterial() == Material.water)
/*  63:    */         {
/*  64: 76 */           paramaqu.setBlock(localdt2, BlockList.air.instance(), 2);
/*  65: 77 */           localArrayList.add(localdt2);
/*  66: 78 */           i++;
/*  67: 79 */           if (j < 6) {
/*  68: 80 */             localLinkedList.add(new vi(localdt2, Integer.valueOf(j + 1)));
/*  69:    */           }
/*  70:    */         }
/*  71:    */       }
/*  72: 84 */       if (i > 64) {
/*  73:    */         break;
/*  74:    */       }
/*  75:    */     }
/*  76: 88 */     for (Object localObject = localArrayList.iterator(); ((Iterator)localObject).hasNext();)
/*  77:    */     {
/*  78: 88 */       localdt1 = (BlockPosition)((Iterator)localObject).next();
/*  79: 89 */       paramaqu.c(localdt1, BlockList.air);
/*  80:    */     }
/*  81: 91 */     return i > 0;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void a(Item paramalq, CreativeTabs paramakf, List paramList)
/*  85:    */   {
/*  86: 96 */     paramList.add(new ItemStack(paramalq, 1, 0));
/*  87: 97 */     paramList.add(new ItemStack(paramalq, 1, 1));
/*  88:    */   }
/*  89:    */   
/*  90:    */   public Block a(int paramInt)
/*  91:    */   {
/*  92:102 */     return instance().a(a, Boolean.valueOf((paramInt & 0x1) == 1));
/*  93:    */   }
/*  94:    */   
/*  95:    */   public int c(Block parambec)
/*  96:    */   {
/*  97:107 */     return ((Boolean)parambec.getProperty(a)).booleanValue() ? 1 : 0;
/*  98:    */   }
/*  99:    */   
/* 100:    */   protected bed e()
/* 101:    */   {
/* 102:112 */     return new bed(this, new IBlockData[] { a });
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void c(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/* 106:    */   {
/* 107:117 */     if (!((Boolean)parambec.getProperty(a)).booleanValue()) {
/* 108:118 */       return;
/* 109:    */     }
/* 110:121 */     EnumDirection localej = EnumDirection.a(paramRandom);
/* 111:122 */     if ((localej == EnumDirection.UP) || (World.isFlatSurface(paramaqu, paramdt.a(localej)))) {
/* 112:123 */       return;
/* 113:    */     }
/* 114:126 */     double d1 = paramdt.getX();
/* 115:127 */     double d2 = paramdt.getY();
/* 116:128 */     double d3 = paramdt.getZ();
/* 117:132 */     if (localej == EnumDirection.DOWN)
/* 118:    */     {
/* 119:133 */       d2 -= 0.05D;
/* 120:134 */       d1 += paramRandom.nextDouble();
/* 121:135 */       d3 += paramRandom.nextDouble();
/* 122:    */     }
/* 123:    */     else
/* 124:    */     {
/* 125:137 */       d2 += paramRandom.nextDouble() * 0.8D;
/* 126:138 */       if (localej.k() == EnumAxis.X)
/* 127:    */       {
/* 128:139 */         d3 += paramRandom.nextDouble();
/* 129:140 */         if (localej == EnumDirection.EAST) {
/* 130:141 */           d1 += 1.1D;
/* 131:    */         } else {
/* 132:143 */           d1 += 0.05D;
/* 133:    */         }
/* 134:    */       }
/* 135:    */       else
/* 136:    */       {
/* 137:146 */         d1 += paramRandom.nextDouble();
/* 138:147 */         if (localej == EnumDirection.SOUTH) {
/* 139:148 */           d3 += 1.1D;
/* 140:    */         } else {
/* 141:150 */           d3 += 0.05D;
/* 142:    */         }
/* 143:    */       }
/* 144:    */     }
/* 145:155 */     paramaqu.a(ew.s, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/* 146:    */   }
/* 147:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     baq
 * JD-Core Version:    0.7.0.1
 */