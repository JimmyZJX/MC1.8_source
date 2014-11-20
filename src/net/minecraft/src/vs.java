package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class vs
/*  4:   */ {
/*  5:13 */   private static final Random a = new Random();
/*  6:   */   
/*  7:   */   public static void a(World paramaqu, BlockPosition paramdt, vq paramvq)
/*  8:   */   {
/*  9:16 */     a(paramaqu, paramdt.getX(), paramdt.getY(), paramdt.getZ(), paramvq);
/* 10:   */   }
/* 11:   */   
/* 12:   */   public static void a(World paramaqu, Entity paramwv, vq paramvq)
/* 13:   */   {
/* 14:20 */     a(paramaqu, paramwv.xPos, paramwv.yPos, paramwv.zPos, paramvq);
/* 15:   */   }
/* 16:   */   
/* 17:   */   private static void a(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, vq paramvq)
/* 18:   */   {
/* 19:24 */     for (int i = 0; i < paramvq.getSize(); i++)
/* 20:   */     {
/* 21:25 */       ItemStack localamj = paramvq.get(i);
/* 22:26 */       if (localamj != null) {
/* 23:30 */         a(paramaqu, paramDouble1, paramDouble2, paramDouble3, localamj);
/* 24:   */       }
/* 25:   */     }
/* 26:   */   }
/* 27:   */   
/* 28:   */   private static void a(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, ItemStack paramamj)
/* 29:   */   {
/* 30:35 */     float f1 = a.nextFloat() * 0.8F + 0.1F;
/* 31:36 */     float f2 = a.nextFloat() * 0.8F + 0.1F;
/* 32:37 */     float f3 = a.nextFloat() * 0.8F + 0.1F;
/* 33:39 */     while (paramamj.stackSize > 0)
/* 34:   */     {
/* 35:40 */       int i = a.nextInt(21) + 10;
/* 36:41 */       if (i > paramamj.stackSize) {
/* 37:42 */         i = paramamj.stackSize;
/* 38:   */       }
/* 39:44 */       paramamj.stackSize -= i;
/* 40:   */       
/* 41:46 */       EntityItem item = new EntityItem(paramaqu, paramDouble1 + f1, paramDouble2 + f2, paramDouble3 + f3, new ItemStack(paramamj.getItem(), i, paramamj.getDamage2()));
/* 42:47 */       if (paramamj.hasTagCompound()) {
/* 43:48 */         item.getItemStack().setTagCompound((NBTTagCompound)paramamj.getTagCompound().b());
/* 44:   */       }
/* 45:51 */       float f4 = 0.05F;
/* 46:52 */       item.xVelocity = (a.nextGaussian() * f4);
/* 47:53 */       item.yVelocity = (a.nextGaussian() * f4 + 0.2000000029802322D);
/* 48:54 */       item.zVelocity = (a.nextGaussian() * f4);
/* 49:   */       
/* 50:56 */       paramaqu.spawnEntity(item);
/* 51:   */     }
/* 52:   */   }
/* 53:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     vs
 * JD-Core Version:    0.7.0.1
 */