package net.minecraft.src;
import java.io.IOException;
/*   1:    */ import java.util.ArrayList;
/*   2:    */ 
/*   3:    */ public class TradeOfferList
/*   4:    */   extends ArrayList<TradeOffer>
/*   5:    */ {
/*   6:    */   public TradeOfferList() {}
/*   7:    */   
/*   8:    */   public TradeOfferList(NBTTagCompound paramfn)
/*   9:    */   {
/*  10: 22 */     a(paramfn);
/*  11:    */   }
/*  12:    */   
/*  13:    */   public TradeOffer a(ItemStack paramamj1, ItemStack paramamj2, int paramInt)
/*  14:    */   {
/*  15: 27 */     if ((paramInt > 0) && (paramInt < size()))
/*  16:    */     {
/*  17: 29 */       TradeOffer localaqc1 = (TradeOffer)get(paramInt);
/*  18: 30 */       if ((ItemStack.c(paramamj1, localaqc1.getItemBought())) && (((paramamj2 == null) && (!localaqc1.buysTwoStacks())) || ((localaqc1.buysTwoStacks()) && (ItemStack.c(paramamj2, localaqc1.getItemBoughtB())) && 
/*  19: 31 */         (paramamj1.stackSize >= localaqc1.getItemBought().stackSize) && ((!localaqc1.buysTwoStacks()) || (paramamj2.stackSize >= localaqc1.getItemBoughtB().stackSize))))) {
/*  20: 32 */         return localaqc1;
/*  21:    */       }
/*  22: 35 */       return null;
/*  23:    */     }
/*  24: 37 */     for (int i = 0; i < size(); i++)
/*  25:    */     {
/*  26: 38 */       TradeOffer localaqc2 = (TradeOffer)get(i);
/*  27: 39 */       if ((ItemStack.c(paramamj1, localaqc2.getItemBought())) && (paramamj1.stackSize >= localaqc2.getItemBought().stackSize) && (((!localaqc2.buysTwoStacks()) && (paramamj2 == null)) || ((localaqc2.buysTwoStacks()) && (ItemStack.c(paramamj2, localaqc2.getItemBoughtB())) && (paramamj2.stackSize >= localaqc2.getItemBoughtB().stackSize)))) {
/*  28: 40 */         return localaqc2;
/*  29:    */       }
/*  30:    */     }
/*  31: 43 */     return null;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void a(ByteBufWrapper paramhd)
/*  35:    */   {
/*  36: 72 */     paramhd.writeByte((byte)(size() & 0xFF));
/*  37: 73 */     for (int i = 0; i < size(); i++)
/*  38:    */     {
/*  39: 74 */       TradeOffer localaqc = (TradeOffer)get(i);
/*  40: 75 */       paramhd.a(localaqc.getItemBought());
/*  41: 76 */       paramhd.a(localaqc.getItemSold());
/*  42:    */       
/*  43: 78 */       ItemStack localamj = localaqc.getItemBoughtB();
/*  44: 79 */       paramhd.writeBoolean(localamj != null);
/*  45: 80 */       if (localamj != null) {
/*  46: 81 */         paramhd.a(localamj);
/*  47:    */       }
/*  48: 83 */       paramhd.writeBoolean(localaqc.isBlocked());
/*  49: 84 */       paramhd.writeInt(localaqc.getUses());
/*  50: 85 */       paramhd.writeInt(localaqc.getMaxUses());
/*  51:    */     }
/*  52:    */   }
/*  53:    */   
/*  54:    */   public static TradeOfferList b(ByteBufWrapper paramhd) throws IOException
/*  55:    */   {
/*  56: 90 */     TradeOfferList localaqd = new TradeOfferList();
/*  57:    */     
/*  58: 92 */     int i = paramhd.readByte() & 0xFF;
/*  59: 93 */     for (int j = 0; j < i; j++)
/*  60:    */     {
/*  61: 94 */       ItemStack localamj1 = paramhd.i();
/*  62: 95 */       ItemStack localamj2 = paramhd.i();
/*  63:    */       
/*  64: 97 */       ItemStack localamj3 = null;
/*  65: 98 */       if (paramhd.readBoolean()) {
/*  66: 99 */         localamj3 = paramhd.i();
/*  67:    */       }
/*  68:101 */       boolean bool = paramhd.readBoolean();
/*  69:102 */       int k = paramhd.readInt();
/*  70:103 */       int m = paramhd.readInt();
/*  71:    */       
/*  72:105 */       TradeOffer localaqc = new TradeOffer(localamj1, localamj3, localamj2, k, m);
/*  73:106 */       if (bool) {
/*  74:107 */         localaqc.block();
/*  75:    */       }
/*  76:109 */       localaqd.add(localaqc);
/*  77:    */     }
/*  78:111 */     return localaqd;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void a(NBTTagCompound paramfn)
/*  82:    */   {
/*  83:115 */     fv localfv = paramfn.c("Recipes", 10);
/*  84:117 */     for (int i = 0; i < localfv.c(); i++)
/*  85:    */     {
/*  86:118 */       NBTTagCompound localfn = localfv.b(i);
/*  87:119 */       add(new TradeOffer(localfn));
/*  88:    */     }
/*  89:    */   }
/*  90:    */   
/*  91:    */   public NBTTagCompound a()
/*  92:    */   {
/*  93:124 */     NBTTagCompound localfn = new NBTTagCompound();
/*  94:    */     
/*  95:126 */     fv localfv = new fv();
/*  96:127 */     for (int i = 0; i < size(); i++)
/*  97:    */     {
/*  98:128 */       TradeOffer localaqc = (TradeOffer)get(i);
/*  99:129 */       localfv.a(localaqc.writeToNBT());
/* 100:    */     }
/* 101:131 */     localfn.setNBT("Recipes", localfv);
/* 102:132 */     return localfn;
/* 103:    */   }
/* 104:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aqd
 * JD-Core Version:    0.7.0.1
 */