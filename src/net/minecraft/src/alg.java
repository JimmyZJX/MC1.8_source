package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Lists;
/*  2:   */ import java.util.ArrayList;
/*  3:   */ import java.util.List;
/*  4:   */ 
/*  5:   */ public class alg
/*  6:   */   extends Item
/*  7:   */ {
/*  8:   */   public boolean a(ItemStack paramamj, EntityPlayer paramahd, World paramaqu, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  9:   */   {
/* 10:38 */     if (!paramaqu.isClient)
/* 11:   */     {
/* 12:39 */       ahm localahm = new ahm(paramaqu, paramdt.getX() + paramFloat1, paramdt.getY() + paramFloat2, paramdt.getZ() + paramFloat3, paramamj);
/* 13:40 */       paramaqu.spawnEntity(localahm);
/* 14:42 */       if (!paramahd.abilities.instabuild) {
/* 15:43 */         paramamj.stackSize -= 1;
/* 16:   */       }
/* 17:45 */       return true;
/* 18:   */     }
/* 19:48 */     return false;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void a(ItemStack paramamj, EntityPlayer paramahd, List paramList, boolean paramBoolean)
/* 23:   */   {
/* 24:53 */     if (!paramamj.hasTagCompound()) {
/* 25:54 */       return;
/* 26:   */     }
/* 27:56 */     NBTTagCompound localfn1 = paramamj.getTagCompound().getCompoundTag("Fireworks");
/* 28:57 */     if (localfn1 == null) {
/* 29:58 */       return;
/* 30:   */     }
/* 31:60 */     if (localfn1.hasKey("Flight", 99)) {
/* 32:61 */       paramList.add(fi.a("item.fireworks.flight") + " " + localfn1.d("Flight"));
/* 33:   */     }
/* 34:65 */     fv localfv = localfn1.c("Explosions", 10);
/* 35:66 */     if ((localfv != null) && (localfv.c() > 0)) {
/* 36:67 */       for (int i = 0; i < localfv.c(); i++)
/* 37:   */       {
/* 38:68 */         NBTTagCompound localfn2 = localfv.b(i);
/* 39:   */         
/* 40:70 */         ArrayList localArrayList = Lists.newArrayList();
/* 41:71 */         alf.a(localfn2, localArrayList);
/* 42:73 */         if (localArrayList.size() > 0)
/* 43:   */         {
/* 44:74 */           for (int j = 1; j < localArrayList.size(); j++) {
/* 45:75 */             localArrayList.set(j, "  " + (String)localArrayList.get(j));
/* 46:   */           }
/* 47:78 */           paramList.addAll(localArrayList);
/* 48:   */         }
/* 49:   */       }
/* 50:   */     }
/* 51:   */   }
/* 52:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     alg
 * JD-Core Version:    0.7.0.1
 */