package net.minecraft.src;
/*  1:   */ public class anc
/*  2:   */   extends Item
/*  3:   */ {
/*  4:   */   private ProtoBlock a;
/*  5:   */   private ProtoBlock b;
/*  6:   */   
/*  7:   */   public anc(ProtoBlock paramatr1, ProtoBlock paramatr2)
/*  8:   */   {
/*  9:14 */     this.a = paramatr1;
/* 10:15 */     this.b = paramatr2;
/* 11:16 */     setTabToDisplayOn(CreativeTabs.tabMaterials);
/* 12:   */   }
/* 13:   */   
/* 14:   */   public boolean a(ItemStack paramamj, EntityPlayer paramahd, World paramaqu, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 15:   */   {
/* 16:21 */     if (paramej != EnumDirection.UP) {
/* 17:22 */       return false;
/* 18:   */     }
/* 19:25 */     if (!paramahd.a(paramdt.a(paramej), paramej, paramamj)) {
/* 20:26 */       return false;
/* 21:   */     }
/* 22:29 */     if ((paramaqu.getBlock(paramdt).getProto() == this.b) && (paramaqu.d(paramdt.up())))
/* 23:   */     {
/* 24:30 */       paramaqu.setBlock(paramdt.up(), this.a.instance());
/* 25:31 */       paramamj.stackSize -= 1;
/* 26:32 */       return true;
/* 27:   */     }
/* 28:34 */     return false;
/* 29:   */   }
/* 30:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     anc
 * JD-Core Version:    0.7.0.1
 */