package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Lists;
/*  2:   */ import java.util.ArrayList;
/*  3:   */ import java.util.Collections;
/*  4:   */ import java.util.List;
/*  5:   */ import java.util.Random;
/*  6:   */ 
/*  7:   */ public class vl
/*  8:   */   extends WeightedRandomItem
/*  9:   */ {
/* 10:   */   private ItemStack b;
/* 11:   */   private int c;
/* 12:   */   private int d;
/* 13:   */   
/* 14:   */   public vl(Item paramalq, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/* 15:   */   {
/* 16:19 */     super(paramInt4);
/* 17:20 */     this.b = new ItemStack(paramalq, 1, paramInt1);
/* 18:21 */     this.c = paramInt2;
/* 19:22 */     this.d = paramInt3;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public vl(ItemStack paramamj, int paramInt1, int paramInt2, int paramInt3)
/* 23:   */   {
/* 24:26 */     super(paramInt3);
/* 25:27 */     this.b = paramamj;
/* 26:28 */     this.c = paramInt1;
/* 27:29 */     this.d = paramInt2;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public static void a(Random paramRandom, List paramList, vq paramvq, int paramInt)
/* 31:   */   {
/* 32:33 */     for (int i = 0; i < paramInt; i++)
/* 33:   */     {
/* 34:34 */       vl localvl = (vl)WeightedRandom.getRandomItem(paramRandom, paramList);
/* 35:35 */       int j = localvl.c + paramRandom.nextInt(localvl.d - localvl.c + 1);
/* 36:37 */       if (localvl.b.getMaxStackSize() >= j)
/* 37:   */       {
/* 38:38 */         ItemStack localamj1 = localvl.b.k();
/* 39:39 */         localamj1.stackSize = j;
/* 40:40 */         paramvq.a(paramRandom.nextInt(paramvq.n_()), localamj1);
/* 41:   */       }
/* 42:   */       else
/* 43:   */       {
/* 44:43 */         for (int k = 0; k < j; k++)
/* 45:   */         {
/* 46:44 */           ItemStack localamj2 = localvl.b.k();
/* 47:45 */           localamj2.stackSize = 1;
/* 48:46 */           paramvq.a(paramRandom.nextInt(paramvq.n_()), localamj2);
/* 49:   */         }
/* 50:   */       }
/* 51:   */     }
/* 52:   */   }
/* 53:   */   
/* 54:   */   public static void a(Random paramRandom, List paramList, bcx parambcx, int paramInt)
/* 55:   */   {
/* 56:53 */     for (int i = 0; i < paramInt; i++)
/* 57:   */     {
/* 58:54 */       vl localvl = (vl)WeightedRandom.getRandomItem(paramRandom, paramList);
/* 59:55 */       int j = localvl.c + paramRandom.nextInt(localvl.d - localvl.c + 1);
/* 60:57 */       if (localvl.b.getMaxStackSize() >= j)
/* 61:   */       {
/* 62:58 */         ItemStack localamj1 = localvl.b.k();
/* 63:59 */         localamj1.stackSize = j;
/* 64:60 */         parambcx.a(paramRandom.nextInt(parambcx.n_()), localamj1);
/* 65:   */       }
/* 66:   */       else
/* 67:   */       {
/* 68:63 */         for (int k = 0; k < j; k++)
/* 69:   */         {
/* 70:64 */           ItemStack localamj2 = localvl.b.k();
/* 71:65 */           localamj2.stackSize = 1;
/* 72:66 */           parambcx.a(paramRandom.nextInt(parambcx.n_()), localamj2);
/* 73:   */         }
/* 74:   */       }
/* 75:   */     }
/* 76:   */   }
/* 77:   */   
/* 78:   */   public static List a(List paramList, vl... paramVarArgs)
/* 79:   */   {
/* 80:73 */     ArrayList localArrayList = Lists.newArrayList(paramList);
/* 81:74 */     Collections.addAll(localArrayList, paramVarArgs);
/* 82:   */     
/* 83:76 */     return localArrayList;
/* 84:   */   }
/* 85:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     vl
 * JD-Core Version:    0.7.0.1
 */