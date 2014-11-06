package net.minecraft.src;
/*  1:   */ public class anb
/*  2:   */   extends all
/*  3:   */ {
/*  4:   */   private ProtoBlock b;
/*  5:   */   private ProtoBlock c;
/*  6:   */   
/*  7:   */   public anb(int paramInt, float paramFloat, ProtoBlock paramatr1, ProtoBlock paramatr2)
/*  8:   */   {
/*  9:14 */     super(paramInt, paramFloat, false);
/* 10:   */     
/* 11:16 */     this.b = paramatr1;
/* 12:17 */     this.c = paramatr2;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public boolean a(ItemStack paramamj, EntityPlayer paramahd, World paramaqu, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 16:   */   {
/* 17:22 */     if (paramej != EnumDirection.UP) {
/* 18:23 */       return false;
/* 19:   */     }
/* 20:26 */     if (!paramahd.a(paramdt.a(paramej), paramej, paramamj)) {
/* 21:27 */       return false;
/* 22:   */     }
/* 23:30 */     if ((paramaqu.getBlock(paramdt).getProto() == this.c) && (paramaqu.d(paramdt.up())))
/* 24:   */     {
/* 25:31 */       paramaqu.setBlock(paramdt.up(), this.b.instance());
/* 26:32 */       paramamj.stackSize -= 1;
/* 27:33 */       return true;
/* 28:   */     }
/* 29:35 */     return false;
/* 30:   */   }
/* 31:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     anb
 * JD-Core Version:    0.7.0.1
 */