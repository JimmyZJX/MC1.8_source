package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class BlockRepeater
/*   4:    */   extends ava
/*   5:    */ {
/*   6: 21 */   public static final BlockDataBoolean a = BlockDataBoolean.getInstance("locked");
/*   7: 22 */   public static final BlockDataInteger b = BlockDataInteger.getInstance("delay", 1, 4);
/*   8:    */   
/*   9:    */   protected BlockRepeater(boolean paramBoolean)
/*  10:    */   {
/*  11: 25 */     super(paramBoolean);
/*  12: 26 */     j(this.L.b().setData(N, EnumDirection.NORTH).setData(b, Integer.valueOf(1)).setData(a, Boolean.valueOf(false)));
/*  13:    */   }
/*  14:    */   
/*  15:    */   public Block a(Block parambec, IBlockAccess paramard, BlockPosition paramdt)
/*  16:    */   {
/*  17: 31 */     return parambec.setData(a, Boolean.valueOf(b(paramard, paramdt, parambec)));
/*  18:    */   }
/*  19:    */   
/*  20:    */   public boolean a(World paramaqu, BlockPosition paramdt, Block parambec, EntityPlayer paramahd, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  21:    */   {
/*  22: 36 */     if (!paramahd.by.e) {
/*  23: 37 */       return false;
/*  24:    */     }
/*  25: 40 */     paramaqu.setBlock(paramdt, parambec.a(b), 3);
/*  26: 41 */     return true;
/*  27:    */   }
/*  28:    */   
/*  29:    */   protected int d(Block parambec)
/*  30:    */   {
/*  31: 46 */     return ((Integer)parambec.getProperty(b)).intValue() * 2;
/*  32:    */   }
/*  33:    */   
/*  34:    */   protected Block e(Block parambec)
/*  35:    */   {
/*  36: 51 */     Integer localInteger = (Integer)parambec.getProperty(b);
/*  37: 52 */     Boolean localBoolean = (Boolean)parambec.getProperty(a);
/*  38: 53 */     EnumDirection localej = (EnumDirection)parambec.getProperty(N);
/*  39: 54 */     return BlockList.poweredRepeater.instance().setData(N, localej).setData(b, localInteger).setData(a, localBoolean);
/*  40:    */   }
/*  41:    */   
/*  42:    */   protected Block k(Block parambec)
/*  43:    */   {
/*  44: 59 */     Integer localInteger = (Integer)parambec.getProperty(b);
/*  45: 60 */     Boolean localBoolean = (Boolean)parambec.getProperty(a);
/*  46: 61 */     EnumDirection localej = (EnumDirection)parambec.getProperty(N);
/*  47: 62 */     return BlockList.unpoweredRepeater.instance().setData(N, localej).setData(b, localInteger).setData(a, localBoolean);
/*  48:    */   }
/*  49:    */   
/*  50:    */   public Item a(Block parambec, Random paramRandom, int paramInt)
/*  51:    */   {
/*  52: 68 */     return ItemList.bb;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public Item b(World paramaqu, BlockPosition paramdt)
/*  56:    */   {
/*  57: 73 */     return ItemList.bb;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public boolean b(IBlockAccess paramard, BlockPosition paramdt, Block parambec)
/*  61:    */   {
/*  62: 78 */     return c(paramard, paramdt, parambec) > 0;
/*  63:    */   }
/*  64:    */   
/*  65:    */   protected boolean c(ProtoBlock paramatr)
/*  66:    */   {
/*  67: 83 */     return d(paramatr);
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void c(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/*  71:    */   {
/*  72: 88 */     if (!this.M) {
/*  73: 89 */       return;
/*  74:    */     }
/*  75: 91 */     EnumDirection localej = (EnumDirection)parambec.getProperty(N);
/*  76:    */     
/*  77: 93 */     double d1 = paramdt.getX() + 0.5F + (paramRandom.nextFloat() - 0.5F) * 0.2D;
/*  78: 94 */     double d2 = paramdt.getY() + 0.4F + (paramRandom.nextFloat() - 0.5F) * 0.2D;
/*  79: 95 */     double d3 = paramdt.getZ() + 0.5F + (paramRandom.nextFloat() - 0.5F) * 0.2D;
/*  80:    */     
/*  81: 97 */     float f = -5.0F;
/*  82: 98 */     if (paramRandom.nextBoolean()) {
/*  83: 99 */       f = ((Integer)parambec.getProperty(b)).intValue() * 2 - 1;
/*  84:    */     }
/*  85:101 */     f /= 16.0F;
/*  86:    */     
/*  87:103 */     double d4 = f * localej.g();
/*  88:104 */     double d5 = f * localej.i();
/*  89:    */     
/*  90:106 */     paramaqu.a(EnumParticleEffect.E, d1 + d4, d2, d3 + d5, 0.0D, 0.0D, 0.0D, new int[0]);
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void b(World paramaqu, BlockPosition paramdt, Block parambec)
/*  94:    */   {
/*  95:111 */     super.b(paramaqu, paramdt, parambec);
/*  96:112 */     h(paramaqu, paramdt, parambec);
/*  97:    */   }
/*  98:    */   
/*  99:    */   public Block instance(int paramInt)
/* 100:    */   {
/* 101:117 */     return instance().setData(N, EnumDirection.b(paramInt)).setData(a, Boolean.valueOf(false)).setData(b, Integer.valueOf(1 + (paramInt >> 2)));
/* 102:    */   }
/* 103:    */   
/* 104:    */   public int c(Block parambec)
/* 105:    */   {
/* 106:125 */     int i = 0;
/* 107:    */     
/* 108:127 */     i |= ((EnumDirection)parambec.getProperty(N)).b();
/* 109:128 */     i |= ((Integer)parambec.getProperty(b)).intValue() - 1 << 2;
/* 110:    */     
/* 111:130 */     return i;
/* 112:    */   }
/* 113:    */   
/* 114:    */   protected bed e()
/* 115:    */   {
/* 116:135 */     return new bed(this, new IBlockData[] { N, b, a });
/* 117:    */   }
/* 118:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     azz
 * JD-Core Version:    0.7.0.1
 */