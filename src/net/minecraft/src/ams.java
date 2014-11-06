package net.minecraft.src;
/*  1:   */ import com.google.common.base.Function;
/*  2:   */ 
/*  3:   */ class ams
/*  4:   */   implements Function<ItemStack,String>
/*  5:   */ {
			  private final String[] a;
/*  6:   */   ams(String[] paramArrayOfString) {a=paramArrayOfString;}
/*  7:   */   
/*  8:   */   public String apply(ItemStack paramamj)
/*  9:   */   {
/* 10:27 */     int i = paramamj.i();
/* 11:28 */     if ((i < 0) || (i >= this.a.length)) {
/* 12:29 */       i = 0;
/* 13:   */     }
/* 14:31 */     return this.a[i];
/* 15:   */   }
/* 16:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ams
 * JD-Core Version:    0.7.0.1
 */