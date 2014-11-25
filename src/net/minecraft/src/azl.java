package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class azl
/*  4:   */   extends ProtoBlock
/*  5:   */ {
/*  6:20 */   public static final BlockDataEnum a = BlockDataEnum.getInstance("variant", azn.class);
/*  7:   */   
/*  8:   */   public azl()
/*  9:   */   {
/* 10:23 */     super(Material.rock);
/* 11:24 */     j(this.L.b().a(a, azn.a));
/* 12:25 */     setCreativeTab(CreativeTabs.tabBlock);
/* 13:   */   }
/* 14:   */   
/* 15:   */   public Block a(World paramaqu, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, EntityLiving paramxm)
/* 16:   */   {
/* 17:30 */     if (paramInt == azn.c.a())
/* 18:   */     {
/* 19:31 */       switch (azm.a[paramej.k().ordinal()])
/* 20:   */       {
/* 21:   */       case 1: 
/* 22:33 */         return instance().a(a, azn.e);
/* 23:   */       case 2: 
/* 24:35 */         return instance().a(a, azn.d);
/* 25:   */       }
/* 26:38 */       return instance().a(a, azn.c);
/* 27:   */     }
/* 28:42 */     if (paramInt == azn.b.a()) {
/* 29:43 */       return instance().a(a, azn.b);
/* 30:   */     }
/* 31:46 */     return instance().a(a, azn.a);
/* 32:   */   }
/* 33:   */   
/* 34:   */   public int a(Block parambec)
/* 35:   */   {
/* 36:51 */     azn localazn = (azn)parambec.getProperty(a);
/* 37:52 */     if ((localazn == azn.d) || (localazn == azn.e)) {
/* 38:53 */       return azn.c.a();
/* 39:   */     }
/* 40:56 */     return localazn.a();
/* 41:   */   }
/* 42:   */   
/* 43:   */   protected ItemStack i(Block parambec)
/* 44:   */   {
/* 45:61 */     azn localazn = (azn)parambec.getProperty(a);
/* 46:62 */     if ((localazn == azn.d) || (localazn == azn.e)) {
/* 47:63 */       return new ItemStack(Item.fromProtoBlock(this), 1, azn.c.a());
/* 48:   */     }
/* 49:65 */     return super.i(parambec);
/* 50:   */   }
/* 51:   */   
/* 52:   */   public void a(Item paramalq, CreativeTabs paramakf, List paramList)
/* 53:   */   {
/* 54:70 */     paramList.add(new ItemStack(paramalq, 1, azn.a.a()));
/* 55:71 */     paramList.add(new ItemStack(paramalq, 1, azn.b.a()));
/* 56:72 */     paramList.add(new ItemStack(paramalq, 1, azn.c.a()));
/* 57:   */   }
/* 58:   */   
/* 59:   */   public MapColor g(Block parambec)
/* 60:   */   {
/* 61:77 */     return MapColor.p;
/* 62:   */   }
/* 63:   */   
/* 64:   */   public Block instance(int paramInt)
/* 65:   */   {
/* 66:82 */     return instance().a(a, azn.a(paramInt));
/* 67:   */   }
/* 68:   */   
/* 69:   */   public int c(Block parambec)
/* 70:   */   {
/* 71:88 */     return ((azn)parambec.getProperty(a)).a();
/* 72:   */   }
/* 73:   */   
/* 74:   */   protected bed e()
/* 75:   */   {
/* 76:93 */     return new bed(this, new IBlockData[] { a });
/* 77:   */   }
/* 78:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     azl
 * JD-Core Version:    0.7.0.1
 */