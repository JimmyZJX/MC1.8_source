package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Maps;
/*  2:   */ import java.util.Map;
/*  3:   */ import java.util.Map.Entry;
/*  4:   */ 
/*  5:   */ public class aok
/*  6:   */ {
/*  7:13 */   private static final aok a = new aok();
/*  8:15 */   private Map<ItemStack,ItemStack> b = Maps.newHashMap();
/*  9:16 */   private Map<ItemStack,Float> c = Maps.newHashMap();
/* 10:   */   
/* 11:   */   public static aok a()
/* 12:   */   {
/* 13:19 */     return a;
/* 14:   */   }
/* 15:   */   
/* 16:   */   private aok()
/* 17:   */   {
/* 18:23 */     a(BlockList.ironOre, new ItemStack(ItemList.j), 0.7F);
/* 19:24 */     a(BlockList.goldOre, new ItemStack(ItemList.k), 1.0F);
/* 20:25 */     a(BlockList.diamondOre, new ItemStack(ItemList.diamond), 1.0F);
/* 21:26 */     a(BlockList.sand, new ItemStack(BlockList.w), 0.1F);
/* 22:   */     
/* 23:   */ 
/* 24:29 */     a(ItemList.al, new ItemStack(ItemList.am), 0.35F);
/* 25:30 */     a(ItemList.bi, new ItemStack(ItemList.bj), 0.35F);
/* 26:31 */     a(ItemList.bk, new ItemStack(ItemList.bl), 0.35F);
/* 27:32 */     a(ItemList.bo, new ItemStack(ItemList.bp), 0.35F);
/* 28:33 */     a(ItemList.bm, new ItemStack(ItemList.bn), 0.35F);
/* 29:34 */     a(BlockList.cobblestone, new ItemStack(BlockList.stone), 0.1F);
/* 30:35 */     a(new ItemStack(BlockList.bf, 1, bbc.b), new ItemStack(BlockList.bf, 1, bbc.N), 0.1F);
/* 31:36 */     a(ItemList.aI, new ItemStack(ItemList.aH), 0.3F);
/* 32:37 */     a(BlockList.aL, new ItemStack(BlockList.cz), 0.35F);
/* 33:38 */     a(BlockList.cactus, new ItemStack(ItemList.dye, 1, EnumDyeColor.GREEN.b()), 0.2F);
/* 34:39 */     a(BlockList.log, new ItemStack(ItemList.h, 1, 1), 0.15F);
/* 35:40 */     a(BlockList.log2, new ItemStack(ItemList.h, 1, 1), 0.15F);
/* 36:41 */     a(BlockList.bP, new ItemStack(ItemList.bO), 1.0F);
/* 37:42 */     a(ItemList.bS, new ItemStack(ItemList.bT), 0.35F);
/* 38:43 */     a(BlockList.netherrack, new ItemStack(ItemList.cf), 0.1F);
/* 39:44 */     a(new ItemStack(BlockList.v, 1, 1), new ItemStack(BlockList.v, 1, 0), 0.15F);
/* 40:46 */     for (ali localali : ali.values()) {
/* 41:47 */       if (localali.g()) {
/* 42:48 */         a(new ItemStack(ItemList.fish, 1, localali.a()), new ItemStack(ItemList.aV, 1, localali.a()), 0.35F);
/* 43:   */       }
/* 44:   */     }
/* 45:54 */     a(BlockList.coalOre, new ItemStack(ItemList.h), 0.1F);
/* 46:55 */     a(BlockList.redstoneOre, new ItemStack(ItemList.aC), 0.7F);
/* 47:   */     
/* 48:57 */     a(BlockList.lapisOre, new ItemStack(ItemList.dye, 1, EnumDyeColor.BLUE.b()), 0.2F);
/* 49:58 */     a(BlockList.quartzOre, new ItemStack(ItemList.cg), 0.2F);
/* 50:   */   }
/* 51:   */   
/* 52:   */   public void a(ProtoBlock paramatr, ItemStack paramamj, float paramFloat)
/* 53:   */   {
/* 54:62 */     a(Item.fromProtoBlock(paramatr), paramamj, paramFloat);
/* 55:   */   }
/* 56:   */   
/* 57:   */   public void a(Item paramalq, ItemStack paramamj, float paramFloat)
/* 58:   */   {
/* 59:66 */     a(new ItemStack(paramalq, 1, 32767), paramamj, paramFloat);
/* 60:   */   }
/* 61:   */   
/* 62:   */   public void a(ItemStack paramamj1, ItemStack paramamj2, float paramFloat)
/* 63:   */   {
/* 64:70 */     this.b.put(paramamj1, paramamj2);
/* 65:71 */     this.c.put(paramamj2, Float.valueOf(paramFloat));
/* 66:   */   }
/* 67:   */   
/* 68:   */   public ItemStack a(ItemStack paramamj)
/* 69:   */   {
/* 70:75 */     for (Map.Entry<ItemStack,ItemStack> localEntry : this.b.entrySet()) {
/* 71:76 */       if (a(paramamj, (ItemStack)localEntry.getKey())) {
/* 72:77 */         return (ItemStack)localEntry.getValue();
/* 73:   */       }
/* 74:   */     }
/* 75:81 */     return null;
/* 76:   */   }
/* 77:   */   
/* 78:   */   private boolean a(ItemStack paramamj1, ItemStack paramamj2)
/* 79:   */   {
/* 80:85 */     return (paramamj2.getItem() == paramamj1.getItem()) && ((paramamj2.i() == 32767) || (paramamj2.i() == paramamj1.i()));
/* 81:   */   }
/* 82:   */   
/* 83:   */   public Map<ItemStack,ItemStack> b()
/* 84:   */   {
/* 85:89 */     return this.b;
/* 86:   */   }
/* 87:   */   
/* 88:   */   public float b(ItemStack paramamj)
/* 89:   */   {
/* 90:93 */     for (Map.Entry<ItemStack,Float> localEntry : this.c.entrySet()) {
/* 91:94 */       if (a(paramamj, (ItemStack)localEntry.getKey())) {
/* 92:95 */         return ((Float)localEntry.getValue()).floatValue();
/* 93:   */       }
/* 94:   */     }
/* 95:98 */     return 0.0F;
/* 96:   */   }
/* 97:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aok
 * JD-Core Version:    0.7.0.1
 */