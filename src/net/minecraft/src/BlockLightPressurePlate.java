package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class BlockLightPressurePlate
/*  4:   */   extends BlockPressurePlate
/*  5:   */ {
/*  6:17 */   public static final BlockDataBoolean a = BlockDataBoolean.getInstance("powered");
/*  7:   */   private final azh b;
/*  8:   */   
/*  9:   */   protected BlockLightPressurePlate(Material parambof, azh paramazh)
/* 10:   */   {
/* 11:26 */     super(parambof);
/* 12:27 */     j(this.L.b().setData(a, Boolean.valueOf(false)));
/* 13:28 */     this.b = paramazh;
/* 14:   */   }
/* 15:   */   
/* 16:   */   protected int e(Block parambec)
/* 17:   */   {
/* 18:38 */     return ((Boolean)parambec.getData(a)).booleanValue() ? 15 : 0;
/* 19:   */   }
/* 20:   */   
/* 21:   */   protected Block a(Block parambec, int paramInt)
/* 22:   */   {
/* 23:43 */     return parambec.setData(a, Boolean.valueOf(paramInt > 0));
/* 24:   */   }
/* 25:   */   
/* 26:   */   protected int e(World paramaqu, BlockPosition paramdt)
/* 27:   */   {
/* 28:48 */     AABB localbrt = a(paramdt);
/* 29:   */     List<? extends Entity> localList;
/* 30:51 */     switch (azg.a[this.b.ordinal()])
/* 31:   */     {
/* 32:   */     case 1: 
/* 33:53 */       localList = paramaqu.b(null, localbrt);
/* 34:54 */       break;
/* 35:   */     case 2: 
/* 36:56 */       localList = paramaqu.getEntityList(EntityLiving.class, localbrt);
/* 37:57 */       break;
/* 38:   */     default: 
/* 39:59 */       return 0;
/* 40:   */     }
/* 41:62 */     if (!localList.isEmpty()) {
/* 42:63 */       for (Entity localwv : localList) {
/* 43:64 */         if (!localwv.aH()) {
/* 44:65 */           return 15;
/* 45:   */         }
/* 46:   */       }
/* 47:   */     }
/* 48:70 */     return 0;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public Block instance(int paramInt)
/* 52:   */   {
/* 53:75 */     return instance().setData(a, Boolean.valueOf(paramInt == 1));
/* 54:   */   }
/* 55:   */   
/* 56:   */   public int c(Block parambec)
/* 57:   */   {
/* 58:81 */     return ((Boolean)parambec.getData(a)).booleanValue() ? 1 : 0;
/* 59:   */   }
/* 60:   */   
/* 61:   */   protected bed e()
/* 62:   */   {
/* 63:86 */     return new bed(this, new IBlockData[] { a });
/* 64:   */   }
/* 65:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     azf
 * JD-Core Version:    0.7.0.1
 */