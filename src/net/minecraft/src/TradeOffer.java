package net.minecraft.src;
/*   1:    */ public class TradeOffer
/*   2:    */ {
/*   3:    */   private ItemStack buy;
/*   4:    */   private ItemStack buyB;
/*   5:    */   private ItemStack sell;
/*   6:    */   private int uses;
/*   7:    */   private int maxUses;
/*   8:    */   private boolean rewardExp;
/*   9:    */   
/*  10:    */   public TradeOffer(NBTTagCompound tag)
/*  11:    */   {
/*  12: 20 */     readFromNBT(tag);
/*  13:    */   }
/*  14:    */   
/*  15:    */   public TradeOffer(ItemStack buy, ItemStack buyB, ItemStack sell)
/*  16:    */   {
/*  17: 24 */     this(buy, buyB, sell, 0, 7);
/*  18:    */   }
/*  19:    */   
/*  20:    */   public TradeOffer(ItemStack buy, ItemStack buyB, ItemStack sell, int uses, int maxUses)
/*  21:    */   {
/*  22: 28 */     this.buy = buy;
/*  23: 29 */     this.buyB = buyB;
/*  24: 30 */     this.sell = sell;
/*  25: 31 */     this.uses = uses;
/*  26: 32 */     this.maxUses = maxUses;
/*  27: 33 */     this.rewardExp = true;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public TradeOffer(ItemStack buy, ItemStack sell)
/*  31:    */   {
/*  32: 37 */     this(buy, null, sell);
/*  33:    */   }
/*  34:    */   
/*  35:    */   public TradeOffer(ItemStack paramamj, Item paramalq)
/*  36:    */   {
/*  37: 41 */     this(paramamj, new ItemStack(paramalq));
/*  38:    */   }
/*  39:    */   
/*  40:    */   public ItemStack getItemBought()
/*  41:    */   {
/*  42: 49 */     return this.buy;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public ItemStack getItemBoughtB()
/*  46:    */   {
/*  47: 53 */     return this.buyB;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public boolean buysTwoStacks()
/*  51:    */   {
/*  52: 57 */     return this.buyB != null;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public ItemStack getItemSold()
/*  56:    */   {
/*  57: 61 */     return this.sell;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public int getUses()
/*  61:    */   {
/*  62: 77 */     return this.uses;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public int getMaxUses()
/*  66:    */   {
/*  67: 81 */     return this.maxUses;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void onUse()
/*  71:    */   {
/*  72: 85 */     this.uses += 1;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void extendUses(int paramInt)
/*  76:    */   {
/*  77: 89 */     this.maxUses += paramInt;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public boolean isBlocked()
/*  81:    */   {
/*  82: 93 */     return this.uses >= this.maxUses;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void block()
/*  86:    */   {
/*  87: 97 */     this.uses = this.maxUses;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public boolean getRewardExp()
/*  91:    */   {
/*  92:101 */     return this.rewardExp;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void readFromNBT(NBTTagCompound tag)
/*  96:    */   {
/*  97:105 */     NBTTagCompound localfn1 = tag.getCompoundTag("buy");
/*  98:106 */     this.buy = ItemStack.loadItemStackFromNBT(localfn1);
/*  99:107 */     NBTTagCompound localfn2 = tag.getCompoundTag("sell");
/* 100:108 */     this.sell = ItemStack.loadItemStackFromNBT(localfn2);
/* 101:109 */     if (tag.hasKey("buyB", 10)) {
/* 102:110 */       this.buyB = ItemStack.loadItemStackFromNBT(tag.getCompoundTag("buyB"));
/* 103:    */     }
/* 104:112 */     if (tag.hasKey("uses", 99)) {
/* 105:113 */       this.uses = tag.getInteger("uses");
/* 106:    */     }
/* 107:115 */     if (tag.hasKey("maxUses", 99)) {
/* 108:116 */       this.maxUses = tag.getInteger("maxUses");
/* 109:    */     } else {
/* 110:118 */       this.maxUses = 7;
/* 111:    */     }
/* 112:120 */     if (tag.hasKey("rewardExp", 1)) {
/* 113:121 */       this.rewardExp = tag.getBoolean("rewardExp");
/* 114:    */     } else {
/* 115:123 */       this.rewardExp = true;
/* 116:    */     }
/* 117:    */   }
/* 118:    */   
/* 119:    */   public NBTTagCompound writeToNBT()
/* 120:    */   {
/* 121:128 */     NBTTagCompound tag = new NBTTagCompound();
/* 122:129 */     tag.setNBT("buy", this.buy.writeToNBT(new NBTTagCompound()));
/* 123:130 */     tag.setNBT("sell", this.sell.writeToNBT(new NBTTagCompound()));
/* 124:131 */     if (this.buyB != null) {
/* 125:132 */       tag.setNBT("buyB", this.buyB.writeToNBT(new NBTTagCompound()));
/* 126:    */     }
/* 127:134 */     tag.setInt("uses", this.uses);
/* 128:135 */     tag.setInt("maxUses", this.maxUses);
/* 129:136 */     tag.setBoolean("rewardExp", this.rewardExp);
/* 130:137 */     return tag;
/* 131:    */   }
/* 132:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aqc
 * JD-Core Version:    0.7.0.1
 */