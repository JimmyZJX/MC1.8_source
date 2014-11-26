package net.minecraft.src;
/*   2:    */ 
/*   3:    */ public class bbk
/*   4:    */   extends ProtoBlock
/*   5:    */ {
/*   6: 21 */   public static final BlockDataBoolean a = BlockDataBoolean.getInstance("explode");
/*   7:    */   
/*   8:    */   public bbk()
/*   9:    */   {
/*  10: 24 */     super(Material.u);
/*  11: 25 */     j(this.L.b().setData(a, Boolean.valueOf(false)));
/*  12: 26 */     setCreativeTab(CreativeTabs.tabRedstone);
/*  13:    */   }
/*  14:    */   
/*  15:    */   public void c(World paramaqu, BlockPosition paramdt, Block parambec)
/*  16:    */   {
/*  17: 31 */     super.c(paramaqu, paramdt, parambec);
/*  18: 33 */     if (paramaqu.z(paramdt))
/*  19:    */     {
/*  20: 34 */       d(paramaqu, paramdt, parambec.setData(a, Boolean.valueOf(true)));
/*  21: 35 */       paramaqu.g(paramdt);
/*  22:    */     }
/*  23:    */   }
/*  24:    */   
/*  25:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, ProtoBlock paramatr)
/*  26:    */   {
/*  27: 41 */     if (paramaqu.z(paramdt))
/*  28:    */     {
/*  29: 42 */       d(paramaqu, paramdt, parambec.setData(a, Boolean.valueOf(true)));
/*  30: 43 */       paramaqu.g(paramdt);
/*  31:    */     }
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void a(World paramaqu, BlockPosition paramdt, aqo paramaqo)
/*  35:    */   {
/*  36: 49 */     if (paramaqu.isClient) {
/*  37: 50 */       return;
/*  38:    */     }
/*  39: 53 */     aek localaek = new aek(paramaqu, paramdt.getX() + 0.5F, paramdt.getY() + 0.5F, paramdt.getZ() + 0.5F, paramaqo.c());
/*  40: 54 */     localaek.a = (paramaqu.rng.nextInt(localaek.a / 4) + localaek.a / 8);
/*  41: 55 */     paramaqu.spawnEntity(localaek);
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void d(World paramaqu, BlockPosition paramdt, Block parambec)
/*  45:    */   {
/*  46: 60 */     a(paramaqu, paramdt, parambec, (EntityLiving)null);
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, EntityLiving paramxm)
/*  50:    */   {
/*  51: 64 */     if (paramaqu.isClient) {
/*  52: 65 */       return;
/*  53:    */     }
/*  54: 68 */     if (((Boolean)parambec.getProperty(a)).booleanValue())
/*  55:    */     {
/*  56: 69 */       aek localaek = new aek(paramaqu, paramdt.getX() + 0.5F, paramdt.getY() + 0.5F, paramdt.getZ() + 0.5F, paramxm);
/*  57: 70 */       paramaqu.spawnEntity(localaek);
/*  58: 71 */       paramaqu.a(localaek, "game.tnt.primed", 1.0F, 1.0F);
/*  59:    */     }
/*  60:    */   }
/*  61:    */   
/*  62:    */   public boolean a(World paramaqu, BlockPosition paramdt, Block parambec, EntityPlayer paramahd, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  63:    */   {
/*  64: 77 */     if (paramahd.bY() != null)
/*  65:    */     {
/*  66: 78 */       Item localalq = paramahd.bY().getItem();
/*  67: 79 */       if ((localalq == ItemList.d) || (localalq == ItemList.bL))
/*  68:    */       {
/*  69: 80 */         a(paramaqu, paramdt, parambec.setData(a, Boolean.valueOf(true)), paramahd);
/*  70: 81 */         paramaqu.g(paramdt);
/*  71: 83 */         if (localalq == ItemList.d) {
/*  72: 84 */           paramahd.bY().a(1, paramahd);
/*  73: 85 */         } else if (!paramahd.by.d) {
/*  74: 86 */           paramahd.bY().stackSize -= 1;
/*  75:    */         }
/*  76: 88 */         return true;
/*  77:    */       }
/*  78:    */     }
/*  79: 91 */     return super.a(paramaqu, paramdt, parambec, paramahd, paramej, paramFloat1, paramFloat2, paramFloat3);
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, Entity paramwv)
/*  83:    */   {
/*  84: 96 */     if ((!paramaqu.isClient) && ((paramwv instanceof ahj)))
/*  85:    */     {
/*  86: 97 */       ahj localahj = (ahj)paramwv;
/*  87: 98 */       if (localahj.au())
/*  88:    */       {
/*  89: 99 */         a(paramaqu, paramdt, paramaqu.getBlock(paramdt).setData(a, Boolean.valueOf(true)), (localahj.c instanceof EntityLiving) ? (EntityLiving)localahj.c : null);
/*  90:100 */         paramaqu.g(paramdt);
/*  91:    */       }
/*  92:    */     }
/*  93:    */   }
/*  94:    */   
/*  95:    */   public boolean a(aqo paramaqo)
/*  96:    */   {
/*  97:107 */     return false;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public Block instance(int paramInt)
/* 101:    */   {
/* 102:112 */     return instance().setData(a, Boolean.valueOf((paramInt & 0x1) > 0));
/* 103:    */   }
/* 104:    */   
/* 105:    */   public int c(Block parambec)
/* 106:    */   {
/* 107:117 */     return ((Boolean)parambec.getProperty(a)).booleanValue() ? 1 : 0;
/* 108:    */   }
/* 109:    */   
/* 110:    */   protected bed e()
/* 111:    */   {
/* 112:122 */     return new bed(this, new IBlockData[] { a });
/* 113:    */   }
/* 114:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bbk
 * JD-Core Version:    0.7.0.1
 */