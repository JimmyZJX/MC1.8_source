package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class azv
/*  4:   */   extends ProtoBlock
/*  5:   */ {
/*  6:   */   private final boolean a;
/*  7:   */   
/*  8:   */   public azv(boolean paramBoolean)
/*  9:   */   {
/* 10:17 */     super(Material.t);
/* 11:18 */     this.a = paramBoolean;
/* 12:20 */     if (paramBoolean) {
/* 13:21 */       a(1.0F);
/* 14:   */     }
/* 15:   */   }
/* 16:   */   
/* 17:   */   public void c(World paramaqu, BlockPosition paramdt, Block parambec)
/* 18:   */   {
/* 19:27 */     if (paramaqu.isClient) {
/* 20:28 */       return;
/* 21:   */     }
/* 22:31 */     if ((this.a) && (!paramaqu.z(paramdt))) {
/* 23:32 */       paramaqu.setBlock(paramdt, BlockList.bJ.instance(), 2);
/* 24:33 */     } else if ((!this.a) && (paramaqu.z(paramdt))) {
/* 25:34 */       paramaqu.setBlock(paramdt, BlockList.bK.instance(), 2);
/* 26:   */     }
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, ProtoBlock paramatr)
/* 30:   */   {
/* 31:40 */     if (paramaqu.isClient) {
/* 32:41 */       return;
/* 33:   */     }
/* 34:44 */     if ((this.a) && (!paramaqu.z(paramdt))) {
/* 35:45 */       paramaqu.a(paramdt, this, 4);
/* 36:46 */     } else if ((!this.a) && (paramaqu.z(paramdt))) {
/* 37:47 */       paramaqu.setBlock(paramdt, BlockList.bK.instance(), 2);
/* 38:   */     }
/* 39:   */   }
/* 40:   */   
/* 41:   */   public void b(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/* 42:   */   {
/* 43:53 */     if (paramaqu.isClient) {
/* 44:54 */       return;
/* 45:   */     }
/* 46:57 */     if ((this.a) && (!paramaqu.z(paramdt))) {
/* 47:58 */       paramaqu.setBlock(paramdt, BlockList.bJ.instance(), 2);
/* 48:   */     }
/* 49:   */   }
/* 50:   */   
/* 51:   */   public Item a(Block parambec, Random paramRandom, int paramInt)
/* 52:   */   {
/* 53:65 */     return Item.fromProtoBlock(BlockList.bJ);
/* 54:   */   }
/* 55:   */   
/* 56:   */   public Item b(World paramaqu, BlockPosition paramdt)
/* 57:   */   {
/* 58:70 */     return Item.fromProtoBlock(BlockList.bJ);
/* 59:   */   }
/* 60:   */   
/* 61:   */   protected ItemStack i(Block parambec)
/* 62:   */   {
/* 63:75 */     return new ItemStack(BlockList.bJ);
/* 64:   */   }
/* 65:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     azv
 * JD-Core Version:    0.7.0.1
 */