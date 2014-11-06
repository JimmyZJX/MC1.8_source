package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class aml
/*  4:   */   extends Item
/*  5:   */ {
/*  6:   */   public aml()
/*  7:   */   {
/*  8:17 */     setTabToDisplayOn(CreativeTabs.tabTools);
/*  9:   */   }
/* 10:   */   
/* 11:   */   public boolean a(ItemStack paramamj, EntityPlayer paramahd, World paramaqu, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 12:   */   {
/* 13:22 */     ProtoBlock localatr = paramaqu.getBlock(paramdt).getProto();
/* 14:23 */     if ((localatr instanceof avv))
/* 15:   */     {
/* 16:24 */       if (paramaqu.isClient) {
/* 17:25 */         return true;
/* 18:   */       }
/* 19:28 */       a(paramahd, paramaqu, paramdt);
/* 20:29 */       return true;
/* 21:   */     }
/* 22:31 */     return false;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public static boolean a(EntityPlayer paramahd, World paramaqu, BlockPosition paramdt)
/* 26:   */   {
/* 27:36 */     adl localadl = adl.b(paramaqu, paramdt);
/* 28:   */     
/* 29:   */ 
/* 30:39 */     boolean bool = false;
/* 31:40 */     double d = 7.0D;
/* 32:41 */     int i = paramdt.getX();
/* 33:42 */     int j = paramdt.getY();
/* 34:43 */     int k = paramdt.getZ();
/* 35:   */     
/* 36:45 */     List<EntityMob> localList = paramaqu.a(EntityMob.class, new AABB(i - d, j - d, k - d, i + d, j + d, k + d));
/* 37:46 */     for (EntityMob localxn : localList) {
/* 38:47 */       if ((localxn.cb()) && (localxn.cc() == paramahd))
/* 39:   */       {
/* 40:48 */         if (localadl == null) {
/* 41:49 */           localadl = adl.a(paramaqu, paramdt);
/* 42:   */         }
/* 43:51 */         localxn.a(localadl, true);
/* 44:52 */         bool = true;
/* 45:   */       }
/* 46:   */     }
/* 47:55 */     return bool;
/* 48:   */   }
/* 49:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aml
 * JD-Core Version:    0.7.0.1
 */