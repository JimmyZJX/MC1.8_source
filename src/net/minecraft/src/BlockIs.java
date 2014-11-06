package net.minecraft.src;
/*  1:   */ import com.google.common.base.Predicate;
/*  2:   */ 
/*  3:   */ public class BlockIs
/*  4:   */   implements Predicate<Block>
/*  5:   */ {
/*  6:   */   private final ProtoBlock a;
/*  7:   */   
/*  8:   */   private BlockIs(ProtoBlock paramatr)
/*  9:   */   {
/* 10:13 */     this.a = paramatr;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public static BlockIs instance(ProtoBlock paramatr)
/* 14:   */   {
/* 15:17 */     return new BlockIs(paramatr);
/* 16:   */   }
/* 17:   */   
/* 18:   */   public boolean apply(Block parambec)
/* 19:   */   {
/* 20:23 */     if ((parambec == null) || (parambec.getProto() != this.a)) {
/* 21:24 */       return false;
/* 22:   */     }
/* 23:26 */     return true;
/* 24:   */   }
/* 25:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bep
 * JD-Core Version:    0.7.0.1
 */