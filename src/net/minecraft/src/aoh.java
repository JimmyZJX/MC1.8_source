package net.minecraft.src;
/*   1:    */ public class aoh
/*   2:    */ {
/*   3:    */   public void a(aop paramaop)
/*   4:    */   {
/*   5: 14 */     for (int i = 0; i < 16; i++)
/*   6:    */     {
/*   7: 15 */       paramaop.b(new ItemStack(BlockList.wool, 1, i), new Object[] { new ItemStack(ItemList.dye, 1, 15 - i), new ItemStack(Item.fromProtoBlock(BlockList.wool), 1, 0) });
/*   8:    */       
/*   9:    */ 
/*  10:    */ 
/*  11: 19 */       paramaop.a(new ItemStack(BlockList.cu, 8, 15 - i), new Object[] { "###", "#X#", "###", Character.valueOf('#'), new ItemStack(BlockList.cz), Character.valueOf('X'), new ItemStack(ItemList.dye, 1, i) });
/*  12:    */       
/*  13:    */ 
/*  14:    */ 
/*  15:    */ 
/*  16:    */ 
/*  17:    */ 
/*  18:    */ 
/*  19: 27 */       paramaop.a(new ItemStack(BlockList.cG, 8, 15 - i), new Object[] { "###", "#X#", "###", Character.valueOf('#'), new ItemStack(BlockList.glass), Character.valueOf('X'), new ItemStack(ItemList.dye, 1, i) });
/*  20:    */       
/*  21:    */ 
/*  22:    */ 
/*  23:    */ 
/*  24:    */ 
/*  25:    */ 
/*  26:    */ 
/*  27: 35 */       paramaop.a(new ItemStack(BlockList.stainedGlassPane, 16, i), new Object[] { "###", "###", Character.valueOf('#'), new ItemStack(BlockList.cG, 1, i) });
/*  28:    */     }
/*  29: 44 */     paramaop.b(new ItemStack(ItemList.dye, 1, EnumDyeColor.YELLOW.b()), new Object[] { new ItemStack(BlockList.yellowFlower, 1, EnumFlowerVariant.a.b()) });
/*  30:    */     
/*  31:    */ 
/*  32: 47 */     paramaop.b(new ItemStack(ItemList.dye, 1, EnumDyeColor.RED.b()), new Object[] { new ItemStack(BlockList.redFlower, 1, EnumFlowerVariant.b.b()) });
/*  33:    */     
/*  34:    */ 
/*  35: 50 */     paramaop.b(new ItemStack(ItemList.dye, 3, EnumDyeColor.WHITE.b()), new Object[] { ItemList.bone });
/*  36:    */     
/*  37:    */ 
/*  38: 53 */     paramaop.b(new ItemStack(ItemList.dye, 2, EnumDyeColor.PINK.b()), new Object[] { new ItemStack(ItemList.dye, 1, EnumDyeColor.RED.b()), new ItemStack(ItemList.dye, 1, EnumDyeColor.WHITE.b()) });
/*  39:    */     
/*  40:    */ 
/*  41:    */ 
/*  42: 57 */     paramaop.b(new ItemStack(ItemList.dye, 2, EnumDyeColor.ORANGE.b()), new Object[] { new ItemStack(ItemList.dye, 1, EnumDyeColor.RED.b()), new ItemStack(ItemList.dye, 1, EnumDyeColor.YELLOW.b()) });
/*  43:    */     
/*  44:    */ 
/*  45:    */ 
/*  46: 61 */     paramaop.b(new ItemStack(ItemList.dye, 2, EnumDyeColor.LIME.b()), new Object[] { new ItemStack(ItemList.dye, 1, EnumDyeColor.GREEN.b()), new ItemStack(ItemList.dye, 1, EnumDyeColor.WHITE.b()) });
/*  47:    */     
/*  48:    */ 
/*  49:    */ 
/*  50: 65 */     paramaop.b(new ItemStack(ItemList.dye, 2, EnumDyeColor.GRAY.b()), new Object[] { new ItemStack(ItemList.dye, 1, EnumDyeColor.BLACK.b()), new ItemStack(ItemList.dye, 1, EnumDyeColor.WHITE.b()) });
/*  51:    */     
/*  52:    */ 
/*  53:    */ 
/*  54: 69 */     paramaop.b(new ItemStack(ItemList.dye, 2, EnumDyeColor.SILVER.b()), new Object[] { new ItemStack(ItemList.dye, 1, EnumDyeColor.GRAY.b()), new ItemStack(ItemList.dye, 1, EnumDyeColor.WHITE.b()) });
/*  55:    */     
/*  56:    */ 
/*  57:    */ 
/*  58: 73 */     paramaop.b(new ItemStack(ItemList.dye, 3, EnumDyeColor.SILVER.b()), new Object[] { new ItemStack(ItemList.dye, 1, EnumDyeColor.BLACK.b()), new ItemStack(ItemList.dye, 1, EnumDyeColor.WHITE.b()), new ItemStack(ItemList.dye, 1, EnumDyeColor.WHITE.b()) });
/*  59:    */     
/*  60:    */ 
/*  61:    */ 
/*  62:    */ 
/*  63: 78 */     paramaop.b(new ItemStack(ItemList.dye, 2, EnumDyeColor.LIGHT_BLUE.b()), new Object[] { new ItemStack(ItemList.dye, 1, EnumDyeColor.BLUE.b()), new ItemStack(ItemList.dye, 1, EnumDyeColor.WHITE.b()) });
/*  64:    */     
/*  65:    */ 
/*  66:    */ 
/*  67: 82 */     paramaop.b(new ItemStack(ItemList.dye, 2, EnumDyeColor.CYAN.b()), new Object[] { new ItemStack(ItemList.dye, 1, EnumDyeColor.BLUE.b()), new ItemStack(ItemList.dye, 1, EnumDyeColor.GREEN.b()) });
/*  68:    */     
/*  69:    */ 
/*  70:    */ 
/*  71: 86 */     paramaop.b(new ItemStack(ItemList.dye, 2, EnumDyeColor.PURPLE.b()), new Object[] { new ItemStack(ItemList.dye, 1, EnumDyeColor.BLUE.b()), new ItemStack(ItemList.dye, 1, EnumDyeColor.RED.b()) });
/*  72:    */     
/*  73:    */ 
/*  74:    */ 
/*  75: 90 */     paramaop.b(new ItemStack(ItemList.dye, 2, EnumDyeColor.MAGENTA.b()), new Object[] { new ItemStack(ItemList.dye, 1, EnumDyeColor.PURPLE.b()), new ItemStack(ItemList.dye, 1, EnumDyeColor.PINK.b()) });
/*  76:    */     
/*  77:    */ 
/*  78:    */ 
/*  79: 94 */     paramaop.b(new ItemStack(ItemList.dye, 3, EnumDyeColor.MAGENTA.b()), new Object[] { new ItemStack(ItemList.dye, 1, EnumDyeColor.BLUE.b()), new ItemStack(ItemList.dye, 1, EnumDyeColor.RED.b()), new ItemStack(ItemList.dye, 1, EnumDyeColor.PINK.b()) });
/*  80:    */     
/*  81:    */ 
/*  82:    */ 
/*  83:    */ 
/*  84: 99 */     paramaop.b(new ItemStack(ItemList.dye, 4, EnumDyeColor.MAGENTA.b()), new Object[] { new ItemStack(ItemList.dye, 1, EnumDyeColor.BLUE.b()), new ItemStack(ItemList.dye, 1, EnumDyeColor.RED.b()), new ItemStack(ItemList.dye, 1, EnumDyeColor.RED.b()), new ItemStack(ItemList.dye, 1, EnumDyeColor.WHITE.b()) });
/*  85:    */     
/*  86:    */ 
/*  87:    */ 
/*  88:    */ 
/*  89:    */ 
/*  90:    */ 
/*  91:    */ 
/*  92:107 */     paramaop.b(new ItemStack(ItemList.dye, 1, EnumDyeColor.LIGHT_BLUE.b()), new Object[] { new ItemStack(BlockList.redFlower, 1, EnumFlowerVariant.c.b()) });
/*  93:    */     
/*  94:    */ 
/*  95:110 */     paramaop.b(new ItemStack(ItemList.dye, 1, EnumDyeColor.MAGENTA.b()), new Object[] { new ItemStack(BlockList.redFlower, 1, EnumFlowerVariant.d.b()) });
/*  96:    */     
/*  97:    */ 
/*  98:113 */     paramaop.b(new ItemStack(ItemList.dye, 1, EnumDyeColor.SILVER.b()), new Object[] { new ItemStack(BlockList.redFlower, 1, EnumFlowerVariant.e.b()) });
/*  99:    */     
/* 100:    */ 
/* 101:116 */     paramaop.b(new ItemStack(ItemList.dye, 1, EnumDyeColor.RED.b()), new Object[] { new ItemStack(BlockList.redFlower, 1, EnumFlowerVariant.f.b()) });
/* 102:    */     
/* 103:    */ 
/* 104:119 */     paramaop.b(new ItemStack(ItemList.dye, 1, EnumDyeColor.ORANGE.b()), new Object[] { new ItemStack(BlockList.redFlower, 1, EnumFlowerVariant.g.b()) });
/* 105:    */     
/* 106:    */ 
/* 107:122 */     paramaop.b(new ItemStack(ItemList.dye, 1, EnumDyeColor.SILVER.b()), new Object[] { new ItemStack(BlockList.redFlower, 1, EnumFlowerVariant.h.b()) });
/* 108:    */     
/* 109:    */ 
/* 110:125 */     paramaop.b(new ItemStack(ItemList.dye, 1, EnumDyeColor.PINK.b()), new Object[] { new ItemStack(BlockList.redFlower, 1, EnumFlowerVariant.i.b()) });
/* 111:    */     
/* 112:    */ 
/* 113:128 */     paramaop.b(new ItemStack(ItemList.dye, 1, EnumDyeColor.SILVER.b()), new Object[] { new ItemStack(BlockList.redFlower, 1, EnumFlowerVariant.j.b()) });
/* 114:    */     
/* 115:    */ 
/* 116:131 */     paramaop.b(new ItemStack(ItemList.dye, 2, EnumDyeColor.YELLOW.b()), new Object[] { new ItemStack(BlockList.cF, 1, avk.a.a()) });
/* 117:    */     
/* 118:    */ 
/* 119:134 */     paramaop.b(new ItemStack(ItemList.dye, 2, EnumDyeColor.MAGENTA.b()), new Object[] { new ItemStack(BlockList.cF, 1, avk.b.a()) });
/* 120:    */     
/* 121:    */ 
/* 122:137 */     paramaop.b(new ItemStack(ItemList.dye, 2, EnumDyeColor.RED.b()), new Object[] { new ItemStack(BlockList.cF, 1, avk.e.a()) });
/* 123:    */     
/* 124:    */ 
/* 125:140 */     paramaop.b(new ItemStack(ItemList.dye, 2, EnumDyeColor.PINK.b()), new Object[] { new ItemStack(BlockList.cF, 1, avk.f.a()) });
/* 126:144 */     for (int i = 0; i < 16; i++) {
/* 127:145 */       paramaop.a(new ItemStack(BlockList.cy, 3, i), new Object[] { "##", Character.valueOf('#'), new ItemStack(BlockList.wool, 1, i) });
/* 128:    */     }
/* 129:    */   }
/* 130:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aoh
 * JD-Core Version:    0.7.0.1
 */