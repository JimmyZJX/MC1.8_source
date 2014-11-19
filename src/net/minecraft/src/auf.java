package net.minecraft.src;
/*   1:    */ import java.util.Iterator;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class auf
/*   5:    */   extends ProtoBlock
/*   6:    */ {
/*   7: 20 */   public static final BlockDataInteger a = BlockDataInteger.getInstance("age", 0, 15);
/*   8:    */   
/*   9:    */   protected auf()
/*  10:    */   {
/*  11: 23 */     super(Material.A);
/*  12: 24 */     j(this.L.b().a(a, Integer.valueOf(0)));
/*  13: 25 */     a(true);
/*  14: 26 */     setCreativeTab(CreativeTabs.tabDeco);
/*  15:    */   }
/*  16:    */   
/*  17:    */   public void b(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/*  18:    */   {
/*  19: 31 */     BlockPosition localdt = paramdt.up();
/*  20: 32 */     if (!paramaqu.isEmpty(localdt)) {
/*  21: 33 */       return;
/*  22:    */     }
/*  23: 36 */     int i = 1;
/*  24: 37 */     while (paramaqu.getBlock(paramdt.down(i)).getProto() == this) {
/*  25: 38 */       i++;
/*  26:    */     }
/*  27: 41 */     if (i >= 3) {
/*  28: 42 */       return;
/*  29:    */     }
/*  30: 45 */     int j = ((Integer)parambec.getProperty(a)).intValue();
/*  31: 46 */     if (j == 15)
/*  32:    */     {
/*  33: 47 */       paramaqu.setBlock(localdt, instance());
/*  34: 48 */       Block localbec = parambec.a(a, Integer.valueOf(0));
/*  35: 49 */       paramaqu.setBlock(paramdt, localbec, 4);
/*  36: 50 */       a(paramaqu, localdt, localbec, this);
/*  37:    */     }
/*  38:    */     else
/*  39:    */     {
/*  40: 52 */       paramaqu.setBlock(paramdt, parambec.a(a, Integer.valueOf(j + 1)), 4);
/*  41:    */     }
/*  42:    */   }
/*  43:    */   
/*  44:    */   public AABB a(World paramaqu, BlockPosition paramdt, Block parambec)
/*  45:    */   {
/*  46: 59 */     float f = 0.0625F;
/*  47: 60 */     return new AABB(paramdt.getX() + f, paramdt.getY(), paramdt.getZ() + f, paramdt.getX() + 1 - f, paramdt.getY() + 1 - f, paramdt.getZ() + 1 - f);
/*  48:    */   }
/*  49:    */   
/*  50:    */   public AABB a(World paramaqu, BlockPosition paramdt)
/*  51:    */   {
/*  52: 65 */     float f = 0.0625F;
/*  53: 66 */     return new AABB(paramdt.getX() + f, paramdt.getY(), paramdt.getZ() + f, paramdt.getX() + 1 - f, paramdt.getY() + 1, paramdt.getZ() + 1 - f);
/*  54:    */   }
/*  55:    */   
/*  56:    */   public boolean isOpaqueCube()
/*  57:    */   {
/*  58: 71 */     return false;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public boolean c()
/*  62:    */   {
/*  63: 76 */     return false;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public boolean c(World paramaqu, BlockPosition paramdt)
/*  67:    */   {
/*  68: 81 */     if (super.c(paramaqu, paramdt)) {
/*  69: 82 */       return d(paramaqu, paramdt);
/*  70:    */     }
/*  71: 85 */     return false;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, ProtoBlock paramatr)
/*  75:    */   {
/*  76: 90 */     if (!d(paramaqu, paramdt)) {
/*  77: 91 */       paramaqu.b(paramdt, true);
/*  78:    */     }
/*  79:    */   }
/*  80:    */   
/*  81:    */   public boolean d(World paramaqu, BlockPosition paramdt)
/*  82:    */   {
/*  83: 96 */     for (Iterator<EnumDirection> localObject = en.HORIZONTAL.iterator(); (localObject).hasNext();)
/*  84:    */     {
/*  85: 96 */       EnumDirection localej = (EnumDirection)(localObject).next();
/*  86: 97 */       if (paramaqu.getBlock(paramdt.a(localej)).getProto().getMaterial().a()) {
/*  87: 98 */         return false;
/*  88:    */       }
/*  89:    */     }
/*  90:101 */     ProtoBlock localObject = paramaqu.getBlock(paramdt.down()).getProto();
/*  91:102 */     return (localObject == BlockList.cactus) || (localObject == BlockList.sand);
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, Entity paramwv)
/*  95:    */   {
/*  96:107 */     paramwv.a(DamageSource.h, 1.0F);
/*  97:    */   }
/*  98:    */   
/*  99:    */   public aql k()
/* 100:    */   {
/* 101:112 */     return aql.c;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public Block a(int paramInt)
/* 105:    */   {
/* 106:117 */     return instance().a(a, Integer.valueOf(paramInt));
/* 107:    */   }
/* 108:    */   
/* 109:    */   public int c(Block parambec)
/* 110:    */   {
/* 111:123 */     return ((Integer)parambec.getProperty(a)).intValue();
/* 112:    */   }
/* 113:    */   
/* 114:    */   protected bed e()
/* 115:    */   {
/* 116:128 */     return new bed(this, new IBlockData[] { a });
/* 117:    */   }
/* 118:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     auf
 * JD-Core Version:    0.7.0.1
 */