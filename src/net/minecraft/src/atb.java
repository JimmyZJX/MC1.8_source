package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class atb
/*   4:    */   extends atg
/*   5:    */ {
/*   6: 26 */   public static final BlockDataDirection a = BlockDataDirection.getInstance("facing", en.HORIZONTAL);
/*   7: 27 */   public static final BlockDataInteger b = BlockDataInteger.getInstance("rotation", 0, 15);
/*   8:    */   
/*   9:    */   protected atb()
/*  10:    */   {
/*  11: 30 */     super(Material.d);
/*  12: 31 */     float f1 = 0.25F;
/*  13: 32 */     float f2 = 1.0F;
/*  14: 33 */     a(0.5F - f1, 0.0F, 0.5F - f1, 0.5F + f1, f2, 0.5F + f1);
/*  15:    */   }
/*  16:    */   
/*  17:    */   public AABB a(World paramaqu, BlockPosition paramdt, Block parambec)
/*  18:    */   {
/*  19: 39 */     return null;
/*  20:    */   }
/*  21:    */   
/*  22:    */   public AABB a(World paramaqu, BlockPosition paramdt)
/*  23:    */   {
/*  24: 44 */     a(paramaqu, paramdt);
/*  25: 45 */     return super.a(paramaqu, paramdt);
/*  26:    */   }
/*  27:    */   
/*  28:    */   public boolean isOpaqueCube()
/*  29:    */   {
/*  30: 50 */     return false;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public boolean b(IBlockAccess paramard, BlockPosition paramdt)
/*  34:    */   {
/*  35: 55 */     return true;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public boolean c()
/*  39:    */   {
/*  40: 60 */     return false;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public bcm a(World paramaqu, int paramInt)
/*  44:    */   {
/*  45: 65 */     return new bci();
/*  46:    */   }
/*  47:    */   
/*  48:    */   public Item a(Block parambec, Random paramRandom, int paramInt)
/*  49:    */   {
/*  50: 71 */     return ItemList.cE;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public Item b(World paramaqu, BlockPosition paramdt)
/*  54:    */   {
/*  55: 76 */     return ItemList.cE;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, float paramFloat, int paramInt)
/*  59:    */   {
/*  60: 81 */     bcm localbcm = paramaqu.s(paramdt);
/*  61: 82 */     if ((localbcm instanceof bci))
/*  62:    */     {
/*  63: 83 */       ItemStack localamj = new ItemStack(ItemList.cE, 1, ((bci)localbcm).b());
/*  64:    */       
/*  65: 85 */       NBTTagCompound localfn = new NBTTagCompound();
/*  66: 86 */       localbcm.writeToNBT(localfn);
/*  67: 87 */       localfn.o("x");
/*  68: 88 */       localfn.o("y");
/*  69: 89 */       localfn.o("z");
/*  70: 90 */       localfn.o("id");
/*  71: 91 */       localamj.a("BlockEntityTag", localfn);
/*  72:    */       
/*  73: 93 */       a(paramaqu, paramdt, localamj);
/*  74:    */     }
/*  75:    */     else
/*  76:    */     {
/*  77: 95 */       super.a(paramaqu, paramdt, parambec, paramFloat, paramInt);
/*  78:    */     }
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void a(World paramaqu, EntityPlayer paramahd, BlockPosition paramdt, Block parambec, bcm parambcm)
/*  82:    */   {
/*  83:101 */     if ((parambcm instanceof bci))
/*  84:    */     {
/*  85:102 */       ItemStack localamj = new ItemStack(ItemList.cE, 1, ((bci)parambcm).b());
/*  86:    */       
/*  87:104 */       NBTTagCompound localfn = new NBTTagCompound();
/*  88:105 */       parambcm.writeToNBT(localfn);
/*  89:106 */       localfn.o("x");
/*  90:107 */       localfn.o("y");
/*  91:108 */       localfn.o("z");
/*  92:109 */       localfn.o("id");
/*  93:110 */       localamj.a("BlockEntityTag", localfn);
/*  94:    */       
/*  95:112 */       a(paramaqu, paramdt, localamj);
/*  96:    */     }
/*  97:    */     else
/*  98:    */     {
/*  99:114 */       super.a(paramaqu, paramahd, paramdt, parambec, null);
/* 100:    */     }
/* 101:    */   }
/* 102:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     atb
 * JD-Core Version:    0.7.0.1
 */