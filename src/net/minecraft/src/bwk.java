package net.minecraft.src;
/*   1:    */ import com.google.common.base.Predicate;
/*   2:    */ import com.google.common.primitives.Floats;
/*   3:    */ 
/*   4:    */ class bwk
/*   5:    */   implements Predicate<String>
/*   6:    */ {
/*   7:    */   bwk(bwj parambwj) {}
/*   8:    */   
/*   9:    */   public boolean apply(String paramString)
/*  10:    */   {
/*  11:186 */     Float localFloat = Floats.tryParse(paramString);
/*  12:187 */     return (paramString.length() == 0) || ((localFloat != null) && (Floats.isFinite(localFloat.floatValue())) && (localFloat.floatValue() >= 0.0F));
/*  13:    */   }
/*  14:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bwk
 * JD-Core Version:    0.7.0.1
 */