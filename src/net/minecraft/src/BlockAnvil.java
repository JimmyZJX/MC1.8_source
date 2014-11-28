package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public class BlockAnvil
/*   4:    */   extends avt
/*   5:    */ {
/*   6: 28 */   public static final BlockDataDirection a = BlockDataDirection.getInstance("facing", EnumHorizontalVertical.HORIZONTAL);
/*   7: 29 */   public static final BlockDataInteger b = BlockDataInteger.getInstance("damage", 0, 2);
/*   8:    */   
/*   9:    */   protected BlockAnvil()
/*  10:    */   {
/*  11: 33 */     super(Material.g);
/*  12: 34 */     j(this.L.b().setData(a, EnumDirection.NORTH).setData(b, Integer.valueOf(0)));
/*  13: 35 */     e(0);
/*  14: 36 */     setCreativeTab(CreativeTabs.tabDeco);
/*  15:    */   }
/*  16:    */   
/*  17:    */   public boolean isOpaqueCube()
/*  18:    */   {
/*  19: 41 */     return false;
/*  20:    */   }
/*  21:    */   
/*  22:    */   public boolean c()
/*  23:    */   {
/*  24: 46 */     return false;
/*  25:    */   }
/*  26:    */   
/*  27:    */   public Block a(World paramaqu, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, EntityLiving paramxm)
/*  28:    */   {
/*  29: 51 */     EnumDirection localej = paramxm.aO().yRotate();
/*  30: 52 */     return super.a(paramaqu, paramdt, paramej, paramFloat1, paramFloat2, paramFloat3, paramInt, paramxm).setData(a, localej).setData(b, Integer.valueOf(paramInt >> 2));
/*  31:    */   }
/*  32:    */   
/*  33:    */   public boolean a(World paramaqu, BlockPosition paramdt, Block parambec, EntityPlayer paramahd, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  34:    */   {
/*  35: 57 */     if (!paramaqu.isClient) {
/*  36: 58 */       paramahd.a(new ata(paramaqu, paramdt));
/*  37:    */     }
/*  38: 61 */     return true;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public int a(Block parambec)
/*  42:    */   {
/*  43: 66 */     return ((Integer)parambec.getData(b)).intValue();
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void a(IBlockAccess paramard, BlockPosition paramdt)
/*  47:    */   {
/*  48: 71 */     EnumDirection localej = (EnumDirection)paramard.getBlock(paramdt).getData(a);
/*  49: 72 */     if (localej.k() == EnumAxis.X) {
/*  50: 73 */       a(0.0F, 0.0F, 0.125F, 1.0F, 1.0F, 0.875F);
/*  51:    */     } else {
/*  52: 75 */       a(0.125F, 0.0F, 0.0F, 0.875F, 1.0F, 1.0F);
/*  53:    */     }
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void a(Item paramalq, CreativeTabs paramakf, List paramList)
/*  57:    */   {
/*  58: 81 */     paramList.add(new ItemStack(paramalq, 1, 0));
/*  59: 82 */     paramList.add(new ItemStack(paramalq, 1, 1));
/*  60: 83 */     paramList.add(new ItemStack(paramalq, 1, 2));
/*  61:    */   }
/*  62:    */   
/*  63:    */   protected void a(adv paramadv)
/*  64:    */   {
/*  65: 88 */     paramadv.a(true);
/*  66:    */   }
/*  67:    */   
/*  68:    */   public void a_(World paramaqu, BlockPosition paramdt)
/*  69:    */   {
/*  70: 93 */     paramaqu.playLevelEvent(1022, paramdt, 0);
/*  71:    */   }
/*  72:    */   
/*  73:    */   public boolean a(IBlockAccess paramard, BlockPosition paramdt, EnumDirection paramej)
/*  74:    */   {
/*  75: 98 */     return true;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public Block b(Block parambec)
/*  79:    */   {
/*  80:140 */     return instance().setData(a, EnumDirection.SOUTH);
/*  81:    */   }
/*  82:    */   
/*  83:    */   public Block instance(int paramInt)
/*  84:    */   {
/*  85:145 */     return instance().setData(a, EnumDirection.b(paramInt & 0x3)).setData(b, Integer.valueOf((paramInt & 0xF) >> 2));
/*  86:    */   }
/*  87:    */   
/*  88:    */   public int c(Block parambec)
/*  89:    */   {
/*  90:152 */     int i = 0;
/*  91:    */     
/*  92:154 */     i |= ((EnumDirection)parambec.getData(a)).b();
/*  93:155 */     i |= ((Integer)parambec.getData(b)).intValue() << 2;
/*  94:    */     
/*  95:157 */     return i;
/*  96:    */   }
/*  97:    */   
/*  98:    */   protected bed e()
/*  99:    */   {
/* 100:162 */     return new bed(this, new IBlockData[] { a, b });
/* 101:    */   }
/* 102:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     asz
 * JD-Core Version:    0.7.0.1
 */