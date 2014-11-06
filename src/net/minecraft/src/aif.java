package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ class aif
/*   4:    */   extends ajk
/*   5:    */ {
				private final World a;
				private final BlockPosition b;
				private final aid c;
/*   6:    */   aif(aid paramaid, vq paramvq, int paramInt1, int paramInt2, int paramInt3, World paramaqu, BlockPosition paramdt)
/*   7:    */   {
/*   8: 67 */     super(paramvq, paramInt1, paramInt2, paramInt3);
				  a=paramaqu;b=paramdt;c=paramaid;
/*   9:    */   }
/*  10:    */   
/*  11:    */   public boolean a(ItemStack paramamj)
/*  12:    */   {
/*  13: 70 */     return false;
/*  14:    */   }
/*  15:    */   
/*  16:    */   public boolean a(EntityPlayer paramahd)
/*  17:    */   {
/*  18: 75 */     return ((paramahd.by.d) || (paramahd.bz >= this.c.a)) && (this.c.a > 0) && (e());
/*  19:    */   }
/*  20:    */   
/*  21:    */   public void a(EntityPlayer paramahd, ItemStack paramamj)
/*  22:    */   {
/*  23: 80 */     if (!paramahd.by.d) {
/*  24: 81 */       paramahd.a(-this.c.a);
/*  25:    */     }
/*  26: 83 */     aid.a(this.c).a(0, null);
/*  27: 84 */     if (aid.b(this.c) > 0)
/*  28:    */     {
/*  29: 85 */       ItemStack localObject = aid.a(this.c).a(1);
/*  30: 86 */       if ((localObject != null) && (((ItemStack)localObject).stackSize > aid.b(this.c)))
/*  31:    */       {
/*  32: 87 */         localObject.stackSize -= aid.b(this.c);
/*  33: 88 */         aid.a(this.c).a(1, (ItemStack)localObject);
/*  34:    */       }
/*  35:    */       else
/*  36:    */       {
/*  37: 90 */         aid.a(this.c).a(1, null);
/*  38:    */       }
/*  39:    */     }
/*  40:    */     else
/*  41:    */     {
/*  42: 93 */       aid.a(this.c).a(1, null);
/*  43:    */     }
/*  44: 95 */     this.c.a = 0;
/*  45:    */     
/*  46: 97 */     Object localObject = this.a.getBlock(this.b);
/*  47: 98 */     if ((!paramahd.by.d) && (!this.a.isClient) && (((Block)localObject).getProto() == BlockList.cf) && (paramahd.bb().nextFloat() < 0.12F))
/*  48:    */     {
/*  49: 99 */       int i = ((Integer)((Block)localObject).getProperty(BlockAnvil.b)).intValue();
/*  50:100 */       i++;
/*  51:100 */       if (i > 2)
/*  52:    */       {
/*  53:101 */         this.a.g(this.b);
/*  54:102 */         this.a.playLevelEvent(1020, this.b, 0);
/*  55:    */       }
/*  56:    */       else
/*  57:    */       {
/*  58:104 */         this.a.setBlock(this.b, ((Block)localObject).a(BlockAnvil.b, Integer.valueOf(i)), 2);
/*  59:105 */         this.a.playLevelEvent(1021, this.b, 0);
/*  60:    */       }
/*  61:    */     }
/*  62:107 */     else if (!this.a.isClient)
/*  63:    */     {
/*  64:108 */       this.a.playLevelEvent(1021, this.b, 0);
/*  65:    */     }
/*  66:    */   }
/*  67:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aif
 * JD-Core Version:    0.7.0.1
 */