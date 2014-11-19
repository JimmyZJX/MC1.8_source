package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ import java.util.Random;
/*  3:   */ 
/*  4:   */ public class avq
/*  5:   */   extends ProtoBlock
/*  6:   */ {
/*  7:22 */   public static final BlockDataDirection a = BlockDataDirection.getInstance("facing", en.HORIZONTAL);
/*  8:23 */   public static final BlockDataBoolean b = BlockDataBoolean.a("eye");
/*  9:   */   
/* 10:   */   public avq()
/* 11:   */   {
/* 12:26 */     super(Material.rock);
/* 13:27 */     j(this.L.b().a(a, EnumDirection.NORTH).a(b, Boolean.valueOf(false)));
/* 14:   */   }
/* 15:   */   
/* 16:   */   public boolean c()
/* 17:   */   {
/* 18:32 */     return false;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void h()
/* 22:   */   {
/* 23:37 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, AABB parambrt, List paramList, Entity paramwv)
/* 27:   */   {
/* 28:42 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
/* 29:43 */     super.a(paramaqu, paramdt, parambec, parambrt, paramList, paramwv);
/* 30:45 */     if (((Boolean)paramaqu.getBlock(paramdt).getProperty(b)).booleanValue())
/* 31:   */     {
/* 32:46 */       a(0.3125F, 0.8125F, 0.3125F, 0.6875F, 1.0F, 0.6875F);
/* 33:47 */       super.a(paramaqu, paramdt, parambec, parambrt, paramList, paramwv);
/* 34:   */     }
/* 35:49 */     h();
/* 36:   */   }
/* 37:   */   
/* 38:   */   public Item a(Block parambec, Random paramRandom, int paramInt)
/* 39:   */   {
/* 40:55 */     return null;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public Block a(World paramaqu, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, EntityLiving paramxm)
/* 44:   */   {
/* 45:60 */     return instance().a(a, paramxm.aO().d()).a(b, Boolean.valueOf(false));
/* 46:   */   }
/* 47:   */   
/* 48:   */   public boolean N()
/* 49:   */   {
/* 50:65 */     return true;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public int l(World paramaqu, BlockPosition paramdt)
/* 54:   */   {
/* 55:70 */     if (((Boolean)paramaqu.getBlock(paramdt).getProperty(b)).booleanValue()) {
/* 56:71 */       return 15;
/* 57:   */     }
/* 58:74 */     return 0;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public Block a(int paramInt)
/* 62:   */   {
/* 63:79 */     return instance().a(b, Boolean.valueOf((paramInt & 0x4) != 0)).a(a, EnumDirection.b(paramInt & 0x3));
/* 64:   */   }
/* 65:   */   
/* 66:   */   public int c(Block parambec)
/* 67:   */   {
/* 68:86 */     int i = 0;
/* 69:   */     
/* 70:88 */     i |= ((EnumDirection)parambec.getProperty(a)).b();
/* 71:90 */     if (((Boolean)parambec.getProperty(b)).booleanValue()) {
/* 72:91 */       i |= 0x4;
/* 73:   */     }
/* 74:94 */     return i;
/* 75:   */   }
/* 76:   */   
/* 77:   */   protected bed e()
/* 78:   */   {
/* 79:99 */     return new bed(this, new IBlockData[] { a, b });
/* 80:   */   }
/* 81:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     avq
 * JD-Core Version:    0.7.0.1
 */