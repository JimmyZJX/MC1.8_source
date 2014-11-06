package net.minecraft.src;
/*  1:   */ public class ItemFrame
/*  2:   */   extends Item
/*  3:   */ {
/*  4:   */   private final Class a;
/*  5:   */   
/*  6:   */   public ItemFrame(Class paramClass)
/*  7:   */   {
/*  8:15 */     this.a = paramClass;
/*  9:16 */     setTabToDisplayOn(CreativeTabs.tabDeco);
/* 10:   */   }
/* 11:   */   
/* 12:   */   public boolean a(ItemStack paramamj, EntityPlayer paramahd, World paramaqu, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 13:   */   {
/* 14:21 */     if (paramej == EnumDirection.DOWN) {
/* 15:22 */       return false;
/* 16:   */     }
/* 17:24 */     if (paramej == EnumDirection.UP) {
/* 18:25 */       return false;
/* 19:   */     }
/* 20:28 */     BlockPosition localdt = paramdt.a(paramej);
/* 21:30 */     if (!paramahd.a(localdt, paramej, paramamj)) {
/* 22:31 */       return false;
/* 23:   */     }
/* 24:34 */     EntityFrame localadj = a(paramaqu, localdt, paramej);
/* 25:35 */     if ((localadj != null) && (localadj.j()))
/* 26:   */     {
/* 27:36 */       if (!paramaqu.isClient) {
/* 28:37 */         paramaqu.spawnEntity(localadj);
/* 29:   */       }
/* 30:39 */       paramamj.stackSize -= 1;
/* 31:   */     }
/* 32:41 */     return true;
/* 33:   */   }
/* 34:   */   
/* 35:   */   private EntityFrame a(World paramaqu, BlockPosition paramdt, EnumDirection paramej)
/* 36:   */   {
/* 37:45 */     if (this.a == adm.class) {
/* 38:46 */       return new adm(paramaqu, paramdt, paramej);
/* 39:   */     }
/* 40:47 */     if (this.a == EntityItemFrame.class) {
/* 41:48 */       return new EntityItemFrame(paramaqu, paramdt, paramej);
/* 42:   */     }
/* 43:50 */     return null;
/* 44:   */   }
/* 45:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aln
 * JD-Core Version:    0.7.0.1
 */