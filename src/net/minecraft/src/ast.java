package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ import java.util.Random;
/*  3:   */ 
/*  4:   */ public class ast
/*  5:   */   extends arm
/*  6:   */ {
/*  7:   */   protected ast(int paramInt)
/*  8:   */   {
/*  9:18 */     super(paramInt);
/* 10:19 */     this.as.A = 2;
/* 11:20 */     this.as.B = 1;
/* 12:21 */     this.as.D = 1;
/* 13:22 */     this.as.E = 8;
/* 14:23 */     this.as.F = 10;
/* 15:24 */     this.as.J = 1;
/* 16:25 */     this.as.z = 4;
/* 17:26 */     this.as.I = 0;
/* 18:27 */     this.as.H = 0;
/* 19:28 */     this.as.C = 5;
/* 20:   */     
/* 21:30 */     this.ar = 14745518;
/* 22:   */     
/* 23:32 */     this.at.add(new SpawnListEntry(EntitySlime.class, 1, 1, 1));
/* 24:   */   }
/* 25:   */   
/* 26:   */   public bhc a(Random paramRandom)
/* 27:   */   {
/* 28:37 */     return this.aC;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public int b(BlockPosition paramdt)
/* 32:   */   {
/* 33:42 */     double d = af.a(paramdt.getX() * 0.0225D, paramdt.getZ() * 0.0225D);
/* 34:43 */     if (d < -0.1D) {
/* 35:44 */       return 5011004;
/* 36:   */     }
/* 37:46 */     return 6975545;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public int c(BlockPosition paramdt)
/* 41:   */   {
/* 42:51 */     return 6975545;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public EnumFlowerVariant a(Random paramRandom, BlockPosition paramdt)
/* 46:   */   {
/* 47:56 */     return EnumFlowerVariant.c;
/* 48:   */   }
/* 49:   */   
/* 50:   */   public void a(World paramaqu, Random paramRandom, bgk parambgk, int paramInt1, int paramInt2, double paramDouble)
/* 51:   */   {
/* 52:61 */     double d = af.a(paramInt1 * 0.25D, paramInt2 * 0.25D);
/* 53:62 */     if (d > 0.0D)
/* 54:   */     {
/* 55:63 */       int i = paramInt1 & 0xF;
/* 56:64 */       int j = paramInt2 & 0xF;
/* 57:65 */       for (int k = 255; k >= 0; k--) {
/* 58:66 */         if (parambgk.a(j, k, i).getProto().getMaterial() != Material.air)
/* 59:   */         {
/* 60:67 */           if ((k != 62) || (parambgk.a(j, k, i).getProto() == BlockList.water)) {
/* 61:   */             break;
/* 62:   */           }
/* 63:68 */           parambgk.a(j, k, i, BlockList.water.instance());
/* 64:69 */           if (d >= 0.12D) {
/* 65:   */             break;
/* 66:   */           }
/* 67:70 */           parambgk.a(j, k + 1, i, BlockList.waterLily.instance()); break;
/* 68:   */         }
/* 69:   */       }
/* 70:   */     }
/* 71:78 */     b(paramaqu, paramRandom, parambgk, paramInt1, paramInt2, paramDouble);
/* 72:   */   }
/* 73:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ast
 * JD-Core Version:    0.7.0.1
 */