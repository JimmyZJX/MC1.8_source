package net.minecraft.src;
/*  1:   */ public class anj
/*  2:   */   extends aju
/*  3:   */ {
/*  4:   */   public anj(BlockType paramatr)
/*  5:   */   {
/*  6:13 */     super(paramatr);
/*  7:   */     
/*  8:15 */     setMaxDamage(0);
/*  9:16 */     a(true);
/* 10:   */   }
/* 11:   */   
/* 12:   */   public boolean a(ItemStack paramamj, EntityPlayer paramahd, World paramaqu, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 13:   */   {
/* 14:21 */     if (paramamj.stackSize == 0) {
/* 15:22 */       return false;
/* 16:   */     }
/* 17:24 */     if (!paramahd.a(paramdt, paramej, paramamj)) {
/* 18:25 */       return false;
/* 19:   */     }
/* 20:28 */     Block localbec1 = paramaqu.getBlock(paramdt);
/* 21:29 */     BlockType localatr = localbec1.getType();
/* 22:31 */     if ((localatr != this.a) && (paramej != EnumDirection.UP))
/* 23:   */     {
/* 24:32 */       paramdt = paramdt.offset(paramej);
/* 25:33 */       localbec1 = paramaqu.getBlock(paramdt);
/* 26:34 */       localatr = localbec1.getType();
/* 27:   */     }
/* 28:37 */     if (localatr == this.a)
/* 29:   */     {
/* 30:38 */       int i = ((Integer)localbec1.getData(BlockSnowLayer.a)).intValue();
/* 31:40 */       if (i <= 7)
/* 32:   */       {
/* 33:41 */         Block localbec2 = localbec1.setData(BlockSnowLayer.a, Integer.valueOf(i + 1));
/* 34:42 */         if ((paramaqu.isCollisionFree(this.a.a(paramaqu, paramdt, localbec2))) && (paramaqu.setBlock(paramdt, localbec2, 2)))
/* 35:   */         {
/* 36:43 */           paramaqu.a(paramdt.getX() + 0.5F, paramdt.getY() + 0.5F, paramdt.getZ() + 0.5F, this.a.H.b(), (this.a.H.d() + 1.0F) / 2.0F, this.a.H.e() * 0.8F);
/* 37:44 */           paramamj.stackSize -= 1;
/* 38:45 */           return true;
/* 39:   */         }
/* 40:   */       }
/* 41:   */     }
/* 42:50 */     return super.a(paramamj, paramahd, paramaqu, paramdt, paramej, paramFloat1, paramFloat2, paramFloat3);
/* 43:   */   }
/* 44:   */   
/* 45:   */   public int a(int paramInt)
/* 46:   */   {
/* 47:55 */     return paramInt;
/* 48:   */   }
/* 49:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     anj
 * JD-Core Version:    0.7.0.1
 */