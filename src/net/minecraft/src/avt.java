package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class avt
/*  4:   */   extends BlockType
/*  5:   */ {
/*  6:   */   public static boolean M;
/*  7:   */   
/*  8:   */   public avt()
/*  9:   */   {
/* 10:16 */     super(Material.p);
/* 11:17 */     setCreativeTab(CreativeTabs.tabBlock);
/* 12:   */   }
/* 13:   */   
/* 14:   */   public avt(Material parambof)
/* 15:   */   {
/* 16:21 */     super(parambof);
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void c(World paramaqu, BlockPosition paramdt, Block parambec)
/* 20:   */   {
/* 21:26 */     paramaqu.a(paramdt, this, a(paramaqu));
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, BlockType paramatr)
/* 25:   */   {
/* 26:31 */     paramaqu.a(paramdt, this, a(paramaqu));
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void b(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/* 30:   */   {
/* 31:36 */     if (!paramaqu.isClient) {
/* 32:37 */       e(paramaqu, paramdt);
/* 33:   */     }
/* 34:   */   }
/* 35:   */   
/* 36:   */   private void e(World paramaqu, BlockPosition paramdt)
/* 37:   */   {
/* 38:42 */     if ((!d(paramaqu, paramdt.down())) || (paramdt.getY() < 0)) {
/* 39:43 */       return;
/* 40:   */     }
/* 41:46 */     int i = 32;
/* 42:   */     Object localObject;
/* 43:47 */     if ((M) || (!paramaqu.a(paramdt.offset(-i, -i, -i), paramdt.offset(i, i, i))))
/* 44:   */     {
/* 45:48 */       paramaqu.g(paramdt);
/* 46:   */       
/* 47:50 */       localObject = paramdt.down();
/* 48:51 */       while ((d(paramaqu, (BlockPosition)localObject)) && (((BlockPosition)localObject).getY() > 0)) {
/* 49:52 */         localObject = ((BlockPosition)localObject).down();
/* 50:   */       }
/* 51:54 */       if (((BlockPosition)localObject).getY() > 0) {
/* 52:56 */         paramaqu.setBlock(((BlockPosition)localObject).up(), instance());
/* 53:   */       }
/* 54:   */     }
/* 55:58 */     else if (!paramaqu.isClient)
/* 56:   */     {
/* 57:59 */       localObject = new adv(paramaqu, paramdt.getX() + 0.5D, paramdt.getY(), paramdt.getZ() + 0.5D, paramaqu.getBlock(paramdt));
/* 58:60 */       a((adv)localObject);
/* 59:61 */       paramaqu.spawnEntity((Entity)localObject);
/* 60:   */     }
/* 61:   */   }
/* 62:   */   
/* 63:   */   protected void a(adv paramadv) {}
/* 64:   */   
/* 65:   */   public int a(World paramaqu)
/* 66:   */   {
/* 67:70 */     return 2;
/* 68:   */   }
/* 69:   */   
/* 70:   */   public static boolean d(World paramaqu, BlockPosition paramdt)
/* 71:   */   {
/* 72:75 */     BlockType localatr = paramaqu.getBlock(paramdt).getType();
/* 73:76 */     Material localbof = localatr.material;
/* 74:77 */     return (localatr == BlockList.fire) || (localbof == Material.air) || (localbof == Material.water) || (localbof == Material.lava);
/* 75:   */   }
/* 76:   */   
/* 77:   */   public void a_(World paramaqu, BlockPosition paramdt) {}
/* 78:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     avt
 * JD-Core Version:    0.7.0.1
 */