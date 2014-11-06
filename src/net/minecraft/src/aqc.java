package net.minecraft.src;
/*   1:    */ public class aqc
/*   2:    */ {
/*   3:    */   private ItemStack a;
/*   4:    */   private ItemStack b;
/*   5:    */   private ItemStack c;
/*   6:    */   private int d;
/*   7:    */   private int e;
/*   8:    */   private boolean f;
/*   9:    */   
/*  10:    */   public aqc(NBTTagCompound paramfn)
/*  11:    */   {
/*  12: 20 */     a(paramfn);
/*  13:    */   }
/*  14:    */   
/*  15:    */   public aqc(ItemStack paramamj1, ItemStack paramamj2, ItemStack paramamj3)
/*  16:    */   {
/*  17: 24 */     this(paramamj1, paramamj2, paramamj3, 0, 7);
/*  18:    */   }
/*  19:    */   
/*  20:    */   public aqc(ItemStack paramamj1, ItemStack paramamj2, ItemStack paramamj3, int paramInt1, int paramInt2)
/*  21:    */   {
/*  22: 28 */     this.a = paramamj1;
/*  23: 29 */     this.b = paramamj2;
/*  24: 30 */     this.c = paramamj3;
/*  25: 31 */     this.d = paramInt1;
/*  26: 32 */     this.e = paramInt2;
/*  27: 33 */     this.f = true;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public aqc(ItemStack paramamj1, ItemStack paramamj2)
/*  31:    */   {
/*  32: 37 */     this(paramamj1, null, paramamj2);
/*  33:    */   }
/*  34:    */   
/*  35:    */   public aqc(ItemStack paramamj, Item paramalq)
/*  36:    */   {
/*  37: 41 */     this(paramamj, new ItemStack(paramalq));
/*  38:    */   }
/*  39:    */   
/*  40:    */   public ItemStack a()
/*  41:    */   {
/*  42: 49 */     return this.a;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public ItemStack b()
/*  46:    */   {
/*  47: 53 */     return this.b;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public boolean c()
/*  51:    */   {
/*  52: 57 */     return this.b != null;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public ItemStack d()
/*  56:    */   {
/*  57: 61 */     return this.c;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public int e()
/*  61:    */   {
/*  62: 77 */     return this.d;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public int f()
/*  66:    */   {
/*  67: 81 */     return this.e;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void g()
/*  71:    */   {
/*  72: 85 */     this.d += 1;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void a(int paramInt)
/*  76:    */   {
/*  77: 89 */     this.e += paramInt;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public boolean h()
/*  81:    */   {
/*  82: 93 */     return this.d >= this.e;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void i()
/*  86:    */   {
/*  87: 97 */     this.d = this.e;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public boolean j()
/*  91:    */   {
/*  92:101 */     return this.f;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void a(NBTTagCompound paramfn)
/*  96:    */   {
/*  97:105 */     NBTTagCompound localfn1 = paramfn.getCompoundTag("buy");
/*  98:106 */     this.a = ItemStack.loadItemStackFromNBT(localfn1);
/*  99:107 */     NBTTagCompound localfn2 = paramfn.getCompoundTag("sell");
/* 100:108 */     this.c = ItemStack.loadItemStackFromNBT(localfn2);
/* 101:109 */     if (paramfn.hasKey("buyB", 10)) {
/* 102:110 */       this.b = ItemStack.loadItemStackFromNBT(paramfn.getCompoundTag("buyB"));
/* 103:    */     }
/* 104:112 */     if (paramfn.hasKey("uses", 99)) {
/* 105:113 */       this.d = paramfn.getInteger("uses");
/* 106:    */     }
/* 107:115 */     if (paramfn.hasKey("maxUses", 99)) {
/* 108:116 */       this.e = paramfn.getInteger("maxUses");
/* 109:    */     } else {
/* 110:118 */       this.e = 7;
/* 111:    */     }
/* 112:120 */     if (paramfn.hasKey("rewardExp", 1)) {
/* 113:121 */       this.f = paramfn.getBoolean("rewardExp");
/* 114:    */     } else {
/* 115:123 */       this.f = true;
/* 116:    */     }
/* 117:    */   }
/* 118:    */   
/* 119:    */   public NBTTagCompound k()
/* 120:    */   {
/* 121:128 */     NBTTagCompound localfn = new NBTTagCompound();
/* 122:129 */     localfn.setNBT("buy", this.a.writeToNBT(new NBTTagCompound()));
/* 123:130 */     localfn.setNBT("sell", this.c.writeToNBT(new NBTTagCompound()));
/* 124:131 */     if (this.b != null) {
/* 125:132 */       localfn.setNBT("buyB", this.b.writeToNBT(new NBTTagCompound()));
/* 126:    */     }
/* 127:134 */     localfn.setInt("uses", this.d);
/* 128:135 */     localfn.setInt("maxUses", this.e);
/* 129:136 */     localfn.setBoolean("rewardExp", this.f);
/* 130:137 */     return localfn;
/* 131:    */   }
/* 132:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aqc
 * JD-Core Version:    0.7.0.1
 */