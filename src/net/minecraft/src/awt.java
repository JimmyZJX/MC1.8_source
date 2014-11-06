package net.minecraft.src;
/*  1:   */ public class awt
/*  2:   */   extends ProtoBlock
/*  3:   */ {
/*  4:   */   private boolean a;
/*  5:   */   
/*  6:   */   protected awt(Material parambof, boolean paramBoolean)
/*  7:   */   {
/*  8:13 */     super(parambof);
/*  9:14 */     this.a = paramBoolean;
/* 10:   */   }
/* 11:   */   
/* 12:   */   public boolean c()
/* 13:   */   {
/* 14:19 */     return false;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public boolean a(IBlockAccess paramard, BlockPosition paramdt, EnumDirection paramej)
/* 18:   */   {
/* 19:24 */     Block localbec = paramard.getBlock(paramdt);
/* 20:25 */     ProtoBlock localatr = localbec.getProto();
/* 21:27 */     if ((this == BlockList.w) || (this == BlockList.cG))
/* 22:   */     {
/* 23:28 */       if (paramard.getBlock(paramdt.a(paramej.d())) != localbec) {
/* 24:29 */         return true;
/* 25:   */       }
/* 26:31 */       if (localatr == this) {
/* 27:32 */         return false;
/* 28:   */       }
/* 29:   */     }
/* 30:36 */     if ((!this.a) && (localatr == this)) {
/* 31:37 */       return false;
/* 32:   */     }
/* 33:40 */     return super.a(paramard, paramdt, paramej);
/* 34:   */   }
/* 35:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     awt
 * JD-Core Version:    0.7.0.1
 */